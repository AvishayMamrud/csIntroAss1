/*
 * Task4e
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */

import java.util.Scanner;

public class Task4e {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner(System.in);
		int n = myScanner.nextInt();
		int b = myScanner.nextInt();
		int s = myScanner.nextInt();
		int d = myScanner.nextInt();
		int sqr = 1;
		boolean isPrime = false;
		for(int i = 0;i<d;i=i+1){
			sqr = (sqr * b)%n;
		}//now sqr = (b^d)%n
		if(sqr == 1 | sqr == (n-1)){//consider (b^((2^0)*d))%n==(n-1)
			isPrime = true;
		}//if
		int result = sqr;
		for(int j = 1;j<=(s-1) & isPrime==false;j=j+1){
			result = (result * result)%n;
			if(result == (n-1)){
				isPrime = true;
			}//if
		}//now result = (b^((2^j)*d))%n
		if(isPrime){
			System.out.println("we assume " + n + " is a prime");
		}else{
			System.out.println(b + " is a witness. " + n + " is a composite");
		}
        //---------------write your code ABOVE this line only!--------------
    }

    
}