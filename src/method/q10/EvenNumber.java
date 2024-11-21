package method.q10;

import java.util.Arrays;

public class EvenNumber {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		int count = 0;
		int[] array = new int[10];
		
		
		array = new int[]{ 3, 2, 5, 6, 7, 25, 10, 51, 88, 98 };
		
		count = getEvenNubers( array );
		
		
		System.out.println( Arrays.toString( array ) + "には、偶数が" + count + "個あります。" );

	}
	
	
	public static int getEvenNubers( int[] array ) {
		
		
		int count = 0;
		
		for( int num : array ) {
			
			if( num%2 == 0 ) {
				count++;
			}
		}
		
		
		return count;
		
	}

}
