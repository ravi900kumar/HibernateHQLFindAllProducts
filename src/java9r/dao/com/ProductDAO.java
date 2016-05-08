package java9r.dao.com;

import java9r.entites.com.*;
import java9r.util.com.*;
import org.hibernate.*;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.type.IntegerType;
import org.hibernate.type.Type;

import java.util.*;

public class ProductDAO {
	private SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

/*	@SuppressWarnings("unchecked")
	public List<Product> FindAllProducts() {
		try {
			if (!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
			return sessionFactory.getCurrentSession().createCriteria(Product.class).list();

		} catch (Exception e) {
			return null;
		}
	}
*/
	
	@SuppressWarnings("unchecked")
	public List<Product> findAllHQL(){
		try {
			
			if(!sessionFactory.getCurrentSession().getTransaction().isActive())
				sessionFactory.getCurrentSession().getTransaction().begin();
	
			Query q=sessionFactory.getCurrentSession().createQuery("select p from Product p");
			return q.list();
		} catch (Exception e) {
			return null;
		}
	}

}
