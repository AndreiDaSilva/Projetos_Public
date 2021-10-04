import java.util.HashMap;

public class Cliente {
	private String endereco;
	private String nome;
	private HashMap<String, Telefonia > telefone = new HashMap<>();

	
	public Cliente(String endereco, String telefone, String nome) {
		setNome(nome);
		setEndereco(endereco);
		criaPlano(telefone);
		
	}
	
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		endereco = endereco;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		nome = nome;
	}
	public HashMap<String, Telefonia> getTelefone() {
		return telefone;
	}
	public void setTelefone(HashMap<String, Telefonia> telefone) {
		this.telefone = telefone;
	}
	
	public void criaPlano(String nTelefone) {
		this.telefone.put(nTelefone, new Telefonia (nTelefone, this));
	}
	
}
