package principle;

public class Clients {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a = new A();
		a.depend1(new C());
		a.depend2(new C());
		a.depend3(new C());
		
		B b = new B();
		b.depend1(new D());
		b.depend4(new D());
		b.depend5(new D());
	}

}
