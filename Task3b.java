/*
 * Task3b
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task3b {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int k = myScanner.nextInt();
		int result = 1;
		while (n>0) {
			result = (result * 2)%k;
			n = n-1;
		}//while
		System.out.println(result);
        //---------------write your code ABOVE this line only!--------------
    }

    
}