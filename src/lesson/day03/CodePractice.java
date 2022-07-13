package lesson.day03;

public class CodePractice {
	// 누구나 사용할 수 있는 메소드이며 1~10까지의 합계를 구하여 출력하는 코드를 가지고 있다
	// 1. 누구나 사용할 수 있다: public
	// 2. 리턴한다는 말은 없다 / 가지고만 있다고 했다 / return type: void
	// 3. 메소드 식별자: calcuSum()

	//	public void calcuSum() {
//		int sum = 0;
//		for(int n=1; n<11; n++) {
//			sum += n;
//		}
//		System.out.print(sum);
//	}
	
	// 코드를 좀 더 명확하게
//		public void calcuSum() {
//			int sum = 0;
//			int element = 1;
//			for(int i=1; i<10+1; i++) {
//				sum += element;
//				element++;
//			}
//			System.out.print(sum);
//		}
		
		// 마지막 값을 사용자로부터 입력받는다면? 
		// 사용자로부터 마지막 값을 입력받아서, 연산을 수행한 후, 그 결과를 외부로 리턴(전달)하겠다
//		public int calcuSum(int second) {
//			int result = 0;
//			int sum = 0;
//			int element = 1;
//			for(int i=1; i<second+1; i++) {
//				sum += element;
//				element++;
//			}
//			System.out.print(sum);
//			result = sum;
//			return result;
//		

		
}

