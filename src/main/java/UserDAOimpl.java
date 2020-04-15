import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class UserDAOimpl implements UserDAO {
    private SessionFactory sessionFactory;
    private Session session;
    public UserDAOimpl(){
        sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Users.class)
                .buildSessionFactory();
        session=sessionFactory.openSession();
    }

    @Override
    public Users get(int id) {
      return (Users)session.get(Users.class,id);
    }

    @Override
    public List<Users> getAll() {
        return session.createQuery("From Users s ").getResultList();
    }

    @Override
    public void save(Users user) {

    }

    @Override
    public void update(Users user, String[] params) {

    }

    @Override
    public void delete(Users user) {

    }
}
