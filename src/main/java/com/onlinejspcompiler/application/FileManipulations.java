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
		FileWriter fileWriter = null;
		System.out.println(jspBody);
		System.out.println(path);
		file = new File(path);
		/*
		 * System.out.println("before writing:-"+file.exists());
		 * System.out.println( "content before writing:-"+readLineByLineJava8(
		 * path+"test.jsp" ) );
		 * 
		 * if(file.exists()) {
		 * file.delete();
		 * System.out.println("file deleted");
		 * }
		 */
		fileWriter = new FileWriter(file);
		fileWriter.write(jspBody);
		fileWriter.flush();
		fileWriter.close();
		System.out.println(file.getAbsolutePath());
		System.out.println(file.exists());

		//System.out.println(readLineByLineJava8(path + "test.jsp"));
	}

	/*
	 * private static String readLineByLineJava8(String filePath) {
	 * StringBuilder contentBuilder = new StringBuilder();
	 * 
	 * try (Stream<String> stream = Files.lines(Paths.get(filePath),
	 * StandardCharsets.UTF_8)) {
	 * stream.forEach(s -> contentBuilder.append(s).append("\n"));
	 * } catch (IOException e) {
	 * e.printStackTrace();
	 * }
	 * 
	 * return contentBuilder.toString();
	 * }
	 */
}
