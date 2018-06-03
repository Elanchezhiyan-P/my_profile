package com.personal;

public class ElancheProfile implements IProfile{

	@Override
	public void myBasicInfo() {
		System.out.println(ProfileConstants.FIRST_NAME + "Elanchezhiyan");
		System.out.println(ProfileConstants.LAST_NAME + "Poosamani");
		System.out.println(ProfileConstants.AGE+ "21");
	}

	@Override
	public void myHobbies() {
		System.out.println("My hobbies are gardnening and watching movies");
		
	}
 
}
