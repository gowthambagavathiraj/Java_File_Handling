package Java_File_Handling;
import java.io.File;
import java.io.IOException;
public class Create_Folder {
	public static void main(String[]args) {
		File folder=new File("C:\\Users\\B.Gowtham\\OneDrive\\Desktop\\Jailer");
		try {
			if(!(folder.exists())) {
				folder.mkdir();	
				System.out.println("Folder Created");
				}
		
		else {
			System.out.println("Folder Already Exists");
		}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
