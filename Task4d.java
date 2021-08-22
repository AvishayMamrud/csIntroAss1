/*
 * Task4d
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4d {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int sqr = 1;
		int s = 0;
		int d = 0;
		while(sqr<n & (((n-1)/sqr)%2)!=1){
			sqr=sqr*2;
			s=s+1;
			d=((n-1)/sqr);
		}
		System.out.println(s);
		System.out.println(d);
        //---------------write your code ABOVE this line only!--------------
    }

    
}