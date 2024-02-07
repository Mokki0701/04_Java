package edu.kh.poly.pack2.run;

public class Solution {
	public String solution(int n) {
    String answer = "";
    int num = 0;
    
    while(n > 0){
        num = n%10;
        answer += (char)num;
        n = n/10;
    }
    
    return answer;
}
}

