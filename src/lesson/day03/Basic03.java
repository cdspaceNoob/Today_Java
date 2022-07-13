package lesson.day03;

public class Basic03 {

	public static void main(String[] args) {
		// 프로그램 짜기 전에 뭐가 필요한지
		// 어떤 시퀀스를 가질지 먼저 필기하라 
		// 하나씩 처리하라 
		int year = 2022;
		int month = 8;
		int startDay = 3%7;
		int lastDay = 31;
		
		//String days = "\t일 \t월 \t화 \t수 \t목 \t금 \t토";
		
		System.out.println("\t \t \t"+year+"년 "+month+"월");
		//System.out.println(days);
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
		
		
		/*
		System.out.println("\t1 \t2 \t3 \t4 \t5 \t6 \t7");
		System.out.println("\t8 \t9 \t10 \t11 \t12 \t13 \t14");
		System.out.println("\t15 \t16 \t17 \t18 \t19 \t20 \t21");
		System.out.println("\t22 \t23 \t24 \t25 \t26 \t27 \t28");
		System.out.println("\t29 \t30 \t31");
		*/

	}

}
