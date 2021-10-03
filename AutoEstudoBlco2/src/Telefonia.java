public class Telefonia {
	private String linha;
	private String nTelefone;
	private String ocorrencias;
	private Boolean internet;
	private String ramo;
	private Cliente cliente;
	
	public Telefonia(String nTelefone, Cliente cliente) {
		setCliente(cliente);
		setnTelefone(nTelefone);
	}
	
	public String getLinha() {
		return linha;
	}
	public void setLinha(String linha) {
		this.linha = linha;
	}
	public String getnTelefone() {
		return nTelefone;
	}
	public void setnTelefone(String nTelefone) {
		this.nTelefone = nTelefone;
	}
	public String getOcorrencias() {
		return ocorrencias;
	}
	public void setOcorrencias(String ocorrencias) {
		this.ocorrencias = ocorrencias;
	}
	public Boolean getInternet() {
		return internet;
	}
	public void setInternet(Boolean internet) {
		this.internet = internet;
	}
	public String getRamo() {
		return ramo;
	}
	public void setRamo(String ramo) {
		this.ramo = ramo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	



}
