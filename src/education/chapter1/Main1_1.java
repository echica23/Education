package education.chapter1;

public class Main1_1 {

	/**
	 * 初めてのJava
	 * Main関数。Javaプログラムの開始箇所。
	 * @param args
	 */
	public static void main(String[] args) {
		
		// 標準出力へ文字を表示
		System.out.println(getHello(2));
	}
	
	private static String getHello(int aaaa) {
		return "Hello World!" + aaaa;
	}

}
