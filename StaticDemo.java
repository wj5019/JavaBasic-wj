package oo.day05;
//static的演示
public class StaticDemo {
	public static void main(String[] args) {
		Loo o1 = new Loo();
		o1.show(); //1,1
		Loo o2 = new Loo();
		o2.show(); //1,2
		System.out.println(Loo.b); //常常通过类名点来访问
		
		Moo.test(); //通过类名点来访问
		
		Noo o3 = new Noo();
		Noo o4 = new Noo();
		Noo o5 = new Noo();
	}
}

class Noo{ //演示静态块
	static{
		System.out.println("静态块");
	}
	Noo(){
		System.out.println("构造方法");
	}
}

class Moo{ //演示静态方法
	int a; //实例变量
	static int b; //静态变量
	void show(){ //有隐式this传递
		System.out.println(this.a);
		System.out.println(Moo.b);
	}
	static void test(){ //没有隐式this传递
		//静态方法中没有隐式的this传递
		//没有this意味着没有对象
		//而实例变量a必须通过对象点来访问
		//所以此处编译错误
		//System.out.println(a);
		System.out.println(Moo.b);
	}
}

class Loo{ //演示静态变量
	int a;
	static int b;
	Loo(){
		a++;
		b++;
	}
	void show(){
		System.out.println(a+","+b);
	}
}






















