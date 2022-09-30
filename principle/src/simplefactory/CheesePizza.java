package simplefactory;

public class CheesePizza extends Pizza{
	public CheesePizza() {
		setName("奶酪披萨");
	}
	public void prepare() {
//		setName("奶酪披萨");
		System.out.println("  准备"+ name +"的原材料:奶酪、面粉、糖  ");
	}
}
