
public class SpringTest {
	private String name;
	private String tooks;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getTooks() {
		return tooks;
	}

	public void setTooks(String tooks) {
		this.tooks = tooks;
	}
	
	/*
	 * public void print() { System.out.println(name +"หตฃบ"+tooks); }
	 */

	public SpringTest(String name, String tooks) {
		super();
		this.name = name;
		this.tooks = tooks;
	}

	@Override
	public String toString() {
		return "SpringTest [name=" + name + ", tooks=" + tooks + "]";
	}

	
	
	
	
}
