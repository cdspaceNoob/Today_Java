package lesson.day03;

public class Basic02 {

	public static void main(String[] args) {
		for(int j=0; j<8; j++) {
			int stage = j+2;
			int n = 1;
			System.out.println("");
			for (int i=0; i<9; i++) {
				// n = i + 1;
				System.out.println(stage+"*"+n+"="+(stage*n));
				n = n + 1;
			}
		}
	}
}
