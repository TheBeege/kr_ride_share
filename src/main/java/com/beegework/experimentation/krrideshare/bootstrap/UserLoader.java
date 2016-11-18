package com.beegework.experimentation.krrideshare.bootstrap;

/**
 * Created by thebeege on 11/18/16.
 */
import com.beegework.experimentation.krrideshare.model.User;
import com.beegework.experimentation.krrideshare.repositories.UserRepository;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class UserLoader implements ApplicationListener<ContextRefreshedEvent> {

    private UserRepository userRepository;

    private Logger log = Logger.getLogger(UserLoader.class);

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {

        User alex = new User();
        alex.setFamilyName("Kim");
        alex.setGivenName("Alex");
        alex.setPhotoURL("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
        userRepository.save(alex);

        log.info("Saved Alex - id: " + alex.getUserID());

        User sunny = new User();
        sunny.setFamilyName("Kim");
        sunny.setGivenName("Sunny");
        sunny.setPhotoURL("https://springframework.guru/wp-content/uploads/2015/04/spring_framework_guru_shirt-rf412049699c14ba5b68bb1c09182bfa2_8nax2_512.jpg");
        userRepository.save(sunny);

        log.info("Saved Sunny - id:" + sunny.getUserID());
    }
}
