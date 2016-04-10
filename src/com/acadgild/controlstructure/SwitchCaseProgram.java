/**
 * 
 */
package com.acadgild.controlstructure;

/**
 * @author shrinivasa.goudar
 *
 */
public class SwitchCaseProgram {

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		//Assigning the month value as 6.
		int month = 6;

		switch (month) {

		case 1:
			//This case will executed for month is equal to 1
			System.out.println("Jan Month Has 31 Days");
			break;
		case 2:
			//This case will executed for month is equal to 2
			System.out.println("Feb Month Has 28/29 Days");
			break;
		case 3:
			//This case will executed for month is equal to 3
			System.out.println("March Month Has 31 Days");
			break;
		case 4:
			//This case will executed for month is equal to 4
			System.out.println("April Month Has 30 Days");
			break;
		case 5:
			//This case will executed for month is equal to 5
			System.out.println("May Month Has 30 Days");
			break;
		case 6:
			//This case will executed for month is equal to 6
			System.out.println("June Month Has 31 Days");
			break;
		case 7:
			//This case will executed for month is equal to 7
			System.out.println("July Month Has 30 Days");
			break;
		case 8:
			//This case will executed for month is equal to 8
			System.out.println("August Month Has 31 Days");
			break;
		case 9:
			//This case will executed for month is equal to 9
			System.out.println("September Month Has 30 Days");
			break;
		case 10:
			//This case will executed for month is equal to 10
			System.out.println("October Month Has 31 Days");
			break;
		case 11:
			//This case will executed for month is equal to 11
			System.out.println("November Month Has 30 Days");
			break;
		case 12:
			//This case will executed for month is equal to 12
			System.out.println("December Month Has 31 Days");
			break;
		default:
			System.out.println("Invalid Month");
			break;
		}
	}

}
