package com;

import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileWrite {

	public static void main(String[] args) {

		Path filePath = Paths.get(System.getProperty("user.dir"), "data.txt");

		// Use try-with-resource to get auto-closeable writer instance
		try (BufferedWriter writer = Files.newBufferedWriter(filePath)) {
			writer.write("Hello World !!");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
