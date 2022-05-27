package day6Assignment;
import java.util.Scanner;
public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter any No :");
		int num=scanner.nextInt();
		int Result = 0;
		int temp = num;
		while(num!=0)
		{
			int remainder = num%10;
			Result = Result*10 + remainder;
			num = num/10;
			
		}
		System.out.println("Reverse Number of "+temp+" = "+Result);
	}

}
