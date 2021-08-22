/*
 * Task4c
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4c {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		n = (int)(Math.random()*(n-2))+2;//throws a number between 2 and n (n excluded)
		System.out.println(n);
		//---------------write your code ABOVE this line only!--------------
    }

    
}