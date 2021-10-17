package education.chapter1;

public class Main1_2 {

	/**
	 * 文字列変数
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 変数：型 変数名
		
		// Stringは文字列を表す「クラス＝型」
		// Stringは特殊なクラスで、""で値を生成できる。
		String message;
		message = "This is message.";
		
		System.out.println(message.length());
		
		String messageAdd = "\nThis is added message";
		
		// messageという変数にmessageAddという変数を連結している。
		// 原則的に＋は足し算で使用するが例外的に文字列の連結も可能
		message = message + messageAdd;
		
		// 上記のコードはこう書き換えることもできる
		// message += messageAdd;
		
		System.out.println(message);

	}

}
