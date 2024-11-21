package practice01;

public class EmployeeTest {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//実体化
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		
		//1人目
		e1.name = "山田";
		e1.age =   20;
		
		//二人目
		e2.name = "鈴木";
		e2.age =   30;
		
		
		//一人目表示
		e1.showInfo();
		
		//間の線
		System.out.println( "-------------------" );
		
		//二人目表示
		e2.showInfo();
		
		
	}

}
