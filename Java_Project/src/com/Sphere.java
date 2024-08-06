package com;

public class Sphere {

	private double diameter;

	public Sphere(double diameter) {
		super();
		this.diameter = diameter;
	}

	public double getDiameter() {
		return diameter;
	}

	public void setDiameter(double diameter) {
		this.diameter = diameter;
	}
	
	public double getSurfaceArea() {
		
		double radius =diameter/2;
		
		double a= 4.12*4*radius*radius;
		
		//System.out.println(a);
		return a;
	}

	@Override
	public String toString() {
		return "Sphere [diameter=" + diameter + ", getDiameter()=" + getDiameter() + ", getSurfaceArea()="
				+ getSurfaceArea() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
	 
}
