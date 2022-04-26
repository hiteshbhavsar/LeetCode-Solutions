class CountCollisions {
    public int countCollisions(String directions) {
     /*
     Collision bound to happen on 
     RS :  when car is coming right (->) and there is a stationary car
     SL :  when car is coming left (<-) and there is stationary car
     RL :  when two car coming in opposite direction come towards each other
     */   
        
        /*
        Runtime: 88 ms, faster than 33.87% of Java online submissions for Count Collisions on       a Road.
        Memory Usage: 42.9 MB, less than 90.96% of Java online submissions for Count Collisions on a Road.
        */
        if(directions==null||directions.length()==1) return 0;
        Stack<Character> stack=new Stack<>();
        
        char [] direction=directions.toCharArray();
        char prevc='0';int collision=0; // In prevc variable we store the previous direction of the car
        
        for(int i=0;i<direction.length;i++)
        {
            // As we are checking from left to right we need to store all the cars coming from the 0th index to the right
            if(direction[i]=='R')
            {
                stack.push(direction[i]);
            }
            else
            {
                if((direction[i]=='S' && prevc=='R')) // this scenario mainly check the situation such as RS , RRRRS etc.
                {
                    if(!stack.isEmpty()) stack.pop();
                    collision+=1;   // If there is collision between 2 cars then add 1 to collisions
                    direction[i]='S';
                    while(!stack.isEmpty())
                    {
                        
                        collision++;stack.pop(); // Keep adding 1 to the number of collision as previous car moving with R direction will also collide
                    }
                }
                
                if((direction[i]=='L'&&prevc=='R'))  // this scenario mainly check the situation such as RL , RRRRLLL etc.
                {
                    stack.pop();
                    collision+=2;   // This is to store the immediate collision between car moving in opposite direction i.e LR or RL
                    direction[i]='S'; //After the collision the car becomes stationary so all the car coming before it to the right directions will have collision 1
                    while(!stack.isEmpty())
                    {
                        
                        collision++;stack.pop(); //summing up the collision for all car comming to right direction from the index previous to i
                    }
                }
                if(direction[i]=='L'&&prevc=='S') // this scenario only test SL case all the trailing L's would be taken care using this case
                {
                    collision++;
                    direction[i]='S';
                }
            }
            prevc=direction[i];
        }
        return collision;
    }
}
