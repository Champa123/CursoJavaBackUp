package principal;

import java.sql.Date;
import java.util.ArrayList;

import javax.rmi.CORBA.UtilDelegate;

import com.mysql.jdbc.Util;

import bo.ItemPedido;
import bo.Pedido;
import dao.GestorDePedidos;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		java.util.Date fecha= new java.util.Date();
		GestorDePedidos gestor=new GestorDePedidos();
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido();
		ArrayList<ItemPedido> arrayItem=new ArrayList<>();
		
		arrayItem.add(item);
		item.setCantidad(2);
		item.setIdItem(6);
		item.setIdPedido(5);
		
		item.setPrecio(5);
		pedido.setEstado("Reservado");
		pedido.setItemPedido(arrayItem);
		pedido.setFecha();
		pedido.setIdPedido(3);
		
		gestor.guardarPedido(pedido);
	}

}
