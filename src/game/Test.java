package game;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Test {
	/*��������game��������¹��ܡ�
	1��������Ϸ��NetGame�����а�����
	a)˽�����ԣ�gameName��gameServer��gameLevel
	b)������
	i.3�������Ը�ֵ�ķ�����Ҫ�󣺷�����ֻ���ǡ���ͨ���������š�������ͨ���������⡱��Ĭ��Ϊ��ͨ���ȼ������Ǵ��ڵ���0��������
	    ���ȼ���Чʱ��Ĭ��Ϊ0��
	ii.3����������ֵ�ķ���
	iii.group(int person)��ʵ����Ϸ���ŵĹ��ܣ���ʾ����Ϸ��Ҫ���ٸ��˲������ţ�����ͨ����������
	2��������TestGame������3����Ϸ���󣬽��ܼ������룬��ÿ����Ϸ�����Ը�ֵ����ʾ��������Ϸ������ֵ��
		���ÿ����Ϸ�������ŵ���������*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("���������ڷ�������");
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
		
		if(s == "��ͨ" ){
			System.out.println(s);
		}else if(s == "����"){
			System.out.println(s);
		}else if(s == "��ͨ"){
			System.out.println(s);
		}else if(s == "����"){
			System.out.println(s);
		}else{
			System.out.println("���ڷ�����������󣡣���");
		}
	}
	/*NetGame(int gameLevel){
		}*/
	void getGameServer(String s){
		
		/*while(s == "��ͨ"||s == "����"||s == "��ͨ"||s == "����"){
			System.out.println(s);
		}*/
		
		
		
	}
}