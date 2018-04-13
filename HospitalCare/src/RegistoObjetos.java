import java.util.HashMap;

public class RegistoObjetos {
	private static HashMap<Integer,Doente> doentes = new HashMap<Integer, Doente>();
	private static HashMap<Integer, Administrativo> funcadmin = new HashMap<Integer,Administrativo>();
	private static HashMap<Integer, EntradaDoente> entradas = new HashMap<Integer, EntradaDoente>();
	
	public static void inserirDoente(Integer codigo, Doente doente) {
		doentes.put(codigo, doente);
	}
	public static Doente devolverDoente(Integer codigo) {
		return doentes.get(codigo);
	}
	public static void inserirFuncAdmin(Integer codigo, Administrativo func) {
		funcadmin.put(codigo, func);
	}
	public static Administrativo devolverFuncAdmin(Integer codigo) {
		return funcadmin.get(codigo);
	}
	public static void inserirEntrada(Integer codigo, EntradaDoente entrada) {
		entradas.put(codigo, entrada);
	}
	public static EntradaDoente devolverEntrada(Integer codigo) {
		return entradas.get(codigo);
	}
}
