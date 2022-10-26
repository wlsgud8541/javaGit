package day11;

public class Ex03 {

   public Ex03() {
		  // 학생 10 명을 기억할 배열
		   String[] names = {"제니", "리사", "로제", "지수", "아이유", "경욱", "태윤", "우영", "경민", "혁주"};
	      
	      //10명의 국어점수를 기억할 배열을 만들고 점수를 랜덤하게 채우세요
	      int[] kor = new int[10];
	      for (int i = 0; i < kor.length; i++) {
	    	  kor[i] = (int)(Math.random()*61+40);
		  }
	      
	      //10명의 영어점수를 기억할 배열을 만들고 점수를 랜덤하게 채우세요
	      int[] eng = new int[10];
	      for (int i = 0; i < eng.length; i++) {
	    	  eng[i] = (int)(Math.random()*61+40);
	      }
	      
	      //10명의 수학점수를 기억할 배열을 만들고 점수를 랜덤하게 채우세요
	      int[] math = new int[10];
	      for (int i = 0; i < math.length; i++) {
	    	  math[i] = (int)(Math.random()*61+40);
	      }
	      
	      //10명의 총점을 기억할 배열을 만들고 위의 배열에 기억한 점수로 계산해서 채워 넣으세요
	      int[] total = new int[10];
	      for (int i = 0; i < total.length; i++) {
			  total[i] = kor[i]+eng[i]+math[i];
		  }
	      
	      //10명의 평균을 기억할 배열을 만들고 위의 총점배열에 기억한 점수로 계산해서 채워 넣으세요
	      double[] avg = new double[10];
	      for (int i = 0; i < avg.length; i++) {
	    	  avg[i] = total[i]/3;
		  }
	      
	      // 학생배열에 각 데이터를 채워넣으세요
	      Student[] stu =  new Student[10];
	      for (int i = 0; i < stu.length; i++) {
	    	  Student s =  new Student();
	    	  s.name = names[i];
	    	  s.kor = kor[i];
	    	  s.eng = eng[i];
	    	  s.math = math[i];
	    	  s.total = total[i];
	    	  s.avg = avg[i];
	    	  
	    	  stu[i] = s;
	      }
	      
	      for (int i = 0; i < stu.length; i++) {
	    	  for (int j = 0; j < stu.length; j++) {
	    		  if (stu[i].avg <= stu[j].avg) {
	    			  stu[i].rank += 1;
	    		  }
	    	  }
	      }
	      
	      
	      for (int i = 0; i < stu.length-1; i++) {
	    	  for (int j = i+1; j < stu.length; j++) {
	    		  if (stu[i].avg < stu[j].avg) {
	    			  Student s = stu[i];
	    			  stu[i] = stu[j];
	    			  stu[j] = s;
	    		  }
	    	  }
	      }
	      
	      for (Student s : stu) {
	    	  System.out.println("학생이름 : "+s.name
	    	  					+" / 국어점수 : "+s.kor
	    	  					+" / 영어점수 : "+s.eng
	    	  					+" / 수학점수 : "+s.math
	    	  					+" / 총 점수 : "+s.total
	    	  					+" / 평균점수 : "+s.avg
	    	  					+" / 등수 : "+s.rank);
	      }
   	  }

      public static void main(String[] args) {
    	  new Ex03();
      }

}