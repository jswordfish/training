package com.training.regex;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

public class TestFileCount {
	
	@Test
	public void testGetNoCount() throws Exception{
		String str = FileUtils.readFileToString(new File("problem.txt"));
		 Pattern pattern = Pattern.compile("testcase1");
		    Matcher  matcher = pattern.matcher(str);

		    int count = 0;
		    while (matcher.find())
		        count++;

		    System.out.println(count);    
	}

}
