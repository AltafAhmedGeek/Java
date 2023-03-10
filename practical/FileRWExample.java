package IO;

import java.io.FileReader;
import java.io.FileWriter;

public class FileRWExample {
	public static void main(String[] args) {
		// writing
		try {
			FileWriter fileWriter = new FileWriter(
					"C:\\Users\\altaf\\Desktop\\demo.txt");
			String name = "We are learning java io classes from Anudip";
			fileWriter.write(name);
			fileWriter.close();

		} catch (Exception e) {
			System.out.println(e);
		}
		// reading
		try {
			FileReader fileReader = new FileReader(
					"C:\\Users\\altaf\\Desktop\\demo.txt");
			int i = 0;
			while ((i = fileReader.read()) != -1) {
				System.out.print((char) i);
			}
			fileReader.close();

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}