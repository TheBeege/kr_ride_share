package com.beegework.experimentation.krrideshare.service;

import com.beegework.experimentation.krrideshare.model.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by thebeege on 11/15/16.
 */
@RestController
public class UserController {
    private static final String template = "Hello, %s!";

    /*@RequestMapping("/user")
    public User greeting(
                @RequestParam(value="familyName", defaultValue="Kim") String familyName
                ,@RequestParam(value="givenName", defaultValue="Alex") String givenName
                ,@RequestParam(value="photoURL", defaultValue="fake.com") String photoURL
            ) {
        return new User(familyName, givenName, photoURL);
    }*/
}
