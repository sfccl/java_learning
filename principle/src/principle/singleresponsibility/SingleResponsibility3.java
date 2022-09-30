package principle.singleresponsibility;

public class SingleResponsibility3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle2 vehicle = new Vehicle2();
		vehicle.run("汽车");
		vehicle.runWater("轮船");
		vehicle.runAir("飞机");
	}

}
//方式三分析
//在类层级没有遵守单一职责原则，但是在方法层级上遵守了单一职责原则。
//兼顾效率与遵守单一原则

class Vehicle2 {
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上运行...");
	}

	public void runAir(String vehicle) {
		System.out.println(vehicle + " 在天空中运行...");
	}

	public void runWater(String vehicle) {
		System.out.println(vehicle + " 在水中运行...");
	}
}
