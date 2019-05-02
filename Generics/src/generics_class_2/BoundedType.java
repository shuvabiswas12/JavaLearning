package generics_class_2;

public class BoundedType<T extends Number> {
	
	private T[] nums;
	private int currentIndex = 0;
	
	public BoundedType() {
		this.nums = nums;
	}
	
	
	public double average() {
		double sum = 0.0;
		for (T num : nums) {
			sum += num.doubleValue();
		}
		return sum/nums.length;
	}
	

}
