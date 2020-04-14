import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.*;

public class Main {
    public static void main(String[] args){
        SessionFactory sessionFactory=new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Users.class)
                .buildSessionFactory();
        Session session=sessionFactory.openSession();
        Users usertmp=new Users("Andrzej","Piekacz");
        session.beginTransaction();
        session.save(usertmp);
        session.getTransaction().commit();

    }
}
