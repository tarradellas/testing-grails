package com.strands



import grails.test.mixin.*
import org.junit.*

/**
 * See the API for {@link grails.test.mixin.domain.DomainClassUnitTestMixin} for usage instructions
 */
@TestFor(User)
class UserTests {

    void testSomething() {
	   def user = new User(username:"test1",email:"test1@mailinator.com",password:"123456") 
	   user.save()
	   assertNotNull(user)
	   def users = User.findByUsername("test1")
	   assertNotNull(users)
    }
	
}
