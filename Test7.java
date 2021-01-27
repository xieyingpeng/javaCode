class Test7 {
	public static void main(String[] args) {
		NewPhone  newphone = new NewPhone();
		newphone.call("xie");+
		private String name h;
		private int age ;
		private String 
		//System.out.println("Hello World!");
	}
}
class Phone{
	public void call(String name){
		System.out.println("给"+name +"打电话");
	}
}
class NewPhone extends Phone{
	public void call(String name){
		super.call(name);
		System.out.println(name+"可以听天气预报");
	}
	
}
