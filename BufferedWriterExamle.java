package Java_File_Handling;
import java.io.*;
import java.io.BufferedWriter;
public class BufferedWriterExample {

	public static void main(String[] args) {
		try(BufferedWriter br=new BufferedWriter(new FileWriter("C:\\Users\\B.Gowtham\\OneDrive\\Desktop\\Jailer\\Rajini.txt"))){
			br.write("Hello World");
			System.out.println("Written Successfully");
			
		}
		catch(Exception e){
			System.out.println("Error "+e.getMessage());
		}

	}

}
