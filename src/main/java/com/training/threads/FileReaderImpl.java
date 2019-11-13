package com.training.threads;

import java.util.List;

public class FileReaderImpl implements FileReader{

	
	

	@Override
	public Integer noOfOccurrences(List<String> filenames, String occureces) {
		FileReaderRunnable join1 = new FileReaderRunnable(filenames.get(0), occureces);
		FileReaderRunnable join2 = new FileReaderRunnable(filenames.get(1), occureces);
		FileReaderRunnable join3 = new FileReaderRunnable(filenames.get(2), occureces);
		FileReaderRunnable join4 = new FileReaderRunnable(filenames.get(3), occureces);
		FileReaderRunnable join5 = new FileReaderRunnable(filenames.get(4), occureces);
		
		Thread t1 = new Thread(join1, "Thread1");
		Thread t2 = new Thread(join2, "Thread2");
		Thread t3 = new Thread(join3, "Thread3");
		Thread t4 = new Thread(join4, "Thread4");
		Thread t5 = new Thread(join5, "Thread5");
		t1.start();
		try {
			/**
			 *start t2 after waiting for 1 sec for t1 to end
			 */
			t1.join(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		t2.start();
	
		try {
			/**
			 * wait for t1 to end if not ended
			 */
			t1.join();
			/**
			 * wait for t2 to end if not ended and start t3
			 */
			t2.join();
			/**
			 * start t3 as said before
			 */
			t3.start();
			/**
			 * atrt t4 after waiting for a sec for t3 to end if it hasn't ended yet.
			 */
			t3.join(1000);
			t4.start();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try{
			t4.join();
			t5.start();
			t5.join();
		}
		catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		int totalNoOfOccurrences = join1.getNoOfOccurences() + join2.getNoOfOccurences() +join3.getNoOfOccurences()+join4.getNoOfOccurences()+join5.getNoOfOccurences();
		System.out.println(totalNoOfOccurrences);
		return totalNoOfOccurrences;
	}

	

	
	

}
