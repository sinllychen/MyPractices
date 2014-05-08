public class LeetCode_01_ReverseWords {
    public String reverseWords(String s) {
    
       String[] str=s.trim().split("\\s+");
       StringBuffer buf=new StringBuffer();
       for(int i=str.length-1;i>=0;i--)
       {
    	   if(str[i].equals(""))
    		    return "";
           buf.append(str[i]);
           buf.append(" ");
       }
       return buf.toString().trim();
    }
}