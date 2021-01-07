class Multiply {
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        if(num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        
        char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();
        
        int[] res = new int[n1.length + n2.length];
        
        for(int i = n1.length - 1; i >= 0; i--) {
            for(int j = n2.length - 1; j >= 0; j--) {
                res[i + j + 1] += (n1[i] - '0') * (n2[j] - '0');
            }
        }
        
        int carry = 0;
        
        for(int i = res.length - 1; i >= 0; i--) {
            int sum = res[i] + carry;
            res[i] = sum % 10;
            carry = sum / 10;
        }
        
        if(res[0] != 0) {
                sb.append(res[0]);
        }
        for(int i = 1; i < res.length; i++) {
            sb.append(res[i]);
        }
        
        return sb.toString();
    }

}
