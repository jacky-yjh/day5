package draw;

import java.util.Scanner;

public class Test {
	/*���ص㣺�������أ�������draw��
	1��������Draw������ͼ�Σ���������
	a)���ԣ�private double drawRound��������ͼ�ε��ܳ���
	b)���췽���������Ը�ֵΪ0��
	c)������getRound�������ش����ܳ�������ֵ
	d)������void round��double r�� ����Բ�ε��ܳ���������ʾԲ�İ뾶
	e)������void round��int length��int width�� ���㳤���ε��ܳ���������ʾ�����εĳ����
	f)������void round��int length�����������ε��ܳ���������ʾ�����εı߳�
	g)������void round��int a��int b��int c�����������ε��ܳ���������ʾ�����ε������ߡ�
	2��������TestDraw���������У������û�����ÿ��ͼ�����ܳ�����Ҫ�����ݣ���������Ӧ��round��������ܳ�����ʾ������
		ע�������������һ��ͼ��*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Draw draw = new Draw();
		draw.show();
		draw.getRound();
		draw.round(0);
	}

}

class Draw{
	private double drawRound;
	Draw(){
		drawRound = 0;	
	}
	
	Draw(double r){
		
	}
	
	Draw(int length,int width){
		
	}
	
	/*Draw(int length){
		
	}*/
	

	Draw(int a,int b,int c){
		
	}
	void show(){
		System.out.println(drawRound);
	}
	void getRound(){
		System.out.println(drawRound+"��");
	}
	void round(double r){
		Scanner scan = new Scanner(System.in);
		System.out.println("������뾶��");
		r = scan.nextDouble();
		System.out.println("�ܳ��ǣ�"+(2*Math.PI*r));
	}
	void round(int length,int width){
		Scanner scan = new Scanner(System.in);
		System.out.println("�����볤��");
		length = scan.nextInt();
		System.out.println("�������");
		width = scan.nextInt();
		System.out.println("�ܳ��ǣ�"+(2*length*width));
	}
	void round(int length){
		Scanner scan = new Scanner(System.in);
		System.out.println("������߳���");
		length = scan.nextInt();
		System.out.println("�ܳ��ǣ�"+(4*length));
	}
	void round(int a,int b,int c){
		Scanner scan = new Scanner(System.in);
		System.out.println("�����������εĵ�һ��a��");
		a = scan.nextInt();
		System.out.println("�����������εĵڶ���b��");
		b = scan.nextInt();
		System.out.println("�����������εĵ�����c��");
		c = scan.nextInt();
		System.out.println("�ܳ��ǣ�"+(a+b+c));
	}
}