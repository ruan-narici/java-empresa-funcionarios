
public class Empresa {

	public static void main(String[] args) {
		
		SistemaInterno sistema = new SistemaInterno();
		
		Administrador a1 = new Administrador("Ruan", "000.000.000-00");
		
		System.out.println(a1.getName());
		System.out.println(a1.getWage());
		
		a1.setSenha(55678);
		System.out.println(a1.getSenha());
		sistema.autentica(a1);
		
		Designer d1 = new Designer("Cinthia", "000.000.000-00");
		
		System.out.println(d1.getName());
		System.out.println(d1.getWage());
		
		Gerente g1 = new Gerente("Nayara", "000.000.000-00");
		
		System.out.println(g1.getName());
		System.out.println(g1.getWage());
		
		g1.setSenha(55679);
		System.out.println(g1.getSenha());
		sistema.autentica(g1);
	}
}
