package org.paumard.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;

public class MyWritingFiles {

	public static void main(String... args) {
		Path path = Path.of("files/debug.log");
		try (BufferedWriter writer1 = Files.newBufferedWriter(path);
				BufferedWriter writer2 = new BufferedWriter(writer1);
				PrintWriter pw = new PrintWriter(writer2);) {
			writer1.write("Hello World!");

			pw.printf("\ni = %d\n", 12);


		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
		System.out.println("DONE!");
	}
}
