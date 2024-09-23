package com.hms.repository;

import com.hms.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCRUDRepo extends CrudRepository<User, Integer> {
}
