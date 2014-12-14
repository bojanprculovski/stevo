package Sorting;
import java.util.Random;


public class FillArray {
	Random random = new Random();
	
	public FillArray(int x, int a[]) {
		for(int i=0;i<x;i++){
			a[i]=random.nextInt(50);
		}
	}
	
	public void PrintArray(int x, int a[]){
		for(int i=0;i<x;i++){
			System.out.print(a[i] + " ");
		}
	}
}

