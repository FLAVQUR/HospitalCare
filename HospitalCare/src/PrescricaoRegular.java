import java.time.LocalDateTime;

public class PrescricaoRegular extends Prescricao {

	public PrescricaoRegular(int codigo, Medico medico, Doente doente, LocalDateTime datahora) {
		super(codigo, medico, doente, datahora);
	}
	
}
