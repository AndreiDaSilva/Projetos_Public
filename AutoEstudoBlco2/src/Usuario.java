import java.time.LocalDate;
import java.util.HashMap;

public class Usuario {
		private String nome;
		private String endereco;
		private HashMap<String, Plano > telefone = new HashMap<>();

	
	public Usuario(String endereco, String telefone, String nome, LocalDate dataInstalacao) throws Exception {
		setNome(nome);
		setEndereco(endereco);
		criaPlano(telefone, dataInstalacao);
	}
	
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public HashMap<String, Plano> getTelefone() {
		return telefone;
	}
	public void setTelefone(HashMap<String, Plano> telefone) {
		this.telefone = telefone;
	}
	
	public void criaPlano(String nTelefone, LocalDate dataInstalacao) throws Exception {
		if(nTelefone.length() != 10) {
			throw new Exception("Numero de telefone deve conter 10 digitos");
		}

		if(this.telefone.get(nTelefone) != null) {
			throw new Exception("Telefone já existe");
		} 
		
		this.telefone.put(nTelefone, new Plano (nTelefone, this, dataInstalacao));
	}
	
}
