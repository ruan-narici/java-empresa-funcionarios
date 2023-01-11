
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticaUtil autentica;

	public Gerente(String nome, String cpf) {
		super(nome, cpf, 2500.0);
		autentica = new AutenticaUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}
	
	@Override
	public int getSenha() {
		return this.autentica.getSenha();
	}

	@Override
	public boolean verifica(int senha) {
		return this.autentica.verifica(senha);
	}

}
