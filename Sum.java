import java.util.Scanner;
class Sum {//求和类
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入三个整数：");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		integerSum(a,b);
		integerSum(a,b,c);
		System.out.print("请输入三个实数：");
		double a1 = scanner.nextInt();
		double b1 = scanner.nextInt();
		double c1 = scanner.nextInt();
		realNumberSum(a1,b1);
		realNumberSum(a1,b1,c1);
		
	}
	public static void integerSum(int a ,int b){//两个整数求和
		int sum =  a+b;
		System.out.println("两个整数和为:"+sum);
	}
	public static void integerSum(int a ,int b ,int c){//三个整数求和
		int sum =  a+b+c;
		System.out.println("三个整数和为:"+sum);
	}
	public static void realNumberSum(double a,double b){//两个实数求和
		double sum =  a+b;
		System.out.println("两个整数和为:"+sum);
	}
	public static void realNumberSum(double a ,double b,double c){
		double sum =  a+b+c;
		System.out.println("三个整数和为:"+sum);
	}
}
