package lesson.day03;

public class MyCalendar {
	// 달력 서비스
	// 1. 데이터 정보: 변수(필드 또는 속성)
	// 2. 프로세스 정보: 메소드 
	
	public void viewMethod() {
		int year = 2022;
		int month = 8;
		int startDay = 3%7;
		int lastDay = 31;
		
		// 이런 기능들은, 클래스 내부에서는 메소드로 정의되어야 한다 
		System.out.println("\t \t \t"+year+"년 "+month+"월");
		System.out.println("\t일 \t월 \t화 \t수 \t목 \t금 \t토");
		
		for (int i = 0; i < startDay-1; i++) {
			System.out.print("\t");
		}
		
		for (int d = 1; d < lastDay+1; d++) {
			System.out.print("\t"+d);
			if((d+startDay)%7==0) {
				System.out.println("");
			}
		}
	}
}