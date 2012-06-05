package com.strands

import grails.converters.JSON
import grails.converters.XML

class PaymentController {
    static scaffold = true
	
	def apiList() {
		def items = Payment.list()
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
