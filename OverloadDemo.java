/*1）同一个文件中可以包含多个类
 * 2）public修饰的类，只能有一个
 * 3）public修饰的类，必须与文件名相同
 * 
 * */
//重载的演示
public class OverloadDemo {
	public static void main(String[] args) {//访问类，先new对象
		Aoo o=new Aoo();
		o.say();
		o.say("wj");
		o.say(25);
		o.say("qq", 63);
		o.say(23, "zz");

	}
}

class Aoo{
	void say() {}
	void say(String name) {
		System.out.println("名字是："+name);
	}
	void say(int age) {}
	void say(String name,int age) {}
	void say(int age,String name) {}
	//int say(){return 1};//编译错误，重载与返回值类型无关
	//void say(String address) {}//编译错误，重载与名字无关
}
