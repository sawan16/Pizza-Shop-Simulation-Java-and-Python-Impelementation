
public class NewYorkPizza extends Pizza {
	
	
	public NewYorkPizza(Sauce sauce, Cheese cheese, Dough dough) {
		super(sauce, cheese, dough, 3.0f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayDetails() {
		String detail = "<html> <br/> You have selected New York Pizza: <br /> "+ super.displayDetails();
		
		return detail;
	}
	
	@Override
	public Float calculateCost(){
		
		return this.getBasePrice()+this.getApplyCheese().getCheeseCost()+ this.getDough().getCost()*0.9f + this.getApplySauce().getCost();
	}

}
