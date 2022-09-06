package lockedMePvt;
import java.io.File; 
import java.util.Arrays; 



public class DisplayallDirectories 
{
	void displayallfiles()
	{
//		 Type casting path as string data primitive 
		String path ="D:\\FULL STACK SOFTWARE ENGINEER LIBRARY\\CALTECH PROJECTS\\";
//		saving an instance of file to paper   naming  convention is irrelevant
		File paper = new File(path);
//		built in function is listFiles() 
		File filedfun []=paper.listFiles(); 
//		used sort on arrays for filenames
		Arrays.sort(filedfun);
		System.out.println("LIST OF DIRECTORIES ARE: \n"); 
		for(File ff:filedfun) {
			
			System.out.println(ff.getName());
			}
		}
	
	
}
