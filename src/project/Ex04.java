package project;
/*
 * 1. 프로그램명 : 학생성적관리시스템(LMS)
 * 2. 작성일 : 2023.05.03
 * 3. 작성자 : 김연경
 * 4. 내 용 : 배열을 이용하여 성적 출력하기
*/



class Cal {
	public int sum(int[] score) {
		int sum = 0;
		for(int result : score) {
			sum += result;
		}
		
		return sum;
	}
	
	public double avg(int[] score) {
		double avg = 0.0;
		int sum = 0;
		
		for(int i = 0; i < score.length; ++i) {
			sum += score[i];
		}
		return  sum / (double) score.length;
	}
}

public class Ex04 {

	public static void main(String[] args) {
		//1. 국어, 영어, 수학 점수를 배열에 저장하여 총점, 평균을 출력하는 프로그램을 작성하시오
		// (1) 배열에 저장된 값이 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
		// (2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
		// (3) 메소드를 이용하여 총점 및 평균을 구하는 프로그램을 작성한다.
		// (4) 객체를 별도로 작성하여 작성한 객체에 메소드를 작성하여 출력한다.
		// 프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.

		int[] score = new int[] {60, 85, 70};

		if((score[0] > 0) && (score[1] > 0) && (score[2] > 0)) {
		Cal c = new Cal();
		System.out.println(c.sum(score));
		System.out.println(c.avg(score));
		
		}else {
			System.out.println("계산할 수 없습니다.");
		}
	}

}
