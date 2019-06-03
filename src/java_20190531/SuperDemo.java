package java_20190531;

import java.lang.*;


class A extends Object{
	String name;
	A(String name){
		
		this.name = name;
	}
	

	
}

class B extends A{
	B(){
		super();
	}
	
}

public class SuperDemo extends Object{
	public SuperDemo(){
		super();
	}

}
