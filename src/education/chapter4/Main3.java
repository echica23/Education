package education.chapter4;

public class Main3 {

	public static void main(String[] args) {
		
		// 調べる上限数
		int limit = 300;
		
		for (int i = 1; i <= limit; i++) {
			// 素数判定
			if (isPrime(i)) {
				System.out.println(i + "は素数です");
			}
		}

	}
	
	private static boolean isPrime(int target) {
		
		if (target == 1) {
			return false;
		} else if (target == 2) {
			return true;
		}
		
		boolean result = true;
		for (int i = 2; i <= target/2; i++) {
			if (target % i == 0) {
				result = false;
				break;
			}
		}
		
		return result;
	}

}
