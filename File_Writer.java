package Java_File_Handling;

import java.io.FileWriter;
import java.io.IOException;
public class File_Writer {

	public static void main(String[] args) {
		try {
			FileWriter writer= new FileWriter("C:\\Users\\B.Gowtham\\OneDrive\\Desktop\\Jailer\\Rajini.txt");
			writer.write("Hello World");
			writer.write("\n Ganesh is the Topper");
			writer.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
