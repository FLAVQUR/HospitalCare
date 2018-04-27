import java.util.HashMap;

public class RegistoObjetos {
	private static HashMap<Integer,Doente> doentes = new HashMap<Integer, Doente>();
	private static HashMap<Integer, FuncionarioAdministrativo> funcadmin = new HashMap<Integer,FuncionarioAdministrativo>();
	private static HashMap<Integer, Entrada> entradas = new HashMap<Integer, Entrada>();
	private static HashMap<Integer, Medico> medicos = new HashMap<Integer, Medico>();
	private static HashMap<Integer, Enfermeiro> enfermeiros = new HashMap<Integer, Enfermeiro>();
	private static HashMap<Integer, AutorizacaoPrescricao> autorizacaoPrescricoes = new HashMap<Integer, AutorizacaoPrescricao>();
	
	public RegistoObjetos() {}
	
	public static void adicionarPrescricao(int codigo, Prescricao p) {
		
	}
	
	public static Doente devolverDoente(java.lang.Integer codigo) {
		return doentes.get(codigo);
	}
	
	public static void inserirDoente(Integer codigo, Doente doente) {
		doentes.put(codigo, doente);
	}
	
	public static Entrada devolverEntrada(java.lang.Integer codigo) {
		return entradas.get(codigo);
	}
	
	public static void inserirEntrada(Integer codigo, Entrada entrada) {
		entradas.put(codigo, entrada);
	}
	
	public static FuncionarioAdministrativo devolverFuncAdmin(java.lang.Integer codigo) {
		return funcadmin.get(codigo);
	}
	
	public static void inserirFuncAdmin(Integer codigo, FuncionarioAdministrativo func) {
		funcadmin.put(codigo, func);
	}
	
	public static Medico devolverMedico(java.lang.Integer codigo) {
		return medicos.get(codigo);
	}
	
	public static void inserirMedico(int codigo, Medico medico) {
		medicos.put(codigo, medico);
	}
	
	public static Enfermeiro devolverEnfermeiro(int codigo) {
		return enfermeiros.get(codigo);
	}
	
	public static void inserirEnfermeiro(int codigo, Enfermeiro enfermeiro) {
		enfermeiros.put(codigo, enfermeiro);
	}
	
	public static AutorizacaoPrescricao devolverAutorizacaoPrescricao(Integer codigo) {
		return autorizacaoPrescricoes.get(codigo);
	}
	
	public static void inserirAutorizacaoPrescricao(int codigo, AutorizacaoPrescricao autorizacaoPrescricao) {
		autorizacaoPrescricoes.put(codigo, autorizacaoPrescricao);
	}

}
