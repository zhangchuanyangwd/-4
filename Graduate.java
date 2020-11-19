package com;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{
	
	//成员变量
	String name,sex;
	int age;
	static double fee,salary;//学费，薪水
	
	
	
	@Override
	public void setsalary(double salary) {
		// 发放薪水
		this.salary = salary * 12;
		System.out.println("实发薪水："+this.salary);
	}
	

	@Override
	public void getsalary(double salary) {
		// 查询薪水
		this.salary = salary * 12;
		System.out.println("应发薪水："+this.salary);
	}
	

	@Override
	public void setFee(double fee) {
		// 缴纳学费
		this.fee = fee;
		System.out.println("实缴学费："+this.fee);
	}
	

	@Override
	public void getFee(double fee) {
		//查询学费
		this.fee = fee;
		System.out.println("应缴学费："+this.fee);
	}
	
	public static void ratepaying() {
		try{
		if((salary-fee)<3000) {
			System.out.println("应纳税款"+(salary-fee)*0.03);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.03)));
		}else if((salary-fee)>3000 && (salary-fee)<=12000){
			
			System.out.println("应纳税款"+(salary-fee)*0.1);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.1)));
		}else if((salary-fee)>12000 && (salary-fee)<=25000) {
			System.out.println("应纳税款"+(salary-fee)*0.2);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.2)));
		}else if((salary-fee)>25000 && (salary-fee)<=35000) {
			System.out.println("应纳税款"+(salary-fee)*0.25);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.25)));
		}else if((salary-fee)>35000 && (salary-fee)<=55000) {
			System.out.println("应纳税款"+(salary-fee)*0.3);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.3)));
		}else if((salary-fee)>55000 && (salary-fee)<=80000) {
			System.out.println("应纳税款"+(salary-fee)*0.35);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.35)));
		}else if((salary-fee)>80000) {
			System.out.println("应纳税款"+(salary-fee)*0.45);
			System.out.println("实发工资"+((salary-fee)-((salary-fee)*0.45)));
		}	
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		//创建研究生对象
		Graduate graduate = new Graduate();
		Scanner scanner = new Scanner(System.in);	
		
		//初始化研究生对象
		System.out.println("请输入姓名");
		graduate.name = scanner.next();		//姓名
		System.out.println("请输入年龄");
		graduate.age = scanner.nextInt();	//年龄
		System.out.println("请输入性别");
		graduate.sex = scanner.next();		//性别
		//设置工资
		System.out.println("请输入月工资");
		double salary = scanner.nextDouble();	//月工资
		graduate.setsalary(salary);
		System.out.println("请输入学费");
		double fee = scanner.nextDouble();	//学费
		graduate.setFee(fee);
		ratepaying();
		}
	

}
