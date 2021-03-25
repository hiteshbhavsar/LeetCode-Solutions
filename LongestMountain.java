class LongestMountain {
    /*
    Runtime: 2 ms, faster than 83.26% of Java online submissions for Longest Mountain in Array.
Memory Usage: 39.7 MB, less than 88.91% of Java online submissions for Longest Mountain in Array.*/
    public int longestMountain(int[] arr) {
        if(arr==null||arr.length<3) return 0;
        boolean valley=false,peak=false;
        int length=0,i=0;
        while(i<arr.length-1)
        {
            if(arr[i]<arr[i+1])
            {
                int start=i;
                while(i<arr.length-1 && arr[i]<arr[i+1]){
                    i++;
                    peak=true;
                }
                while(i<arr.length-1 && arr[i]>arr[i+1])
                {
                    i++;
                    valley=true;
                }
                
                if(peak==true && valley==true)
                {
                    length=Math.max(length,i-start+1);
                }
            }
            else {i++;}
            peak=false;
            valley=false;
        }
        return length;
    }
}
