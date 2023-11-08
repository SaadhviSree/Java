package main;
import java.util.*;

class outer{
	static class inner{
		void minmax(int[] arr) {
			Arrays.sort(arr);
			System.out.println("Max : "+arr[arr.length -1]);
			System.out.println("Min : "+arr[0]);
		}
	}
}

public class Main2 {

	public static void main (String[] args) {
		outer.inner obj = new outer.inner();
		int[] array1 = {5,8,9,6,3};
		obj.minmax(array1);
	}
}
