import java.time.LocalDateTime;
import java.util.Date;

public class HorarioToma {
	private LocalDateTime dataHora;
	private String medicamento;
	
	public HorarioToma(LocalDateTime dataHora, String medicamento) {
		this.dataHora = dataHora;
		this.medicamento = medicamento;
	}

	public LocalDateTime getDataHora() {
		return dataHora;
	}

	public void setDataHora(LocalDateTime dataHora) {
		this.dataHora = dataHora;
	}

	public String getMedicamento() {
		return medicamento;
	}

	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}
}