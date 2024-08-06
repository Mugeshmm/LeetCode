class Solution {
    public String reverseWords(String s) {
        s=s.trim();
        String []str=s.split("\\s+"); 
        //String[]words=s.toCharArray();
        StringBuilder str2=new StringBuilder();
        for(int i=str.length-1;i>=0;i--){
            str2.append(str[i]);
            str2.append(" ");
        }
        return str2.toString().trim();
        
    }
}