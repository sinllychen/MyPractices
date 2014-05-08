public class LeetCode_01 {
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
    pubic static void main(String[] args)
   {
      String s= "the sky is blue";
      System.out.println(reverseWords(s));
    }
}