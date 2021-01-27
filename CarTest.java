class CarTest {
	public static void main(String[] args) {
		NonAutomotive nonautomotive = new NonAutomotive("红色","天宇",4,2);
		nonautomotive.print();
		Bicycle bicycle = new Bicycle("捷安","黄色");
		bicycle.print();
		Electrocar electrocar = new Electrocar("飞鸽");
		electrocar.print();
		Tricycle tricycle = new Tricycle();
		tricycle.print();
	}
}
class NonAutomotive{
	private String brand;
	private String color;
	private int wheel=2;
	private int chair=1;
	public String getBrand(){
		return brand ;
	}
	public String getColor(){
		return color ;
	}
	public int getWheel(){
		return wheel;
	}
	public int getChair(){
		return chair;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public void setColor(String color ){
		this.color = color ;
	}
	public void setWheel(int wheel){
		this.wheel = wheel ;
	}
	public void setChair(int chair){
		this.chair = chair;
	}
	public NonAutomotive(){
	}
	public NonAutomotive(String brand ,String color){
		this.brand = brand;
		this.color= color;
	}
	public NonAutomotive(String color, String brand , int wheel ,int chair){
		this.color = color ;
		this.brand = brand;
		this.wheel = wheel;
		this.chair = chair;
	}
	public void print(){
		System.out.println("父类信息测试："+"这是一辆"+color+"颜色,"+brand+"牌的非机动车,"+"有"+wheel+"轮子,"+"有"+chair+"个座椅");
	}
}
class Bicycle extends NonAutomotive{
	public Bicycle(String  color, String brand  ){
		super(color , brand );
	}
	public void print(){
		System.out.println("自行车类信息测试："+"这是一辆"+getColor()+"颜色,"+getBrand()+"牌的自行车");
	}
}
class Tricycle extends NonAutomotive{
	public Tricycle(){
		setWheel(3);
	}
	
	public void print(){
		System.out.println("三轮车类信息测试："+"这是一款有"+getWheel()+"个轮子的三轮车");
	}
}
class Electrocar extends NonAutomotive{
	private String batteryBrand;
	public Electrocar (String batteryBrand){
		this.batteryBrand = batteryBrand;
	}
	public void print(){
		System.out.println("电动车类信息测试："+"这是一辆"+batteryBrand+"牌的电动车");
	}

}

