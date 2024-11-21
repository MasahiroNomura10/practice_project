package method.q09;

public class Even {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		int num = 5;
		boolean ans = false;
		
		
		ans = checkEven( num );
		
		
		if( ans ) {
			
			System.out.println(  num + "は偶数です。");
			
		}else {
			
			System.out.println(  num + "は奇数です。");			
			
		}
			
		
		
	}
	
	
	public static boolean checkEven( int num ) {
		
		boolean result = false;
		
		if( num%2 == 0 ) {
			result = true;
		}
		else {			
			result =  false;
		}
		
		return result;
	}

}
