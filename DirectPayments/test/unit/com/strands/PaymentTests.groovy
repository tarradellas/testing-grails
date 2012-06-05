package com.strands



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(Payment)
@Mock([User])
class PaymentTests {

    void testSomething() {
	   def user1 = new User(username:"test1",email:"test1@mailinator.com",password:"123456") 
	   user1.save()
	   def user2 = new User(username:"test2",email:"test2@mailinator.com",password:"123456") 
	   user2.save()
	   def payment = new Payment(concept: "test",belongsTo: user1, toUser: user2, amount: 100)
	   payment.save()
	   assertNotNull(payment)
	   def payments = Payment.all
	   assertNotNull(payments)
    }
	
}
