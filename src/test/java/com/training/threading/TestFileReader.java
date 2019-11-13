package com.training.threading;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import com.training.threads.FileReader;
import com.training.threads.FileReaderImpl;

public class TestFileReader {
	
	

	FileReader fileReader = new FileReaderImpl();
	
	@Test
	public void testNoOfOccurrences(){
		List<String> files = new ArrayList<String>();
		files.add("file1.txt");
		files.add("file2.txt");
		files.add("file3.txt");
		files.add("file4.txt");
		files.add("file5.txt");
		Integer noOfoccurrences = fileReader.noOfOccurrences(files, "request");
		System.out.println(noOfoccurrences);
	}
}
