package model;

public class Reserva {
	private Cliente cliente;
	private Restaurante restaurante;
	private String prato;
	
	public Reserva(Cliente cliente, Restaurante restaurante, String prato) {
		super();
		this.cliente = cliente;
		this.restaurante = restaurante;
		this.prato = prato;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Restaurante getRestaurante() {
		return restaurante;
	}
	public void setRestaurante(Restaurante restaurante) {
		this.restaurante = restaurante;
	}
	public String getPrato() {
		return prato;
	}
	public void setPrato(String prato) {
		this.prato = prato;
	}
	
}
