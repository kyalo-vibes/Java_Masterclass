package multiThreading;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ShutDownHookExample {
	public static void main(String[] args) throws InterruptedException {

		BufferedReader br = null;
		BufferedWriter bw = null;
		
		Thread t = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("From shutdown hook..");
				
			}
		});
		
		Runtime.getRuntime().addShutdownHook(t);
		
		
		
		try {
			FileInputStream in = new FileInputStream("C:\\Users\\Admin\\Desktop\\todos.txt");
			InputStreamReader inr = new InputStreamReader(in);
			br = new BufferedReader(inr, 1024 * 8);

			FileOutputStream out = new FileOutputStream("C:\\Users\\Admin\\Desktop\\todos_buffered_output.txt");
			OutputStreamWriter osw = new OutputStreamWriter(out);
			bw = new BufferedWriter(osw);

			String line;

			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();
				System.out.println("Exit..");
				
			}
			Runtime.getRuntime().removeShutdownHook(t);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			System.out.println("Finally block");
			try {
				if (br != null)
					br.close();
				if (bw != null)
					bw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	
	}
}
