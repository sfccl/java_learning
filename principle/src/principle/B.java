package principle;

class B {
	public void depend1(Interface1 i) {
		i.operation1();
	}
	public void depend4(Interface3 i) {
		i.operation4();
	
	}
	public void depend5(Interface3 i) {
		i.operation5();
	}
}
