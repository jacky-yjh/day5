package employee;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Test {
	/*����������employee��������¹��ܡ�
	1������һ��Ա����(Employee)�����а�����
	1��4��˽�����ԣ�Ա������(name)��Ա������(age)��Ա��ְλ(position)������(salary)
	2��������
	Employee() ���������е�����ָ����ʼֵ
	setName����������name���Ը�ֵ
	          setAge����������age���Ը�ֵ��Ҫ�����������18�����ϣ���������Чʱ��������ǿ�Ƹ�ֵΪ18
		      setPosition����������position���Ը�ֵ��ֻ���ǡ��ۺ���񡱺͡�����Ա�������������Ҫ����ǿ�ƽ�ְλ��ֵΪ���ۺ���񡱡�
	          setSalary������������Ա���Ĺ��ʣ�����Ա��������β�ͬ�����������Ը�ֵ������Ҫ��18~20��֮�䣬1000Ԫ��21~25��֮�䣬1500Ԫ��26~30��֮�䣬2000Ԫ��31~40��֮�䣬3000Ԫ��41~50��֮�䣬3500Ԫ��50������,4000Ԫ
	          getName������������name����
	          getAge������������age����
	          getPosition������������position����
	 getSalary������������salary����

	2��������TestEmployee���ڸ����д���3��Employee����ͨ�����������3��Ա�������֡����䡢ְλ���и�ֵ�������ÿ��Ա���Ĺ��ʣ���ʾ������Ա������Ϣ*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Employee employee1 =  new Employee();
		employee1.Employee();
		System.out.println("������������");
		String n = scan.next();
		Employee employee2 =  new Employee(n);
		employee2.setName();
		System.out.println("���������䣺");
		int a = scan.nextInt();
		Employee employee3 =  new Employee(a);
		employee3.setAge();
		/*System.out.println("������Ա��ְλ��");
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
		System.out.println("����:"+name);
	}
	
	Employee(int age){
		this.age = age;
		if(age <= 18){
			 age = 18;
		}
		System.out.println("����:"+age);
	}
	/*Employee(String position){
		
	}*/
	Employee(double salary){
		
		}
		
	void Employee(){
		System.out.println("���֣�"+name+"  ���䣺"+age+"��  Ա��ְλ��"+position+"  нˮ"+salary+"Ԫ");
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
			System.out.println("������������");
		}
		
		System.out.println(salary);
	}
}
