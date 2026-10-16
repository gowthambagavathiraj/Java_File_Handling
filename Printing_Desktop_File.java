package Java_File_Handling;

import java.io.File;

public class Print_Desktop_Files_ {
	public static void main(String []args) {
	    File file=new File("C:\\Users\\B.Gowtham\\OneDrive\\Desktop"); 
	    String[] Allfiles=file.list();
	    if(Allfiles!=null) {
	    for(String f:Allfiles) {
	    	System.out.println(f);
	    }
	    }
	    else {
	    	System.out.println("No files in the Desktop");
	    }
	    
/*------------------------------Printing All Files with Directory-----------------------------*/	    
	    File []f1=file.listFiles();
	    if(f1!=null) {
	    	for(File ff:f1) {
	    		System.out.println(ff);
	    	}
	    }
	    else {
	    	System.out.println("No Directory Files in the Desktop");
	    }
	    
	}
}
