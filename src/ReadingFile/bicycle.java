package ReadingFile;

import java.util.Scanner;

public class bicycle extends FR
{
	public void bic()
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("For bicycle number "+(countc));
			System.out.println("Enter the manufacturer.\n");
			bicycles[countbi][0]=sc.nextLine();
			System.out.println("Enter the model.\n");
			bicycles[countbi][1]=sc.nextLine();
			System.out.println("Enter the class (Mountain/City).\n");
			bicycles[countbi][2]=sc.nextLine();
			System.out.println("Enter the price.\n");
			bicycles[countbi][3]=sc.nextLine();
			System.out.println("Enter the color.\n");
			bicycles[countbi][4]=sc.nextLine();
			System.out.println("Enter the number of wheels.\n");
			bicycles[countbi][5]=sc.nextLine();
		
	}

}
