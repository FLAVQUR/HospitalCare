import java.util.ArrayList;
import java.util.Date;

public class Prescricao {
	private Doente doente;
	private Medico medico;
	private Medicamento medicamento;
	
	private Date data;
	
	private ArrayList<HorarioToma> horario;
	
	public Doente getDoente() {
		return doente;
	}
	public void setDoente(Doente doente) {
		this.doente = doente;
	}
	public Medico getMedico() {
		return medico;
	}
	public void setMedico(Medico medico) {
		this.medico = medico;
	}
	public Medicamento getMedicamento() {
		return medicamento;
	}
	public void setMedicamento(Medicamento medicamento) {
		this.medicamento = medicamento;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public Prescricao() {
		horario = new ArrayList<HorarioToma>();
	}
	
	public Prescricao(Doente doente, Medico medico, Medicamento medicamento, Date data, ArrayList<HorarioToma> horario) {
		this.doente = doente;
		this.medico = medico;
		this.medicamento = medicamento;
		this.data = data;
		this.horario = horario;
	}
	
}