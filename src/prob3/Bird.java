package prob3;

public class Bird {
	private String name;
	private boolean fly;
	private String sing;
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}

	public String isSing() {
		return sing;
	}

	public void setSing(String sing) {
		this.sing = sing;
	}

	@Override
	public String toString() {
		return "Bird [name=" + name + ", fly=" + fly + ", sing=" + sing + "운다]";
	}

	public void fly() {
		// TODO Auto-generated method stub
		
	}
	
	public void sing(){
		
	}

	
}
