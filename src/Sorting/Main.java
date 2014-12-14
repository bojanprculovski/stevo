package Sorting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



public class Main {
	public static void main(String[] args) {
		final int x = 10;
		int[] array = new int[x+1];
		
		FillArray fill = new FillArray(x, array);
		fill.PrintArray(x, array);
		
		System.out.println();
		
		SortArray sort = new SortArray(x, array);
		sort.PrintSortedArray(x, array);
		System.out.println();
		
		
		System.out.println();
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("SortedArrays.txt"), true))){
			for(int i=1;i<=x;i++)
			bw.write(array[i] + " ");
			bw.newLine();
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	
	}
}
	