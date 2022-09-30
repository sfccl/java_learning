package principle.singleresponsibility;

public class SingleResponsiblility2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RoadVehicle roadVehicle = new RoadVehicle();
		roadVehicle.run("汽车");
		roadVehicle.run("摩托车");
		AirVehicle airVehicle = new AirVehicle();
		airVehicle.run("飞机");
	}

}
//方案2分析
//严格遵守了单一职责原则，但花销大。
class RoadVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + " 在路上运行...");
	}
}

class AirVehicle{
	public void run(String vehicle) {
		System.out.println(vehicle + " 在天空运行...");
	}
}