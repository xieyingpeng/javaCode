import java.util.Scanner;
class Shape {//定义形状类

	public static void main(String[] args) {
		Scanner scanner = new Scanner();
		System.out.print("请输入长和宽,高，半径：");
		double length = scanner.nextDouble();
		double width = scanner.nextDouble();
		double hight = scanner.nextDouble();
		double r = scanner.nextDouble();
		rectangle(length,width);
		round(r);
		triangle(length,hight);
		trapezoid(length,width,hight);
	}
	public static void rectangle(double l , double w){//矩形方法
		double s = l*w;
		System.out.println("矩形的面积为："+s);
	}
	public static void round(int r){//圆方法
		double s =r*r*3.14 ;
		System.out.println("圆的面积为："+s);
	}
	public static void triangle(double l,double h){//三角形
		double s = l*h/2;
		System.out.println("三角形的面积为："+s);
	}
	public static void trapezoid(double l,double ,w,double h){//梯形
		double s = (l+w)*h/2;
		System.out.println("梯形的面积为："+s);
	}
}
