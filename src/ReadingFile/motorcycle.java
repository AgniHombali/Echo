package ReadingFile;

import java.util.Scanner;

public class motorcycle extends FR 
{
	public void m()
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("For motorcycle number "+(countm));
			System.out.println("Enter the manufacturer.\n");
			motorcycles[countm][0]=sc.nextLine();
			System.out.println("Enter the model.\n");
			motorcycles[countm][1]=sc.nextLine();
			System.out.println("Enter the class (Chopper/Superbike/Mopeds).\n");
			motorcycles[countm][2]=sc.nextLine();
			System.out.println("Enter the price.\n");
			motorcycles[countm][3]=sc.nextLine();
			System.out.println("Enter the color.\n");
			motorcycles[countm][4]=sc.nextLine();
			System.out.println("Enter the number of wheels.\n");
			motorcycles[countm][5]=sc.nextLine();
		
	}

}
