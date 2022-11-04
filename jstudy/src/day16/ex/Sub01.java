package day16.ex;

public class Sub01{
	Extra ex;
	
	public Sub01() {
	}

	public Sub01(Extra ex) {
		ExSort sort = new ExSort();
		this.ex = ex;
		setArr(ex);
		sort.arrSort(ex.arr);
		//setSort(ex.arr);
		setPrint();
	}

	private void setArr(Extra ex) {
		ex.arr = new Dohyung[10];
		Dohyung[] dArr = ex.arr;
		for (int i = 0; i < dArr.length; i++) {
			int num = (int)(Math.random()*3);
			int rad = (int)(Math.random()*16+5);
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
			
			switch (num) {
			case 0:
				dArr[i] = new Dongle(rad);
				break;
			case 1:
				dArr[i] = new Semo(width,height);
				break;
			case 2:
				dArr[i] = new Nemo(width,height);
				break;
			}
		}
	}
	
	/*
	public void setSort(Dohyung[] dArr) {
		for (int i = 0; i < dArr.length-1; i++) {
			double num1 = dArr[i].getArea();
			for (int j = i+1; j < dArr.length; j++) {
				double num2 = dArr[j].getArea();
				
				if (num1 > num2) {
					Dohyung temp = dArr[i];
					dArr[i] = dArr[j];
					dArr[j] = temp;
					num1 = num2;
				}
			}
		}
	}
	*/
	public void setPrint() {
		for (Dohyung d : this.ex.arr) {
			d.toPrint();
		}
	}
}
