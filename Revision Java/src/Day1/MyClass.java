package Day1;

public class MyClass {
	
	public static void main(String[] args) {
		Human boy = new Human("Black");
		
		Human girl = new Human("Pink");
		
		Human newbie = girl.producedBaby(boy);
		System.out.println("Baby color = " +newbie.getColor());
	}

}

class Human {
	private String color;
	
	public Human() {
		
	}
	
	public Human(String color) {
		this.setColor(color);
	}
	
	private void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return color;
	}
	
	public Human producedBaby(Human human) {
		Human baby = new Human();
		
		baby.color = this.color + " " + human.getColor();
		
		
		return baby;
	}
	
}
