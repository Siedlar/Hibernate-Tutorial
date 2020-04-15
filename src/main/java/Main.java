import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args){
      UserDAO userDAO=new UserDAOimpl();
     UserService userService=new UserService(userDAO);
     userService.wypisz();
     userService.wypiszListe();
}
}
