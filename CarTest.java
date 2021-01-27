class CarTest {
	public static void main(String[] args) {
		NonAutomotive nonautomotive = new NonAutomotive("��ɫ","����",4,2);
		nonautomotive.print();
		Bicycle bicycle = new Bicycle("�ݰ�","��ɫ");
		bicycle.print();
		Electrocar electrocar = new Electrocar("�ɸ�");
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
		System.out.println("������Ϣ���ԣ�"+"����һ��"+color+"��ɫ,"+brand+"�Ƶķǻ�����,"+"��"+wheel+"����,"+"��"+chair+"������");
	}
}
class Bicycle extends NonAutomotive{
	public Bicycle(String  color, String brand  ){
		super(color , brand );
	}
	public void print(){
		System.out.println("���г�����Ϣ���ԣ�"+"����һ��"+getColor()+"��ɫ,"+getBrand()+"�Ƶ����г�");
	}
}
class Tricycle extends NonAutomotive{
	public Tricycle(){
		setWheel(3);
	}
	
	public void print(){
		System.out.println("���ֳ�����Ϣ���ԣ�"+"����һ����"+getWheel()+"�����ӵ����ֳ�");
	}
}
class Electrocar extends NonAutomotive{
	private String batteryBrand;
	public Electrocar (String batteryBrand){
		this.batteryBrand = batteryBrand;
	}
	public void print(){
		System.out.println("�綯������Ϣ���ԣ�"+"����һ��"+batteryBrand+"�Ƶĵ綯��");
	}

}

