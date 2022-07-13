package lesson.day03;

public class Computer{
	int sum1(int ... values) {
		int sum = 0;
		for (int i = 0; i < values.length; i++) {
			sum += values[i];
		}
		System.out.println(sum);
		return sum;
	}
}
