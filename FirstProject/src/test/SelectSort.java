package test;

public class SelectSort {
	/*public static void main(String[] args) {
		int[]array= {63,4,24,1,3,15};
		SelectSort sorter=new SelectSort();
		sorter.sort(array);
	}
	public  void sort(int[]array) {
		int index;
		for(int i=1;i<array.length;i++) {
			index=0;
			for(int j=1;j<=array.length-i;j++) {
				if(array[i]>array[index]) {
					index=j;
				}
			}
			int temp=array[array.length-i];
			array[array.length-i]=array[index];
			array[index]=temp;
		}
		showArray(array);
	}
	public void showArray(int[]array) {
		for(int i:array) {
			System.out.print(">"+i);
		}
		System.out.println();*/
	/*public static void main(String[] args) {
		int a[][]=new int[][]{{1,2,3},{4,5,6},{7,8,9}};
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				System.out.print(a[i][j]);
			}
			System.out.println();
		}*/
	public class InsertionSort{
		public void insertionSort(int[] array) {
			if(array==null||array.length<2) {
				return;
			}
			for(int i=1;i<array.length;i++) {
				int currentValue=array[i];
				int position=i;
				for (int j=i-1;j>=0;j--) {
					if(array[i]>currentValue) {
						array[j+1]=array[j];
						position-=1;
					}
					else {
						break;
					}
				}
				array[position]=currentValue;
					}
		      }
		public void main(String[]args) {
			//TODO Auto-generated method stub
			int[]array= {
					34,56,34,78,25,67,46,69
			};
			insertionSort(array);
			for(int i:array)
				System.out.print(i+" ");
		}
	}
		
			
	}