/**
 * 
 */
package com.acadgild.objectorienteconcepts;

import java.util.Scanner;

/**
 * @author shrinivasa.goudar
 *
 */
public class PrimeNUmber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter  the  number");
		int givenNumber = sc.nextInt();
		PrimeNUmber prime = new PrimeNUmber();
		if (givenNumber<=1)  {
			System.out.println("Given number is not a prime");
		}else {
			prime.isPrimeNUmber(givenNumber);
		}
		
	}

	/**
	 * @param givenNumber
	 */
	private void isPrimeNUmber(int givenNumber) {
		int flag = 0;
		for (int i = 2; i <=(givenNumber/2); i++) {
			if (givenNumber % i == 0) {
				System.out.println(" The given Number :" + givenNumber
						+ " is not Prime Number");
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			System.out.println(" The given Number :" + givenNumber
					+ " is Prime Number");
		}
	}

}
