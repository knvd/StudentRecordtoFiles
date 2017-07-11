import java.io.IOException;
import java.io.RandomAccessFile;

public class fxn {

	void insert(int rno,String name,String course)	//insert fxn
	{
		
		try {
			RandomAccessFile strecords = new RandomAccessFile("record.txt", "rw");
			
			if(strecords.getFilePointer()==0)		//if empty write heading
				{
					strecords.writeBytes("===================================================================\n");
					strecords.writeBytes("Roll Number\t|\tName\t\t|\tCourse\n");
					strecords.writeBytes("===================================================================\n");			
				}
			long i=strecords.length();
			strecords.seek(i);			//write at end of file
			strecords.writeBytes(rno+"\t\t"+"      "+name+"\t\t\t"+"      "+course+"\n");
	
			System.out.println("Student "+name+" added Successfully!");
			strecords.close();	
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	
	
	
	
	void view()			//view function
	{
		 
		try {
			RandomAccessFile strecords = new RandomAccessFile("record.txt", "r");
			strecords.seek(0);			//start to read file from start
			
			long tr;
			long temp=strecords.length();		//last pointer location
				do
				{
					String line=strecords.readLine();				
				    System.out.println(line);
				 //   System.out.println();
				   line="";
				   tr=strecords.getFilePointer();		//location of pointer at that time
				}while(tr!=temp);
				
			strecords.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
