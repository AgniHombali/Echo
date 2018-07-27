package ReadingFile;
import java.io.BufferedReader;//Scanner
import java.io.FileReader;


public class FR 
{
	public static int countc=0;
	public static String cars[][]=new String[100][6];
	public static int countb=0;
	public static String buses[][]=new String[100][6];
	public static int countt=0;
	public static String trains[][]=new String[100][6];
	public static int countp=0;
	public static String planes[][]=new String[100][6];
	public static int countm=0;
	public static String motorcycles[][]=new String[100][6];
	public static int countu=0;
	public static String ufos[][]=new String[100][6];
	public static int countbi=0;
	public static String bicycles[][]=new String[100][6];
	public static void main(String[]args) throws Exception
	{
		int i,j;
		//Scanner read=new Scanner(System.in);
		FileReader file=new FileReader("C:\\Users\\Agni_Hombali\\Desktop\\input.txt");
		BufferedReader reader=new BufferedReader(file);
		
		String text="";
		String line=reader.readLine();
		while(line!=null)
		{
			text=line;
			//text+=line;
			line=reader.readLine();
			//text=line;
			System.out.println(text);
			if(text.equals("car"))
			{
				countc++;
				car ca=new car();
				ca.c();
			}
			else if(text.equals("bus"))
			{
				countb++;
				bus bu=new bus();
				bu.b();
			}
			else if(text.equals("train"))
			{
				countt++;
				train tr=new train();
				tr.t();
			}
			else if(text.equals("plane"))
			{
				countp++;
				plane pl=new plane();
				pl.p();
			}
			else if(text.equals("motorcycle"))
			{
				countm++;
				motorcycle mo=new motorcycle();
				mo.m();
			}
			else if(text.equals("ufo"))
			{
				countu++;
				ufo uf=new ufo();
				uf.u();
			}
			else if(text.equals("bicycle"))
			{
				countbi++;
				bicycle bicy=new bicycle();
				bicy.bic();
			}
			
		}
		System.out.println("-------------------CARS-----------------------");
		System.out.println("Manufacturer   \tModel   \tClass   \tPrice   \tColor   \tNumber of wheels.   \n");
		
		for(i=1;i<=countt;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print(cars[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("-------------------BUSES-----------------------");
		System.out.println("Manufacturer   \tModel   \tClass   \tPrice   \tColor   \tNumber of wheels.   \n");
		
		for(i=1;i<=countb;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print(buses[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("-------------------TRAINS-----------------------");
		System.out.println("Manufacturer   \tModel   \tClass   \tPrice   \tColor   \tNumber of wheels.   \n");
		
		for(i=1;i<=countc;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print(trains[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("-------------------PLANES-----------------------");
		System.out.println("Manufacturer   \tModel   \tClass   \tPrice   \tColor   \tNumber of engines.   \n");
		
		for(i=1;i<=countp;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print(planes[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("-------------------MOTERCYCLES-----------------------");
		System.out.println("Manufacturer   \tModel   \tClass   \tPrice   \tColor   \tNumber of wheels.   \n");
		
		for(i=1;i<=countm;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print(motorcycles[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("-------------------UFOS-----------------------");
		System.out.println("Manufacturer   \tModel   \tClass   \tPrice   \tColor   \tNumber of circles.   \n");
		
		for(i=1;i<=countu;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print(ufos[i][j]+"\t\t");
			}
			System.out.println();
		}
		System.out.println("-------------------BICYCLES-----------------------");
		System.out.println("Manufacturer   \tModel   \tClass   \tPrice   \tColor   \tNumber of wheels.   \n");
		
		for(i=1;i<=countbi;i++)
		{
			for(j=0;j<6;j++)
			{
				System.out.print(bicycles[i][j]+"\t\t");
			}
			System.out.println();
		}
		
	}

}
