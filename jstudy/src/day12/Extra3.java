package day12;

public class Extra3 {
	public Extra3() {

		int[][][] score = new int[6][][];
		for (int k = 0; k < 6; k++) {
			int num = (int)(Math.random()*13+13);
			score[k] = new int[num][3];
			
			for (int i = 0; i < score[k].length; i++) {
				for (int j = 0; j < 3; j++) {
					score[k][i][j] = (int)(Math.random()*41+60);
				}
			}
		}
		
		//전체 리스트 출력
		for (int k = 0; k < score.length; k++) {
			System.out.print(k+1+"반");
			System.out.println();
			for (int i = 0; i < score[k].length; i++) {
				System.out.print(i+1+"번째 학생 점수 : ");
				for (int j = 0; j < 3; j++) {
					System.out.printf("%3d점",score[k][i][j]);
					
				}
				System.out.println();
			}
			System.out.println("================================================================");
		}
		
		//학생별 총점 출력
		for (int k = 0; k < score.length; k++) {
			System.out.print(k+1+"반");
			System.out.println();
			for (int i = 0; i < score[k].length; i++) {
				int allScore = 0;
				System.out.print(i+1+"번째 학생 총점 : ");
					for (int j = 0; j < 3; j++) {
						allScore += score[k][i][j];
					}
				System.out.printf("%3d점",allScore);
				System.out.println();
			}
			System.out.println("================================================================");
		}
		
		//각 반 별 총점, 평균 출력
		for (int k = 0; k < score.length; k++) {
			int totalScore = 0;
			double avgScore = 0;
			for (int i = 0; i < score[k].length; i++) {
				int allScore = 0;
					for (int j = 0; j < 3; j++) {
						allScore += score[k][i][j];
					}
				totalScore += allScore;
			}
			avgScore = totalScore/score[k].length;
			System.out.print(k+1+"반 총점 : ");
			System.out.printf("%3d점",totalScore);
			System.out.print(" / 평균 : ");
			System.out.printf("%3f점",avgScore);
			System.out.println();
			System.out.println("================================================================");
		}
	}
	
	public static void main(String[] args) {
		new Extra3();
	}
}
