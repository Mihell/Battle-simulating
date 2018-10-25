package unisa.pf.assign02.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;


public class Log {
	private static FileWriter log = null;
	private static boolean fileOut = false;


	static {
		try {
			File f1 = new File("test.txt");
			if (f1.exists()) {
				f1.delete();
			}
			log = new FileWriter("test.txt");
			log.write("Testing Output File\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void println(String output) {
			print(output+"\n");
	}


	public static void print(String output) {
		if (fileOut) {
			try {
				log.write(output);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} else {
			System.out.print(output);
		}
	}

	public static void close() {
		try {
			log.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void setFileOut() {
		fileOut = true;
	}
	
	public static void setConsoleOut() {
		fileOut = false;
	}
}
