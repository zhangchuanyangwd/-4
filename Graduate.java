package com;

import java.util.Scanner;

public class Graduate implements StudentInterface,TeacherInterface{
	
	//��Ա����
	String name,sex;
	int age;
	static double fee,salary;//ѧ�ѣ�нˮ
	
	
	
	@Override
	public void setsalary(double salary) {
		// ����нˮ
		this.salary = salary * 12;
		System.out.println("ʵ��нˮ��"+this.salary);
	}
	

	@Override
	public void getsalary(double salary) {
		// ��ѯнˮ
		this.salary = salary * 12;
		System.out.println("Ӧ��нˮ��"+this.salary);
	}
	

	@Override
	public void setFee(double fee) {
		// ����ѧ��
		this.fee = fee;
		System.out.println("ʵ��ѧ�ѣ�"+this.fee);
	}
	

	@Override
	public void getFee(double fee) {
		//��ѯѧ��
		this.fee = fee;
		System.out.println("Ӧ��ѧ�ѣ�"+this.fee);
	}
	
	public static void ratepaying() {
		try{
		if((salary-fee)<3000) {
			System.out.println("Ӧ��˰��"+(salary-fee)*0.03);
			System.out.println("ʵ������"+((salary-fee)-((salary-fee)*0.03)));
		}else if((salary-fee)>3000 && (salary-fee)<=12000){
			
			System.out.println("Ӧ��˰��"+(salary-fee)*0.1);
			System.out.println("ʵ������"+((salary-fee)-((salary-fee)*0.1)));
		}else if((salary-fee)>12000 && (salary-fee)<=25000) {
			System.out.println("Ӧ��˰��"+(salary-fee)*0.2);
			System.out.println("ʵ������"+((salary-fee)-((salary-fee)*0.2)));
		}else if((salary-fee)>25000 && (salary-fee)<=35000) {
			System.out.println("Ӧ��˰��"+(salary-fee)*0.25);
			System.out.println("ʵ������"+((salary-fee)-((salary-fee)*0.25)));
		}else if((salary-fee)>35000 && (salary-fee)<=55000) {
			System.out.println("Ӧ��˰��"+(salary-fee)*0.3);
			System.out.println("ʵ������"+((salary-fee)-((salary-fee)*0.3)));
		}else if((salary-fee)>55000 && (salary-fee)<=80000) {
			System.out.println("Ӧ��˰��"+(salary-fee)*0.35);
			System.out.println("ʵ������"+((salary-fee)-((salary-fee)*0.35)));
		}else if((salary-fee)>80000) {
			System.out.println("Ӧ��˰��"+(salary-fee)*0.45);
			System.out.println("ʵ������"+((salary-fee)-((salary-fee)*0.45)));
		}	
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
	public static void main(String[] args) {
		//�����о�������
		Graduate graduate = new Graduate();
		Scanner scanner = new Scanner(System.in);	
		
		//��ʼ���о�������
		System.out.println("����������");
		graduate.name = scanner.next();		//����
		System.out.println("����������");
		graduate.age = scanner.nextInt();	//����
		System.out.println("�������Ա�");
		graduate.sex = scanner.next();		//�Ա�
		//���ù���
		System.out.println("�������¹���");
		double salary = scanner.nextDouble();	//�¹���
		graduate.setsalary(salary);
		System.out.println("������ѧ��");
		double fee = scanner.nextDouble();	//ѧ��
		graduate.setFee(fee);
		ratepaying();
		}
	

}
