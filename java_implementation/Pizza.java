
public abstract class Pizza {
	
	private Sauce sauce;
	private Cheese cheese;
	private Dough dough;
	private Float basePrice;
	
	
	
	public Pizza(Sauce sauce, Cheese cheese, Dough dough, Float basePrice) {
		super();
		this.sauce = sauce;
		this.cheese = cheese;
		this.dough = dough;
		this.basePrice = basePrice;
	}

	
	public Float getBasePrice() {
		return basePrice;
	}


	public void setBasePrice(Float basePrice) {
		this.basePrice = basePrice;
	}


	public Sauce getApplySauce() {
		return sauce;
	}
	public void setApplySauce(Sauce sauce) {
		this.sauce = sauce;
	}
	public Cheese getApplyCheese() {
		return cheese;
	}
	public void setApplyCheese(Cheese cheese) {
		this.cheese = cheese;
	}
	public Dough getDough() {
		return dough;
	}
	public void setDough(Dough dough) {
		this.dough = dough;
	}
	
	public abstract Float calculateCost();
	
	public  String displayDetails(){
		
		String detail ="";
		detail+="Cheese :"+ this.getApplyCheese().getClass().getName()+" <br /> ";
		
		detail+="Dough :"+ this.getDough().getClass().getName()+" <br /> ";
		
		detail+="Sauce :"+ this.getApplySauce().getClass().getName()+" <br /> ";
		
		detail+=" THANK YOU.....  </html>";
		return detail;
	}
	

}
