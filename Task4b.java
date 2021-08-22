/*
 * Task4b
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4b {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int nOfPrime = 0;
		boolean isPrime = true;
		for(int num = 2;num<=n;num=num+1){
			for(int divisor = 2 ; divisor*divisor <= num & isPrime; divisor = divisor + 1){
				if(num%divisor==0)
					isPrime = false;
			}//for
			if(isPrime)
				nOfPrime=nOfPrime+1;
			else
				isPrime = true;
		}//for
		System.out.println(nOfPrime);
		//---------------write your code ABOVE this line only!--------------
    }

    
}