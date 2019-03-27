public class Demo01 {

	public static void main(String[] args) {
		/*
		 * "String 对象"是不可改变的
		 * String 类型的引用值可以改变
		 */
		// str 是String类型的引用，
		// "ABC" 是String类型的对象
		String str = "ABC";
		String s = str;
		str += "def";
		System.out.println(str);
		System.out.println(s);
		
	}

}

////////////////////////////////////////////////
public class Demo02 {

	public static void main(String[] args) {
		/*
		 * 为了Java系统的安全，Java将String定义
		 * 为final类，可以避免用户继承String 
		 */
	}

}
//编译错误，String是final的，不能被继承
//class MyString extends String{
//}

/////////////////////////////////////////////
public class Demo03 {
	public static final String S = "ABC";
	public static void main(String[] args) {
		/*
		 * String 常量池
		 * 1. JAVA 静态字符串
		 *    字面量  “ABC”
		 *    常量  static final String S;
		 *    字面量 常量的运算结果： 'A'+"BC"
		 * 2. Java 会将静态字符串的引用缓存到
		 * 	 Java 常量池，在“一样”时候重用相同
		 *   字符串对象 
		 * 3. 动态字符串，不会被重用 
		 * 	  new 创建的字符串
		 *    字符串变量连接的结果
		 *    
		 * > 复用静态字符串的目的是为了优化性能
		 *   提高内存的使用效率。
		 */
		String s1 = "ABC";
		String s2 = "ABC";
		String s4 = 'A'+"BC"; //字面量连接
		String s5 = S;
		String s3 = new String("ABC");
		String ss1 = "A";
		String ss2 = "BC";
		String s6 = ss1+ss2;//变量连接
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s6);
	}

}


///////////////////////////////////////////////////////
public class Demo04 {

	public static void main(String[] args) {
		/*
		 * 1. Java String 中的字符是char类型
		 * 2. 无论中文还是英文都是 16位的char字符
		 * 3. 每个字符的值是unicode编码值
		 * 
		 * 使用 length() 可以返回字符个数
		 * 使用 charAt(索引号) 返回指定位置字符
		 */
		
		String str = "您好Hello";//序号从0开始
		int len = str.length();  //7  字符串长度
		char c = str.charAt(1);  //好 序号为1的字符
		System.out.println(c);   //好
		System.out.println((int)c);//Unicode值
		c = str.charAt(3); //序号为3的字符
		System.out.println(c);  //e
		System.out.println((int)c);//Unicode值
		int n = 0; //统计一下字符串中英文字符的个数
		for(int i=0; i<str.length(); i++ ){
			char ch = str.charAt(i);
			if(('A'<=ch && ch<='Z') || 
			 ('a'<=ch && ch<='z')){
				n++;
			}
		}
		System.out.println(n); 
	}

}
//////////////////////////////////////////////////
public class Demo05 {

	public static void main(String[] args) {
		/*
		 * indexOf 方法
		 * 从前向后查找指定的字符串、字符
		 * 找到就返回位置，找不到返回-1
		 */
		String str = "今天你吃了吗？吃了！";
		int index = str.indexOf('你');
		System.out.println(index);//2
		index = str.indexOf("吃了");
		System.out.println(index); //3
		index = str.indexOf("吃了",4);
		System.out.println(index);//7
		index = str.indexOf("您");
		System.out.println(index); //-1
	}

}
//////////////////////////////////////////////////
public class Demo06 {

	public static void main(String[] args) {
		/*
		 * 截取子字符串 substring 
		 * 截取字符串的一部分作为新的字符串
		 */
		String url="http://tmooc.cn/index.html";
		//用法1: 按照范围截取字符串
		//截取主机地址：从7开始截取到15（不包含）
		String host=url.substring(7, 15);
		System.out.println(host); //tmooc.cn
		//用法2：按照长度截取字符串
		//按照长度截取：从7开始连续截取5个字符
		String str=url.substring(7, 7+5);
		System.out.println(str); //tmooc
		
		//重载方法: 从起始位置开始到字符串最后
		String s = url.substring(16);
		System.out.println(s);//index.html
		
		String h = host(
			"http://tmooc.cn/index.html");
		System.out.println(h); 
		h = host(
			"http://doc.canglaoshi.org/index.html");
			System.out.println(h); 
	}
	
	/*
	 * 实现一个方法，输入任意URL地址，返回其中
	 * 的主机名
	 * http://tmooc.cn/index.html
	 * http://doc.canglaoshi.org/index.html
	 * http://tedu.cn/index.html
	 * 
	 */
	public static String host(String url){
		int end = url.indexOf("/",7);
		String host=url.substring(7, end);
		return host;
	}

}

//////////////////////////////////////////////
public class Demo07 {

	public static void main(String[] args) {
		/*
		 * 从后向前查找 lastIndexOf()
		 * 返回起始字符的序号，如果找不到返回-1
		 */
		String url="http://tmooc.cn/index.html";
		int index = url.lastIndexOf("cn");
		System.out.println(index); //13
		index = url.lastIndexOf("a");
		System.out.println(index); //-1
		
		String file=fileName(
				"http://tedu.cn/css/style.css");
		System.out.println(file); 
	}
	
	/*
	 * 解析URL，将查询的文件名截取出来
	 * http://tmooc.cn/index.html
	 * http://tmooc.cn/images/logo.png
	 * http://teud.cn/css/cn/style.css
	 */
	public static String fileName(String url){
		int index = url.lastIndexOf("/");
		String file=url.substring(index+1);
		return file;
	}
	

}

/////////////////////////////////////////////
public class Demo08 {

