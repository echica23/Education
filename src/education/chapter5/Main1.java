package education.chapter5;

public class Main1 {

	public static void main(String[] args) {
		
		String str = "abc";
		
		// 配列
		String[] strArray = {"abc","def","aaa"};
		
		// 走査
		for (int i = 0; i < strArray.length; i++) {
			System.out.println(strArray[i]); // 添字
		}
		
		System.out.println(strArray[0]);
		
		// 拡張ループ
		for (String strItem : strArray) {
			System.out.println(strItem);
		}
		

	}

}
