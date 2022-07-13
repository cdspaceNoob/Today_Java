package lesson.day02;
import java.util.Scanner;
public class Time {

	public static void main(String[] args) {
        Scanner scanned = new Scanner(System.in);
        int intVal01 = scanned.nextInt();
        int intVal02 = scanned.nextInt();
        
        String strVal = String.valueOf(intVal02);
        
        String[] digits = strVal.split("(?<=.)");
        
        System.out.println(digits[0]);
        System.out.println(digits[1]);
        System.out.println(digits[2]);
        System.out.println(Integer.parseInt(digits[1]));
       
        //System.out.println(digits);
       
        
        
        //for(int i = 0; i < digits.length; i++){
        for(int i = digits.length-1; i < 0; i--){
            System.out.println((Integer.parseInt(digits[i])) * intVal01);
        }
    }
}
