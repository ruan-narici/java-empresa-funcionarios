
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;
	
	public Funcionario(String nome, String cpf, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
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
	
	public void setWage(double salario) {
		this.salario = salario;
	}
	
	public double getWage() {
		return this.salario;
	}
}