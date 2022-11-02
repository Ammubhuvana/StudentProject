package Assignment8;
import java.util.Scanner;
public class RemovingVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name,name1;
		Scanner scanner=new Scanner(System.in);
		name=scanner.next();
		name1=name.replaceAll("[aeiouAEIOU]", "" );
		for(int i=0;i<name.length();i++)
		{
			char ch=name.charAt(i);
			if(ch=='a'||ch=='i'||ch=='e'||ch=='o'||ch=='u'||ch=='A'||ch=='I'||ch=='E'||ch=='O'||ch=='U');
			{
				System.out.println(ch);
			}
		}
		System.out.println(name1);

	}

}