	public static void main(String[] args) {
		/*
		 * 去除字符串两端的空白 
		 * 1. 空白包含Unicode编码：0000~0020范围
		 *    的字符，这个范围都是控制字符（空白）
		 * 2. 字符串中间的空白不会被去除
		 * 3. 一定接收返回值，返回值才是去除空白
		 *    以后的字符串副本
		 * 4. 原字符串对象不变
		 */
		String s = "\t\n\t Tom Jerry \n\t";
		String ss = s.trim();
		System.out.println(ss); 
		
		String str = "Tom";
		String s1 = str.trim();
		System.out.println(str==s1); 
		
		//trim方法经常用于处理用户表单参数
		//过滤并且去除用户意外输入的空白
		String name = "Jerry ";
		name = name.trim();
		System.out.println(name); 
	}
}

/////////////////////////////////////////////

public class Demo09 {

	public static void main(String[] args) {
		/*
		 * 检查字符串是否已指定后缀为结尾 
		 */
		String str="那些年我们追过的女孩.mp4";
		boolean b = str.endsWith(".mp4");
		System.out.println(b); //true
		b = str.endsWith(".mp3");
		System.out.println(b); //false
	}

}
///////////////////////////////////////////
public class Demo10 {

	public static void main(String[] args) {
		/*
		 * StringBuilder
		 * 可变字符串，其方法可以修改StringBuilder中
		 * 字符数组的内容。因为没有频繁复制新字符数组
		 * 相对于String API其操作性能好
		 */
		//创建StringBuilder对象时候，会自动
		//在内部创建一个16个元素的char数组
		StringBuilder buf=new StringBuilder();
		//最佳数据时候，数据会自动填充到char数组中
		buf.append("范传奇");
		buf.append("今天早晨");
		//当超过16个元素时候回自动扩容
		
		//StringBuilder API 方法会返回
		//StringBuilder 对象自身，这样方便
		//连续使用 . 调用其方法，可以大大简化
		//程序的书写
		buf.append("干了一件惊天动地的")
		   .append("大事！")
		   .insert(3, "老师")
		   .delete(1, 1+2);
		System.out.println(buf);
	}

}
///////////////////////////////////////////
public class Demo11 {

	public static void main(String[] args) {
		/*
		 * 转换大小写
		 */
		String str = "您好Java";
		String s = str.toUpperCase();
		System.out.println(s); 
		//转换小写 略 
		
		//经典用途：比较验证码
		// 6d3F 与  6D3F 比较，判断是否一致
		
		//直接比较：
		String code = "6d3F";
		String input = "6D3F";
		System.out.println(code.equalsIgnoreCase(input)); 
		System.out.println(code.equals(input)); 
		//转小写比较编码是否一致
		System.out.println(
				code.toLowerCase().equals(
				input.toLowerCase())); 
		//判断文件是否以png为结尾
		String file="logo.PNG";
		System.out.println(file.endsWith(".png"));
		System.out.println(
				file.toLowerCase().endsWith(".png"));
		
		
	}
}
//////////////////////////////////////////////////////
public class Demo12 {

	public static void main(String[] args) {
		/*
		 * StringBuilder 的用途
		 * 1. Java 中动态字符串连接，是自动利用
		 *   StringBuilder完成的。
		 * 2. 在一行上使用字符串连接会使用同一个
		 *   StringBuilder对象。
		 * 3. 如果进行大量的字符串操作，请使用
		 *   一个StringBuilder对象实现字符串连接
		 *   提高字符串连接性能
		 * 4. StringBuffer 与 StringBuilder
		 *   API方法完全一样，内部结构完全一样
		 *   StringBuffer 是线程安全的API，方法加锁了
		 *   StringBuffer 早 慢
		 *   StringBuilder 新 快 
		 */
		String s1 = "您好";
		String s2 = "Java";
		String s3 = s1 + s2;
		// s3 = new StringBuilder(s1)
		//		.append(s2).toString();
		String s4 = s1+s2+5+8;
		// s4 = new StringBuilder(s1)
		//		.append(s2)
		//		.append(5)
		//		.append(8).toString();
		
		//案例：将一个数组连接为一个字符串
		int[] arr = {4,1,10,5,1,9,22};
		//连接为：[4, 1, 10, 5, 1, 9, 22]
		String str="["+arr[0];//
		for(int i=1; i<arr.length; i++){
			str = str+", "+arr[i] ;//
		}
		str = str + "]";//
		System.out.println(str); 
		
		arr = new int[100000];//10万个0 
		System.out.println(stringTest(arr)); 
		System.out.println(
				stringBuilderTest(arr)); 
	}
	//使用一个StringBuilde对象完成字符串连接
	//性能好，速度快！
	public static long stringBuilderTest(int [] arr){
		long start = System.currentTimeMillis();
		StringBuilder buf=
				new StringBuilder("[")
				.append(arr[0]);
		for(int i=1; i<arr.length; i++){
			buf.append(", ").append(arr[i]);
		}
		buf.append("]");
		long end=System.currentTimeMillis();
		//System.out.println(buf);
		return end-start;
	}
	
	//将数组连接为一个字符串
	//采用 String 连接计算，性能差
	//创建了很多个 StringBuilder对象
	public static long stringTest(int[] arr){
		long start = System.currentTimeMillis();
		//"["+arr[0] 创建了一个StringBuilder对象
		String str = "["+arr[0];
		for(int i=1; i<arr.length; i++){
			//创建了N个StringBuilder对象
			str = str + ", "+arr[i];
		}
		//创建了一个StringBuilder对象
		str = str+"]";
		long end = System.currentTimeMillis();
		return end - start;
	}

}
















