package com.strands

import grails.converters.JSON
import grails.converters.XML

class UserController {
    static scaffold = true
	
	def apiList() {
		def items = User.list()
		withFormat {
			json {
				render items as JSON
			}
			xml {
				render items as XML
			}
		}
	}
	
}
