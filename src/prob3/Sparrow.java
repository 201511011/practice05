package prob3;

public class Sparrow extends Bird {

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return super.getName();
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		super.setName(name);
	}

	@Override
	public boolean isFly() {
		// TODO Auto-generated method stub
		return super.isFly();
	}

	@Override
	public void setFly(boolean fly) {
		// TODO Auto-generated method stub
		super.setFly(fly);
	}

	@Override
	public String isSing() {
		// TODO Auto-generated method stub
		return super.isSing();
	}

	@Override
	public void setSing(String sing) {
		// TODO Auto-generated method stub
		super.setSing(sing);
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

	@Override
	public void fly() {
		System.out.println("챔새("+super.getName()+")는 날아다닙니다.");
	}

	@Override
	public void sing() {
		System.out.println("오리("+super.getName()+")는 짹짹 웁니다.");
	}
	
//	public void fly(Bird d){
//		System.out.println("챔새("+d.getName()+")는 날아다닙니다.");
//	}
//	
//	public void sing(Bird d){
//		System.out.println("오리("+d.getName()+")는 짹짹 웁니다.");
//		
//	}

}
