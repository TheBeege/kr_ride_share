package com.beegework.experimentation.krrideshare.repository;

import com.beegework.experimentation.krrideshare.model.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by thebeege on 11/18/16.
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
