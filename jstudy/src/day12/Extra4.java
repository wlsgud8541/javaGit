package day12;

public class Extra4 {
	/* 1.
	 * 6개 반의 학생들의 점수를 기억할 배열을 만들고
	 * 각 반 별로 랜덤하게 10 명의 학생을 채우고
	 * 학생별로 5~10과목의 점수를 랜덤하게 60~100사이로 만들어서 채워서
	 * 출력
	 * 
	 * 2.
	 * 각 학생별 총점을 구하고
	 * 각 반별 총점, 반 평균을 구해서 출력
	 * */
	public Extra4() {
		int[][][] score = new int[6][10][];
		
		for (int i = 0; i < score.length; i++) {
			for (int j = 0; j < score[i].length; j++) {
				int num = (int)(Math.random()*6+5);
				score[i][j] = new int[num];
				for (int k = 0; k < score[i][j].length; k++) {
					int ranScore = (int)(Math.random()*41+60);
					score[i][j][k] = ranScore;
				}
			}
		}
		
		for (int i = 0; i < score.length; i++) {
			System.out.print((i+1)+"반");
			System.out.println();
			for (int j = 0; j < score[i].length; j++) {
				System.out.print((j+1)+"번째 학생 : ");
				for (int k = 0; k < score[i][j].length; k++) {
					System.out.print(score[i][j][k]+", ");
				}
				System.out.println();
			}
		}
	}
	
	public static void main(String[] args) {
		new Extra4();
	}
}
