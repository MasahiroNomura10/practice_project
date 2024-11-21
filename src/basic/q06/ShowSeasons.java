package basic.q06;

public class ShowSeasons {

	
	
	
	
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		
		int season = 4;
		
		
		switch( season ) {
		
			//冬
			case  1:
			case  2:
			case 12:

				System.out.println( season + "月は冬です。" );
			
			break;
			
			//春
			case 3:
			case 4:
			case 5:
				
				System.out.println( season + "月は春です。" );
				
			break;
				
			//夏
			case 6:
			case 7:
			case 8:
				
				System.out.println( season + "月は夏です。" );
				
			break;
		
			//冬
			case  9:
			case 10:
			case 11:
				
				System.out.println( season + "月は冬です。" );
				
			break;
			
			//上記以外
			default:
				System.out.println( season + "月は存在しないです。" );				
				break;
		
		}
		
	
	}

}
