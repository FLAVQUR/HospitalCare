import java.util.Date;

public class PreparacaoMedicamentos {
	private Date dataHora;	
	private Enfermeiro enfermeiro;
	
	public PreparacaoMedicamentos() {}
	
	public PreparacaoMedicamentos(Date dataHora, Enfermeiro enfermeiro) {
		this.dataHora = dataHora;
		this.enfermeiro = enfermeiro;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

}
