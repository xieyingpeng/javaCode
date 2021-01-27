class Test6 {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setAge(18);
		animal.setColor("red");
		animal.setGender("男");
		animal.play();
		animal.rest();
		animal.showAll();
		Student studentt = new Student();
		student.setName("xie");
		student.setAge(18);
		System.out.println("姓名："+getName());
	}

}

class Animal{
	private String color;
	private int age;
	private String gender;
	public String getColor(){
		return color;
	}
	public int getAge(){
		return age;
	}
	public String getGender(){
		return gender;

	}
	public void setColor(String color){
		this.color = color;

	}
	public void setAge(int age){
		this.age=age;
	}
	public void setGender(String gender){
		this.gender=gender;
	}
	public void play(){
		System.out.println("玩耍");
	}
	public void rest(){
		System.out.println("休息");
	}
	public void showAll(){
		System.out.println("颜色为："+getColor()+"性别为："+getGender()+"年龄为："+getAge());

	}


}
class Student{
	private String name;
	private String number;
	private int age ;
	public String getName(){
		return name ;
	}
	public  String getNmber(){
		return number;
	}
	public int getAge(){
		return age;
	}
	public void setNmae(String name ){
		this.name = name;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public void setAge(int age){
		this.age = age;
	}
}