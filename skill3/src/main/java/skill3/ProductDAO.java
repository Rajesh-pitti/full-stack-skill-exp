package skill3;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class ProductDAO {

    public void insertProduct(Product p) {
        Session s = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = s.beginTransaction();
        s.save(p);
        tx.commit();
        s.close();
    }

    public List<Product> sortPriceAsc() {
        Session s = HibernateUtil.getSessionFactory().openSession();
        List<Product> list =
            s.createQuery("from Product order by price asc", Product.class).list();
        s.close();
        return list;
    }
}
