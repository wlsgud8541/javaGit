package day13;

public class Test07 {
	/*
	 * 5명의 학생의 자바, 디비, 웹 점수를 랜덤하게 샛팅한 후
	 * 총점을 계산해서 출력하는 프로그램을 작성
	 * */
	public Test07() {
		int[][] score = getStuds();
		int[] total = getTotal(score);
		toPrint(score, total);
	}
	
	public static void main(String[] args) {
		new Test07();
	}
	
	public int[][] getStuds(){
		int[][] arr= new int[5][3];
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = (int)(Math.random()*41+60);
			}
		}
		return arr;
	}
	
	
	public int[] getTotal(int[][] n) {
		int[] total = new int[n.length];
		
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n[i].length; j++) {
				total[i] += n[i][j];
			}
		}
		return total;
	}
	
	public void toPrint(int[][] subj, int[] total) {
		for (int i = 0; i < subj.length; i++) {
			System.out.print("|");
			for (int j = 0; j < subj[i].length; j++) {
				System.out.printf("%3d | ", subj[i][j]);
			}
			System.out.println(" : 총점 - "+total[i]);
		}
		
	}
	
}
