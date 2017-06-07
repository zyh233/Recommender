package cn.cumt.utils;

import Jama.Matrix;

public class Ratio {
	public static Matrix ratioP1;
	public static Matrix ratioP2;
	public static Matrix ratioP3;
	public static Matrix ratioP4;
	static
	{
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
			ratioP1=matrixMul.inverse().times(matrix2).times(mp1);
			//(X^t*X)^(-1)*X^t*p2
			ratioP2=matrixMul.inverse().times(matrix2).times(mp2);
			//(X^t*X)^(-1)*X^t*p3  ratioP3
			ratioP3=matrixMul.inverse().times(matrix2).times(mp3);
			//(X^t*X)^(-1)*X^t*p4  ratioP4
			ratioP4=matrixMul.inverse().times(matrix2).times(mp4);
	}
}
