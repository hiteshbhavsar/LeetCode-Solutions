class Solution {
    public int compress(char[] chars) {
        /*
        Runtime: 1 ms, faster than 93.08% of Java online submissions for String Compression.
        Memory Usage: 38.6 MB, less than 68.48% of Java online submissions for String Compression.
        */
        if(chars != null && chars.length > 0){
            int index = 0;
            for(int i = 0; i < chars.length; i++){
                int count = 1;
                while(i+1 < chars.length && chars[i] == chars[i+1]){
                    count++;
                    i++;
                }
                chars[index++] = chars[i];
                if(count > 1){
                    StringBuffer num = new StringBuffer();
                    while(count > 0){
                        num.insert(0,count%10);
                        count = count/10;
                    }
                    for(char c : num.toString().toCharArray()){
                        chars[index++] = c;
                    } 
                }                               
            }
            return index;
        }
        return -1;
    }
}
