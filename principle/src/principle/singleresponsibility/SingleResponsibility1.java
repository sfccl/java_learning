package principle.singleresponsibility;

public class SingleResponsibility1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehicle vehicle = new Vehicle();
		vehicle.run("摩托车");
		vehicle.run("汽车");
		vehicle.run("飞机");
	}

}
//方式1分析
//没有遵守单一职责原则

class Vehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + " 在公路上运行...");
	}
}