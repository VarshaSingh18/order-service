package com.example.demo.model;

public class orderserviceconfiguration {

	private int min;
	private int max;
	public int getMin() {
		return min;
	}
	public orderserviceconfiguration() {
	
	}
	public orderserviceconfiguration(int min, int max) {
		super();
		this.min = min;
		this.max = max;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public int getMax() {
		return max;
	}
	public void setMax(int max) {
		this.max = max;
	}
}
