package day16.ex;

public class ExSort {

	public ExSort() {
	}
	
	
	public Dohyung[] arrSort(Dohyung[] dhArr) {
		double area1 = 0;
		double area2 = 0;
		for (int i = 0; i < dhArr.length-1; i++) {
				area1 = dhArr[i].getArea();
			for (int j = i+1; j < dhArr.length; j++) {
					area2 = dhArr[j].getArea();
				if (area1 > area2) {
					Dohyung temp = new Dohyung();
					temp = dhArr[i];
					dhArr[i] = dhArr[j];
					dhArr[j] = temp;
					area1 = area2;
				}
			}
		}
		return dhArr;
	}
}
