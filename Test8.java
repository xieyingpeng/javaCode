class Test7 {
	public static void main(String[] args) {
		Z z = new Z();
	}
}
class X{
	Y y = new Y();
	X(){
		System.out.println("X");
	}
}
class Y{
	Y(){
		System.out.println("Y");
	}
}
class Z extends X{
	Y y = new Y();

}