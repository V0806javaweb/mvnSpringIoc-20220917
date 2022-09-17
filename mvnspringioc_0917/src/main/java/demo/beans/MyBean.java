package demo.beans;

public class MyBean {
	private String name="orgin";		
	
	public MyBean(String name) {		
		this.name = name;
	}
	public MyBean() {
		this.name = "NA";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "MyBean [name=" + name + "]";
	}	
}
