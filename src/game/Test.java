package game;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Test {
	/*【创建包game，完成如下功能】
	1．创建游戏类NetGame，其中包含：
	a)私有属性：gameName、gameServer、gameLevel
	b)方法：
	i.3个给属性赋值的方法，要求：服务器只能是“联通”、“电信”、“铁通”、“国外”，默认为联通，等级必须是大于等于0的整数，
	    当等级无效时，默认为0级
	ii.3个返回属性值的方法
	iii.group(int person)：实现游戏组团的功能，显示该游戏需要多少个人才能组团，人数通过参数接受
	2．测试类TestGame，创建3个游戏对象，接受键盘输入，给每个游戏的属性赋值，显示出所有游戏的属性值，
		输出每款游戏允许组团的最少人数*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入所在服务器：");
		String s = scan.next();
		NetGame netGame = new NetGame(s);
		netGame.getGameServer(s);
	}

}

class NetGame extends Test{
	private String gameName;
	private String gameServer;
	private int gameLevel;
	NetGame(){
		
	}
	NetGame(String s){
		this.gameServer = s;
		
		if(s == "联通" ){
			System.out.println(s);
		}else if(s == "电信"){
			System.out.println(s);
		}else if(s == "铁通"){
			System.out.println(s);
		}else if(s == "国外"){
			System.out.println(s);
		}else{
			System.out.println("所在服务器输入错误！！！");
		}
	}
	/*NetGame(int gameLevel){
		}*/
	void getGameServer(String s){
		
		/*while(s == "联通"||s == "电信"||s == "铁通"||s == "国外"){
			System.out.println(s);
		}*/
		
		
		
	}
}