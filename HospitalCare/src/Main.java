import java.time.LocalDateTime;

public class Main {
	
	private static void precondicoes() {
		Doente doente = new Doente(1, "Maria");
		RegistoObjetos.inserirDoente(1, doente);
		Administrativo fadmin = new Administrativo(1, "José");
		RegistoObjetos.inserirFuncAdmin(1, fadmin);
	}
	
	private static void inserirEntrada() {
		Integer codigoDoente = 1;
		Doente d =  RegistoObjetos.devolverDoente(codigoDoente);
		System.out.println(d.getNome());
		
		Integer codigoFunc = 1;
		Administrativo f = RegistoObjetos.devolverFuncAdmin(codigoFunc);
		System.out.println(f.getNome());
		
		EntradaDoente e = new EntradaDoente(1, LocalDateTime.now(), d, f);
		EntradaDoente e1 = new EntradaDoente(2, LocalDateTime.now(), d, f);
		RegistoObjetos.inserirEntrada(1, e);
		RegistoObjetos.inserirEntrada(2, e1);
	}
	
	public static void main(String[] args) {
		precondicoes();
		inserirEntrada();
	}

}
