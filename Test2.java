
import java.util.Scanner;
public class Test2 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setColor("��ɫ");
		animal.setAge(20);
		animal.setGender("����");
		animal.printAll();
		animal.play();
		animal.rest();
		animal.run();
		Employee employee = new Employee();
		employee.setName("����");
		employee.setPosition("����Ա");
		employee.setSalary(6799);
		employee.showAll();
		employee.eat();
		employee.work();
		employee.raise();
		Book book = new Book();
		book.setTitle("java�γ�");
		book.setPageNum(100);
		book.showAll();
		Circle circle1 = new Circle(2.5);
		Circle circle2 = new Circle(10);
		circle1.findPerimeter();
		circle1.findArea();
		circle2.findPerimeter();
		circle2.findArea();
		Account account = new Account();
		account.setId("1000");
		account.setcoustomer("Jane Smith");
		account.setBalance(2000);
		account.setAnnuallnterestRate("1.23%");		
		account.deposit(100);
		account.withdraw(960);
		account.withdraw(2000);
		account.print(100,960);
	}

}
class Animal{
	private String color ;
	private String gender;
	private int age;
	public String getColor(){
		return color;
	}
	public String getGender(){
		return gender;
	}
	public int getAge(){
		return age;
	}
	public void setColor(String color){
		this.color = color;
	}
	public void setGender(String gender){
		this.gender = gender;
	}
	public void setAge(int age ){
		this.age = age;
	}
	public void play(){
		System.out.print("��ˣ"+" ");
	}
	public void run(){
		System.out.print("����"+" " );
	}
	public void rest(){
		System.out.println("��Ϣ"+" ");
	}
	public void printAll(){
		System.out.println("��ɫΪ��"+getColor()+" "+"�Ա�Ϊ��"+" "+getGender()+" "+"���䣺"+getAge()+"����");
	}
}
class Employee{
	private double salary ;
	private String position;
	private String name ;
	public double getSalary(){
		return salary;
	}
	public String getPosition(){
		return position;
	}
	public String getName(){
		return name;
	}
	public void setSalary(double salary){
		this.salary = salary;
	}
	public void setPosition(String position){
		this.position = position ;
	}
	public void setName(String name){
		this.name = name;
	}
	public void work(){
		System.out.println("����");
	}
	public void eat(){
		System.out.println("�Է�");
	}
	public void raise(){
		System.out.println("��н");
	}
	public void showAll(){
		System.out.println("������"+" "+getName()+"ְҵ:"+" "+getPosition()+"нˮ��"+getSalary());
	}
}
class Book{
	private String title ;
	private int pageNum;
	public String getTitle(){
		return title;
	}
	public int getPageNum(){
		return pageNum;
	
	}
	public void setPageNum(int pageNum){
		this.pageNum = pageNum;
	}
	public void setTitle(String title){
		this.title = title;
	}
	public void showAll(){
		if(getPageNum()<200){
			System.out.println("�������");
			System.out.println("��ı���Ϊ��"+getTitle()+" "+"ҳ��Ϊ��200");
		
		}else{
			System.out.println("��ı���Ϊ��"+getTitle()+" "+"ҳ��Ϊ��"+getPageNum());
		
			
		}
		
	}

}
class Circle{
	private double radius;
	public Circle (double radius){
		this.radius = radius;
	}
	public void findPerimeter(){//���ܳ�
		System.out.println("�ܳ�Ϊ��"+(2*3.14*radius));

	}
	public void findArea(){//�����
		System.out.println("���Ϊ��"+(3.14*radius*radius));


	}
	
}
class Account{
	private String coustomer;
	private String id;
	private double balance ;
	private String annuallnterestRate;
	public String getCoustomer(){
		return coustomer;
	}
	public String getId(){
		return id;
	}
	public double getBalance(){
		return balance;
	}
	public String getAnnuallnterestRate(){
		return annuallnterestRate;
	}
	public void setId(String id){
		this.id = id;
	}
	public void setcoustomer(String coustomer){
		this.coustomer = coustomer;
	}
	public void setBalance (double balance){
		this.balance = balance ;
	}
	public void setAnnuallnterestRate(String annuallnterestRate){
		this.annuallnterestRate = annuallnterestRate;
	}
	public void withdraw(double b){
		if(b<getBalance()){

			System.out.println("�ɹ�ȡ��:"+b);
		}else{
			System.out.println("���㣬ȡǮʧ�ܣ�");
		}

	}
	public void deposit(double a){
		System.out.println("�ɹ���"+a);
	}
	public void print(double a,double b){
		System.out.println("Customer[Smith,Jane] has a account : id is" +getId()+",annuallnterestRate is :"+getAnnuallnterestRate()+",balance is :"+(getBalance()-b+a));
	}
}