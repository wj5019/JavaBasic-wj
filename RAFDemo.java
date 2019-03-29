package raf;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * java.io.RandomAccessFile
 * 专门用来读写文件的API,RAF基于指针对文件随机读写.
 * 
 * @author adminitartor
 *
 */
public class RAFDemo {
	public static void main(String[] args) throws IOException {
		/*
		 *  对当前目录下的test.dat文件进行读写操作
		 *  RAF构造方法第一个参数可以直接给路径,
		 *  或者指定File对象.
		 *  第二个参数为操作模式,常用的有:
		 *  "r":只读模式,对该文件仅做读取操作
		 *  "rw":对文件进行读写
		 */
		RandomAccessFile raf
			= new RandomAccessFile(
					"./test.dat","rw");
		
		/*
		 *                            vvvvvvvv
		 * 00000000 00000000 00000000 00000001
		 * 
		 * void write(int d)
		 * 向文件写入1个字节,写入的是给定的int值
		 * 对应2进制的"低8位"
		 * 
		 * 00000001 00000010
		 */
		raf.write(1);
		raf.write(2);
		
		System.out.println("写出完毕!");
		raf.close();
		
	}
}

