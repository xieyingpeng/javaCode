class Duotai {
	public static void main(String[] args) {
		A a = new B();
		a.show();
		B b = new C();
		b.show();
	}
}
class A{
	public void show(){
		System.out.println("2019");
		show2();
	}
	public void show2(){
		System.out.println("2018");
	}

}

class B extends A{
	public void show2(){
		System.out.println("利大");
	}
	

}
class C extends B{
	public void show(){
		System.out.println("柴親");
		super.show();
	}
	public void show2(){
		System.out.println("方箪");
	}
}
