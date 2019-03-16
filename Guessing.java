package day07;
//猜字符游戏
import java.util.Scanner;

public class Gussing {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char[] chs = generate();//获取随机字符数组
		System.out.println(chs);//只有char数组可以这么写，其他的都要for遍历输出//作弊
		int count = 0;//猜错的次数
		while (true) {//自造死循环  break的时候才会停止
			System.out.println("猜吧！");
			String str= scan.nextLine().toUpperCase();//获取用户的字符串//后面是小写字母转化成大写
			//toUpperCase()转化成大写    toLowerCase（）转成小写
			if (str.equals("EXIT")) {//判断字符串的内容相等  ，，基本数据变量用== ，string类型用equals
				System.out.println("下次再来吧");
				break;
			}
			char[] input = str.toCharArray();//字符串转换成数组
			int[] result=check(chs, input);//对比
			if (result[0]==chs.length) {//对
				int score=100*chs.length-10*count;
				System.out.println("恭喜你猜对了，得分为："+score);
				break;
			}else {//错
				count++;
				System.out.println("字符对的个数为"+result[1]+"位置对的个数为"+result[0]);
			}
			}
		scan.close();
	}


	public static char[] generate() {//生成随机字符数组chs
		
		char[] letters = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
				'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V',
				'W', 'X', 'Y', 'Z' };//随机字符
		boolean[] flags = new boolean[letters.length];//标记，默认的是false
		char[] chs = new char[5];//随机字符数组
		for (int i = 0; i < chs.length; i++) {//遍历随机字符数组
			int index;
			do {
				index = (int) (Math.random() * (letters.length));//随机下标0-26之间
			} while (flags[index]==true);//当条件为真说明已经使用过，随机取下标，条件为假未使用过直接去下面
			chs[i] = letters[index];//基于下标index到letters中获取对应字符，赋值给chs[i]
			flags[index] = true;
		}
		return chs;
	}
	//i=0;index=2;  chs[0]=c  flags=true
	//i=1;index=2/1;  chs[1]=b  flags=true
	//i=2;index=1/1/0; chs[2]=a   flags=true
	//i=3;index=13;chs[3]=n flags=true
	//i=4;index=2/2/1/13/5;chs[4]=e flags=true 


	public static int[] check(char[] chs, char[] input) {//对比：随机字符数组chs与用户输入的字符数组input
		int[] result = new int[2];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < chs.length; j++) {
				if (input[i] == chs[j]) {//字符对
					result[1]++;//假设result【1】为字符对个数，result[0]是位置对个数
					if (i == j) {//位置对
						result[0]++;//位置对个数
					}
					break;//不重复的字母，input[i],chs[j]对上 j后面的就不用再试了
				}
			}
		}
		return result;
	}
}
