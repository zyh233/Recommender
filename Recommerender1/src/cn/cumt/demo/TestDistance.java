package cn.cumt.demo;

import java.util.Scanner;

import cn.cumt.utils.Distance;
import cn.cumt.utils.GetData;
import cn.cumt.utils.Matrix1;

public class TestDistance {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����ѵ��������");
		//int exercise=scanner.nextInt();
		System.out.println("����Ҫ���Ե��к�");		
		int test=scanner.nextInt();
		System.out.println("����Ҫ���Ե�����(1~4)");
		int p=scanner.nextInt();
		estimate(test, p);
//		Matrix1 m1=new Matrix1(exercise, 20);
//		Matrix1 m2=new Matrix1(1, 20);
//		double[][] temp=m1.getMatirx(1);
//		double[][] temp2=m2.getMatirx(test);
//		int row=Distance.calculate(temp, temp2);
//		GetData getData=new GetData();
//		if(p==1){
//			double value=getData.GetP1(row);
//			double real=getData.GetP1(test);
//			System.out.println("����ֵ:"+value+"   ��ʵֵ:"+real+"     ���:"+(value-real));
//		}
//		if(p==2){
//			double value=getData.GetP2(row);
//			double real=getData.GetP2(test);
//			System.out.println("����ֵ:"+value+"   ��ʵֵ:"+real+"     ���:"+(value-real));
//		}
//		if(p==3){
//			double value=getData.GetP3(row);
//			double real=getData.GetP3(test);
//			System.out.println("����ֵ:"+value+"   ��ʵֵ:"+real+"     ���:"+(value-real));
//		}
//		if(p==4){
//			double value=getData.GetP4(row);
//			double real=getData.GetP4(test);
//			System.out.println("����ֵ:"+value+"   ��ʵֵ:"+real+"     ���:"+(value-real));
//		}
//		System.out.println("������������Ƶ��к�:"+row);
		scanner.close();

	}
	public static String estimate(int test,int p){
		String string=null;
		Matrix1 m1=new Matrix1(150, 20);
		Matrix1 m2=new Matrix1(1, 20);
		double[][] temp=m1.getMatirx(1);
		double[][] temp2=m2.getMatirx(test);
		int row=Distance.calculate(temp, temp2);
		GetData getData=new GetData();
		if(p==1){
			double value=getData.GetP1(row);
			double real=getData.GetP1(test);
			string="����ֵ:"+value+"\n��ʵֵ:"+real+"\n���:"+(value-real);
			System.out.println("����ֵ:"+value+"   ��ʵֵ:"+real+"     ���:"+(value-real));
		}
		if(p==2){
			double value=getData.GetP2(row);
			double real=getData.GetP2(test);
			string="����ֵ:"+value+"\n��ʵֵ:"+real+"\n���:"+(value-real);
			System.out.println("����ֵ:"+value+"   ��ʵֵ:"+real+"     ���:"+(value-real));
		}
		if(p==3){
			double value=getData.GetP3(row);
			double real=getData.GetP3(test);
			string="����ֵ:"+value+"\n��ʵֵ:"+real+"\n���:"+(value-real);
			System.out.println("����ֵ:"+value+"   ��ʵֵ:"+real+"     ���:"+(value-real));
		}
		if(p==4){
			double value=getData.GetP4(row);
			double real=getData.GetP4(test);
			string="����ֵ:"+value+"\n��ʵֵ:"+real+"\n���:"+(value-real);
			System.out.println("����ֵ:"+value+"   ��ʵֵ:"+real+"     ���:"+(value-real));
		}
		System.out.println("������������Ƶ��к�:"+row);
		return string;
		
	}

}
