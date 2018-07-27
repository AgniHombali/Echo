package ReadingFile;

import java.util.Scanner;
public class car extends FR
{
	
	public void c()
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("For car number "+(countc));
			System.out.println("Enter the manufacturer.\n");
			cars[countc][0]=sc.nextLine();
			System.out.println("Enter the model.\n");
			cars[countc][1]=sc.nextLine();
			System.out.println("Enter the class (SUV/Sedan/Hatchback).\n");
			cars[countc][2]=sc.nextLine();
			System.out.println("Enter the price.\n");
			cars[countc][3]=sc.nextLine();
			System.out.println("Enter the color.\n");
			cars[countc][4]=sc.nextLine();
			System.out.println("Enter the number of wheels.\n");
			cars[countc][5]=sc.nextLine();
		
	}
}