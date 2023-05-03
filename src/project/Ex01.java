package project;

import java.util.Scanner;

/*
	1. 프로그램명 : LMS 학생성적관리시스템
	2. 작성일 : 2023.05.03
	3. 작성자 : 김연경
	4. 내 용 : 
 */

public class Ex01 {

	public static void main(String[] args) {
		//1. 두 변수(국어, 영어)에 정수를 입력 받아 두 과목의 총점, 평균을 출력하는 프로그램을 작성하시오
		// (1) 두 변수가 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
		// (2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
		// 프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주세요(정수) >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력해 주세요(정수) >> ");
		int eng = sc.nextInt();
		
		int sum = 0;
		double avg = 0.0;
		
		
		if(kor >= 0 && eng >= 0) {
			sum = kor + eng;
			avg = sum / (double)2;
			
			System.out.println("총점 : " + sum + "점, 평균 : " + avg + "점");
		}else {
			System.out.println("계산할 수 없습니다.");
		}
	}

}
