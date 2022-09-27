package oday04;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Test10000 {
	public static void main(String[] args) {
		Solution2 solution = new Solution2();
		int n = 6;
		
		//result = 4;
		//int[] lost = {2,4};
		//int[] reserve = {3};
		
		//result = 5;
		//int[] lost = {1,3};
		//int[] reserve = {2,4};
		
		//result = 6;
		int[] lost = {2,4,5};
		int[] reserve = {1,3,6};
				
		
		//출력 3
		int num = solution.solution(n, lost, reserve);

		
		System.out.println("(6) result : "+ num);
	}
}	
	class Solution2 {
	    
	    public int solution(int n, int[] lost, int[] reserve) {
	        ArrayList<Integer> reStu = new ArrayList<Integer>(); //진짜 여벌이 있는 학생 배열
	        ArrayList<Integer> doStu = new ArrayList<Integer>(); //진짜 도난 당한 학생 배열
	        ArrayList<Integer> tempStu = new ArrayList<Integer>(); //못빌린 학생에 대한 배열
	        //ArrayList<Integer> tempStu2 = new ArrayList<Integer>(); //이미 빌려준 학생에 대한 임시 배열
	        boolean check = false;
	        int answer = 0;
	        //진짜 여벌이 있는 학생
	        
	        Arrays.sort(reserve);
	        Arrays.sort(lost);
	        
	        for(int i=0; i<reserve.length; i++){ 
	            for(int j=0; j<lost.length; j++){ 
	                if(reserve[i] != lost[j]){
	                   check = true;
	                }else{
	                   check = false;
	                   break;
	                }
	            } 
	            if(check == true){
	                reStu.add(reserve[i]); //진짜 여벌이 있는 학생 배열    
	            }
	        }
	        System.out.println("진짜 여벌이 있는 학생 : "+ reStu);
	        
	        //진짜 옷을 도난 당한 학생 배열
	        for(int i=0; i<lost.length; i++){ 
	            for(int j=0; j<reserve.length; j++){ 
	                if(lost[i] != reserve[j]){
	                    check = true;
	                }else{
	                    check = false;    
	                    break;
	                }
	            }
	            if(check == true){
	                doStu.add(lost[i]);  //진짜 도난 당한 학생 배열
	            }
	        }
	        System.out.println("진짜 도난 학생 : "+ doStu);
	       
	        reStu.sort(Comparator.naturalOrder());
	        doStu.sort(Comparator.naturalOrder());
	        
	        for(int i=0; i<doStu.size();i++){ 
	        	System.out.println("배열체크"+i+"번째 doStu(도난) : "+(doStu.get(i)-1)+"///"+(doStu.get(i)+1));
	        	System.out.println("배열체크"+i+"번째 reStu(여별) : "+reStu);
	        	if((reStu.contains(doStu.get(i)-1) || reStu.contains(doStu.get(i)+1))){ 
	        		System.out.println(i+"번째 진입");
	                for(int j=0; j<reStu.size(); j++){
	                    if(doStu.get(i)-1 == reStu.get(j) || doStu.get(i)+1 == reStu.get(j)){ //빌릴 수 있는 경우
	                        if(doStu.get(i)-1 == reStu.get(j)){ // 앞사람에게 빌린 경우
	                        	doStu.remove(Integer.valueOf(doStu.get(i)));
	                        	reStu.remove(Integer.valueOf(reStu.get(j)));
	                        	i--;
	                        	//System.out.println(i+"번째 reStu(여별) : "+reStu);
	                        	//System.out.println(i+"번째 doStu(도난) : "+doStu);
								break;
	                        }else if(doStu.get(i)+1 == reStu.get(j)){ // 뒷사람에게 빌린 경우
	                        	doStu.remove(Integer.valueOf(doStu.get(i)));
	                        	reStu.remove(Integer.valueOf(reStu.get(j)));
	                        	i--;
	                        	break;
	                        }    
	                    }else if(doStu.get(i)-1 != reStu.get(j) && doStu.get(i)+1 != reStu.get(j)){//못빌린 경우
                            tempStu.add(doStu.get(i));
                        }
	                }
	            }else{
	                tempStu.add(doStu.get(i));  
	            }
	        }
	        System.out.println("체육복이 없는 사람 : "+tempStu);
	        answer = n - tempStu.size();
	        return answer;
	    }
	}