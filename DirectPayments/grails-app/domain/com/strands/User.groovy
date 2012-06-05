package com.strands

class User {
	
	String username;
	String email;
	String password;
	static hasMany = [payments:Payment]

    static constraints = {
		username(blank:false)
		username(unique:false)
		email(blank:false)
		email(email:true)
		password(blank:false)
    }
}
