package simplefactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OrderPizza {
	public OrderPizza(Pizza a) {
		System.out.println(a.name);
		a.prepare();
		a.bake();
		a.cut();
		a.box();
	}
//	public void depend(Pizza a ){
//		a.prepare();
//		a.bake();
//		a.cut();
//		a.box();
//	
//	}

//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType;
//		
//		do {
//			orderType = getType();
//			if(orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName("希腊披萨");
//			}else if(orderType.endsWith("cheese")){
//				pizza = new CheesePizza();
//				pizza.setName("奶酪披萨");
//			}else {
//				System.out.print("订单输入有误！");
//				break;
//			}
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();		
//		}while(true);	
//	}
	
//	private String getType() {
//		try {
//			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
//			System.out.print("Please input Pizza的种类：");
//			String str = strin.readLine();
//			return str;
//		}catch (IOException e) {
//			e.printStackTrace();
//			return "";
//		}
//	}

}


