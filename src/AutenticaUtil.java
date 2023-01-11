
public class AutenticaUtil {
	
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public int getSenha() {
		System.out.print("A senha e: ");
		return this.senha;
	}
	
	public boolean verifica(int senha) {
		if (senha == this.senha) {
			return true;
		}
		else {
			return false;
		}
	}
}
