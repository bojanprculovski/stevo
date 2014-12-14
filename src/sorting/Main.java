package sorting;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int x = input.nextInt();
		input.close();
		
		int[] array = new int[x+1];
			
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(new File("SortedArrays.txt"), true))){
			
			FillArray fill = new FillArray(x, array);
			fill.PrintArray(x, array);
			
			bw.write("Normal: ");
			for(int i=0;i<x;i++){
				bw.write(array[i] + " ");
			}
			bw.newLine();
			
			SortArray sort = new SortArray(x, array);
			sort.PrintSortedArray(x, array);
			
			bw.write("Sorted: ");
			for(int i=1;i<=x;i++){
				bw.write(array[i] + " ");
			}
			bw.newLine();
			
			
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	
	
	}
}
	