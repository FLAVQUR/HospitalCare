import java.time.LocalDateTime;

public class Main {
	
	public static void precondicoes() {
		Doente doente = new Doente(1, "Maria");
		RegistoObjetos.inserirDoente(1, doente);
		FuncionarioAdministrativo fadmin = new FuncionarioAdministrativo(1, "José");
		RegistoObjetos.inserirFuncAdmin(1, fadmin);		
		Medico medico = new Medico (1, "Melissa"); //Antonio
		RegistoObjetos.inserirMedico(1, medico);
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
		//System.out.println(m.getNome());
		
		HorarioToma ht = new HorarioToma(LocalDateTime.now(),"ht");
		
		
	}
	
	public static void main(String[] args) {
		precondicoes();
		inserirEntrada();
	}

}
