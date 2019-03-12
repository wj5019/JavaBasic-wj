//重写与重载的区别的演示
public class OverrideOverloadDemo {
    public static void main(String[] args) {
    	Goo goo=new Goo();//想访问先new一个对象
    	Eoo o=new Foo();//向上造型
    	goo.test(o);//重载
    	//重载看参数，重写看对象
	
    }

}
class Goo{
	void test(Eoo o) {
		System.out.println("超类型参数");
		o.show();//父子类重写。重写看对象，o的对象是Foo
	}
	void test(Foo o) {
		System.out.println("派生类型参数");
		o.show();
	}
}
class Eoo{
	void show() {
		System.out.println("超类show");
	}
}

class Foo extends Eoo{
	void show() {
		System.out.println("子类show");
	}
}
