package oday04;

public class Ex01 {
	/*
	 * 문제 1 ]
	 * String[] student = {"제니", "리사", "로제", "지수"};
	 * int[] java = {100, 80, 90, 95};
	 * int[] db = {90, 95, 80, 80};
	 * int[] web = {80, 80, 95, 100};
	 * */
	public static void main(String[] args) {
		//문제 : 1. 이차원배열 score 에 자바, 디비, 웹 점수를 학생별로 기억시키세요. 
		//		 2. 각 학생의 총점을 score 배열을 이용해서 구하고 입력하세요.
		String[] student = {"제니", "리사", "로제", "지수", "과목총점"};
		int[] java = {100, 80, 90, 95};
		int[] db = {90, 95, 80, 80};
		int[] web = {80, 80, 95, 100};
		int[] subTotal = {0, 0, 0, 0};
		
		int[][] score = new int[4][3];
		//int[][] score2 = new int[5][4];
		int[][] score2 = new int[4][5];
		int[] total = new int[4];

		for (int i = 0; i < 4; i++) {
			score[i][0] = java[i];
			score[i][1] = db[i];
			score[i][2] = web[i];
		}
		/*
		
		int num = 0;
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < score[i].length; j++) {
				total[i] = total[i] + score[i][j];
			}
		}
		
		for (int i = 0; i < 4; i++) {
			score2[i][0] = java[i];
			score2[i][1] = db[i];
			score2[i][2] = web[i];
			score2[i][3] = total[i];
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 5; j++) {
				num += score2[j][i];
			}
			score2[4][i] = num;
			num=0;
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.printf((i != 4)? "%s     : " : "%s : " , student[i]);
			for (int j = 0; j < score2[i].length; j++) {
				System.out.printf((j != 3)? "%4d점, " : "%4d점", score2[i][j]);
			}
			System.out.println();
		}
		*/
		
		for (int i = 0; i < score2.length -1; i++) {
			for (int j = 0; j <= score2.length -1; j++) {
				score2[i][j] = score[j][i];
				score2[i][score2[i].length-1] += score[j][i];
				score2[score2.length -1][j] += score[j][i];
			}
		}
		
		for (int[] i : score2) {
			for (int no : i) {
				System.out.printf("%4d |", no);
			}
			System.out.println();
		}
	}
}
