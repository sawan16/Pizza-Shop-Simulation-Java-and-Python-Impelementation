
public class ChicagoPizza extends Pizza {

	
	
	public ChicagoPizza(Sauce sauce, Cheese cheese, Dough dough) {
		super(sauce, cheese, dough, 2.0f);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String displayDetails() {
		String detail = "<html> <br/> You have selected Chicago Pizza: <br /> "+ super.displayDetails();		
		return detail;
	}
	
	public Float calculateCost(){
		
		return this.getBasePrice()+this.getApplyCheese().getCheeseCost()* 0.8f + this.getDough().getCost() + this.getApplySauce().getCost();
	}

}
