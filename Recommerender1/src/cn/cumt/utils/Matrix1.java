package cn.cumt.utils;
public class Matrix1 {
	double[][] temp;
	/**
	 * 构造函数
	 * @param m   二维数组的行
	 * @param n   二维数组的列
	 */
	public  Matrix1(int m,int n){		       				
		this.temp=new double[m][n];		
	}
	/**  获取Q
	 * @param k从第几行开始取数
	 * @return 返回一个n*20的二维数组
	 * 
	 */
	public double[][] getMatirx(int k){
		GetData getData=new GetData();
		for(int i=0;i<this.temp.length;i++)
		{
			int[] q=getData.GetQ(k+i);
			for(int j=0;j<20;j++){				
				temp[i][j]=q[j];
			}
		}		
		return temp;		
	}
	/**
	 * 获取P
	 * @param column P的种类 1~4
	 * @param k 从第几行开始取数
	 * @return 返回一个n*1的二维数组
	 */
	public double[][] GetMatrix_b(int column,int k){
		GetData getData=new GetData();
		if(column==1)
		{
			for(int i=0;i<this.temp.length;i++)
				temp[i][0]=getData.GetP1(i+k);
		}
		else if(column==2){
			for(int i=0;i<this.temp.length;i++)
				temp[i][0]=getData.GetP2(k+i);
		}
		else if(column==3){
			for(int i=0;i<this.temp.length;i++)
				temp[i][0]=getData.GetP3(k+i);
		}
		else if(column==4){
			for(int i=0;i<this.temp.length;i++)
				temp[i][0]=getData.GetP4(k+i);
		}
		return temp;
	}
}
