//auther:xieyingpeng 
import java.util.Scanner;
class Test {//测试类
	public static void main(String[] args) {
		Phone phone1 = new Phone();//创建第一个对象
		phone1.name = "谢应鹏";
		phone1.bread = "苹果";
		phone1.color = "黑色";
		phone1.prece = 5900;
		phone1.showPrint();
		phone1.setMessage();
		phone1.playGame();
		phone1.elephone();
		phone1.eat();
		phone1.sleep();
		Phone phone2 = new Phone();//创建第二个对象
		phone2.name = "张三";
		phone2.bread = "华为";
		phone2.color = "白色";//分别赋值
		phone2.prece = 6000;
		phone2.showPrint();
		phone2.setMessage();
		phone2.playGame();
		phone2.elephone();//方法引用
		phone2.eat();
		phone2.sleep();
		phone2.bay();
	
	}
	
}
class Phone{//手机类
	String name ;
	String bread;
	String color;
	int prece;
	public void showPrint(){
		System.out.println(name+"用的品牌手机是："+bread+" "+"颜色是："+color+" "+"价钱："+prece+"元");
		setMessage();
	}
	public void setMessage(){
		System.out.println(name+"用"+bread+"发信息" );
		setMessage();
	}
	public void playGame(){
		System.out.println(name+"用"+bread+"玩游戏");
	}
	public void elephone(){
		System.out.println(name+"用"+bread+"打电话");
		playGame();
	}
	public void eat(){
		System.out.println(name+"去食堂吃饭");
		elephone();
	}
	public void sleep(){
		System.out.println(name+"睡觉");
	}
	public void bay(){
		System.out.println("欢迎光临！谢谢使用！");
	}
}
		