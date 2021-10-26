package education.chapter3;

public class Main1 {

	/**
	 * 条件分岐と繰り返し
	 * @param args
	 */
	public static void main(String[] args) {

		// System.currentTimeMillisは現在時刻をミリ秒で返却する
		long time = System.currentTimeMillis();

		// msの現在時刻が偶数か奇数かを
		// true / false
		/**
		if (条件A) {
			・・・
		} else {
			NOT 条件A
		}
		**/
		
		/**
		if (条件A) {
			条件A
		} else if (条件B){
			NOT 条件A　&& 条件B
		} else {
			NOT 条件A　&& NOT 条件B
		}
		**/
		
		if (time % 2 != 0) {
			System.out.println("ODD!!");
		} else {
			System.out.println("EVEN!");
		}
		
		
		
		// 繰り返し(for)
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
		}
		
		// 繰り返し(while)
		int i = 0;
		while(i < 10) {
			System.out.println(i);
			i++;
		}
		
		
	}

}
