package lesson.day03;
import java.util.Scanner;
public class NineByNine {
	// 1. 단수를 한 개씩 올리면서 반복 
	// 2. 1부터 9까지 곱하는 걸 반복 
	// for문 두 개 
	// 3. 사용자로부터 숫자를 입력 받아야하므로 
	// Scanner 가져오기 
	
	public int[] getArr(){
		try (Scanner var = new Scanner(System.in)) {
			int from = var.nextInt();
			int to = var.nextInt();
			int[] target = {from, to};
			return target;
		}
	}
	
	
	public int getTarget(){
		try (Scanner var = new Scanner(System.in)) {
			int target = var.nextInt();
			return target;
		}
	}
	
	
	public void nBnTarget() {
		System.out.println("몇 단 보실래요?");
		int numberTarget = this.getTarget();
		
		System.out.println(numberTarget+"단");
		
		for(int times = 1; times < 9+1; times++) {
			System.out.println(numberTarget+"*"+times+"="+(numberTarget*times));
		}
	}
	
	
	public void nBnRange(){
		System.out.println("몇 단부터 몇 단까 보실 건가요?");
		int[] target = this.getArr();
		
		System.out.println(target[0]+"단부터 "+target[target.length-1]+"단까지\n");
		
		for(int i = target[0]; i < target[target.length-1]+1; i++) {
			System.out.println(i+"단");
			for(int times = 1; times < 9+1; times++) {
				System.out.println(i+"*"+times+"="+(i*times));
			}
			System.out.println();
		}
	
	}
	
	
	public void nBnFull() {
		System.out.println("구구단 전체\n");
		for(int i = 2; i < 9+1; i++) {
			System.out.println(i+"단");
			for(int times = 1; times < 9+1; times++) {
				System.out.println(i+"*"+times+"="+(i*times));
			}
			System.out.println();
		}
	}

}
