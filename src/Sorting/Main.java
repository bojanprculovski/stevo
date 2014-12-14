package Sorting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;



public class Main {
	public static void main(String[] args) {
		final int x = 10;
		int[] array = new int[x+1];
			
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("SortedArrays.txt"), true))){
			bw.write("Normal: ");
			bw.newLine();
			FillArray fill = new FillArray(x, array);
			fill.PrintArray(x, array);
			System.out.println();
			for(int i=0;i<x;i++)
				bw.write(array[i] + " ");
			bw.newLine();
			
			SortArray sort = new SortArray(x, array);
			sort.PrintSortedArray(x, array);
			System.out.println();
			
			bw.write("Sorted: ");
			bw.newLine();
			for(int i=1;i<=x;i++)
				bw.write(array[i] + " ");
			bw.newLine();
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	
	}
}
	