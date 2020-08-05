package com.icc.external;

public class IccScoreCompImpl implements IccScoreComp {

	@Override
	public String getScore(int mid) {
		if(mid==1001) 
			return "IND vs WI IND(BAT):: 300/3";
		else if(mid==1002)
			return "AUS vs ENG:(bat): 300/3";
		else 
			throw new IllegalArgumentException("Invalid match id");
	}
}
