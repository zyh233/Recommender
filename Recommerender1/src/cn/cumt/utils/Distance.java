package cn.cumt.utils;

public class Distance {
	public static int calculate(double[][] m1,double[][] m2){
		int q=1;
		double sum=0;
		double min = 0;
		for (int i = 0; i < m2.length; i++) {
			for (int j = 0; j < m1.length; j++) {
				for(int k = 0;k < m1[0].length;k++){
					sum+=Math.pow(m2[i][k]-m1[j][k],2);					
				}
				if(j==0){
					min=Math.sqrt(sum);
				}
				else if (Math.sqrt(sum)< min) {
					min=Math.sqrt(sum);;q=j+1;
				}
				sum=0;
			}
		}
		return q;
		
	}
}
