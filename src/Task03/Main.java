package Task03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		File fout = new File("out.txt");
		FileOutputStream fos = new FileOutputStream(fout);

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(fos));
		readFile("C:/Users/kokodzh/Desktop/countries.txt");
		Scanner in = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			System.out.println("Enter capitals");
			String caps = in.nextLine();
			List<String> ar = new ArrayList<String>();
			ar.add(caps);
			for (String c : ar) {
				System.out.print(c);
				bw.write(c);
				bw.newLine();

			}
		}
		bw.close();
	}

	public static void readFile(String path) {
		try {

			FileReader fileReader = new FileReader(path);

			BufferedReader bufferedReader = new BufferedReader(fileReader);

			while (bufferedReader.ready()) {
				String line = bufferedReader.readLine();
				System.out.println(line);
			}

			bufferedReader.close();

		} catch (Exception e) {
			System.out.println("Error while reading a file.");
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}