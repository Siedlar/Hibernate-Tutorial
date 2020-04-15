import java.util.List;

public class UserService {
    private UserDAO userDAO;

    public UserService(UserDAO userDAO) {
        this.userDAO = userDAO;
    }
    public void wypisz(){
        Users users =userDAO.get(1);
        System.out.println(users.toString());
    }
    public void wypiszListe(){
        List<Users> list=userDAO.getAll();
        list.forEach((x)-> System.out.println(x));
    }
}
