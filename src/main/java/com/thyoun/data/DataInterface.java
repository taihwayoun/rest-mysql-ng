package com.thyoun.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface DataInterface extends CrudRepository<User, Long> {

}
