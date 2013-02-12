package classes;

public class Email {

	String email;
	
	public Email(String email){
		if(emailValido(email)){
		 	this.email = email;
		}
		
	}

	private boolean emailValido(String email) {
		if(email.contains("@") && (email.contains(".com"))){
			return true;
		}
		return false;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
