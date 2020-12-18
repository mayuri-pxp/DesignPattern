package com.deep.clone.designpatterns.prototype;

class Testimmutablestring {
	public static void main(String args[]) {
		String s = "Sachin";
		String s1 = "Sachin";
		String s2 = "Sachin";
		s.concat(" Tendulkar");
		s = s.concat(" Tendulkar");
		System.out.println(s);
		System.out.println(s1);
		System.out.println(s2);
	}
}