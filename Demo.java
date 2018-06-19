import java.io.*;
import java.util.*;
public class Demo
{
 public static void main(String[] args)
   {
       int num, count, total=0;
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        s.close();
        for(count = 1; count <= num; count++)
        {
            total = total + count;
        }
       System.out.println(total);
    }
}
