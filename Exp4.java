import java.util.Scanner;
class ReverseString
{
    public static void main(String args[])
    {
        String s="NAMASTE DUNIYA";
        String rev="";
        for(int j=s.length(); j>0 ; --j)
        {
            rev=rev+(s.charAt(j-1));
        }
        System.out.println("Reverse of a string is ="+ rev);
        
    }
}
