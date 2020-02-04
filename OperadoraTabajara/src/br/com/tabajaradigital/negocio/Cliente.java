package br.com.tabajaradigital.negocio;

/**
 *
 * @author ronaldo
 */
public class Cliente {

    private int codigoCliente;
    private String nomeCliente;
    private int numeroCliente;
    private StatusCliente status;

    public Cliente() {
    }

	public Cliente(int codigoCliente, String nomeCliente, int numeroCliente, StatusCliente status) {
		super();
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

	public int getNumeroCliente() {
		return numeroCliente;
	}

	public void setNumeroCliente(int numeroCliente) {
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
