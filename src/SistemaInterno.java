
public class SistemaInterno {

	private int senha = 55678;
	
	public void autentica(Autenticavel funcionario) {
		boolean autenticado = funcionario.verifica(this.senha);
		if (autenticado) {
			System.out.println("Acesso liberado!");
		}
		else {
			System.out.println("Acesso negado!");
		}
	}
}
