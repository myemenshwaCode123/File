package FileHandling;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			FileWriter myWriter = new FileWriter("C:\\FileHandling\\Filef2.txt");
			myWriter.write("JAVA BEEN GETTING MOONNNNEYYYYY NIGGGGGGGGGGUUAAHHHHH");
			myWriter.close();
			System.out.println("Successfully wrote to the file");
		}catch(IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
			
		}

	}

}
