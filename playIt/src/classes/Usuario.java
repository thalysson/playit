package classes;

public class Usuario {
	
	String login, nome;
	Email email;
	
	public Usuario(String login, String nome, Email email){
		this.login = login;
		this.nome = nome;
		this.email = email;
	}
	
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email.getEmail();
	}

	public void setEmail(Email email) {
		this.email = email;
	}

	

}
