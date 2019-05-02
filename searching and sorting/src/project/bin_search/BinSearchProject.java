package project.bin_search;

public class BinSearchProject {
	
	public void binSearch(int key, int array[]) {
		int start, end, mid;
		start = 0;
		end = array.length-1;
		System.out.println("start\tend\tmid\tkey");
		do{
			mid = (start+end)/2;
			
			System.out.println(start+"\t"+end+"\t"+mid+"\t"+key);
			if(key == array[mid]) {
				System.out.println("\nKey is found at position : "+(++mid));
				break;
			}
			else if(key < array[mid]) {
				end = mid-1;
			}
			else if(key > array[mid]) {
				start = mid+1;
			}
			
		}
		while(start<=end);
		if(start>end) {
			System.out.println("\nKey is not found. polease try again later");
		}
	}
}
