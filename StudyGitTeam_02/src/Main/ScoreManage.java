package Main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class ScoreManage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add(20);
		arr.add(30);
		arr.add(28);
		arr.add(65);
		arr.add(44);
		arr.add(74);
		arr.add(88);
		arr.add(96);
		

		
		ScorecAverage sa = new ScorecAverage();
		sa.operate(arr);
		ScoreSort ss=new ScoreSort();
		ss.sort(arr);
		
	}

}
