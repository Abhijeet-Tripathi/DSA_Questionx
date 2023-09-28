class test {
    public static void main(String[] args){
        String res= decodeAtIndex(leet2code3);
        System.out.println(res);
    
        {
    }
    public String decodeAtIndex(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            if(c.isDigit()){
                while((c-'0')>0){
                    sb.append(sb);
                    c--;
                }
            }
            if(c.isLetter()){
                sb.append(c);
            }

        }
        System.out.println(sb.toString());
    }
}