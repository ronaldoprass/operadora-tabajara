package br.com.tabajaradigital.negocio;

/**
 *
 * @author ronaldo
 */
public class Cliente {

    private int codigoCliente;
    private String nomeCliente;
    private String numeroCliente;
    private StatusCliente status;

    public Cliente() {
    }

	public Cliente(int codigoCliente, String nomeCliente, String numeroCliente, StatusCliente status) {
		
		this.codigoCliente = codigoCliente;
		this.nomeCliente = nomeCliente;
		this.numeroCliente = numeroCliente;
		this.status = status;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public String getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(String numeroCliente) {
		this.numeroCliente = numeroCliente;
	}

	public StatusCliente getStatus() {
		return status;
	}

	public void setStatus(StatusCliente status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nomeCliente=" + nomeCliente + ", numeroCliente="
				+ numeroCliente + ", status=" + status + "]";
	}
	
	
	
    
}
