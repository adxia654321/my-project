package cart.dao.impl;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import cart.dao.ProductDAO;
import cart.model.entity.Product;

public class ProductDaoImpl extends BaseDao implements ProductDAO{

	@Override
	public List<Product> findAllProducts() {
		List<Product> products = new ArrayList<Product>();
		
		String sql = "select product_id, product_name, price, qty, image_base64 from product";
		try(Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql)){
			// rs存放資料表內容
			while (rs.next()) {
				Product product = new Product();
				product.setProductId(rs.getInt("product_id"));
				product.setProductName(rs.getString("product_name"));
				
			}
			
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void add(Product product) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Integer productId) {
		// TODO Auto-generated method stub
		
	}

	

}
