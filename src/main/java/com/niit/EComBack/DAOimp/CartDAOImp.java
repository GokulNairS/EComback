package com.niit.EComBack.DAOimp;

	import java.util.ArrayList;
	import java.util.List;
	import javax.transaction.Transactional;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.query.Query;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;
import com.niit.EComBack.DAO.cartDAO;
import com.niit.EComBack.Model.Cart;
	
	@Repository("cartDAO")
	@Transactional
	public class CartDAOImp implements cartDAO{
		@Autowired
		SessionFactory sessionFactory;

		@Override
		public boolean add(Cart cart) {
			try
			{
				sessionFactory.getCurrentSession().save(cart);
				return true;
			} 
			catch (Exception e) {
				return false;
			}
			
		}

		@Override
		public boolean delete(Cart cart) {
			try 
			{
				sessionFactory.getCurrentSession().delete(cart);
				return true;
			} catch (Exception e) 
			{
				return false;
			}
			}

		@Override
		public boolean update(Cart cart) {
			try
			{
				sessionFactory.getCurrentSession().update(cart);
				return true;
			}
			catch (Exception e)
			{
				return false;
			}
		}

		
		@Override
		public Cart getCart(int tId) {
			Session session = sessionFactory.openSession();
			Query<Cart> query = session.createQuery("from Cart where itemid='"+tId+"'");
			Cart c=query.getSingleResult();
			session.close();
			return c;
		}

		@Override
		public List<Cart> listCart(int cartId) {
			try {
				return sessionFactory.getCurrentSession().createQuery("from Cart where cartId="+cartId).list();
					
			}
			catch(Exception e)
			{
				return new ArrayList<Cart>();
			}
			}

	}

