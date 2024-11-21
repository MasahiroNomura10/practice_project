package practice04;

public class AnimalTest {

	
	
	public static void main(String[] args) {
		
		//犬
		String dogName = "ポチ";
		int dogAge = 2;
		String dogFurColor = "白";
		
		//すずめ
		String sparrowName = "チュン";
		int sparrowAge = 1;
		boolean sparrowFlyFlag = true;
		
		//犬のコンストラクタ
		Dog dog = new Dog( dogName, dogAge, dogFurColor );
		//すずめのコンストラクタ
		Sparrow sparrow = new Sparrow( sparrowName, sparrowAge, sparrowFlyFlag );
		
		
		//犬の表示
		dog.showInfo();
		dog.cry();
		//間の線
		System.out.println("-----------------");
		//スズメの表示
		sparrow.showInfo();
		sparrow.cry();
		
		
		
		
		
	}
	
	
	
	
	
}
