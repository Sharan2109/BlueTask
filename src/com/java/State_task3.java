package com.java;

public class State_task3 extends Language_task3 {
private void southindia() {
	// TODO Auto-generated method stub
System.out.println("we are from south india");
}
private void northindia() {
	// TODO Auto-generated method stub
System.out.println("we are from north india");
}
@Override
	public void tamil() {
		// TODO Auto-generated method stub
		super.tamil();
	}

@Override
	public void english() {
		// TODO Auto-generated method stub
		super.english();
	}
public static void main(String[] args) {
	State_task3 a = new State_task3();
			a.southindia();
	a.northindia();
	a.english();
	a.tamil();
}

}
