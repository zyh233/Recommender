package cn.cumt.demo;

import java.util.Scanner;

import cn.cumt.utils.Distance;
import cn.cumt.utils.GetData;
import cn.cumt.utils.Matrix1;

public class TestDistance {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("输入训练集行数");
		//int exercise=scanner.nextInt();
		System.out.println("输入要测试的行号");		
		int test=scanner.nextInt();
		System.out.println("输入要测试的属性(1~4)");
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
//			System.out.println("估计值:"+value+"   真实值:"+real+"     误差:"+(value-real));
//		}
//		if(p==2){
//			double value=getData.GetP2(row);
//			double real=getData.GetP2(test);
//			System.out.println("估计值:"+value+"   真实值:"+real+"     误差:"+(value-real));
//		}
//		if(p==3){
//			double value=getData.GetP3(row);
//			double real=getData.GetP3(test);
//			System.out.println("估计值:"+value+"   真实值:"+real+"     误差:"+(value-real));
//		}
//		if(p==4){
//			double value=getData.GetP4(row);
//			double real=getData.GetP4(test);
//			System.out.println("估计值:"+value+"   真实值:"+real+"     误差:"+(value-real));
//		}
//		System.out.println("与测试行最相似的行号:"+row);
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
			string="估计值:"+value+"\n真实值:"+real+"\n误差:"+(value-real);
			System.out.println("估计值:"+value+"   真实值:"+real+"     误差:"+(value-real));
		}
		if(p==2){
			double value=getData.GetP2(row);
			double real=getData.GetP2(test);
			string="估计值:"+value+"\n真实值:"+real+"\n误差:"+(value-real);
			System.out.println("估计值:"+value+"   真实值:"+real+"     误差:"+(value-real));
		}
		if(p==3){
			double value=getData.GetP3(row);
			double real=getData.GetP3(test);
			string="估计值:"+value+"\n真实值:"+real+"\n误差:"+(value-real);
			System.out.println("估计值:"+value+"   真实值:"+real+"     误差:"+(value-real));
		}
		if(p==4){
			double value=getData.GetP4(row);
			double real=getData.GetP4(test);
			string="估计值:"+value+"\n真实值:"+real+"\n误差:"+(value-real);
			System.out.println("估计值:"+value+"   真实值:"+real+"     误差:"+(value-real));
		}
		System.out.println("与测试行最相似的行号:"+row);
		return string;
		
	}

}
