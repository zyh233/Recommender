package cn.cumt.demo;

import java.util.Scanner;

import Jama.Matrix;
import cn.cumt.utils.Matrix1;
import cn.cumt.utils.Ratio;

public class TestMatrix extends Ratio{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("����Ҫ���������");
		int p=scanner.nextInt();
		System.out.println("��ʼ��");
		int row=scanner.nextInt();
		System.out.println("����");
		int k=scanner.nextInt();
		estimate(p,row,k);
		scanner.close();

	}
	public static String estimate(int p,int row,int k){
		String string = null;
		if (p==1) {
			Matrix1 temp=new Matrix1(k, 20);			
			Matrix test=new Matrix(temp.getMatirx(row));
			Matrix1 tp1=new Matrix1(k, 1);
			Matrix testp1=new Matrix(tp1.GetMatrix_b(1, row));
			Matrix result= test.times(ratioP1).minusEquals(testp1);
			System.out.print("����ֵ");
			test.times(ratioP1).print(1, 20);
			double d1=test.times(ratioP1).getArray()[0][0];
			System.out.print("��ʵֵ");
			testp1.print(1, 20);
			double d2=testp1.getArray()[0][0];
			System.out.print("���");
			result.print(1, 20);
			double d3=result.getArray()[0][0];
			string="����ֵ:"+String.valueOf(d1)+"\n"+"��ʵֵ:"+String.valueOf(d2)+"\n"+"���:"+String.valueOf(d3)+"\n";
		}
		else if (p==2) {
			Matrix1 temp=new Matrix1(k, 20);			
			Matrix test=new Matrix(temp.getMatirx(row));
			Matrix1 tp2=new Matrix1(k, 1);
			Matrix testp2=new Matrix(tp2.GetMatrix_b(2, row));
			Matrix result= test.times(ratioP2).minusEquals(testp2);
			System.out.print("����ֵ");
			test.times(ratioP2).print(1, 20);
			double d1=test.times(ratioP2).getArray()[0][0];
			System.out.print("��ʵֵ");
			testp2.print(1, 20);
			double d2=testp2.getArray()[0][0];
			System.out.print("���");
			result.print(1, 20);
			double d3=result.getArray()[0][0];
			string="����ֵ:"+String.valueOf(d1)+"\n"+"��ʵֵ:"+String.valueOf(d2)+"\n"+"���:"+String.valueOf(d3)+"\n";
		}
		else if (p==3) {
			Matrix1 temp=new Matrix1(k, 20);			
			Matrix test=new Matrix(temp.getMatirx(row));
			Matrix1 tp3=new Matrix1(k, 1);
			Matrix testp3=new Matrix(tp3.GetMatrix_b(3, row));
			Matrix result= test.times(ratioP3).minusEquals(testp3);
			System.out.print("����ֵ");
			test.times(ratioP3).print(1, 20);
			double d1=test.times(ratioP3).getArray()[0][0];
			System.out.print("��ʵֵ");
			testp3.print(1, 20);
			double d2=testp3.getArray()[0][0];
			System.out.print("���");
			result.print(1, 20);
			double d3=result.getArray()[0][0];
			string="����ֵ:"+String.valueOf(d1)+"\n"+"��ʵֵ:"+String.valueOf(d2)+"\n"+"���:"+String.valueOf(d3)+"\n";
		}
		else if (p==4) {
			Matrix1 temp=new Matrix1(k, 20);			
			Matrix test=new Matrix(temp.getMatirx(row));
			Matrix1 tp4=new Matrix1(k, 1);
			Matrix testp4=new Matrix(tp4.GetMatrix_b(4, row));
			Matrix result= test.times(ratioP4).minusEquals(testp4);
			System.out.print("����ֵ");
			test.times(ratioP4).print(1, 20);
			double d1=test.times(ratioP4).getArray()[0][0];
			System.out.print("��ʵֵ");
			testp4.print(1, 20);
			double d2=testp4.getArray()[0][0];
			System.out.print("���");
			result.print(1, 20);
			double d3=result.getArray()[0][0];
			string="����ֵ:"+String.valueOf(d1)+"\n"+"��ʵֵ:"+String.valueOf(d2)+"\n"+"���:"+String.valueOf(d3)+"\n";
		}
		return string;
	}

}
