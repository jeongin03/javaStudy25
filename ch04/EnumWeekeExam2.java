package ch04;

public class EnumWeekeExam2 {

	public static void main(String[] args) {
		// 요일별 스케줄(일일 학습목표)
		
		Week today = null ;
	//  타입   변수     빈값  ;
		
		if(today == Week.SUNDAY) {
			System.out.println("일요일입니다. 열심히 집안일을 합시다.");
		}else if(today == Week.MONDAY) {
			System.out.println("월요일입니다. 열심히 자바공부를 합시다.");
		}else if(today == Week.TUESDAY) {
			System.out.println("화요일입니다. 열심히 오라클db공부를 합시다. ");
		}else if (today == Week.WEDNESDAY) {
			System.out.println("수요일입니다. 열심히 jsp공부를 합니다.");
		}else if(today == Week.THURSDAY) {
			System.out.println("목요일입니다. 열심히 클라우드공부를 합니다.");
		}else if(today == Week.FRIDAY) {
			System.out.println("금요일입니다. 열심히 파이썬공부를 합니다.");
		}else if (today == Week.SATURDAY) {
			System.out.println("토요일입니다. 열심히 영화를 봅니다.");
		}
			

	}

}
