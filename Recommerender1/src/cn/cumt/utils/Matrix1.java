package cn.cumt.utils;
public class Matrix1 {
	double[][] temp;
	/**
	 * ���캯��
	 * @param m   ��ά�������
	 * @param n   ��ά�������
	 */
	public  Matrix1(int m,int n){		       				
		this.temp=new double[m][n];		
	}
	/**  ��ȡQ
	 * @param k�ӵڼ��п�ʼȡ��
	 * @return ����һ��n*20�Ķ�ά����
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
	 * ��ȡP
	 * @param column P������ 1~4
	 * @param k �ӵڼ��п�ʼȡ��
	 * @return ����һ��n*1�Ķ�ά����
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
