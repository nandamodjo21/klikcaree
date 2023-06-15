package id.klikdata.klinik.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import id.klikdata.klinik.Mesagge.Message;
import id.klikdata.klinik.dao.UserDao;
import id.klikdata.klinik.entity.User;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class UserController {

    private final UserDao userDao;
    // @Autowired
    private Message message;

    @PostMapping
    public User login(@RequestBody User log) {
        // TODO: process POST request

        User user = new User();
        user.setUsername(log.getUsername());
        user.setPassword(log.getPassword());
        userDao.save(user);
        return user;

    }

    @PostMapping("/login")
    public User lgn(@RequestBody User lgn) {
        User user = new User();
        // Message message = new Message();
        user.setUsername(lgn.getUsername());
        user.setPassword(lgn.getPassword());

        if (!user.getUsername().isEmpty()) {
            message.setMessage("sukses");
            userDao.save(user);

            // message.setMessage("sukses");

        } else {
            message.setMessage("invalid");

        }
        return user;
    }

}
