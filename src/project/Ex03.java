package project;

/*
1. 프로그램명 : LMS 학생성적관리시스템
2. 작성일 : 2023.05.03
3. 작성자 : 김연경
4. 내 용 : 
*/

class Cals {
	//메소드
	public int sum(int kor, int eng) {
		return kor + eng;
	}
	
	public double avg(int kor, int eng) {
		return (kor + eng) / (double)2;
	}

}

public class Ex03 {

	public static void main(String[] args) {
		//1. 두 변수(국어, 영어)에 정수를 입력 받아 두 과목의 총점, 평균을 출력하는 프로그램을 작성하시오
		// (1) 두 변수가 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
		// (2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
		// (3) 메소드를 이용하여 총점 및 평균을 구하는 프로그램을 작성한다.
//		   (4) 객체를 별도로 작성하여 작성한 객체에 메소드를 작성하여 출력한다. 
		// 프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.

		//객체타입은 new 를 이용해서 사용
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("국어 점수 >> ");
//		int kor = sc.nextInt();
//		System.out.print("영어 점수 >> ");
//		int eng = sc.nextInt();

		int kor = 50;
		int eng = 100;
		
		if(kor >= 0 && eng >= 0) {
			Cals c = new Cals();
			System.out.println("총점 : " + c.sum(kor, eng) + "점");
			System.out.println("평균 : " + c.avg(kor, eng) + "점");
		}else {
			System.out.println("계산할 수 없습니다.");
		}
		
		
		
	}
}
