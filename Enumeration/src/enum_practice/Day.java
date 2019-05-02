package enum_practice;

public enum Day {
	
	SUN(2) {
		@Override
		protected String dispAll() {
			
			return "sunday";
		}}, 
	SAT(1) {
			@Override
			protected String dispAll() {
				
				return "saturday";
			}
		}, 
	MON(3) {
			@Override
			protected String dispAll() {
				
				return "monday";
			}
		}, 
	TUES(4) {
			@Override
			protected String dispAll() {
				
				return "tuesday";
			}
		}, 
	WED(5) {
			@Override
			protected String dispAll() {
				
				return "wednessday";
			}
		}, 
	THUS(6) {
			@Override
			protected String dispAll() {
				
				return "thursday";
			}
		}, 
	FRI(7) {
			@Override
			protected String dispAll() {
				
				return "friday";
			}
		},
	
	
	WINTER(6, "Decembar-February") {
		@Override
		protected String dispAll() {
			
			return "winter";
		}
	}, 
	
	SUMMER(6, "March-May") {
		@Override
		protected String dispAll() {
			return "summer";
		}
		
	}, 
	
	RAINY(6, "June-August") {
		@Override
		protected String dispAll() {
			return "rainy";
		}
	};
	
	public int day;
	public String month;
	public int number;
	
	
	private Day() {
		
	}
	
	private Day(int number) {
		this.number = number;
	}
	
	private Day(int day, String month) {
		this.day = day;
		this.month = month;
	}
	
	protected abstract String dispAll();

}
