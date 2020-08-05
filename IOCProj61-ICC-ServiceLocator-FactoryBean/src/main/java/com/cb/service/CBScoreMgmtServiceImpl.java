package com.cb.service;

import com.icc.external.IccScoreComp;

public class CBScoreMgmtServiceImpl implements CBScoreMgmtService {

	private IccScoreComp extComp;
	public CBScoreMgmtServiceImpl(IccScoreComp extComp) {
		this.extComp = extComp;
	}
	
	@Override
	public String getScore(int mid) {
		//use exeternal component reference
		return extComp.getScore(mid);
	}
}
