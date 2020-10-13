package Main;

import java.util.ArrayList;
import java.util.Collections;

public class ScoreSort {
	public void sort(ArrayList arr) {
		int q=arr.size();
		Collections.sort(arr);
		if(q%2==0) {
		}else if(q%2!=0) {
			System.out.println("中位数是:"+arr.get(q/2));
		}
		System.out.println("排序后："+arr);
		System.out.println("最小值min="+arr.get(0));
		System.out.println("最大值max="+arr.get(q-1));
	}
}






