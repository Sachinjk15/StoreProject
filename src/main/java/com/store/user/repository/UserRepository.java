package com.store.user.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.store.model.SaveStore;
import com.store.model.Store;
import com.store.model.User;
import com.store.model.UserWithRole;


@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select s from User s where s.email= :email")
	User findByUserName( @Param("email") String userEmail);
	
	
	@Query("select s from UserWithRole s where s.email = :email")
	UserWithRole findRoleOfUser(@Param("email") String email);
	
	@Query("select s from Store s where s.storeId = :storeId")
	Store getStoreById(@Param("storeId") int storeid);


	@Modifying
	@Transactional
	@Query("update User u set u.password =:userPassword where u.email = :userEmail")
	void resetPassword(@Param("userEmail") String userEmail,@Param("userPassword") String userPassword);


	@Query("select u from User u where u.email = :email")
	User searchEmail(@Param("email")String email);
}
