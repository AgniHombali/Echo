package ReadingFile;

import java.util.Scanner;

public class ufo extends FR
{
	public void u()
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("For ufo number "+(countu));
			System.out.println("Enter the manufacturer.\n");
			ufos[countu][0]=sc.nextLine();
			System.out.println("Enter the model.\n");
			ufos[countu][1]=sc.nextLine();
			System.out.println("Enter the class (Passenger/Goods).\n");
			ufos[countu][2]=sc.nextLine();
			System.out.println("Enter the price.\n");
			ufos[countu][3]=sc.nextLine();
			System.out.println("Enter the color.\n");
			ufos[countu][4]=sc.nextLine();
			System.out.println("Enter the number of circles.\n");
			ufos[countu][5]=sc.nextLine();
		
	}


}
