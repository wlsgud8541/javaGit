package day12;

public class Extra2 {
	public Extra2() {

		int[][][] score = null;
		for (int k = 0; k < 6; k++) {
			int num = (int)(Math.random()*13+13);
			score = new int[6][num][3];
			
			for (int m = 0; m < score.length; m++) {
				for (int i = 0; i < score[m].length; i++) {
					for (int j = 0; j < 3; j++) {
						score[m][i][j] = (int)(Math.random()*41+60);
					}
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
	}
	
	public static void main(String[] args) {
		new Extra2();
	}
}
