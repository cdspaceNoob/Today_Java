package lesson.test.day0711;
import java.util.Scanner;
public class A4 {

	public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        int intVal01 = scanned.nextInt();
        int intVal02 = scanned.nextInt();
        System.out.println(intVal01 * (intVal02%10));
        System.out.println(intVal01 * ((intVal02/10)%10));
        System.out.println(intVal01 * ((intVal02/10)/10));
	}

}
