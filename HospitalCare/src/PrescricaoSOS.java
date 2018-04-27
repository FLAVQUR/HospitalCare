import java.time.LocalDateTime;

public class PrescricaoSOS extends Prescricao {

	public PrescricaoSOS(int codigo, Medico medico, Doente doente, LocalDateTime datahora) {
		super(codigo, medico, doente, datahora);
	}
	
}
