package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import bo.ItemPedido;
import bo.Pedido;

public class GestorDePedidos {
	
		
		
	

	public void guardarPedido(Pedido pedido){
		
		Connection connection=null;
		String sql = "Insert into pedido (Estado, fecha) values (?,?)";
		
		try {
			
			connection =DBUtil.recuperarConexion();
			PreparedStatement comandoInsert = connection.prepareStatement(sql);
			String sql1 = "insert into item_pedido (idItem,cantidad,idPedido,precio) Values (?, ?, last_insert_id(), ?)";
			
			comandoInsert.setString(1, pedido.getEstado());
			comandoInsert.setDate(2,pedido.getFecha());
			comandoInsert.execute();
			ArrayList <ItemPedido> items = pedido.getItemPedido();
			for (ItemPedido item : items ){
				PreparedStatement comandoInsert2= connection.prepareStatement(sql1);
				comandoInsert2.setInt(1, item.getIdItem());
				comandoInsert2.setInt(2, item.getCantidad());
				comandoInsert2.setDouble(3, item.getPrecio());
				comandoInsert2.execute();
				
			}
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		} catch (SQLException e) {
		
			e.printStackTrace();
		} finally {
			DBUtil.cerrarConexion(connection);
		}
	}
		public ArrayList<Pedido> pedidos (){
			ArrayList<Pedido> pedidos =new ArrayList<>();
			Connection connection= null;
			try {
				connection= DBUtil.recuperarConexion();
				String sql = "select estado,fecha from pedidos inner join item_pedido on pedido.idPedido=item_pedido.idPedido";
				PreparedStatement comandoSelect = connection.prepareStatement(sql);
				ResultSet resultado = comandoSelect.executeQuery();
				while (resultado.next()) {
					
					
				}
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
				
		}
		
	}

	

