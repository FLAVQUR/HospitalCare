import java.util.Date;

public class HorarioToma {
	private Date dataHora;
	
	public HorarioToma() {}
	
	public HorarioToma(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}
}
