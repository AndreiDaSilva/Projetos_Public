import java.time.LocalDate;
import java.util.HashMap;

public class Cliente {
	private LocalDate dataInstalacao;
	private String endereco;
	private String nome;
	private HashMap<String, Telefonia > telefone = new HashMap<>();

	
	public Cliente(LocalDate dataInstalacao, String endereco, String telefone, String nome) {
		setNome(nome);
		setEndereco(endereco);
		setDataInstalacao(dataInstalacao);
		criaPlano(telefone);
		
	}
	
	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}
	public void setDataInstalacao(LocalDate dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
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
