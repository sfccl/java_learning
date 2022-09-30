package simplefactory;

public class GreekPizza extends Pizza{
	public GreekPizza(){
		this.setName("希腊披萨");
	}
	public void prepare() {
		//setName("希腊披萨");
		System.out.println("  准备"+ name+ "的原材料：希腊酱、面粉、辣椒  ");
	}

}
