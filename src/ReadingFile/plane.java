package ReadingFile;

import java.util.Scanner;

public class plane extends FR 
{
	public void p()
	{
		
		Scanner sc=new Scanner(System.in);
			System.out.println("For plane number "+(countp));
			System.out.println("Enter the manufacturer.\n");
			planes[countp][0]=sc.nextLine();
			System.out.println("Enter the model.\n");
			planes[countp][1]=sc.nextLine();
			System.out.println("Enter the class (Commercial/Fighter Jet/Goods).\n");
			planes[countp][2]=sc.nextLine();
			System.out.println("Enter the price.\n");
			planes[countp][3]=sc.nextLine();
			System.out.println("Enter the color.\n");
			planes[countp][4]=sc.nextLine();
			System.out.println("Enter the number of engines.\n");
			planes[countp][5]=sc.nextLine();
		
	}

}
