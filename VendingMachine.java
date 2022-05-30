package day6Assignment;

public class VendingMachine {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 868;
		int count = 1;
		
		int [] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 1 };
		
		System.out.println("Counting Notes : ");
		for(int i =0; i<=8;i++)
		{
			if(amount>notes[i])
			{
			count =	amount/notes[i];
			amount = amount - count *  notes[i];
			System.out.println("Rs "+notes[i]+" : "+count);
			}
		}
	}

}
