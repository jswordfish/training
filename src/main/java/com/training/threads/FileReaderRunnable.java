package com.training.threads;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

public class FileReaderRunnable implements Runnable {
	String fileName;
	
	String wordToFind;
	
	Integer noOfOccurences;
	
	public FileReaderRunnable(String fileName, String occurrence){
		this.fileName = fileName;
		this.wordToFind = occurrence;
	}
	
//	public  static void main(String args[]){
//		FileReaderRunnable join1 = new FileReaderRunnable("file1.txt", "request");
//		FileReaderRunnable join2 = new FileReaderRunnable("file2.txt", "request");
//		FileReaderRunnable join3 = new FileReaderRunnable("file3.txt", "request");
//		FileReaderRunnable join4 = new FileReaderRunnable("file4.txt", "request");
//		FileReaderRunnable join5 = new FileReaderRunnable("file5.txt", "request");
//		
//		Thread t1 = new Thread(join1, "Thread1");
//		Thread t2 = new Thread(join2, "Thread2");
//		Thread t3 = new Thread(join3, "Thread3");
//		Thread t4 = new Thread(join4, "Thread4");
//		Thread t5 = new Thread(join5, "Thread5");
//		t1.start();
//		try {
//			/**
//			 *start t2 after waiting for 1 sec for t1 to end
//			 */
//			t1.join(1000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		t2.start();
//	
//		try {
//			/**
//			 * wait for t1 to end if not ended
//			 */
//			t1.join();
//			/**
//			 * wait for t2 to end if not ended and start t3
//			 */
//			t2.join();
//			/**
//			 * start t3 as said before
//			 */
//			t3.start();
//			/**
//			 * atrt t4 after waiting for a sec for t3 to end if it hasn't ended yet.
//			 */
//			t3.join(1000);
//			t4.start();
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		
//		try{
//			t4.join();
//			t5.start();
//			t5.join();
//		}
//		catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int totalNoOfOccurrences = join1.getNoOfOccurences() + join2.getNoOfOccurences() +join3.getNoOfOccurences()+join4.getNoOfOccurences()+join5.getNoOfOccurences();
//		System.out.println(totalNoOfOccurrences);
//	}

	
	
	public Integer getNoOfOccurences() {
		return noOfOccurences;
	}

	public void setNoOfOccurences(Integer noOfOccurences) {
		this.noOfOccurences = noOfOccurences;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			 System.out.println("Thread started:::"+Thread.currentThread().getName());
			int count = 0;
			List<String> lines = FileUtils.readLines(new File("input"+File.separator+fileName));
			for(String line : lines){
				if(line.contains(this.wordToFind)){
					count ++;
				}
			}
			this.noOfOccurences = count;
			System.out.println("Thread ended:::"+Thread.currentThread().getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
