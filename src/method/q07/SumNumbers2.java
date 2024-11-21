package method.q07;

public class SumNumbers2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int num1 = 5;
		double num2 = 3.3;
		int sum = 0;
		
		sum = calculateSum( num1, num2 );
		
		System.out.println( "第一引数（整数）：" + num1 );
		System.out.println( "第二引数（実数）：" + num2 );
		System.out.println( "加算結果：" + sum );
		

	}
	
	public static int calculateSum( int num1, double num2 ) {		
		
		
		
		
		return num1 + (int)num2;
	}

}
