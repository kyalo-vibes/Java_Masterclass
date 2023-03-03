package multithreading;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class SyncBlockExample {

	SyncExample se = new SyncExample();

	public void method(String fileToRead) throws IOException {

		// No lock req section
		String str = readFromFile(fileToRead);
		String str2 = "";

		// CRITICAL SECTION - LOCK REQUIRED
		synchronized (this) {
			writeToFile(str);
			str2 = readFromFile("C:\\Users\\Admin\\Desktop\\temp.txt");
		}
		/*synchronized (SyncExample.class) {
			SyncExample.writeToFile(fileToRead);
		}*/

		// No lock req section
		System.out.println(Thread.currentThread() + " : " + str2);
	}

	private String readFromFile(String fileToRead) throws IOException {

		FileReader fr = new FileReader(fileToRead);
		StringBuffer sb = new StringBuffer();
		int i;

		while ((i = fr.read()) != -1) {
			sb.append((char) i);
			
			//I am adding sleep for this example. Imagine we are doing some
			//Meaning ful operation here that takes 1 sec
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		return sb.toString();
	}

	private void writeToFile(String str) throws IOException {

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

}
