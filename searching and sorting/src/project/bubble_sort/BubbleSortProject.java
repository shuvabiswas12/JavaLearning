package project.bubble_sort;

public class BubbleSortProject {
	
	public void bubSort(int array[]) {
		int i, j;
		
		/*for(i=0; i<array.length; i++) {
			for(j=i+1; j<array.length; j++) {
				if(array[i] > array[j]) {
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}*/
		
		for(i=0; i<array.length; i++) {
			j = i+1;
			while(j<array.length) {
				if(array[i] > array[j]) {
					int temp;
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
				j++;
			}
		}
		
		for(i=0; i<array.length; i++) {
			System.out.print(array[i]+"\t");
		}
	}
}
