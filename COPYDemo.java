package raf;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * 文件复制
 * @author adminitartor
 *
 */
public class CopyDemo {
	public static void main(String[] args) throws IOException {
		RandomAccessFile src
			= new RandomAccessFile("./music.mp3","r");
	
		RandomAccessFile desc
			= new RandomAccessFile("./music_cp.mp3","rw");
		//记录每次从原文件读取到的字节
		int d = -1;
		while((d=src.read())!=-1){
			desc.write(d);
		}
		System.out.println("复制完毕!");
		src.close();
		desc.close();
	}
}


