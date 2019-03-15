package oo.day06;
//static final常量的演示
public class StaticFinalDemo {
	public static void main(String[] args) {
		System.out.println(Aoo.PI); //常常由类名点来访问
		//Aoo.PI = 3.1415926; //编译错误，常量不能被改变
		
		
		
		//1)加载Boo.class到方法区中
		//2)静态变量num存储到方法区中
		//3)到方法区中获取num的值并输出
		System.out.println(Boo.num);
		
		
		//编译器在编译时将常量直接替换为具体的值，效率高
		//相当于System.out.println(5);
		System.out.println(Boo.COUNT);
		
	}
}

class Boo{
	public static int num = 5; //静态变量
	public static final int COUNT = 5; //常量
}


