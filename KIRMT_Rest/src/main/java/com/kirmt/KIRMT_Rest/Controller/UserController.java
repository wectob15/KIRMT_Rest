package com.kirmt.KIRMT_Rest.Controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.kirmt.KIRMT_Rest.Entity.User;
import com.kirmt.KIRMT_Rest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	@Autowired
	private UserRepository userRepository;
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public List<User> getUser(){
		return userRepository.findAll();
	}

	@RequestMapping(value = "/users/add", method = RequestMethod.POST)
	public void addUser(@Valid @RequestBody User user) {

		userRepository.save(user);
	}

	@RequestMapping(value = "/users/delete/{user_id}", method = RequestMethod.DELETE)
	public void deleteUser(@PathVariable int user_id) {

		userRepository.deleteById(user_id);
	}
	@RequestMapping(value = "/users/update/{user_id}", method = RequestMethod.PUT)
	public void updateUser(@PathVariable int user_id, @Valid @RequestBody User user ) {
		User dbUser = userRepository.getOne(user_id);
		userRepository.delete(dbUser);
		userRepository.save(user);
	}
	
	@RequestMapping(value = "/users/{user_id}", method = RequestMethod.GET)
	public Optional<User> getUser(@PathVariable int user_id) {

		return userRepository.findById(user_id);
	}
}
