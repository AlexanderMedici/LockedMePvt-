package lockedMePvt;


import java.io.File;
import java.io.IOException;
import java.util.Scanner;

	public class AddingDirectory
	{
//		path to save create delete files just replace it 
		String path ="D:\\FULL STACK SOFTWARE ENGINEER LIBRARY\\CALTECH PROJECTS\\";
		Scanner scnr=new Scanner(System.in);
		void createfile()  
		{
			System.out.println("TAKE YOURE TIME SPELL THE NAME OF YOUR FILE   ..");
			String filename=scnr.next();
			String filepath=path+filename;
//			creating a new named instance from file called sheet 
			File sheet=new File(filepath);
			//create a new file
			try 
			{
//			used try catch again that way scanner stays open   then using dot operator chained built in function create new file from File imported framework
				if(sheet.createNewFile()) 
				{
					System.out.println("✅✅  CREATED AND ADDED FILE TO THE DIRECTORY ✅ ✅ ");
				}
				else 
				{
					System.out.println("⁉️⁉️ FAILED TO CREATE FILE DOSE NOT EXIST TRY AGAIN ⁉️⁉️⁉️");
				}
//				if there is an error this will catch it and  print it  using imported IOException the function that dose the work is print stack trace
			}catch (IOException e) {
				e.printStackTrace();
			}
		}

	}