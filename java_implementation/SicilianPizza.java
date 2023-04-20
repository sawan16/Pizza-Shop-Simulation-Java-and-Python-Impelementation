
public class SicilianPizza extends Pizza {

	
	
	public SicilianPizza(Sauce sauce, Cheese cheese, Dough dough) {
		super(sauce, cheese, dough, 1.5f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayDetails() {
		String detail = "<html> <br/> You have selected Sicilian Pizza: <br /> "+ super.displayDetails();		
		return detail;
	}
	
	public Float calculateCost(){
		
		return this.getBasePrice()+this.getApplyCheese().getCheeseCost()+ this.getDough().getCost() + this.getApplySauce().getCost();
	}

}
