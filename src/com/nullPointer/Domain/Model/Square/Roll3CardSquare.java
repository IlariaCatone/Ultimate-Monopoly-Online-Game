package com.nullPointer.Domain.Model.Square;
import com.nullPointer.Domain.Model.GameEngine;

public class Roll3CardSquare extends Square {

	public Roll3CardSquare(String n, String t) {
		super(n, t);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void evaluateSquare(GameEngine gameEngine) {
		// TODO Auto-generated method stub
		// make them draw some card? 
		// maybe we can keep a roll 3 card deck here, and make the player draw a card and call its playCard()
		// open to suggestions
		gameEngine.nextTurn();
	}

}