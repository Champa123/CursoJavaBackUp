package bo;

import java.util.ArrayList;

public class Pedido {
	private String estado;
	private java.sql.Date fecha;
	private ArrayList <ItemPedido> itemPedido;
	
	public void cargarItems (ItemPedido item){
		this.itemPedido.add(item);
	}
	public void setFecha() {
		this.fecha = null;
	}

	private int idPedido;
	
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public java.sql.Date getFecha() {
		return fecha;
	}
	
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	
	
	@Override
	public String toString() {
		return "Pedido [estado=" + estado + ", fecha=" + fecha + ", itemPedido=" + itemPedido + ", idPedido=" + idPedido
				+ "]";
	}
	public ArrayList <ItemPedido> getItemPedido() {
		return itemPedido;
	}
	public void setItemPedido(ArrayList <ItemPedido> itemPedido) {
		this.itemPedido = itemPedido;
	}
	
	
}
