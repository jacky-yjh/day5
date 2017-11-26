package employee;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Test {
	/*【创建包：employee，完成如下功能】
	1．创建一个员工类(Employee)，其中包括：
	1）4个私有属性：员工姓名(name)、员工年龄(age)、员工职位(position)、工资(salary)
	2）方法：
	Employee() ——给所有的属性指定初始值
	setName（）——给name属性赋值
	          setAge（）——给age属性赋值，要求年龄必须在18岁以上，当年龄无效时，将年龄强制赋值为18
		      setPosition（）——给position属性赋值，只能是“售后服务”和“销售员”，如果不符合要求，则强制将职位赋值为“售后服务”。
	          setSalary（）——用于员工的工资：根据员工的年龄段不同，给工资属性赋值，具体要求：18~20岁之间，1000元，21~25岁之间，1500元，26~30岁之间，2000元，31~40岁之间，3000元，41~50岁之间，3500元，50岁以上,4000元
	          getName（）——返回name属性
	          getAge（）——返回age属性
	          getPosition（）——返回position属性
	 getSalary（）——返回salary属性

	2．测试类TestEmployee，在该类中创建3个Employee对象，通过键盘输入给3个员工的名字、年龄、职位进行赋值，计算出每个员工的工资，显示出所有员工的信息*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Employee employee1 =  new Employee();
		employee1.Employee();
		System.out.println("请输入姓名：");
		String n = scan.next();
		Employee employee2 =  new Employee(n);
		employee2.setName();
		System.out.println("请输入年龄：");
		int a = scan.nextInt();
		Employee employee3 =  new Employee(a);
		employee3.setAge();
		/*System.out.println("请输入员工职位：");
		String p = scan.next();
		Employee employee4 =  new Employee(p);
		employee4.setPosition();*/
		Employee employee5 =  new Employee();
		employee5.setSalary(a);
	}

}

class Employee{
	private String name;
	private int age;
	private String position;
	private double salary;
	Employee(){
		
	}
	
	Employee(String name){
		this.name = name;
		System.out.println("名字:"+name);
	}
	
	Employee(int age){
		this.age = age;
		if(age <= 18){
			 age = 18;
		}
		System.out.println("年龄:"+age);
	}
	/*Employee(String position){
		
	}*/
	Employee(double salary){
		
		}
		
	void Employee(){
		System.out.println("名字："+name+"  年龄："+age+"岁  员工职位："+position+"  薪水"+salary+"元");
	}
	
	void setName(){
		
	}
	void  setAge(){
		
	}
	/*void setPosition(){
		
	}*/
	void setSalary(int age){
		if(age >= 18 && age <= 20){
			salary = 1000;
		}else if(age >= 21 && age <= 25){
			salary = 1500;
		}else if(age >= 26 && age <= 30){
			salary = 2000;
		}else if(age >= 31 && age <= 40){
			salary = 3000;
		}else if(age >= 41 && age <= 50){
			salary = 3500;
		}else if(age > 50){
			salary = 4000;
		}else{
			System.out.println("输入错误的年龄");
		}
		
		System.out.println(salary);
	}
}
