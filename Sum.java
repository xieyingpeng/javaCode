import java.util.Scanner;
class Sum {//�����
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("����������������");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		integerSum(a,b);
		integerSum(a,b,c);
		System.out.print("����������ʵ����");
		double a1 = scanner.nextInt();
		double b1 = scanner.nextInt();
		double c1 = scanner.nextInt();
		realNumberSum(a1,b1);
		realNumberSum(a1,b1,c1);
		
	}
	public static void integerSum(int a ,int b){//�����������
		int sum =  a+b;
		System.out.println("����������Ϊ:"+sum);
	}
	public static void integerSum(int a ,int b ,int c){//�����������
		int sum =  a+b+c;
		System.out.println("����������Ϊ:"+sum);
	}
	public static void realNumberSum(double a,double b){//����ʵ�����
		double sum =  a+b;
		System.out.println("����������Ϊ:"+sum);
	}
	public static void realNumberSum(double a ,double b,double c){
		double sum =  a+b+c;
		System.out.println("����������Ϊ:"+sum);
	}
}
