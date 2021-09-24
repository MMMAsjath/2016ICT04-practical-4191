package com.example.demo.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class User {
	@Id
	private String UserId;
	private String Email;
	private String Firstname;
	private String Lastname;
	private int age;
	@OneToMany(mappedBy = "Owner")
	private List<Post>posts;
	@OneToMany(mappedBy = "CommentedBy")
	private List<Comment>comments;
	
	
	public User()
	{}


	public User(String userId, String email, String firstname, String lastname, int age, List<Post> posts,
			List<Comment> comments) {
		super();
		UserId = userId;
		Email = email;
		Firstname = firstname;
		Lastname = lastname;
		this.age = age;
		this.posts = posts;
		this.comments = comments;
	}


	public String getUserId() {
		return UserId;
	}


	public void setUserId(String userId) {
		UserId = userId;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public String getFirstname() {
		return Firstname;
	}


	public void setFirstname(String firstname) {
		Firstname = firstname;
	}


	public String getLastname() {
		return Lastname;
	}


	public void setLastname(String lastname) {
		Lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public List<Post> getPosts() {
		return posts;
	}


	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}


	public List<Comment> getComments() {
		return comments;
	}


	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}
 
}
