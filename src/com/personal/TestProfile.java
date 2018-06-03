package com.personal;

public class TestProfile {
	public static void printprofile(IProfile profile) {
		profile.myBasicInfo();
		profile.myHobbies();
	}

	public static void main(String[] args) {
		IProfile myProfile ;
		myProfile= new ElancheProfile();
		TestProfile.printprofile(myProfile);
		
		IProfile myProfile1 ;
		myProfile1= new ArunProfile();
		TestProfile.printprofile(myProfile1);
	}
}
