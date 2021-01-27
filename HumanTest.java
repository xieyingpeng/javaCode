class HumanTest {
	public static void main(String[] args) {
		Student student1 = new Student("xie","20","��","2019");
		student1.showAll();
		student1.student();
		Student student2 = new Student("����", "23","��","20190521");
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
		System.out.println("������"+name+" ���䣺"+age+"�Ա�"+sex);
	}
	public void student(){
		System.out.println("������ѧϰ");
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
		super.showAll();//���ø���ķ���
		System.out.println("ѧ��:"+number);
	}
	public void student(){
		//super.student();
		System.out.println("ѧ������ѧϰ");
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
		System.out.println("��ѧ������ѧϰ");
	}
	public void show(){
		super.showAll();//���ø���ķ���
		//System.out.println("������"+getName()+"���䣺"+getAge()+"�Ա�"+getSex());
	}

}