import java.util.ArrayList;
import java.util.Date;

public class Prescricao {
	private Medico medico;
	private Doente doente;
	private ArrayList<HorarioToma> horariosToma = new ArrayList<HorarioToma>();
	private Date datahora;	

	private String medicamento;

	public Prescricao() {
		
	}	
	
	public Prescricao(int codigo, java.time.LocalDateTime datahora)  {
		
	}
	
	public Prescricao(Medico medico, Doente doente, ArrayList<HorarioToma> horariosToma, Date datahora) {
		this.medico = medico;
		this.doente = doente;
		this.horariosToma = horariosToma;
		this.datahora = datahora;
	}
	
	public void adicionarHToma(HorarioToma ht) {
		horariosToma.add(ht);
	}
}