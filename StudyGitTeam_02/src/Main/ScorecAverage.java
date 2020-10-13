package Main;

import java.util.ArrayList;

public class ScorecAverage {

	double average = 0;
	double passrate = 0;
	double youxiu = 0;
	
	double sum = 0;
	double k = 0;
	double l = 0;
	int w=0;
	int e=0;
	int r=0;
	int t=0;
	public void operate(ArrayList arr) {
		
		double n = arr.size();

		for (int i = 0; i < arr.size(); i++) {
			int j = (Integer) arr.get(i);
			sum += j;
			if (j > 60) {
				k++;
			}
			if (j > 90) {
				l++;
			}
			if(j>=0&&j<=30) {
				w++;
			}else if(j<=60) {
				e++;
			}else if(j<=90) {
				r++;
			}else {t++;}
		}
		
		average = sum / n;
		System.out.println("平均数是" + average);
		passrate=(k / n)*100;
		System.out.println("及格率" +passrate+"%" );
		youxiu = (l / n) * 100;
		System.out.println("优秀率" + youxiu+"%");
		System.out.println("0-30分的有" +w+"个");
		System.out.println("30-60分的有" +e+"个");
		System.out.println("60-90分的有" +r+"个");
		System.out.println("90分以上的有" +t+"个");
	}

}
