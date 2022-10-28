package day12;

public class Extra {
	/* 1.
	 * 6개 반의 학생들의 점수를 기억할 배열을 만들고
	 * 각 반 별로 랜덤하게 12 ~ 25 명의 학생을 채우고
	 * 학생별로 3과목의 점수를 랜덤하게 60~100사이로 만들어서 채워서
	 * 출력
	 * 
	 * 2.
	 * 각 학생별 총점을 구하고
	 * 각 반별 총점, 반 평균을 구해서 출력
	 * 
	 * 
	 * */
	
	public Extra() {
		
		for (int k = 0; k < 6; k++) {
			int num = (int)(Math.random()*13+13);
			int[][] score = new int[num][3];
			
			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < 3; j++) {
					score[i][j] = (int)(Math.random()*61+40);
				}
			}

			for (int i = 0; i < score.length; i++) {
				for (int j = 0; j < 3; j++) {
					System.out.print(score[i][j]+", ");
				}
				System.out.println();
			}
			System.out.println("================================================================");
		}
	}
	
	public static void main(String[] args) {
		new Extra();
	}
}
