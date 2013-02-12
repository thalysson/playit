package testes;


import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import classes.Email;
import classes.Usuario;


public class TestaUsuario {

	Usuario user1,user2;
	
	@Before
	public void init(){
		user1 = new Usuario("maria1", "maria", new Email("maria@ig.com"));
		user2 = new Usuario("jj", "Joao", new Email("joao@ccc.com"));
	}
	
	@Test
	public void TestaNovoUsuario(){
		
		
		Assert.assertEquals("maria1", user1.getLogin());
		Assert.assertEquals("jj", user2.getLogin());
		Assert.assertEquals("maria", user1.getNome());
		Assert.assertEquals("Joao", user2.getNome());
		Assert.assertEquals("maria@ig.com", user1.getEmail());
		Assert.assertEquals("joao@ccc.com", user2.getEmail());
		
	}
	
	
	@Test
	public void TesteSetsGets(){
		user1.setNome("Maria");
		Assert.assertEquals("Maria", user1.getNome());
		
		Assert.assertEquals("maria@ig.com", user1.getEmail());
		user1.setEmail(new Email("maria127@uol.com"));
		Assert.assertEquals("maria127@uol.com", user1.getEmail());
		
		Assert.assertEquals("jj", user2.getLogin());
		user2.setLogin("@JJ");
		Assert.assertEquals("@JJ", user2.getLogin());
		
		
	}

}
