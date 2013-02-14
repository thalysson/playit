package classes;

public class Som {
	
	private String nome, artista, album, horaPostagem, mensagemPost;
	
	
	//a mensagem do post pode ser passada null caso a pessoa nao queira comentar
	public Som (String nome, String artista, String album, String horaPostagem, String mensagemPost){
		this.nome = nome;
		this.artista = artista;
		this.album = album;
		this.horaPostagem = horaPostagem;
		this.mensagemPost = mensagemPost;
		
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
		return horaPostagem;
	}


	public void setHoraPostagem(String horaPostagem) {
		this.horaPostagem = horaPostagem;
	}


	public String getMensagemPost() {
		return mensagemPost;
	}


	public void setMensagemPost(String mensagemPost) {
		this.mensagemPost = mensagemPost;
	}

	
	
}
