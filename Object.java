public class Demo01 {

	public static void main(String[] args) {
		/*
		 * Object 
		 * 是所有Java类的最终父类型
		 *  
		 * 包装类
		 * 用于将基本类型包装为对象
		 * 以及提供了Java中最基本的方法
		 * 
		 * 
		 * Object
		 * 1. 任何类型如果没有父类型，则默认继承
		 *   于Object。
		 *   任何类最终都继承于Object
		 * 2. Java 将全部类型都有的属性和方法
		 *   定义到了Object类型上
		 * 3. Object 定义的方法，任何对象都有
		 * 	 equals 方法
		 *   toString 方法
		 */
		
		/*
		 * toString() 方法
		 * 1. 返回对象的文本描述。
		 * 2. 默认实现返回了 "没有意义的" 
		 * 	   类全名@散列码
		 * 3. Java 建议重写 toString 修改
		 *   toString返回值，一般修改为返回
		 *   对象当前 的属性，用于Debug
		 * 4. Java 的很多API会自动调用toString
		 *   简化编程。 
		 * 5. Eclipse提供了快捷工具，帮你重写
		 *   toString() 返回对象的属性
		 */
		Foo foo = new Foo();
		Point p = new Point();
		System.out.println(p.toString());
		System.out.println(foo.toString());
		
		System.out.println(p.x);
		System.out.println(p.y);
		//println 方法会自动调用p的toString方法
		System.out.println(p);
	}
}
class Foo{
}
class Point{
	int x;
	int y;
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}



public class Demo02 {

	public static void main(String[] args) {
		/*
		 * Object equals 方法
		 *  equals 相等
		 * 
		 * 引子: == 和 equals
		 * 
		 * == 用于比较值是否相等
		 * 1. 基本类型,就是比较基本类型值是否相等
		 * 2. 引用类型,比较引用的值(对象地址值)是
		 *   否相等. 地址值一样则true.
		 * 3. == 只能比较两个引用是否引用了同一个
		 *   对象,不能比较两个对象的内容(属性)是否
		 *   相等.
		 * 
		 * Java 在Object类为全部对象定义了equals
		 * 方法用于解决 判断 对象内容(属性)是否
		 * 相等问题,简称: 判断对象是否相等
		 * 
		 * 1. equals 方法用于比较对象是否相等
		 * 2. 默认的equals方法,其内部就是 "==", 
		 *    与 == 规则一致
		 * 3. Java 建议在子类中重写, 修改为按照
		 *    对象属性比较对象是否相等.
		 * 4. Eclipse 提供了功能,可以快速重写
		 *    equals方法, 按照属性比较对象是否相等
		 * 5. equals 方法要与hashCode一起重写,
		 *    hashCode 方法在 hashMap 章节详细讲解
		 */
		Goo g1 = new Goo(8);
		Goo g2 = g1;
		Goo g3 = new Goo(8);
		System.out.println(g1==g2); //true
		System.out.println(g1==g3); //false
		System.out.println(g1.equals(g2));  
		System.out.println(g1.equals(g3));  
		
		Cell c1 = new Cell(5,6);
		Cell c2 = new Cell(5,6);
		Cell c3 = new Cell(7,9);
		System.out.println(c1.equals(c2));
		System.out.println(c1.equals(c3));
	}
	
}
class Cell{  //格子,单元,细胞
	int row; //行
	int col; //列
	public Cell(int row, int col) {
		this.row = row;
		this.col = col;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + col;
		result = prime * result + row;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cell other = (Cell) obj;
		if (col != other.col)
			return false;
		if (row != other.row)
			return false;
		return true;
	}
	
}
class Goo{
	int x;
	public Goo(int x){
		this.x = x;
	}
}

public class Demo03 {

	public static void main(String[] args) {
		/*
		 * Java API 类 的 toString equals 
		 * 1. Java 的API大多重写了 toString equals 
		 * 2. String 重写了  toString equals 
		 * 3. StringBuilder 也重写了
		 * 
		 * 比较两个字符串是否相等,应该使用 equals
		 * 方法!!
		 */
		String s1 = "ABC";
		String s2 = "ABC";
		//== 不能用于比较String对象是否相等
		System.out.println(s1==s2);//true
		String s3 = new String("ABC");
		System.out.println(s1==s3);//false
		
		//比较两个字符串是否相等,应该使用 equals方法
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}

}




