package com.kirmt.KIRMT_Rest.Controller;

import java.awt.*;
import java.util.List;
import java.util.Optional;

import javax.print.attribute.standard.Media;
import javax.validation.Valid;

import com.kirmt.KIRMT_Rest.Entity.User;
import com.kirmt.KIRMT_Rest.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "/users")
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
	
	@RequestMapping(value = "/users/{email}", method = RequestMethod.GET)
	@CrossOrigin(origins = "*")
	public User getUser(@PathVariable String email) {
		User user = userRepository.findUserByStatusAndNameNamedParams(email);
		return user;
	}
}
