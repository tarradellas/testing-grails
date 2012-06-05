package com.strands

class Payment {
	
	String concept
	Double amount
	Date date
	User toUser
	static belongsTo = [user:User]

    static constraints = {
		concept(blank:false)
		amount(blank:false)
		amount(min:0D)
		toUser(blank:false)
    }
	
}
