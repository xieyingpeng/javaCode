class HumanTest {
	public static void main(String[] args) {
		Student student1 = new Student("xie","20","男","2019");
		student1.showAll();
		student1.student();
		Student student2 = new Student("张三", "23","男","20190521");
		student2.showAll();
		student2.student();
	}
}
class Human{
	private String name ;
	private String sex;
	private String age ;
	public String getName(){
		return name;
	}
	public String getSex(){
		return sex ;
	}
	public String getAge(){
		return age ;
	}
	public void setName(String name ){
		this.name = name;
	}
	public void setSex(String sex ){
		this.sex = sex ;
	}
	public void setAge(String age ){
		this.age = age ;
	}
	public Human(){
	}
	public Human(String name , String sex , String age ){
		this.name = name ;
		this.sex = sex ;
		this.age = age ;
	}
	public void showAll(){
		System.out.println("姓名："+name+" 年龄："+age+"性别："+sex);
	}
	public void student(){
		System.out.println("人在类学习");
	}
}
class Pupil extends Human{
	private String number;
	public String getNumer(){
		return number ;
	}
	public void setNumber(String number){
		this.number = number ;
	}
	public Pupil(){
	}
	public Pupil(String name , String age , String sex ,String number){
		super(name,age,sex);
		this.number = number;
	}
	public void show(){
		super.showAll();//调用父类的方法
		System.out.println("学号:"+number);
	}
	public void student(){
		//super.student();
		System.out.println("学生类在学习");
	}
}
class Student extends Pupil{
	public Student(){
	}
	public Student(String name ,String age, String sex,String number){
		super(name,age,sex,number);
	}
	public void student(){
		//super.student();
		System.out.println("大学生类在学习");
	}
	public void show(){
		super.showAll();//调用父类的方法
		//System.out.println("姓名："+getName()+"年龄："+getAge()+"性别："+getSex());
	}

}