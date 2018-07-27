package ReadingFile;

import java.util.Scanner;

public class train extends FR
{
	public void t()
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("For train number "+(countt));
			System.out.println("Enter the manufacturer.\n");
			trains[countt][0]=sc.nextLine();
			System.out.println("Enter the model.\n");
			trains[countt][1]=sc.nextLine();
			System.out.println("Enter the class (Passenger/Goods).\n");
			trains[countt][2]=sc.nextLine();
			System.out.println("Enter the price.\n");
			trains[countt][3]=sc.nextLine();
			System.out.println("Enter the color.\n");
			trains[countt][4]=sc.nextLine();
			System.out.println("Enter the number of wheels.\n");
			trains[countt][5]=sc.nextLine();
		
	}

}
