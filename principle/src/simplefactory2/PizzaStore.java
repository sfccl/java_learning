package simplefactory2;


public class PizzaStore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		GreekPizza g = new GreekPizza();
//		new OrderPizza(g);
//		CheesePizza g = new CheesePizza();
//		new OrderPizza(g);
//		
		new OrderPizza(new SimpleFactory());
	}

}
