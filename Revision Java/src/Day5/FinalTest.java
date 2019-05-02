package Day5;

import java.util.ArrayList;
import java.util.List;

public class FinalTest {

	public static void main(String[] args) {
		
		Play play = () -> {
			System.out.println("Playing...");
		};
		play.pause();
		
		Music music = massage -> {
			return 10+massage;
		};
		System.out.println(music.Massage(10));
		
		Stop stop =() -> {
			System.out.println("Printing...");
		};
		stop.print();
		Math math=(a, b, c) -> (a+b+c);
		System.out.println(math.add(10, 20, 30));
		

		List<String> list = new ArrayList<>();
		list.add("aaa");
		list.add("sds");
		
		list.forEach((n) -> System.out.println(n));
	}

}

interface Play {
	public abstract void pause();
}


interface Music {
	public abstract int Massage(int massage);
}

interface Stop {
	public abstract void print();
}

interface Math {
	public abstract int add(int a, int b, int c);
}