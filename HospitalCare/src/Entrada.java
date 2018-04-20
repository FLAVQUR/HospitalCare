import java.time.LocalDateTime;

public class Entrada {
	private int codigo;
	private FuncionarioAdministrativo administrativo;
	private Doente doente;
	private LocalDateTime dataHora;
	
	public Entrada(int codigo, FuncionarioAdministrativo administrativo, Doente doente, LocalDateTime dataHora) {
		this.codigo = codigo;
		this.administrativo = administrativo;
		this.doente = doente;
		this.dataHora = dataHora;
	}
	
}