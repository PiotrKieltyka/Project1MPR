package repositories;

import java.util.List;

import domain.*;

public interface IUserRepository extends IRepository<User> {

	public List<User> withLogin(String login);
	public List<User> withRole(String roleName);
	public List<User> withRole(int roleId);

}
