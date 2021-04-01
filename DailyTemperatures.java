class DailyTemperatures {
    public int[] dailyTemperatures(int[] T) {
        /*
        Runtime: 485 ms, faster than 15.83% of Java online submissions for Daily Temperatures.
        Memory Usage: 47.3 MB, less than 41.18% of Java online submissions for Daily Temperatures.
        */
        int i=T.length-2,j=T.length-1;
        if(T.length==1) return new int[]{0};
        ArrayList<Integer> list=new ArrayList<>();list.add(0,0);
        for(i=T.length-2;i>=0;i--)
        {
            int value=0;
            if(T[i]<T[j])
                value=1;
            else if(T[i]==T[j])
                value=list.get(0)==0?0:list.get(0)+1;
            else if(T[i]>T[j])
            {
                int index=j;boolean bcondmet=false;
                while(!bcondmet&&index<T.length)
                {
                    if(T[i]<T[index])
                    {
                        bcondmet=true;
                        value=index-i;
                    }
                index++;
                }
            }
            list.add(0,value);j--;
        }
        return list.stream().mapToInt(a->a).toArray();
    }
}
