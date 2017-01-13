package prob5;

public class MyStack implements Stack {
	
	int top=-1;
	int size=0;
	String[] str=new String[size];
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
	public  MyStack(int size){
		 
		 this.setSize(size);
		 this.str= new String[this.size];
		
 	}
	
	@Override
	public void push(String item) {
		// TODO Auto-generated method stub
		
		
//		크기가 넘어가는 경우 resize(2배)	
		
		if(top+1==str.length){
			this.size=this.size*2;
			String[] str2=new String[this.size];
//			문자열을 옮기기
			for(int i=0;i<(this.size)/2;i++){
				str2[i]=str[i];
			}
			str=str2;
		}
			
			
		str[++top]=item;
		
		
	}

	@Override
	public String pop() throws MyStackException {
		// TODO Auto-generated method stub
		
//		stack이 비어있을 경우 예외사항 발생한다. 
		if(top==-1){
			throw new MyStackException();
		}
		
		return str[top--];
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(top==-1){
			return true;
		}
		
		return false;
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return top+1;
	}

}
