import java.awt.Graphics;

import javax.swing.JFrame;//框
import javax.swing.JPanel;//板,数据在板上
//整个窗口
public class World extends JPanel{
	public static final int WIDTH=400;//窗口的宽
	public static final int HEIGHT=700;//窗口的高
	
	
	private Sky sky= new Sky();//天空
	private Hero hero=new Hero();//英雄机
	private FlyingObject[] enemies= {
			new Airplane(),
			new BigAirplane(),
			new Bee()
	};//敌人（三个
	private Bullet[] bullets= {
			new Bullet(100, 200)
	};//子弹
	
	public void action() {//测试代码
	enemies=new FlyingObject[5];
	enemies[0]=new Airplane();//向上造型
	enemies[1]=new Airplane();
	enemies[2]=new BigAirplane();
	enemies[3]=new BigAirplane();
	enemies[4]=new Bee();
	for (int i = 0; i < enemies.length; i++) {
		enemies[i].step();
		//enemies[i]被子弹射击
		//enemies[i]被英雄机撞
	     }
	}
	
	//重写paint（）画  g画笔
	public void paint(Graphics g) {
		sky.paintObject(g);
		hero.paintObject(g);
		for (int i = 0; i < enemies.length; i++) {
			enemies[i].paintObject(g);//画敌人
		}
		for (int i = 0; i < bullets.length; i++) {
			bullets[i].paintObject(g);//画子弹
		}
	}
	
	
	
	
	
	public static void main(String[] args) {
		JFrame frame=new JFrame();
		World world=new World();
		frame.add(world);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(WIDTH,HEIGHT);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);//1)设置窗口可见，2）尽快去调用paint（）方法
		
		world.action();
	}

}
