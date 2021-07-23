package com.collectionPractice;

public class ArrayMaxNum {
	
int []a = {2,3,77,11,6};
 public int getArrayVallue() {

int max = a[0];	
for (int i =0;i<a.length;i++) {
	if (a[i]>max) {
		max = a [i];
	}
}
	
//System.out.println(max);
return max;
}
public static void main(String[] args) {
	
	ArrayMaxNum obj = new ArrayMaxNum();
	obj.getArrayVallue();
	System.out.println(obj.getArrayVallue());
}
}