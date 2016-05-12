package by.nalivajr.fornina.dao;

import by.nalivajr.fornina.models.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDao extends BaseDao<User> {
    public UserDao() {
        super(User.class);
    }
}
