package packageone;

public class ReverseDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=12345;
		int reversenum =0;
		while( num != 0 )
        {
        reversenum = reversenum * 10;
        reversenum = reversenum + num%10;
        num = num/10;
        }

		System.out.println("Reverse number is: "+reversenum);

		}

		}

		




