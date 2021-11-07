package education.chapter5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main2 {

	public static void main(String[] args) {

		// Collection
		List<String> strList = new ArrayList<>();
		strList.add("aoyama1");
		strList.add("aoyama2");
		strList.add("aoyama3");
		
		// 添字
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		
		// 拡張forループ
		for (String item : strList) {
			System.out.println(item);
		}
		
		
		Map<String,Integer> ageMap = new HashMap<>();
		ageMap.put("Sasaki Tomoko", 28);
		ageMap.put("Aoyama Soichiro", 40);
		
		System.out.println(ageMap.get("Sasaki Tomoko"));
		
		for (Map.Entry<String, Integer> e : ageMap.entrySet()) {
			System.out.println(e.getKey()  + ":" + e.getValue());
		}
	}

}
