package sorting;

public class SortArray {
	private int temporary;
	
	public SortArray(int x, int a[]){
		for(int i=0;i<x;i++){
			for(int j=0;j<x;j++){
				if(a[j]>=a[j+1]){
					temporary=a[j];
					a[j]=a[j+1];
					a[j+1]=temporary;
				}
			}
		}
	}
	
	public void PrintSortedArray(int x, int a[]){
		for(int i=1;i<=x;i++){
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
	
}
