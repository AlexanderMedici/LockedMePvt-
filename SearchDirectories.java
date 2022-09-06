package lockedMePvt;

import java.io.File;
import java.util.Scanner;
import java.util.Arrays;

public class SearchDirectories{
	
void searchingafile(){
	String path ="D:\\FULL STACK SOFTWARE ENGINEER LIBRARY\\CALTECH PROJECTS\\";
	try (Scanner Scnr = new Scanner(System.in)) {
		System.out.println("ENTER DIRECTORY NAME TO SEARCH DIRECTORIES");
		String filedFun = Scnr.next();
 
		File paper = new File(path);  
		int flag = 0;
//		created an array named filled paper 
		File filedPaper[]=paper.listFiles();
//		making sure array is sorted. 
		Arrays.sort(filedPaper); 
		for(File aaa:filedPaper) {
		if(aaa.getName().equals(filedFun))
		{
			flag=1; 
			break;
		}
		else {
			flag=0;
		}

}
		

if(flag==1) {
		System.out.println("✅ DIRECTORY  FOUND ✅ ");
	

		
}
else {
		System.out.println("🛑DIRECTORY NOT FOUND🛑");
			}

		}
	
}
	

	
	}

