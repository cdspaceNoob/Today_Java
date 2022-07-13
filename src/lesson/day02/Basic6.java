package lesson.day02;

public class Basic6 {

	public static void main(String[] args) {
		/* 90이상 A
		* 80-89 B
		* 70-79 C
		* 60-69 D
		* -59 F
		* int score = 82; 일 때 점수의 등급을 출력하는 코드 작성: IF문 사용 
		*/ 

		int score = 92;
		char grade = 'F';
		int grader = score/10;
		
		System.out.println(grader);
		
		switch(grader) {
			case 9:
				grade = 'A';
				break;
			case 8:
				grade = 'B';
				break;
			case 7:
				grade = 'C';
				break;
			case 6:
				grade = 'D';
				break;
		}
		
		System.out.println(grade);
//		if(90 <= score ) {
//			System.out.println("A");
//		}else if(80 < score) {
//			System.out.println("B");
//		}else if(70 < score) {
//			System.out.println("C");
//		}else if(60 < score) {
//			System.out.println("D");
//		}else {
//			System.out.println("F");
//		}
	}

}
