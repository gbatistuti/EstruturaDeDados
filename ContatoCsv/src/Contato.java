
public class Contato {
	
	private int idContato;
	private String nome;
	private String telefone;
	private String email;
	private int diaAniv;
	private int mesAniv;
	
	public Contato(int idContato, String nome, String telefone, String email, int diaAniv, int mesAniv) {
		this.idContato = idContato;
		this.nome = nome;
		this.telefone = telefone;
		this.email = email;
		this.diaAniv = diaAniv;
		this.mesAniv = mesAniv;
	}
	public int getIdContato() {
		return idContato;
	}
	public void setIdContato(int idContato) {
		this.idContato = idContato;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getDiaAniv() {
		return diaAniv;
	}
	public void setDiaAniv(int diaAniv) {
		this.diaAniv = diaAniv;
	}
	public int getMesAniv() {
		return mesAniv;
	}
	public void setMesAniv(int mesAniv) {
		this.mesAniv = mesAniv;
	}
	
	
	
	
	

}
