package project;

import java.util.Scanner;

/*
1. 프로그램명 : LMS 학생성적관리시스템
2. 작성일 : 2023.05.03
3. 작성자 : 김연경
4. 내 용 : 
*/

public class Ex02 {

	public static void main(String[] args) {
		//1. 두 변수(국어, 영어)에 정수를 입력 받아 두 과목의 총점, 평균을 출력하는 프로그램을 작성하시오
		// (1) 두 변수가 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
		// (2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
		// (3) 메소드를 이용하여 총점 및 평균을 구하는 프로그램을 작성한다.
//		     단, 별도의 클래스를 만들지 않고 public class 내부에 메소드를 작성하여 출력한다.
		// 프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.

		//접근제한 : public(아무거나), private(현재페이지), protected(상속)
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주세요(정수) >> ");
		int stdKor = sc.nextInt();
		
		System.out.print("영어 점수를 입력해 주세요(정수) >> ");
		int stdEng = sc.nextInt();
		
		//사용하는 쪽은 값 또는 변수
		//메소드는 타입 변수명
		
		if(stdKor >= 0 && stdEng >= 0) {
			System.out.println("총점 : " + Ex02.sum(stdKor, stdEng));
			System.out.println("평균 : " + Ex02.avg(stdKor, stdEng));
		}else {
			System.out.println("계산할 수 없습니다.");
		}
		sc.close();
		
	}
	
	//총점
	public static int sum(int stdKor, int stdEng) {
		int sum = 0;
		sum = stdKor + stdEng;
		
		return stdKor + stdEng;
	}
	
	//평균
	public static double avg(int stdKor, int stdEng) {
		
		return (stdKor + stdEng) / (double)2;
	}
}
