import java.time.LocalDate;

public class Plano {
	private LocalDate dataInstalacao;
	private String linha;
	private String nTelefone;
	private int ocorrencias;
	private Boolean internet;
	private String ramo;
	private char tipoPlano;
	private Usuario cliente;
	
	
	public Plano(String nTelefone, Usuario cliente, LocalDate dataInstalacao) {
		setCliente(cliente);
		setnTelefone(nTelefone);
		setDataInstalacao(dataInstalacao);
	}
	
	public double getValorPlano(){
		double valorPlano = 0;
		switch (this.tipoPlano) {
		
		case 'R':
			valorPlano = 15.00;
		break;
		
		case 'C':
			if(this.dataInstalacao.isBefore(LocalDate.of(2019, 01, 01))) {
				valorPlano = 25.00;
			} else {
				valorPlano = 37.50;
			}
		break;
		case 'E':
			if(this.ocorrencias > 4999) {
				valorPlano = 187.82;
			} 
			if(this.ocorrencias < 50001 && this.ocorrencias > 10000) {
				valorPlano = 123.9;
			}
			if(this.ocorrencias < 10001 && this.ocorrencias > 5000 ) {
				valorPlano = 98.50;
			}
			if(this.ocorrencias < 5001 && this.ocorrencias > 1000 ) {
				valorPlano = 67.80;
			}
			if(this.ocorrencias < 1001 && this.ocorrencias > 0 ) {
				valorPlano = 50.00;
			}
			break;
		}
		
		
		return valorPlano;
	}
	
	public char getTipoPlano() {
		return tipoPlano;
	}

	public void setTipoPlano(char tipoPlano) {
		this.tipoPlano = tipoPlano;
	}



	public LocalDate getDataInstalacao() {
		return dataInstalacao;
	}

	public void setDataInstalacao(LocalDate dataInstalacao) {
		this.dataInstalacao = dataInstalacao;
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
	
	public int getOcorrencias() {
		return ocorrencias;
	}
	
	public void setOcorrencias(int ocorrencias) {
		this.ocorrencias = ocorrencias;
	}
	
	public boolean getInternet() {	
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

	public Usuario getCliente() {
		return cliente;
	}

	public void setCliente(Usuario cliente) {
		this.cliente = cliente;
	}
	
	
	



}
