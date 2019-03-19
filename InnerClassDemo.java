package oo.day07;
//成员内部类的演示
public class InnerClassDemo {
	public static void main(String[] args) {
		Mama m = new Mama();
		//Baby b = new Baby(); //编译错误，内部类对外不具备可见性
	}
}

class Mama{ //Outer外部类
	private String name;
	void createBaby(){
		Baby b = new Baby(); //内部类对象只在外部类中创建
	}
	class Baby{ //Inner内部类
		void showMamaName(){
			System.out.println(name);
			System.out.println(Mama.this.name);
			//System.out.println(this.name); //编译错误
		}
	}
}























