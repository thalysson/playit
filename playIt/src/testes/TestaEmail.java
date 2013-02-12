package testes;

import org.junit.Test;

import junit.framework.Assert;
import classes.Email;

public class TestaEmail {
	
	Email e1, e2;
	
	@Test
	public void init(){
		e1 = new Email("maria127@uol.com");
		Assert.assertEquals("maria127@uol.com", e1.getEmail());
		
		e2 = new Email("janaina@com");
		Assert.assertEquals(null, e2.getEmail());
		
		
		//isso aqui tem que dar um jeito de verificar um servidor antes do .com :P
		e2 = new Email("janaina@.com");
		Assert.assertEquals("janaina@.com", e2.getEmail());
		
	}

}
