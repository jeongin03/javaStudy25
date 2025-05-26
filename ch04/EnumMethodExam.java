package ch04;

public class EnumMethodExam {

	public static void main(String[] args) {
		// name()메소드 
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println("객체의 이름은 : " + name);
		
		int ordinal = today.ordinal();
		System.out.println("열거순서는 : " + ordinal);
		
		// compareTo() 메소드
		Week day1 = Week.MONDAY ; 
		Week day2 = Week.WEDNESDAY ;
		
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueof() 메소드
		Week weekday = Week.valueOf("MONDAY");
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) {
			System.out.println("주말이군요 푹 쉬시고 평일에 힘냅시다!!!");
		}else {
			System.out.println("평일이군요 학습을 위해 8시간 이상은 주무세요 !!!");
			
		}
		
		// values()메소드 
		Week[] days = Week.values(); // Week에 열거상수를 days 배열로 생성
		for(Week a : days) {
			System.out.print(a + " ");
		}

	}

}
