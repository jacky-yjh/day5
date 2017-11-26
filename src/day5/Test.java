package day5;

public class Test {
//	【创建包book，完成如下功能】
//	1、创建类Book，包含如下成员：
//	a)属性：书名、页数、价格
//	b)方法：
//	i.默认构造方法：给三个属性赋初始值为“未知”、0页、0元
//	ii.show()：显示三个属性值
//	2、创建类TestBook：包含main()，创建两个Book类对象，调用默认构造方法为对象进行实例化，显示出两本书的信息。
//	      再通过键盘输入重新为这两本书的属性赋值，再显示出两本书的信息。
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		System.out.println("  书名："+book1.bookName+"  页数："+book1.pages+"页  价格："+book1.price+"元");
		Book book2 = new Book("1234",567,32.2);
		System.out.println("  书名："+book2.bookName+"  页数："+book2.pages+"页  价格："+book2.price+"元");
	}

}
 class Book{
	 String bookName;
	 int pages;
	 double price;
	 Book(){
		 bookName = "未知";
	 }
	 Book(String bookName,int pages,double price){
		 this.bookName = bookName;
		 this.pages = pages;
		 this.price = price;
	 }
	 void show(){
		 System.out.println("  书名："+bookName+"  页数："+pages+"  价格："+price);
	 }
 }
