package multithreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SyncExample {
		
	public synchronized void display(String str){
		
		for(int i = 0; i < str.length();i++){
			System.out.print(str.charAt(i));
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static synchronized void writeToFile(String str) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\Admin\\Desktop\\temp.txt");

		for (int i = 0; i < str.length(); i++) {
			fw.write(str.charAt(i));
			fw.flush();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

	public static synchronized void readFromFile() throws IOException {

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		FileReader fr = new FileReader("C:\\Users\\Admin\\Desktop\\temp.txt");
		int i;

		while ((i = fr.read()) != -1) {
			System.out.println((char) i);
		}

	}
	
}
