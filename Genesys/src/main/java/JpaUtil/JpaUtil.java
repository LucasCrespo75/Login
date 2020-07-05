package JpaUtil;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtil {

	private static EntityManagerFactory factory;
	//Entity faz a conexao com o banco 
	    static {
	         factory = Persistence.createEntityManagerFactory("JAVA3");
	       
	    }
	    

	    public static EntityManager getEntityManager() {	
	    	return factory.createEntityManager();		
	    }

	    public static void close() {
	        factory.close();

	 
	}
}
