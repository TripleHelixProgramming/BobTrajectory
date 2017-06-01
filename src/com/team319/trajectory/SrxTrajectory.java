package com.team319.trajectory;

import com.fasterxml.jackson.annotation.JsonCreator;

//Combines left and right motion profiles in one object
public class SrxTrajectory {
	
	private SrxMotionProfile leftProfile;
	private SrxMotionProfile rightProfile;
	
	@JsonCreator
	public SrxTrajectory() { }
	
	public SrxTrajectory(SrxMotionProfile left, SrxMotionProfile right) {
		this.leftProfile = left;
		this.rightProfile = right;
	}
	
	public SrxMotionProfile getLeftProfile() {
		return leftProfile;
	}
	public void setLeftProfile(SrxMotionProfile leftProfile) {
		this.leftProfile = leftProfile;
	}
	public SrxMotionProfile getRightProfile() {
		return rightProfile;
	}
	public void setRightProfile(SrxMotionProfile rightProfile) {
		this.rightProfile = rightProfile;
	}
}
