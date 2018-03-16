
public class Medico {
	String Nome;
	String Morada;
	
	public Medico() {}
	
	public Medico(String nome, String morada) {
		Nome = nome;
		Morada = morada;
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
	

}
