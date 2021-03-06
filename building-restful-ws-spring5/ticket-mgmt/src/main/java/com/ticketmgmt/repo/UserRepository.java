package com.ticketmgmt.repo;

import com.ticketmgmt.domain.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * Repository of users.
 *
 * @author vision8
 */
public interface UserRepository {
	
	Flux<User> getAllUsers();
	
	Mono<User> getUser(Integer id);
	
	Mono<Void> saveUser(Mono<User> userMono);
	
	Mono<Void> updateUser(Integer userid, Mono<User> userMono);
	
	Mono<Void> deleteUser(Integer id);
	
}
