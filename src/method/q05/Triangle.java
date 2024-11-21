package method.q05;

public class Triangle {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int bottom = 8;
		int height = 5;
		int sum = 0;
		
		
		sum = getTriangleArea( bottom, height );

		System.out.println( "底辺：" + bottom );
		System.out.println( "高さ：" + height );
		System.out.println( "三角形の面積：" +  sum );
	
	}
	
	public static int getTriangleArea( int bottom, int height ) {
		
		
		
		return bottom * height / 2;
	}

}
