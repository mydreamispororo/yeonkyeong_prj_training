package project;

import java.util.Scanner;

class Cal01 {
	public int sum(int kor, int eng, int mat){
				
		return kor + eng + mat;
	}
	
	public double avg(int kor, int eng, int mat) {
		
		return (kor + eng + mat) / (double) 3;
	}
	
}

public class Ex05 {
	
	public static void main(String[] args) {
		//1. 국어, 영어, 수학 점수를 Scanner 객체로 입력 받아 총점, 평균을 출력하는 프로그램을 작성하시오
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
		
		//삼항연산자 : (조건) ? "참" : "계산을 할 수 없습니다."
		
//		String str = kor > 0 && eng > 0 && mat > 0 ? "계산할 수 있습니다." : "계산을 할 수 없습니다.";
//		System.out.println(str);
		
		if(kor > 0 && eng > 0 && mat > 0) {
			Cal01 c01 = new Cal01();
			System.out.println(c01.sum(kor, eng, mat));
			System.out.println(c01.avg(kor, eng, mat));
		}else {
			System.out.println("계산할 수 없습니다.");
		}
		
		sc.close();
		
		
		

	}

}
