
public class Medico {
	private String Nome;
	private String Morada;
	private String Telefone;
	
	public Medico() {}
	
	public Medico(String nome, String morada, String telefone) {
		this.Nome = nome;
		this.Morada = morada;
		this.Telefone = telefone;		
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getMorada() {
		return Morada;
	}

	public void setMorada(String morada) {
		Morada = morada;
	}

	public String getTelefone() {
		return Telefone;
	}

	public void setTelefone(String telefone) {
		Telefone = telefone;
	}

}
