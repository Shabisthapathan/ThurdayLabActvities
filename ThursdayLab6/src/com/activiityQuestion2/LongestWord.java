package com.activiityQuestion2;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class LongestWord {

	public static void main(String[] args) throws FileNotFoundException {
		new LongestWord().getLongestWords();

	}
	public String getLongestWords()throws FileNotFoundException{
		String longestWord="";
		String current;
		Scanner scan=new Scanner(new File("C:\\Users\\shabi\\OneDrive\\Desktop\\pathan.txt"));
		
		while(scan.hasNext())
		{
			current=scan.next();
			if (current.length()>longestWord.length())
			{
				longestWord=current;
			}
		}
		System.out.println(longestWord);
		return longestWord;
	}

}
