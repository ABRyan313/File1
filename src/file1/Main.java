package file1;
import java.io.*;

public class Main {

	public static void main(String[] args) {
		
		String [] Name = {"AB", "Audri", "Udash"};
		
		try {
			BufferedWriter writer = new BufferedWriter(new FileWriter("Output.txt"));
			writer.write("Hi there");
			
			for(String s : Name){
			  writer.write("\n" +s);
			}
			writer.close();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
		
		
		try {
			BufferedReader reader = new BufferedReader(new FileReader("Output.txt"));
			String line;
			
				while((line = reader.readLine()) != null)
				System.out.println(line);
				reader.close();
			} 
			catch (IOException e) {
				e.printStackTrace();
			}
			
		} 

	}


