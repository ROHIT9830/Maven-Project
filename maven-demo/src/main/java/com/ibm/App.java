package com.ibm;

public class App {
		private int id;
		private String name;
		public App(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		public void display() {
			System.out.println("My id ios "+id+" and name is "+name);
		}

}
