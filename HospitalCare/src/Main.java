import java.time.LocalDateTime;

public class Main {
	
	public static void precondicoes() {
		Doente doente = new Doente(1, "Maria");
		RegistoObjetos.inserirDoente(1, doente);
		FuncionarioAdministrativo fadmin = new FuncionarioAdministrativo(1, "José");
		RegistoObjetos.inserirFuncAdmin(1, fadmin);		
		Medico medico = new Medico (1, "Melissa");
		RegistoObjetos.inserirMedico(1, medico);
		Enfermeiro enfermeiro = new Enfermeiro (1, "Marco");
		RegistoObjetos.inserirEnfermeiro(1, enfermeiro);
		AutorizacaoPrescricao autorizacaoPrescricao = new AutorizacaoPrescricao("lel");
		RegistoObjetos.inserirAutorizacaoPrescricao(1, autorizacaoPrescricao);
	}
	
	public static void inserirEntrada() {
		Integer codigoDoente = 1;
		Doente d =  RegistoObjetos.devolverDoente(codigoDoente);
		//System.out.println(d.getNome());
		
		Integer codigoFunc = 1;
		FuncionarioAdministrativo f = RegistoObjetos.devolverFuncAdmin(codigoFunc);
		//System.out.println(f.getNome());
		
		Entrada e = new Entrada(1, f, d, LocalDateTime.now());
		Entrada e1 = new Entrada(2, f, d, LocalDateTime.now());
		RegistoObjetos.inserirEntrada(1, e);
		RegistoObjetos.inserirEntrada(2, e1);
		
		Integer codigoMedico = 1;
		Medico m = RegistoObjetos.devolverMedico(codigoMedico);
		
		Integer codigoEnfermeiro= 1;
		Enfermeiro enf = RegistoObjetos.devolverEnfermeiro(codigoEnfermeiro);
		System.out.println(enf.getNome());
		
		new PrescricaoVerbalTUnica(1, m, d, LocalDateTime.now(), enf, new AutorizacaoPrescricao("lel"));
		
		HorarioToma ht = new HorarioToma(LocalDateTime.now(),"ht");		
	}
	
	public static void main(String[] args) {
		precondicoes();
		inserirEntrada();
	}

}
