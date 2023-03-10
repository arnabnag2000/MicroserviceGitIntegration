package com.capg.profile.profilerepositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.capg.profile.entity.Profile;


@Repository
public interface ProfileRepository extends JpaRepository<Profile, Long> {

	@Query(value = "SELECT * FROM profile  WHERE  email LIKE ?", nativeQuery = true)
	public List<Profile> findByUserName(@Param("emailId") String email);	
	
}
