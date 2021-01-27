import java.util.Scanner;
class Test1 {
	public static void main(String[] args) {
		int[] a = {3,6,9,3,6};
		//swap(a);
		//int result =findA(a,9);
		//Scanner sc = new Scanner(System.in);
		//System.out.print("请输入你要查找的数：");
		//int b = sc.nextInt();
		//findA(a,b);
		//minA(a);
		print();
		//2020/11/8System.out.println(result);
	}
	public static void swap(int[] a ){
		for (int i = a.length ; i>0 ;i-- ){
			System.out.print(a[i-1]+" ");
		}
		System.out.println();
	}
	public static void findA(int[] a ,int vual){
		for(int i = 0; i<a.length;i++){
			if(a[i] == vual){
				System.out.println("这个数的位置是："+i);
			}

		}
	}
	public static void minA(int[] a ){
		int min=0;
		for(int i =0; i<a.length;i++){
			 min=a[0];
			if(min>a[i]){
				min = a[i];
			}
			
		}
		System.out.println("最小值是："+min);
	}
	public static void print(){
		int[] a = new int [10];
		int[] c = new int [10];
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入10个数：");
		for( int i = 0;i<10;i++){//输入10个数存入c数组中
			 c[i] = sc.nextInt();

		}
		for(int j = 0;j<c.length-1;j++){//从第一个开始
			int i =0;
			for(int k = (j+1);k<c.length;k++){//遍历第一个后面的元素
				if(c[j] != c[k]){//如果不相等 则存入数组a 中
				a[i]=c[j];
				i++;
				}
				else{
					break;
				}
			}
		}
		System.out.println("输出结果为：");
		for( int i = 0 ;i < a.length;i++){
				System.out.print(a[i]+" ");
		}
		System.out.println();
	}


}
