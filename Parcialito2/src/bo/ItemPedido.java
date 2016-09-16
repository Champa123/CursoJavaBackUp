package bo;

public class ItemPedido {
	private int idPedido;
	private int idItem;
	private int cantidad;
	private double precio;
	
	public int getIdPedido() {
		return idPedido;
	}
	public void setIdPedido(int idPedido) {
		this.idPedido = idPedido;
	}
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "ItemPedido [idPedido=" + idPedido + ", idItem=" + idItem + ", cantidad=" + cantidad + ", precio="
				+ precio + "]";
	}
	
	
}
