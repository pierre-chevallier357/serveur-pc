package com.example.strategie;

import java.util.ArrayList;

import com.example.joueur.*;

public class ToujoursTrahir extends Strategie{

	@Override
	public Coup prochainCoup(ArrayList<Coup> historiqueJ1, ArrayList<Coup> historiqueJ2) {
		return Coup.TRAHIR;
	}

}
