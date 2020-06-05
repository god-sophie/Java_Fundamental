package java_20200604ex;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Test {

	public static String solution(String[] participant, String[] completion) {
        String answer = "";
        /*
        ArrayList<String> pList = new ArrayList<String>();
        ArrayList<String> cList = new ArrayList<String>();
        HashMap<String , Integer> map = new HashMap<String, Integer>();
        
        for(String value : participant) {
        	pList.add(value);
        }
        for(String value : completion) {
        	cList.add(value);
        }
        for(int i=0;i<pList.size();i++) {
        	String value = pList.get(i);
        	for(int j=0;j<cList.size();j++) {
        		String cValue = cList.get(j);
        		if(value.equals(cValue)) {
        			pList.remove(i--);
        			cList.remove(j--);
        			break;
        		}
        	}
        }
        answer = pList.get(0);
        */
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        for (String player : participant) hm.put(player, hm.getOrDefault(player, 0) + 1);
        for (String player : completion) hm.put(player, hm.get(player) - 1);

        for (String key : hm.keySet()) {
            if (hm.get(key) != 0){
                answer = key;
            }
        }
        return answer;
    }
	
	public static void main(String[] args) {
		//String[] p = {"leo", "kiki", "eden"};
		//String[] c = {"eden", "kiki"};
		//String[] p = {"marina", "josipa", "nikola", "vinko", "filipa"};
		//String[] c = {"josipa", "filipa", "marina", "nikola"};
		String[] p = {"mislav", "stanko", "mislav", "ana"};
		String[] c = {"stanko", "ana", "mislav"};
		
		
		Arrays.sort(p);
		Arrays.sort(c);
		for(String value : p) {
			System.out.println(value);
		}
		System.out.println("=======================");
		for(String value : c) {
			System.out.println(value);
		}
		
		System.out.println(solution(p,c));
		
	}

}