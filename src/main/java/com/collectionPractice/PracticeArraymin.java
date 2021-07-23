package com.collectionPractice;

public class PracticeArraymin {
	
	int [] c = {2,3,77,11,6};
	public int getminValue() {
		
	int min = c[0];
 for(int i = 0;i>c.length;i++) {
	 if (c[i]<min) {
		 min = c [i];
	 }
			
		
 }	
		return min;

}
	public static void main(String[] args) {
		PracticeArraymin obj = new PracticeArraymin();
		obj.getminValue();
		System.out.println(obj.getminValue());
	}
}