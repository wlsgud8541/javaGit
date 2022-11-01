package day15;

public class Member {
	private String name, birth;
	private String gName = "woojoo"; // 명시적 초기화
	public String[] arr;
 
	public Member() {
		gName = "blackpink"; // 생성자 함수를 이용한 초기화
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getgName() {
		return gName;
	}

	public void setgName(String gName) {
		this.gName = gName;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String[] getArr() {
		return arr;
	}

	public void setArr(Test04 t) {
		arr = new String[t.cnt];
	}

	public void setArr(String[] arr) {
		this.arr = arr;
	}

	
}
