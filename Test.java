//auther:xieyingpeng 
import java.util.Scanner;
class Test {//������
	public static void main(String[] args) {
		Phone phone1 = new Phone();//������һ������
		phone1.name = "лӦ��";
		phone1.bread = "ƻ��";
		phone1.color = "��ɫ";
		phone1.prece = 5900;
		phone1.showPrint();
		phone1.setMessage();
		phone1.playGame();
		phone1.elephone();
		phone1.eat();
		phone1.sleep();
		Phone phone2 = new Phone();//�����ڶ�������
		phone2.name = "����";
		phone2.bread = "��Ϊ";
		phone2.color = "��ɫ";//�ֱ�ֵ
		phone2.prece = 6000;
		phone2.showPrint();
		phone2.setMessage();
		phone2.playGame();
		phone2.elephone();//��������
		phone2.eat();
		phone2.sleep();
		phone2.bay();
	
	}
	
}
class Phone{//�ֻ���
	String name ;
	String bread;
	String color;
	int prece;
	public void showPrint(){
		System.out.println(name+"�õ�Ʒ���ֻ��ǣ�"+bread+" "+"��ɫ�ǣ�"+color+" "+"��Ǯ��"+prece+"Ԫ");
		setMessage();
	}
	public void setMessage(){
		System.out.println(name+"��"+bread+"����Ϣ" );
		setMessage();
	}
	public void playGame(){
		System.out.println(name+"��"+bread+"����Ϸ");
	}
	public void elephone(){
		System.out.println(name+"��"+bread+"��绰");
		playGame();
	}
	public void eat(){
		System.out.println(name+"ȥʳ�óԷ�");
		elephone();
	}
	public void sleep(){
		System.out.println(name+"˯��");
	}
	public void bay(){
		System.out.println("��ӭ���٣�ллʹ�ã�");
	}
}
		