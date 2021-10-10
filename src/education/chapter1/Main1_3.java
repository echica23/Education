package education.chapter1;

public class Main1_3 {

	/**
	 * 数値と四則演算
	 * @param args
	 */
	public static void main(String[] args) {
		
		// intは整数値を格納する
		// 扱える数値の範囲は-2147483648 ～ 2147483647
		// この範囲を超えた場合、桁あふれを起こします
		int intNum1 = 6;
		int intNum2 = 2;
		
		System.out.println("-----------------------------");
		
		// 足し算
		System.out.println(intNum1 + intNum2);

		// 引き算
		System.out.println(intNum1 - intNum2);
		
		// 掛け算
		System.out.println(intNum1 * intNum2);
		
		// 割り算
		System.out.println(intNum1 / intNum2);
		
		// 割り算した際の余り
		System.out.println(intNum1 % intNum2);
		
		
		
		// Longも整数値を格納する。intよりも扱える範囲が広い
		// Longとして扱う場合、末尾にLまたはlをつける（つけなくてもエラーにはならないが、内部的にintになります）
		long longNum1 = 6L;
		long longNum2 = 2L;
		
		System.out.println("-----------------------------");
		
		// 足し算
		System.out.println(longNum1 + longNum2);

		// 引き算
		System.out.println(longNum1 - longNum2);
		
		// 掛け算
		System.out.println(longNum1 * longNum2);
		
		// 割り算
		System.out.println(longNum1 / longNum2);
		
		// 割り算した際の余り
		System.out.println(longNum1 % longNum2);
		
		// doubleは浮動少数点値（少数値）を格納する
		// 扱える数値の範囲は
		double doubleNum1 = 12.1;
		double doubleNum2 = 1.1;
		
		System.out.println("-----------------------------");
		
		// 足し算
		System.out.println(doubleNum1 + doubleNum2);

		// 引き算
		System.out.println(doubleNum1 - doubleNum2);
		
		// 掛け算　※誤差が出ます
		System.out.println(doubleNum1 * doubleNum2);
		
		// 割り算　※誤差が出ます
		System.out.println(doubleNum1 / doubleNum2);
		
		// 割り算した際の余り
		System.out.println(doubleNum1 % doubleNum2);
	}

}
