package project;

import java.util.Scanner;

class Cal02 {
	public int sum(int[] score){
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
		
		return sum / (double) score.length;
	}
	
}


public class Ex06 {

	public static void main(String[] args) {
		//1. 국어, 영어, 수학 점수를 Scanner 객체로 입력 받아 배열에 저장 후 총점, 평균을 출력하는 프로그램을 작성하시오
		// (1) 국어, 영어, 수학 점수가 0보다 클 때만 총점, 평균을 구하며 0보다 크지 않을 때는 "계산할 수 없습니다"라는 메시지를 출력한다.
		// (2) 출력 결과에 총점은 총점 : **점, 평균은 평균 : **.**점으로 출력형식을 맞춰 출력한다.
		// (3) 메소드를 이용하여 총점 및 평균을 구하는 프로그램을 작성한다.
		// (4) 객체를 별도로 작성하여 작성한 객체에 메소드를 작성하여 출력한다.
		// 프로젝트명, 패키지명, 파일이름, 객체이름, 필드이름, 메소드이름 등은 임의로 작성하여도 좋다.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력해 주세요(정수) >> ");
		int kor = sc.nextInt();
		
		System.out.print("영어 점수를 입력해 주세요(정수) >> ");
		int eng = sc.nextInt();
		
		System.out.print("수학 점수를 입력해 주세요(정수) >> ");
		int mat = sc.nextInt();
		
		int[] score = new int[3];
		score[0] = kor;
		score[1] = eng;
		score[2] = mat;
		
		if(score[0] > 0 && score[1] > 0 && score[2] > 0) {
			Cal02 c = new Cal02();
			
			System.out.println("합계 : " + c.sum(score) + "점");
			System.out.println("평균 : " + c.avg(score) + "점");
			
		}else {
			System.out.println("계산할 수 없습니다.");
		}

		
		
	}

}
