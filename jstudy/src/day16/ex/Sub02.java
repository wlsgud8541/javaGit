package day16.ex;

public class Sub02{
	Extra02 ex;
	public Sub02() {
	}

	public Sub02(Extra02 ex) {
		this.ex = ex;
	}

	public void setArr() {
		Dohyung[] dohyung = ex.getArr();
		dohyung = new Dohyung[10];
		
		for (int i = 0; i < dohyung.length; i++) {
			int num = (int)(Math.random()*3);
			int rad = (int)(Math.random()*16+5);
			int width = (int)(Math.random()*16+5);
			int height = (int)(Math.random()*16+5);
			
			switch (num) {
			case 0:
				dohyung[i] = new Dongle(rad);
				break;
			case 1:
				dohyung[i] = new Semo(width,height);
				break;
			case 2:
				dohyung[i] = new Nemo(width,height);
				break;
			}
		}
		ex.setArr(dohyung);
	}
	
	public void setPrint() {
		for (Dohyung d : ex.getArr()) {
			d.toPrint();
		}
	}
}
