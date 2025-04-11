package kadai_015;
//車クラスの作成
public class Car_Chapter15 {

	//フィールド
	private int gear;
	private int speed ;
	
	//コンストラクタ
	public Car_Chapter15(int gear, int speed) {
		this.gear = 1;
		this.speed = 10;	
	}

	
	//ギアの値により速度を変える
	public void gearChange( int afterGear) {
		System.out.println("ギア"+this.gear+"から"+ afterGear+"に切り替えました");
		
		this.gear = afterGear;
		
		switch(this.gear) {
		case 1 -> this.speed = 10;
		case 2 -> this.speed = 20;
		case 3 -> this.speed = 30;
		case 4 -> this.speed = 40;
		case 5 -> this.speed = 50;
		default -> this.speed = 10;
		}
	}
	
	//ギアチェンジ後の速度を表示する
	public void run() {
		System.out.println("速度は時速"+ this.speed + "kmです");
	}
}
