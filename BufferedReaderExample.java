package Java_File_Handling;

import java.io.*;
public class BufferReaderExample {

	public static void main(String[] args) {
		try(BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\B.Gowtham\\OneDrive\\Desktop\\Jailer\\Rajini.txt"))){
			String str;
			while((str=br.readLine())!=null) {
			 System.out.println(str);
			}
		}
		catch(Exception e){
			System.out.println("Error "+e.getMessage());
		}

	}

}
