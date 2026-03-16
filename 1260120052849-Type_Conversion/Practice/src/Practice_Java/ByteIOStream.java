package Practice_Java;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ByteIOStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] b = new char[128];
		try(FileReader fr = new FileReader(args[0]);
			FileWriter fw = new FileWriter(args[1])) {
				int count = 0; 
				int read = 0;
				while ((read = fr.read(b)) != -1) {
					fw.write(b, 0, read);
	                count += read;
	            }
				System.out.println("Total count "+count+" characters");
			}
			catch(FileNotFoundException e) {
				System.out.println("File "+args[0]+" not found");
			}
			catch(IOException e) {
				System.out.println("IOException "+e);
			}
		}
	}

