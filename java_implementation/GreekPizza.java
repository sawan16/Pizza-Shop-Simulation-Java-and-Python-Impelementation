
public class GreekPizza extends Pizza {

	public GreekPizza(Sauce sauce, Cheese cheese, Dough dough) {
		super(sauce, cheese, dough,2.5f);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String displayDetails() {
		String detail = "<html> <br/> You have selected Greek Pizza: <br /> "+ super.displayDetails();		
		return detail;
	}
	
	public Float calculateCost(){
		
		return this.getBasePrice()+this.getApplyCheese().getCheeseCost() + this.getDough().getCost() + (this.getApplySauce().getCost()* 0.6f);
	}

}
