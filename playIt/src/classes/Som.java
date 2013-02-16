package classes;


import java.util.Date;
import java.util.GregorianCalendar;

public class Som {
	
	private String nome, artista, album, mensagemPost;
	private Date horaPostagem;
	private GregorianCalendar calendario = new GregorianCalendar();
	
	//a mensagem do post pode ser passada null caso a pessoa nao queira comentar
	public Som (String nome, String artista, String album, String mensagemPost){
		this.nome = nome;
		this.artista = artista;
		this.album = album;
		this.mensagemPost = mensagemPost;
		
		//o sistema não precisa nao precisa passar a data na 
		//hora de criar o som o proprio som pega a hora atual
		//acho que fica menos uma coisa em comum entre o sistema
		//e o som
		this.horaPostagem = calendario.getTime();
		
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getArtista() {
		return artista;
	}


	public void setArtista(String artista) {
		this.artista = artista;
	}


	public String getAlbum() {
		return album;
	}


	public void setAlbum(String album) {
		this.album = album;
	}


	public String getHoraPostagem() {
		String[] hour = horaPostagem.toString().split(" ");
		return hour[0] + " " + hour[2] + "/" + hour[1] + "/" + hour[5] + " " + hour[3];
	}


	//Para modificar a hora da postagem basta chamar o metodo que ele 
	//atualiza para o horario atual
	public void setHoraPostagem() {
		this.horaPostagem = calendario.getTime();
	}


	public String getMensagemPost() {
		return mensagemPost;
	}


	public void setMensagemPost(String mensagemPost) {
		this.mensagemPost = mensagemPost;
	}

	
	
}
