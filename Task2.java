/*
 * Task2
 *
 * Authentic author: <name>
 * I.D.: <id number>
 * Last update: <dd/mm/yy>
 */
 
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
        //---------------write your code BELOW this line only!--------------
		Scanner myScanner = new Scanner (System.in);
		int a = myScanner.nextInt();
		int b = myScanner.nextInt();
		int x = (int)(Math.random() * (b-a) + a);
		System.out.println(x);
        //---------------write your code ABOVE this line only!--------------
    }

    
}