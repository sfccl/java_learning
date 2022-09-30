package simplefactory3;

public class SimpleFactory {
	Pizza pizza = null;

	public static Pizza creatPizza(String orderType) {
		Pizza pizza = null;
		System.out.println("使用静态工厂模式");
//			orderType = getType();
		if (orderType.equals("greek")) {
			pizza = new GreekPizza();
			// pizza.setName("希腊披萨");
		} else if (orderType.endsWith("cheese")) {
			pizza = new CheesePizza();
			// pizza.setName("奶酪披萨");
		}
//		else {
//			System.out.print("订单输入有误！");
//			pizza = null ;
//		}

		return pizza;
	}
}
