package day6Assignment;
import java.util.Scanner;
public class ComputeStopwatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Press 1 to start the stop watch :");
		double startWatch = scanner.nextDouble();
		
		startWatch = System.currentTimeMillis();
		
		System.out.println("Press 0 to stop the stop watch :");
		double stopWatch = scanner.nextDouble();
		
		stopWatch = System.currentTimeMillis();
		
		System.out.println("The Elacpsed time :"+((stopWatch-startWatch)/1000)+"seconds");
	}
}


