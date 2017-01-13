package prob2;

public class SmartPhone extends MusicPhone {

	@Override
	public void execute(String function) {
		
		if("앱".equals(function)){
			playApp();
			return;
		}// TODO Auto-generated method stub
		
		super.execute(function);
	}

	
	protected void playApp(){
		System.out.println("앱에서 음악재생");
	}
	
}
