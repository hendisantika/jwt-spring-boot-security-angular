package com.hendisantika.jwt.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.hendisantika.jwt.domain.AppUser;

/**
 * @author Hendi Santika
 *
 */
public interface AppUserRepository extends JpaRepository<AppUser, Long> {
	public AppUser findOneByUsername(String username);
}
