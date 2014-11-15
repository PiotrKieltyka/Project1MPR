package repositories.impl;

import domain.Person;
import domain.Role;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.IUserRepository;

public class DummyRepositoryCatalog implements IRepositoryCatalog{

	DummyDb db = new DummyDb();
	
	@Override
	public IUserRepository getUsers() {
		return new DummyUserRepository(db);
	}

	@Override
	public IRepository<Person> getPersons() {
		return new DummyPersonRepository(db);
	}

	@Override
	public IRepository<Role> getRoles() {
		return new DummyRoleRepository(db);
	}

}
