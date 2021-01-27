/*
	A类中有两个show方法，但是都不能完全匹配，寻找父类引用为参数的方法
	因此只能调用public String show(A obj) 输出 'AA‘
	其他也是类型，如果没有最匹配的就找父类的，如果有就找自己的

*/
class Duotai1 {
	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new B();
		B b = new B();
		C c = new C();
		D d = new D();
		System.out.println("1--"+a1.show(b));
		System.out.println("2--"+a1.show(c));
		System.out.println("3--"+a1.show(d));
		System.out.println("4--"+a2.show(b));
		System.out.println("5--"+a2.show(c));
		System.out.println("6--"+a2.show(d));
		System.out.println("7--"+b.show(b));
		System.out.println("8--"+b.show(c));
		System.out.println("9--"+b.show(d));
	}
}
class A{
	public String show(D obj){
		return ("A and D");
	}
	public String show(A obj){
		return ("A and A");
	}
}
class B extends A {
	public String show(B obj){//该方法在A 类中找不到相同的声明，因此不算是重写，是一个新方法
		return ("B and B");
	}
	public String show(A obj){
		return ("B and A");
	}
}
class C extends B{

}
class D extends B{
}
