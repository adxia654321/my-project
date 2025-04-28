package cart.service.impl;

import java.util.List;

import cart.dao.UserListDAO;
import cart.dao.impl.UserListDAOImpl;
import cart.model.dto.UserDTO;
import cart.model.entity.User;
import cart.service.UserListService;

public class UserListServiceImpl implements UserListService{

	private UserListDAO dao = new UserListDAOImpl();
	
	@Override
	public List<UserDTO> findAllUser() {
		
		return dao.findAllUser()
				  .stream()
				  .map(this::transferUserDTO)
				  .toList();	  
				
	}

	
	private UserDTO transferUserDTO(User user) {
		return new UserDTO(user.getId(), user.getUsername(), user.getEmail(), user.getCompleted());
	}
	
	
	
}
