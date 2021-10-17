package education.chapter2;

public class Main2_2 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog("タビ",5);
		
		Dog dog2 = new Dog("ルナ",15);
		
		dog1.bark();
		dog2.bark();
		
		Dog dog3 = dog2;
		dog3.setName("イブ");
		
		dog2.bark();
		dog3.bark();
		
	}

}
