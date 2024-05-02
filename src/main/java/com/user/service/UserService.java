package com.user.service;

import com.user.model.User;
import com.user.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public List<User> getAllUsers(Integer pageSize, Integer pageNumber){
        //return userDao.findAll(Sort.by("name").and(Sort.by("id")))
        if (pageSize!=null || pageNumber!=null){
            Sort sort = Pageable.ofSize(pageSize).withPage(pageNumber).getSortOr(Sort.by("name"));
            return userDao.findAll(sort);
        }
        return userDao.findAll(Sort.by("name"));
    }

    public List<User> saveUsers(List<User> users){
        return userDao.saveAll(users);
    }

}
