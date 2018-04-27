import java.time.LocalDateTime;

public class PrescricaoVerbalTUnica extends Prescricao {
	private Enfermeiro enfermeiro;
	private AutorizacaoPrescricao autorizacao;
	
	public PrescricaoVerbalTUnica() {
		super();
	}
	
	public PrescricaoVerbalTUnica(int codigo, Medico medico, Doente doente, LocalDateTime datahora, Enfermeiro enfermeiro, AutorizacaoPrescricao autorizacao) {
		super(codigo, medico, doente, datahora);
		this.enfermeiro = enfermeiro;
		this.autorizacao = autorizacao;
	}
}
