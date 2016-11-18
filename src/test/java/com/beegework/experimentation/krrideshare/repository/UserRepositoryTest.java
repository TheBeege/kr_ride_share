package com.beegework.experimentation.krrideshare.repository;

/**
 * Created by thebeege on 11/18/16.
 */
import com.beegework.experimentation.krrideshare.configuration.RepositoryConfiguration;
import com.beegework.experimentation.krrideshare.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {RepositoryConfiguration.class})
public class UserRepositoryTest {

    private UserRepository userRepository;

    @Autowired
    public void setProductRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Test
    public void testSaveProduct(){
        //setup product
        User user = new User();
        user.setFamilyName("Kim");
        user.setGivenName("Sejong");
        user.setPhotoURL("fake.com");

        //save product, verify has ID value after save
        assertNull(user.getUserID()); //null before save
        userRepository.save(user);
        assertNotNull(user.getUserID()); //not null after save

        //fetch from DB
        User fetchedUser = userRepository.findOne(user.getUserID());

        //should not be null
        assertNotNull(fetchedUser);

        //should equal
        assertEquals(user.getUserID(), fetchedUser.getUserID());
        assertEquals(user.getFamilyName(), fetchedUser.getFamilyName());

        //update description and save
        fetchedUser.setFamilyName("Gook");
        userRepository.save(fetchedUser);

        //get from DB, should be updated
        User fetchedUpdatedUser = userRepository.findOne(fetchedUser.getUserID());
        assertEquals(fetchedUser.getFamilyName(), fetchedUpdatedUser.getFamilyName());

        //verify count of products in DB
        long productCount = userRepository.count();
        assertEquals(productCount, 1);

        //get all products, list should only have one
        Iterable<User> users = userRepository.findAll();

        int count = 0;

        for(User u : users){
            count++;
        }

        assertEquals(count, 1);
    }
}
