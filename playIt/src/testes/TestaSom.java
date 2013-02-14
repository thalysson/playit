package testes;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import classes.Som;

public class TestaSom {
	Som song1, song2;
	
	@Before
	public void init(){
		//na horaDaPostagem por enquanto to colocando a data
		
		song1 = new Som("oba", "Noel Vermelho", "primeiro", "02/02/12", null);
		song2 = new Som("moinho", "Cartola", "desconheco", "12/02/13", "Muito boa :)");
				
	}
	
	@Test
	public void TestaSom(){
		
		Assert.assertEquals("oba", song1.getNome());
		Assert.assertEquals("Noel Vermelho", song1.getArtista());
		Assert.assertEquals("primeiro", song1.getAlbum());
		Assert.assertEquals("02/02/12", song1.getHoraPostagem());
		Assert.assertEquals(null, song1.getMensagemPost());
		
		
		Assert.assertEquals("moinho", song2.getNome());
		Assert.assertEquals("Cartola", song2.getArtista());
		Assert.assertEquals("desconheco", song2.getAlbum());
		Assert.assertEquals("12/02/13", song2.getHoraPostagem());
		Assert.assertEquals("Muito boa :)", song2.getMensagemPost());
	}
	
	
	@Test
	public void TesteGetsSets(){
		
		Assert.assertEquals("moinho", song2.getNome());
		song2.setNome("moinhozinho");
		Assert.assertEquals("moinhozinho", song2.getNome());
		
		Assert.assertEquals(null, song1.getMensagemPost());
		song1.setMensagemPost("huum");
		Assert.assertEquals("huum", song1.getMensagemPost());
		
		Assert.assertEquals("primeiro", song1.getAlbum());
		song1.setAlbum("segundo");
		Assert.assertEquals("segundo", song1.getAlbum());
		
		Assert.assertEquals("12/02/13", song2.getHoraPostagem());
		song2.setHoraPostagem("03/04/13");
		Assert.assertEquals("03/04/13", song2.getHoraPostagem());
		
		
	}

}
