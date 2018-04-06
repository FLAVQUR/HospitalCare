import java.util.Date;

public class ServicoEnfermeiro {
	private Date dataHoraInicio;
	private Date dataHoraFim;
	
	public ServicoEnfermeiro() {}
	
	public ServicoEnfermeiro(Date dataHoraInicio, Date dataHoraFim) {
		this.dataHoraInicio = dataHoraInicio;
		this.dataHoraFim = dataHoraFim;
	}

	public Date getDataHoraInicio() {
		return dataHoraInicio;
	}

	public void setDataHoraInicio(Date dataHoraInicio) {
		this.dataHoraInicio = dataHoraInicio;
	}

	public Date getDataHoraFim() {
		return dataHoraFim;
	}

	public void setDataHoraFim(Date dataHoraFim) {
		this.dataHoraFim = dataHoraFim;
	}
}
