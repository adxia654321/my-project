package cart.dao;

import cart.model.entity.User;

public interface UserRegisterDAO {

	// 新增 USER
	int addUser(User user);
	
	// emali 驗證成功並修改 completed = ture
	int emailConfirmOK(String username);
	
	
}
