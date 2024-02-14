package edu.kh.poly.pack99.run;

import java.util.HashMap;
import java.util.Map;

class Solution {
  public String[] solution(String[] players, String[] callings) {
  	
  	Map<String, Integer> map = new HashMap<String, Integer>();
    for(int i = 0, num = players.length; i < num; i++){
        map.put(players[i], i);
    }
    
    for(int i = 0, num = callings.length; i < num; i++ ){
        int num2 = map.get(callings[i]);
        
        String str = players[num2-1];
        
        map.put(str, num2);
        map.put(callings[i], num2-1);
    }
    

    
    
    return players;
  }
}
