import java.io.*;
import java.util.*;
class Alp
{
	public static void main(String[ ] arg)
	{
	int i=0;
	Scanner sc=new Scanner(System.in);
	char ch=sc.next( ).charAt(0);	 
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
		System.out.println( "Alphabet");
		else
		System.out.println("No");		
	}
}
