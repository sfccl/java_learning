package simplefactory3;

public abstract class Pizza {
	public String name; 
	public abstract void prepare();
	public void bake() {
		System.out.println(name +"  烘培中...  ");
	}
	public void cut() {
		System.out.println(name +"  切割中...  ");
	}
	public void box() {
		System.out.println(name +"  打包中...  ");
	}
	public void setName(String name) {
		this.name = name;
	}

}
