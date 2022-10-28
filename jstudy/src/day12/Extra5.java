package day12;

public class Extra5 {

	public Extra5() {
		int[][][][][] result = new int[3][3][][][];
		
		for (int i = 0; i < result.length; i++) { //3
			for (int j = 0; j < result[i].length; j++) { //3,3
				int num1 = (int)(Math.random()*6+1);
				result[i][j] = new int[num1][][];
				for (int k = 0; k < result[i][j].length; k++){ //3, 3, ?
					int num2 = (int)(Math.random()*6+1);
					result[i][j][k] = new int[num2][5];
					for (int m = 0; m < result[i][j][k].length; m++) {
						for (int l = 0; l < result[i][j][k][m].length; l++) {
							int num3 = (int)(Math.random()*41+60);
							result[i][j][k][m][l] = num3;
						}
					}
				}
			}
		}
		
		for (int i = 0; i < result.length; i++) {
			for (int j = 0; j < result[i].length; j++) {
				for (int k = 0; k < result[i][j].length; k++) {
					for (int m = 0; m < result[i][j][k].length; m++) {
						System.out.print((i+1)+"번째 학교 / ");
						System.out.print((j+1)+"학년 / ");
						System.out.print((k+1)+"반 / ");
						System.out.print((m+1)+"번째 학생 / ");
						for (int l = 0; l < result[i][j][k][m].length; l++) {
							System.out.print(result[i][j][k][m][l]+", ");
						}
						System.out.println();
					}
					System.out.println();
				}
				System.out.println("---------------------------------------------------------------");
			}
			System.out.println("=============================================================");
		}
		
	}
	public static void main(String[] args) {
		new Extra5();
	}

}
