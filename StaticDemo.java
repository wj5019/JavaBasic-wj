package oo.day05;
//static����ʾ
public class StaticDemo {
	public static void main(String[] args) {
		Loo o1 = new Loo();
		o1.show(); //1,1
		Loo o2 = new Loo();
		o2.show(); //1,2
		System.out.println(Loo.b); //����ͨ��������������
		
		Moo.test(); //ͨ��������������
		
		Noo o3 = new Noo();
		Noo o4 = new Noo();
		Noo o5 = new Noo();
	}
}

class Noo{ //��ʾ��̬��
	static{
		System.out.println("��̬��");
	}
	Noo(){
		System.out.println("���췽��");
	}
}

class Moo{ //��ʾ��̬����
	int a; //ʵ������
	static int b; //��̬����
	void show(){ //����ʽthis����
		System.out.println(this.a);
		System.out.println(Moo.b);
	}
	static void test(){ //û����ʽthis����
		//��̬������û����ʽ��this����
		//û��this��ζ��û�ж���
		//��ʵ������a����ͨ�������������
		//���Դ˴��������
		//System.out.println(a);
		System.out.println(Moo.b);
	}
}

class Loo{ //��ʾ��̬����
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






















