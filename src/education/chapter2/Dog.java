package education.chapter2;

/**
 * 「犬」を表す型（クラス）
 * @author aoyamasouichirou
 */
public class Dog {

	//--------------属性-----------------//
	
	/**
	 * 属性（フィールド）：名前
	 */
	private String name;
	
	/**
	 * 属性（フィールド）：年齢 
	 */
	private int age;
	
	//--------------メソッド---------------//
	
	/**
	 * コンストラクタ
	 * @param name 名前
	 * @param age 年齢
	 */
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	/**
	 * デフォルトコンストラクタ
	 */
	public Dog() {
		// 処理なし
	}
	
	/**
	 * メソッド：吠える
	 */
	public void bark() {
		System.out.println("vow vow!!");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
}
