package simplefactory2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
//	public OrderPizza(Pizza a) {
//		System.out.println(a.name);
//		a.prepare();
//		a.bake();
//		a.cut();
//		a.box();
//	}

	public OrderPizza(SimpleFactory simplefactory) {
		setFactory(simplefactory);
	}
	
	SimpleFactory simplefactory;
	Pizza pizza = null;
	
	public void setFactory(SimpleFactory simplefactory) {
		this.simplefactory = simplefactory;
		String orderType = "";
		do {
			orderType = getType();
			pizza = simplefactory.creatPizza(orderType);
			if (pizza != null) {
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("订购披萨失败！");
				break;
			}
		} while (true);
	}

	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("Please input Pizza的种类：");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}

}
