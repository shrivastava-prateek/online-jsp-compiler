package com.onlinejspcompiler.application;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

import org.springframework.stereotype.Component;

@Component
public class FileManipulations {

	public void createJSPFile(String jspBody, String path) throws IOException {
		File file = null;
		//FileWriter fileWriter = null;
		System.out.println(jspBody);
		System.out.println(path);
		file = new File(path);

		try (FileWriter fileWriter = new FileWriter(file)) {
			fileWriter.write(jspBody);
			fileWriter.flush();
		}

		//fileWriter.close();
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());
	}
}
