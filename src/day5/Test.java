package day5;

public class Test {
//	��������book��������¹��ܡ�
//	1��������Book���������³�Ա��
//	a)���ԣ�������ҳ�����۸�
//	b)������
//	i.Ĭ�Ϲ��췽�������������Ը���ʼֵΪ��δ֪����0ҳ��0Ԫ
//	ii.show()����ʾ��������ֵ
//	2��������TestBook������main()����������Book����󣬵���Ĭ�Ϲ��췽��Ϊ�������ʵ��������ʾ�����������Ϣ��
//	      ��ͨ��������������Ϊ������������Ը�ֵ������ʾ�����������Ϣ��
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		System.out.println("  ������"+book1.bookName+"  ҳ����"+book1.pages+"ҳ  �۸�"+book1.price+"Ԫ");
		Book book2 = new Book("1234",567,32.2);
		System.out.println("  ������"+book2.bookName+"  ҳ����"+book2.pages+"ҳ  �۸�"+book2.price+"Ԫ");
	}

}
 class Book{
	 String bookName;
	 int pages;
	 double price;
	 Book(){
		 bookName = "δ֪";
	 }
	 Book(String bookName,int pages,double price){
		 this.bookName = bookName;
		 this.pages = pages;
		 this.price = price;
	 }
	 void show(){
		 System.out.println("  ������"+bookName+"  ҳ����"+pages+"  �۸�"+price);
	 }
 }
