package com.DisplayCubeOfTheNumber;
import java.util.*;
public class DisplayCubeNumber {
	

		public static void main(String[] args) {
			int i,b;
			System.out.println("Input Number Of Terms:");
			Scanner sc=new Scanner(System.in);
			b=sc.nextInt();
			
			for(i=1;i<=b;i++) {
				System.out.println("Number is:"+i+"and cube of "+i+ "is:"+(i*i*i));
			}

		}

	}

}
