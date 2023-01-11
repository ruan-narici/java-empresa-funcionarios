
public class Cliente implements Autenticavel {
	
	private String nome;
	private String cpf;
	private AutenticaUtil autentica;
	
	public Cliente (String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
		autentica = new AutenticaUtil();
	}
	
	@Override
	public void setSenha(int senha) {
		autentica.setSenha(senha);
	}
	
	@Override
	public int getSenha() {
		return autentica.getSenha();
	}
	
	@Override
	public boolean verifica(int senha) {
		return autentica.verifica(senha);
	}
	
	public void setName(String nome) {
		this.nome = nome;
	}
	
	public String getName() {
		return this.nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return this.cpf;
	}

}
