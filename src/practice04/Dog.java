package practice04;

public class Dog extends Animal{
	
	private String furColor;
	
	//コンストラクタ
	public Dog( String name, int age, String fuColor ) {
		super( name, age );
		
		this.setFurColor( fuColor );
		
	}
	
	//アクセサメソッド
	public String getFurColor() {
		return this.furColor;
	}
	public void setFurColor( String furColor ) {
		this.furColor = furColor;
	}
	
	//自己紹介
	public void showInfo() {
		
		System.out.println( "名前：" + this.getName() );
		System.out.println( "年齢：" + this.getAge() );
		System.out.println( "毛の色：" + this.getFurColor() );
	}
	
	//鳴き声
	public void cry() {
		System.out.println( "鳴き声：ワン" );
	}

}
