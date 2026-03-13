package Practice_Java;

import java.io.FileOutputStream;

public class OutputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "Welcome to java portal!! Have a Happy learning";
		try {
			FileOutputStream output = new FileOutputStream("Output.txt");
			byte[] arr = data.getBytes();
			output.write(arr);
			output.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println("Program finished");
	}

}
