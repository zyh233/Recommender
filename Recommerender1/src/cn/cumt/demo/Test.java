package cn.cumt.demo;

import java.util.Scanner;

import Jama.Matrix;
import cn.cumt.utils.Matrix1;

public class Test {

	public static void main(String[] args) {
		//X   matrix
		Matrix1 matrix1=new Matrix1(100, 20);
		double[][] sample=matrix1.getMatirx(1);		
		Matrix matrix=new Matrix(sample);
				
		//XµÄ×ªÖÃ   matrix2
		Matrix matrix2=matrix.transpose();
		
		//p1 mp1
		Matrix1 p1=new Matrix1(100, 1);
		Matrix mp1=new Matrix(p1.GetMatrix_b(1, 1));		
		//p2 mp2
		Matrix1 p2=new Matrix1(100, 1);
		Matrix mp2=new Matrix(p2.GetMatrix_b(2, 1));		
		//p3 mp3
		Matrix1 p3=new Matrix1(100, 1);
		Matrix mp3=new Matrix(p3.GetMatrix_b(3, 1));
		//p4 mp4
		Matrix1 p4=new Matrix1(100, 1);
		Matrix mp4=new Matrix(p4.GetMatrix_b(4, 1));
		
		
		//X^t*X   matrixMul
		Matrix matrixMul=matrix2.times(matrix);
		
		//(X^t*X)^(-1)*X^t*p1
		Matrix ratioP1=matrixMul.inverse().times(matrix2).times(mp1);
		//(X^t*X)^(-1)*X^t*p2
		Matrix ratioP2=matrixMul.inverse().times(matrix2).times(mp2);
		//(X^t*X)^(-1)*X^t*p3  ratioP3
		Matrix ratioP3=matrixMul.inverse().times(matrix2).times(mp3);
		//(X^t*X)^(-1)*X^t*p4  ratioP4
		Matrix ratioP4=matrixMul.inverse().times(matrix2).times(mp4);
				
		/*					
		ratioP1.print(1, 20);
		ratioP2.print(1, 20);
		ratioP3.print(1, 20);
		ratioP4.print(1, 20);
		*/
		Scanner scanner=new Scanner(System.in);
		int type=scanner.nextInt();
		int column=scanner.nextInt();
		if (type==1) {
			Matrix1 temp=new Matrix1(100, 20);			
			Matrix test=new Matrix(temp.getMatirx(column));
			Matrix1 tp1=new Matrix1(100, 1);
			Matrix testp1=new Matrix(tp1.GetMatrix_b(1, column));
			Matrix result= test.times(ratioP1).minusEquals(testp1);
			result.print(1, 20);
		}
		else if (type==2) {
			Matrix1 temp=new Matrix1(100, 20);			
			Matrix test=new Matrix(temp.getMatirx(column));
			Matrix1 tp2=new Matrix1(100, 1);
			Matrix testp2=new Matrix(tp2.GetMatrix_b(2, column));
			Matrix result= test.times(ratioP2).minusEquals(testp2);
			result.print(1, 20);
		}
		else if (type==3) {
			Matrix1 temp=new Matrix1(100, 20);			
			Matrix test=new Matrix(temp.getMatirx(column));
			Matrix1 tp3=new Matrix1(100, 1);
			Matrix testp3=new Matrix(tp3.GetMatrix_b(3, column));
			Matrix result= test.times(ratioP3).minusEquals(testp3);
			result.print(1, 20);
		}
		else if (type==4) {
			Matrix1 temp=new Matrix1(100, 20);			
			Matrix test=new Matrix(temp.getMatirx(column));
			Matrix1 tp4=new Matrix1(100, 1);
			Matrix testp4=new Matrix(tp4.GetMatrix_b(4, column));
			Matrix result= test.times(ratioP4).minusEquals(testp4);
			result.print(1, 20);
		}
		
		scanner.close();
	}

}
