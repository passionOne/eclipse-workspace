package test;

public class InsertionSort {

	
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
