package lockedMePvt;
// imported java frameworks 
import java.util.Scanner;
import java.io.IOException;





public class CommandConsole {
	public static void main(String[] args) throws IOException
	{
	
	System.out.println("\nπ  WELCOME TO LOCKEDMEPVTπ  ");
	System.out.println("\n MADE WITH π§‘  by ALEXANDER MEDICI π ");
	System.out.println();
//	created and named external files from within package 
	AddingDirectory addafile = new AddingDirectory();
	DisplayallDirectories displayallfiles= new DisplayallDirectories();
	SearchDirectories searchingafile = new SearchDirectories();
	DeleteDirectories deletingafile = new DeleteDirectories();
//	had to use try as scanner was open and would work right 
	try (Scanner scnr = new Scanner(System.in)) {
		exit : while(true) 
		{
			
			System.out.println("File Operations");
			System.out.println("ENTER THE NUMBER OF THE OPERTAION YOU WANT  \n  1) DISPLAY ALL FILES ποΈ   \n  2) FILE METHODS π \n  3) CLOSE PROGRAM β");
			int choice = scnr.nextInt();
			switch(choice) 
			{
			case 1 :
//				invoking a class or function in javascript hard to get javascript out of my mind 
				displayallfiles.displayallfiles();
				System.out.println("π π π π π π π π π ");
				break;
			case 2 :
				while(true) 
				{	
//					used a switch statement witch allows for multiple cases 
					System.out.println("File Access");
					System.out.println("  1.β  ADDING A FILE  \n  2. π SEARCH FOR A FILE\n  3. π§¨ DELETE A FILE   \n  4.π BACK TO START MENU  \n" );
					int option = scnr.nextInt();
					switch(option) 
					{
					case 1 :
						addafile.createfile();
						break;
					case 2 :
						searchingafile.searchingafile();
						break;
					case 3 :
						deletingafile.deletingafile();
						break;
					case 4 :
						continue exit;
					default :
						System.out.println("π¦ INCORRECT ERROR TRY A NUMBER ON THE LIST π¦");
					}
					
				}
			case 3 :
				System.exit(0);
			default :
				System.out.println("π€£ TRY AGAIN π€£");
			}
		}
	}
  }
}


