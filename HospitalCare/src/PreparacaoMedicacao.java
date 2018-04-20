import java.util.Date;

public class PreparacaoMedicacao {
	private Enfermeiro enfermeiro;
	private HorarioToma horarioToma;
	private Date dataHora;
	
	public PreparacaoMedicacao(Enfermeiro enfermeiro, HorarioToma horarioToma, Date dataHora) {
		this.enfermeiro = enfermeiro;
		this.horarioToma = horarioToma;
		this.dataHora = dataHora;
	}

	public Enfermeiro getEnfermeiro() {
		return enfermeiro;
	}

	public void setEnfermeiro(Enfermeiro enfermeiro) {
		this.enfermeiro = enfermeiro;
	}

	public HorarioToma getHorarioToma() {
		return horarioToma;
	}

	public void setHorarioToma(HorarioToma horarioToma) {
		this.horarioToma = horarioToma;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}	
}
