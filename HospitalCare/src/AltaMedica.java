import java.util.Date;

public class AltaMedica {
	private Entrada entrada;
	private Medico medico;
	private Date data_hora;
	
	public AltaMedica(Entrada entrada, Medico medico, Date data_hora) {
		this.entrada = entrada;
		this.medico = medico;
		this.data_hora = data_hora;
	}

	public Entrada getEntrada() {
		return entrada;
	}

	public void setEntrada(Entrada entrada) {
		this.entrada = entrada;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Date getData_hora() {
		return data_hora;
	}

	public void setData_hora(Date data_hora) {
		this.data_hora = data_hora;
	}
}
