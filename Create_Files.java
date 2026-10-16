package Java_File_Handling;
import java.io.File;
public class Create__Files {

	public static void main(String[] args) {
		File file=new File("C:\\Users\\B.Gowtham\\OneDrive\\Desktop\\Jailer\\Rajini.txt");
		try {
			if(file.createNewFile()) {
				System.out.println("New File Created");
			}
			else {
				System.out.println("File Already Exists");
			}
		}
		catch(Exception e) {
			System.out.println("Error "+e.getMessage());
		}
	}

}
