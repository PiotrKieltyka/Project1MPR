import java.util.List;

import domain.*;
import repositories.IRepositoryCatalog;
import repositories.impl.DummyRepositoryCatalog;


public class main {

	public static void main(String[] args) {
		
		IRepositoryCatalog catalog = new DummyRepositoryCatalog();
		
		Person piotr = new Person();
		piotr.setFirstName("Piotr");
		piotr.setSurName("Kieltyka");
		catalog.getPersons().save(piotr);
		
		
		User pkieltyka = new User();
		pkieltyka.setLogin("pkieltyka");
		pkieltyka.setPassword("password");
		catalog.getUsers().save(pkieltyka);
		
		piotr.setUser(pkieltyka);
		pkieltyka.setPerson(piotr);
		
		Role admin = new Role();
		admin.setName("administrator");
		catalog.getRoles().save(admin);
		
		pkieltyka.getRoles().add(admin);
		admin.getUsers().add(pkieltyka);
		
		for(User user: catalog.getUsers().withRole("administrator"))
			System.out.println(user.getLogin());
		
	}

}
