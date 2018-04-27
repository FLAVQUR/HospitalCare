import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Prescricao {
	protected int codigo;
	protected Medico medico;
	protected Doente doente;
	protected ArrayList<HorarioToma> horariosToma = new ArrayList<HorarioToma>();
	protected LocalDateTime datahora;
	
	public Prescricao() {}
	
	public Prescricao(int codigo, Medico medico, Doente doente, LocalDateTime datahora) {
		this.codigo = codigo;
		this.medico = medico;
		this.doente = doente;
		this.datahora = datahora;
	}
	
	public void adicionarHToma(HorarioToma ht) {
		horariosToma.add(ht);
	}
}