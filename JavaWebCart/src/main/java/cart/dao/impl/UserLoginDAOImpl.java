package cart.dao.impl;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import cart.dao.UserLoginDAO;
import cart.model.entity.User;

public  class UserLoginDAOImpl extends BaseDao implements UserLoginDAO{

	@Override
	public User findUserByName(String username) {
		String sql = "select id, username, hash_password, hash_salt, email, completed from user where username=? ";
		try(PreparedStatement pstmt = conn.prepareStatement(sql)) {
			pstmt.setString(1, username);
			// 執行查詢
			try (ResultSet rs = pstmt.executeQuery()){
				// 判斷是否有資料
				if(rs.next()) {
					User user = new User();
					user.setId(rs.getInt("id"));
					user.setUsername(rs.getString("username"));
					user.setHashPassword(rs.getString("hash_password"));
					user.setHashSalt(rs.getString("hash_salt"));
					user.setEmail(rs.getString("email"));
					user.setCompleted(rs.getBoolean("completed"));
					
					return user;
				}							
			} 		
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
		
	}


	

}
