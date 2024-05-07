package sup1.model;

public class Score {
//필드
	private int 국;
	private int 영;
	private int 수;
	private int 총점;
	private double 평균;
//메서드
	//필수 생성자
	public Score(int 국, int 영, int 수) {
		this.국 = 국;
		this.영 = 영;
		this.수 = 수;
	}
	//void 점수
	public void 결과() {
		총점 = 국 + 영 + 수;
		평균 = 총점 / 3.0;
		//각 점수가 50 이상 평균 50점 이상
		//삼항연산자로 합격 불합격
		String 결과 = (국>=50 && 수 >=50 && 영>=50 && 평균 >= 50) ? "합격" : "불합격";
		//출력문으로 국어영어 수학점
		System.out.println("국어 점수 : " + 국);
		System.out.println("영어 점수 : " + 영);
		System.out.println("수학 점수 : " + 수);
		//삼항연산자에 대한 결과 출력
		System.out.println(결과);
	}


}