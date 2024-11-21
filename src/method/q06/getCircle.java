package method.q06;

public class getCircle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		double radius = 5.0;
		double sum = 0;
		
		sum = getCircleArea( radius );
		
		System.out.println( "半径：" + radius );
		System.out.println( "円の面積：" + sum );
		
		
		

	}
	
	public static double getCircleArea( double radius ) {
		
		return radius * radius * 3.14;
		
		
	}

}
