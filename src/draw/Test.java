package draw;

import java.util.Scanner;

public class Test {
	/*【重点：方法重载，创建包draw】
	1、创建类Draw（代表图形），包含：
	a)属性：private double drawRound；（代表图形的周长）
	b)构造方法：给属性赋值为0；
	c)方法：getRound（）返回代表周长的属性值
	d)方法：void round（double r） 计算圆形的周长，参数表示圆的半径
	e)方法：void round（int length，int width） 计算长方形的周长，参数表示长方形的长与宽
	f)方法：void round（int length）计算正方形的周长，参数表示正方形的边长
	g)方法：void round（int a，int b，int c）计算三角形的周长，参数表示三角形的三条边。
	2、创建类TestDraw，主方法中，接受用户输入每种图形求周长所需要的数据，并调用相应的round方法求出周长并显示出来，
		注意描述清楚是哪一种图形*/
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
		System.out.println(drawRound+"米");
	}
	void round(double r){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入半径：");
		r = scan.nextDouble();
		System.out.println("周长是："+(2*Math.PI*r));
	}
	void round(int length,int width){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入长：");
		length = scan.nextInt();
		System.out.println("请输入宽：");
		width = scan.nextInt();
		System.out.println("周长是："+(2*length*width));
	}
	void round(int length){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入边长：");
		length = scan.nextInt();
		System.out.println("周长是："+(4*length));
	}
	void round(int a,int b,int c){
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三角形的第一边a：");
		a = scan.nextInt();
		System.out.println("请输入三角形的第二边b：");
		b = scan.nextInt();
		System.out.println("请输入三角形的第三边c：");
		c = scan.nextInt();
		System.out.println("周长是："+(a+b+c));
	}
}