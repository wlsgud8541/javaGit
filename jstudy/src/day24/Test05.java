package day24;

import java.text.*;
import java.util.*;

public class Test05 {

	public Test05() {
		int no = 100;
		
		DecimalFormat form = new DecimalFormat("000000");
		
		String sno = form.format(no);
		
		System.out.println("변환된 숫자 : "+sno);
		
		Date date = new Date();
		
		SimpleDateFormat form2 = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss");
		System.out.println("date : " + date);
		System.out.println("format : " + form2.format(date));
	}
	public static void main(String[] args) {
		new Test05();
	}
}
