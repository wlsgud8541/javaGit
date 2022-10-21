package day08;

/*
 * 	Nemo 객체 10개를 기억할 배열을 만들어서 기억시키고
 *  세로의 내림차순으로 정렬해서
 *  출력해주는 프로그램을 작성하세요
 * 
 * 
 * */
public class Test07 {
	public static void main(String[] args) {
		Nemo[] nemo = new Nemo[10];
		
		for (int i = 0; i < nemo.length; i++) {
			// 인스턴스 채우기
			nemo[i] = new Nemo();
			
			// 가로, 세로, 면적 세팅
			nemo[i].width = (int)(Math.random()*16+5);
			nemo[i].height = (int)(Math.random()*16+5);
			nemo[i].setArea();
		}
		
		//출력
		for (Nemo sagak : nemo) {
			System.out.print(sagak.height+ ",");
		}
		System.out.println();
		
		//정렬
		for(int i = 0; i < nemo.length-1; i++){
			// 뒷방에 있는 네모들 꺼내서 비교
			for (int j = i+1; j < nemo.length; j++) {
				if (nemo[i].height < nemo[j].height) {
					Nemo tmp = nemo[i];
					nemo[i] = nemo[j];
					nemo[j] = tmp;
				}
			}
		}
		
		
		for (Nemo sagak : nemo) {
			System.out.print(sagak.height+ ",");
		}
		System.out.println();
		
	}
}
