package java_study;

import java.util.ArrayList;

public class Customer extends Parent {

	
	ArrayList<Customer> list = new ArrayList<Customer>();
	
	public Customer(String name, String cphone) {
		super();
		this.name = name;
		this.cphone = cphone;
	}
	public void insert(){
		list.add(new Customer (name, cphone));
	}
	
	public void delete(int i){
		list.remove(i);
	}

}
