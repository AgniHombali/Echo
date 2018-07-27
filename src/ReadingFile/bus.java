package ReadingFile;

import java.util.Scanner;

public class bus extends FR
{
	public void b()
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("For bus number "+(countb));
			System.out.println("Enter the manufacturer.\n");
			buses[countb][0]=sc.nextLine();
			System.out.println("Enter the model.\n");
			buses[countb][1]=sc.nextLine();
			System.out.println("Enter the class (Passenger/Goods).\n");
			buses[countb][2]=sc.nextLine();
			System.out.println("Enter the price.\n");
			buses[countb][3]=sc.nextLine();
			System.out.println("Enter the color.\n");
			buses[countb][4]=sc.nextLine();
			System.out.println("Enter the number of wheels.\n");
			buses[countb][5]=sc.nextLine();
		
	}

}
