class Area 
{
	public static void main(String[] args) 
	{
		Cuboid c1 = new Cuboid(20.0,10.0,5.0);
		c1.setLength(20.0);
		c1.setWidth(10.0);
		c1.getArea();
		c1.getVolume();
		System.out.println("长方体的底面积："+c1.getArea());
		System.out.println("长方体的体积："+c1.getVolume());

		Cuboid c2 = new Cuboid(10.0,8.0,5.0);
		c2.setLength(10.0);
		c2.setWidth(8.0);
		c2.getArea();
		c2.getVolume();
		System.out.println("长方体的底面积："+c2.getArea());
		System.out.println("长方体的体积："+c2.getVolume());
	
	}
}

class Rectangle
{
	double length;
	double width;
	public Rectangle(){

	}

	public Rectangle(double length,double width){
		this.length = length;
		this.width = width;
	}

	public double getLength(){
		return length;
	}

	public void setLength(double length){
		this.length = length;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double width){
		this.width = width;
	}
	public double getArea(){
		return length*width;
	}
}
class Cuboid extends Rectangle
{
	double heigth;
	public Cuboid(){

	}
	public Cuboid(double length,double width,double heigth){
		super(length,width);
		this.heigth = heigth;
	}
	public double getHeigth(){
		return heigth;
	}
	public void setHeight(double heigth){
		this.heigth = heigth;
	}
	public double getVolume(){
		return heigth*length*width;
	}
}

