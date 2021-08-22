/*
 * Task1
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
        int a = myScanner.nextInt(); 
		int b = myScanner.nextInt();
		int q = myScanner.nextInt();
		int r = myScanner.nextInt();
		if (r<b & b!=0 & a==q*b+r) {
			System.out.println("yes");
		}else{
			System.out.println("no");
		}
        //---------------write your code ABOVE this line only!--------------
    }

    
}