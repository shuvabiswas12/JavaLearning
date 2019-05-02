package program3;

public class TestUpcasting {

	public static void main(String[] args) {
		
		Bank bank;
		
		bank = new NCC();
		bank = new ICICI();
		bank = new DBBL();
		
		/*Bank ncc = new Bank();
		ncc.interestOf = 4.3f;
		System.out.println("Interest = "+ncc.getInterestOf());*/

	}

}

class Bank {
	protected float interestOf = 0.0f;
	
	public float getInterestOf() {
		return interestOf;
	}
}

class NCC extends Bank {
	
	public NCC() {
		interestOf = 2.2f;
		System.out.println("Interest = "+this.getInterestOf());
	}
}

class ICICI extends Bank {
	
	public ICICI() {
		interestOf = 4.6f;
		System.out.println("Interest = "+this.getInterestOf());
	}
}

class DBBL extends Bank {
	
	public DBBL() {
		interestOf = 6.2f;
		System.out.println("Interest = "+this.getInterestOf());
	}
}