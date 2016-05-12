package by.nalivajr.fornina.services.impl;

import by.nalivajr.fornina.dao.UserDao;
import by.nalivajr.fornina.models.User;
import by.nalivajr.fornina.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public List<User> getAllUsers() {
        return userDao.getAll();
    }
}
