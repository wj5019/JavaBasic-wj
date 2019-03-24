package oo.day11;
//求一组图形的最大面积
public class ShapeTest {
	public static void main(String[] args) {
		Shape[] shapes=new Shape[6];
		shapes[0]=new Circle(1);
		shapes[1]=new Circle(2);
		shapes[2]=new Square(1);
		shapes[3]=new Square(2);
		shapes[4]=new Six(1);
		shapes[5]=new Six(2);
		
		double max=shapes[0].area();
		int maxIndex=0;//最大面积下标
		for (int i = 0; i < shapes.length; i++) {
			double area=shapes[i].area();
			if (area>max) {
				max=area;
				maxIndex=i;
			}
		}
		System.out.println("最大值为"+max+",最大下标为"+maxIndex);
	}
}

abstract class Shape{//图形
	protected  double c;//周长
	public Shape(double c) {
		this.c=c;
	}
	public abstract double area();//计算面积
}


class Circle extends Shape{//圆形
	public Circle(double c) {
		super(c);
	}
	public double area() {//重写抽象方法
		return 0.0796*c*c;
	}
}


class Square extends Shape{//方形
	public Square(double c) {
		super(c);
	}
	public double area() {//重写抽象方法
		return 0.0625*c*c;
   }
}

class Six extends Shape{
	public Six(double c) {
		super(c);
	}
	public double area() {
		return 0.0721*c*c;
	}
}







