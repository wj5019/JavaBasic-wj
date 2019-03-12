
//重写的演示
public class OverrideDemo {
	public static void main(String[] args) {
		
	}

}

//超类打，派生类小
class Coo{
	void show() {}
	double text() {return 0.0;}//如果不是void一定要return
	Doo say() {return null;}
}


class Doo extends Coo{
	//int show() {return 1;}//编译错误，void时必须相等
	void show() {}
	//int text() {return 0;}//编译错误，基本数据类型时也必须相等
	//Coo say() {return null;}//编译错误，必须小于或等于
	
}
