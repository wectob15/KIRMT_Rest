package com.kirmt.KIRMT_Rest.Repository;

import com.kirmt.KIRMT_Rest.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
	@Query("SELECT u FROM User u WHERE u.email = :email")
	User findUserByStatusAndNameNamedParams(
			@Param("email") String email);
	}
