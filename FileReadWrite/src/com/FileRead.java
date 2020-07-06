package com;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class FileRead {

	public static void main(String[] args) {
		Path path = Paths.get("data.txt");

		try (Stream<String> lines = Files.lines(path)) {
			lines.forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
