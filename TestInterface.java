//接口的实现和定义
class TestInterface {
	public static void main(String[] args) {
		Jiekou jk = new Dog();
		jk.eat();mmmm 
	}
}   
interface Jiekou{
	public abstract void eat();
}
class Dog implements Jiekou{
	public void eat(){
		System.out.println("吃饭饭！");
	}
}
