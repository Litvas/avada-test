package ua.avada.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface UserDetailsRepository extends CrudRepository<UserInfo, Long> {

    UserInfo findByUserName(String userName);

}
