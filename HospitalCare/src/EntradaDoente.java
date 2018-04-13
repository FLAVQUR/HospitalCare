import java.time.LocalDateTime;

public class EntradaDoente {

	private Integer codigo;
	private LocalDateTime dataHora;
	private Doente doente;
	private Administrativo administrativo;
	
	public EntradaDoente(Integer codigo, LocalDateTime dataHora, Doente doente, Administrativo administrativo) {
		this.codigo = codigo;
		this.dataHora = dataHora;
		this.doente = doente;
		this.administrativo = administrativo;
	}
}