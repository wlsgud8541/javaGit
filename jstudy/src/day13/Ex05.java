package day13;

public class Ex05 {
/*
 * 10명의 학생의 국어, 영어, 수학 점수를(60~100)
 * 랜덤하게 셋팅해서
 * 총점, 평균, 석차를 계산해서 출력하는 프로그램을 작성
 * 
 * 각 기능은 모두 별도의 함수로 작성하고
 * 배열은 [10][6]로 만들어서 처리
 * 
 * 국어, 영어, 수학, 총점, 평균, 석차
 * */
	
	public Ex05() {
		int[][] score;
		score = setScore();
		score = setTotalScore(score);
		score = setAvgScore(score);
		score = setRankScore(score);
		toPrint(score);
	}
	
	public int[][] setScore(){
		int[][] score = new int[10][6];
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < 3; j++) {
				int num = (int)(Math.random()*41+60);
				score[i][j] = num;
			}
		}
		return score;
	}
	
	
	// 총점 계산
	public int[][] setTotalScore(int[][] score){
		for (int i = 0; i < score.length; i++) {
			int num = 0;
			for (int j = 0; j < 4; j++) {
				if (j < 3) {
					num += (int) score[i][j]; 
				}else if (j == 3) {
					score[i][j] = num;
				}
			}
		}
		return score;
	}
	
	// 평균 계산
	public int[][] setAvgScore(int[][] score){
		int num = 0;
		for (int i = 0; i < score.length; i++) {
			num = score[i][3]/3;
			score[i][4] = num;
		}

		return score;
	}
	
	//석차 계산
	public int[][] setRankScore(int[][] score){
		for (int i = 0; i < score.length; i++) {
			int cnt = 1;
			score[i][5] = 1;
			for (int j = 0; j < score.length; j++) {
				if (score[i][3] <= score[j][3] && i != j) {
					score[i][5] += cnt;
				}
			}
		}
		
		return score;
	}
	
	
	public void toPrint(int[][] score) {
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				System.out.print(score[i][j]+", ");
			}
			System.out.println();
		}
	}
	

	
	
	public static void main(String[] args) {
		new Ex05();
	}
}
