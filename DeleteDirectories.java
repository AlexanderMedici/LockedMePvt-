package lockedMePvt;
// importing for java utilities framework 
import java.io.File; 
import java.util.Scanner;


	public class DeleteDirectories
	{

		void deletingafile() 
		
		{
//			path to save create delete files just replace it 
			String path ="D:\\FULL STACK SOFTWARE ENGINEER LIBRARY\\CALTECH PROJECTS\\";
//			opted to  use a try statement as it was better the using Scanner close method
			try (Scanner scnr = new Scanner(System.in)) {
				System.out.println("ENTER THE NAME OF THE FILE EXACTLY TO DELETE IT 🗑️");
				String filename=scnr.next();
				String finalpath=path+filename;
				File sheet=new File(finalpath);
				//delete operation function from file library
				if(sheet.delete())
				{
					System.out.println("🗑️🗑️🗑️NAMED FILE FOUND AND DELETED PLEASE DELETE RESPONSIBLY🗑️🗑️🗑️");
				}
				else {
					System.out.println("🛑 NAMED FILE NOT FOUND EITHER DOSENT EXIST OR IS MISSPLELLED 🛑");
				}
			}
		}

	}