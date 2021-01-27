
public class Shape {
	public static void main(String[] args) {
		Cuboid cuboid = new Cuboid(3,4,5);
		System.out.println("底面积为："+cuboid.area());
		System.out.println("体积为："+cuboid.volume());
		
		
	}

}
class Rectangle{
	private double width;
	private double length;
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getLength(){
		return length;
	}
	public void setLength(double length){
		this.length = length;
	}
	public Rectangle (){
	}
	public Rectangle (double width ,double length){
		this.width = width ;
		this.length = length;
	}

	public double area(){
		return width*length;
	}


}
class Cuboid extends Rectangle{
	private double height;
	public Cuboid(){
	}
	public Cuboid(double length , double width,double height){
		super(length,width);
		this.height = height;

	}

	public double volume(){
		return getLength()*getWidth()*height;
	}

}
