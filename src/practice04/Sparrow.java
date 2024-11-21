package practice04;

public class Sparrow extends Animal {


	private boolean canFly;
	
	//コンストラクタ
	public Sparrow( String name, int age, boolean canFly ) {
		super( name, age );
		
		this.setCanFly( canFly );
		
	}
	
	//アクセサメソッド
	public boolean getCanFly() {
		return this.canFly;
	}
	public void setCanFly( boolean canFly ) {
		this.canFly = canFly;
	}
	
	//自己紹介
	public void showInfo() {
		
		System.out.println( "名前：" + this.getName() );
		System.out.println( "年齢：" + this.getAge() );

		if( this.getCanFly() ) {

			System.out.println( "飛べます" );
		
		}else {
		
			System.out.println( "飛べません" );
			
		}
		
	}
	
	//鳴き声
	public void cry() {
		System.out.println( "鳴き声：チュンチュン" );
	}

	
	
}
