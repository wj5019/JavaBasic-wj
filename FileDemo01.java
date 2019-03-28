package file;

import java.io.File;
import java.io.IOException;

public class Demo01 {
	public static void main(String[] args) 
			throws IOException {
		/*
		 * File 文件是什么?
		 * 文件是持久保存数据的存储单元 
		 * 
		 * 任何数据如果需要持久保存,就需要存储到文件中
		 * 
		 * File API 
		 * 
		 * 1. 在java.io包中
		 * 2. 是Java提供的用于操作文件的API
		 * 3. 利用File API方法,可以实现:
		 * 	  创建文件
		 *   创建文件夹
		 *   查看文件的属性
		 *   删除文件/文件夹 
		 *   文件/文件夹改名等
		 */
		
		//Linux 
		//File file = new File("/home/soft01/demo"); 
		//Windows
		File file = new File("D:/demo");
		//到硬盘上(外存上)创建一个文件夹
		//如果创建成功,返回true
		//创建失败返回false, 如已经存在文件夹时候
		boolean b = file.mkdir();
		System.out.println(b); 
		
		/*
		 * 使用File API创建文件
		 */
		//linux: new File("/home/soft01/test.txt");
		File file2 = new File("D:/test.txt");
		//调用方法 createNewFile 创建文件
		//如果返回true表示创建成功,false失败
		b=file2.createNewFile();
		System.out.println(b);
		
		//在文件夹中创建文件:
		//1. 给出全路径名
		//Linux new File("/home/soft01/demo/hello.txt");
		File file3 = new File("D:/demo/hello.txt");
		file3.createNewFile();
		//2. 使用相对路径
		File dir = new File("D:/demo");
		//                 父目录   子文件
		File file4=new File(dir, "myfile.txt");
		file4.createNewFile();
		
		//File API 
		//即可以代表文件也可以代表文件夹
		//提供方法, 用来区别当前代表的是文件
		//还是文件夹
		
		//当file4代表是文件夹时候,返回true否则false
		b = file4.isDirectory();
		System.out.println(b);//false
		//当file4代表是文件时候,返回true否则false
		b = file4.isFile();
		System.out.println(b);//true
		
		b = dir.isDirectory();
		System.out.println(b); //true
		b = dir.isFile();
		System.out.println(b); //false
	}
}




