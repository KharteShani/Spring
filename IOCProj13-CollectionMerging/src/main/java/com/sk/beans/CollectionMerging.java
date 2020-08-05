package com.sk.beans;

import java.util.List;

public class CollectionMerging {
	private List<String> subjects=null;

	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "CollectionMerging [subjects=" + subjects + "]";
	}
	
	
}
