import java.*;
import java.sql.*;
import java.sql.Connection;
import java.util.List;

import domain.*;
import repositories.IRepository;
import repositories.IRepositoryCatalog;
import repositories.impl.DummyRepositoryCatalog;
import repositories.impl.RepositoryCatalog;
import repositories.impl.UserBuilder;
import repositories.impl.UserRepository;
import UnitOfWork.IUnitOfWork;
import UnitOfWork.UnitOfWork;


public class main {

	public static void main(String[] args) {

		String url="jdbc:hsqldb:hsql://localhost/workdb";
		User pkieltyka = new User();
		pkieltyka.setLogin("pkieltyka");
		pkieltyka.setPassword("masterpass");
		
		try {
			
			Connection connection = DriverManager.getConnection(url);
			IUnitOfWork uow = new UnitOfWork(connection);
	
			IRepositoryCatalog catalog = new RepositoryCatalog(connection, uow);
			
			
			catalog.getUsers().save(pkieltyka);
			
			List<User> usersFromDb= catalog.getUsers().getAll();
			
			for(User userFromDb: usersFromDb)
				System.out.println(userFromDb.getId()+" "+userFromDb.getLogin()+" "+userFromDb.getPassword());
			
			User u = catalog.getUsers().get(2);
			u.setPassword("ciuchcia1234");
			catalog.getUsers().update(u);
			catalog.getUsers().delete(usersFromDb.get(0));
		
			for(User userFromDb: catalog.getUsers().getAll())
				System.out.println(userFromDb.getId()+" "+userFromDb.getLogin()+" "+userFromDb.getPassword());
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("THE END");
	}

} 