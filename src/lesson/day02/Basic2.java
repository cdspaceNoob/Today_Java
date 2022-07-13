package lesson.day02;

public class Basic2 {

	public static void main(String[] args) {
		// 아래 금액을 5만 / 1만 / 5천 /1천 / 500 / 100 / 50 / 10/ 5 / 1 단위 

		
//		int saimdang = amount/50000;
//		int saimdang_change = amount%50000;
//		
//		int million = saimdang_change/10000;
//		int million_change = saimdang_change%10000;
//		
//		int leehwang = million_change/5000;
//		int leehwang_change = million_change%5000;
//		
//		int leelee = leehwang_change/1000;
//		int leelee_change = leehwang_change%5000;
//		
//		int hark = leelee_change/500;
//		int hark_chnage = leelee_change%500;
//		
//		int back = hark_chnage/100;
//		int back_change = hark_chnage%100;
//		
//		int halfback = back_change/50;
//		int halfback_change = back_change%50;
//		
//		int last = halfback_change/10;
//		int last_change = halfback_change%10;
		
//			System.out.println(
//					"5만 원 권:"
//					+saimdang+
//					 "\n만 원 권: "
//					+million
//					+"\n오 천 원 권:"
//					+ leehwang
//					+"\n천 원 권:"
//					+ leelee
//					+"\n오 백 원:"
//					+ hark
//					+"\n백 원:"
//					+ back
//					+"\n오 십 원:"
//					+ halfback
//					+"\n십 원:"
//					+ last
//					+"\n일 원:"
//					+ change
//					
//					);
		
		// 한 번 선언해 놓은 변수는 특별한 조건이 없는 한 계속해서 동적으로 변화시킬 수 있다
//		result = insert/50000;
//		piece += result;
//		System.out.println("5 만 원:"+result+"장");
//		amount = insert%50000;
//		
//		result = amount/10000;
//		piece += result;
//		System.out.println("1 만 원:"+result+"장");
//		amount = amount%10000;
//		
//		result = amount/5000;
//		piece += result;
//		System.out.println("5 천 원:"+result+"장");
//		amount = amount%5000;
//		
//		result = amount/1000;
//		piece += result;
//		System.out.println("1 천 원:"+result+"장");
//		amount = amount%5000;
//		
//		result = amount/500;
//		piece += result;
//		System.out.println("500 원:"+result+"개");
//		amount = amount%500;
//		
//		result = amount/100;
//		piece += result;
//		System.out.println("100 원:"+result+"개");
//		amount = amount%100;
//		
//		result = amount/50;
//		piece += result;
//		System.out.println("50 원:"+result+"개");
//		amount = amount%50;
//		
//		result = amount/10;
//		piece += result;
//		System.out.println("10 원:"+result+"개");
//		amount = amount%10;
//		
//		result = amount/1;
//		piece += result;
//		System.out.println("1 원:"+result+"개");
//		
//		System.out.println("총"+piece+"장(+개)");
		
		
		int amount = 324178;
		int result = 0;
		int piece = 0;
		int unit = 50000;
		
		int len = (int)( Math.log10(amount)+1);
		
 
		for(int i = 0; i < len; i++) {
			result = amount/unit;
			piece += result;
			System.out.println(unit+"권 "+result+"장");
			amount = amount%unit;
			
			if(i%2==0) {
				unit /= 5;
			} else {
				unit /= 2;
			}
		}
		
		
	}

}
