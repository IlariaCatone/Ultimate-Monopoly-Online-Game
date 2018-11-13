package com.nullPointer.Model;

public abstract class Square {
	private String name;
	private String type;
	
	public Square(String n,String t){
		name=n;
		type=t;
	}
	public String getName(){
		return name;
	}
	public String getType(){
		return type;
	}
	public abstract void evaluateSquare(int diceValue,
		    int speedDieValue, Player player);
}
