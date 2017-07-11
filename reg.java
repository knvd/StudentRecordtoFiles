import java.util.Scanner;

public class reg {
	static boolean x=true;
	

	public static void main(String[] args) {			
		int ch;
		fxn obj =new fxn();		//object of fxn class to use functions
		Scanner chscanner =new Scanner(System.in);
	while(x)				//Simple user interface holds screen till x is true
	{
		System.out.println("============================================================");
		System.out.println("    1.INSERT a student \t 2.VIEW all students \t 3.EXIT");
		System.out.println("============================================================");
		System.out.println("Enter Your Choice:\t");
		ch=chscanner.nextInt();
		
		switch(ch)
		{
		case 1:
			
			System.out.println("Enter Roll no of the Student:\t");
			int rn = chscanner.nextInt();
			System.out.println("Enter Name of the Student:\t");
			String nm = chscanner.next();
			System.out.println("Enter Course to be Enrolled in:\t");
			String crs = chscanner.next();
			
			obj.insert(rn,nm,crs);	// INSERT() defined in fxn class
			break;
			
		case 2:
			obj.view();				//VIEW() defined in fxn class
			break;
			
		case 3:
			x=false;
			break;
			
		default:
			System.out.println("Wrong Input! Please Enter again...");
		
		}
		
	}
	chscanner.close();
	}
	
	

}
