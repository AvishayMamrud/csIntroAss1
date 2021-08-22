/*
 * Task4a
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4a {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		boolean isPrime = true;
			int divisor = 2;
			while(divisor*divisor <= n & isPrime){
				if(n%divisor==0)
					isPrime = false;
				divisor = divisor + 1;
			}//while
			if(isPrime)
				System.out.println("prime");
			else
				System.out.println("composite");
        //---------------write your code ABOVE this line only!--------------
    }

    
}