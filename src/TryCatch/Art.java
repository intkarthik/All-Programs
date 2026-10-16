package TryCatch;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Art {

	public static void main(String[] args) {

		// Exception = An event that interrupts the normal flow of a program
		fileWriter();
		Art_1();
		bufferedReader();
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while (data != -1) {
				System.out.print((char) data);
				data = reader.read();
			}
			reader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void Art_1() {
		// This program to find the file
		// file = An abstract representation of file and directory pathnames
		File file = new File("art.txt");
		if (file.exists()) {
			System.out.println("That file exist : !");
		} else {
			System.out.println("That file doesn't exists");
		}
		System.out.println(file.getPath());// path of the file
		System.out.println(file.getAbsolutePath());// get exact path in the computer
		System.out.println(file.isFile());// file is exist or not
		String name = file.getName(); // path of the file
		System.out.println(name);
		System.out.println(file.getAbsoluteFile()); // get exact path in the computer
		System.out.println(file.length());
		System.out.println(file.canWrite());
		System.out.println(file.isDirectory());
		String parent = file.getParent();
		System.out.println(parent);
		System.out.println(file.getTotalSpace());

		/*
		 * file.exists(); // true/false file.isFile(); // is it a file?
		 * file.isDirectory(); // is it a folder? file.length(); // size in bytes
		 * file.getName(); // "file.txt" file.getAbsolutePath(); // full path
		 */

		// file.getAbsoluteFile();
		// file.delete();// to delete the file in project when we refresh

	}

	public static void fileWriter() {
		// this program is used to write in java project and it will store in java
		// project using refresh
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Java Learning");
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void bufferedReader() {
		String line;
		try (BufferedReader reader = new BufferedReader(new FileReader("art1.txt"))) {
			while ((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
