package com.blog.payloads;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class UserDto {	
	@NotEmpty
	@Size(min=4,message="Username must be more than 4 character!!!")
	private String name;
	@Email(message="Email is not valid!!!")
	private String email;
	@NotEmpty
	@Size(min=3,max=10,message="password must between 3 to 10 character!!!")
	private String password;
	@NotEmpty
	private String about;
	public UserDto(@NotEmpty @Size(min = 4, message = "Username must be more than 4 character!!!") String name,
			@Email(message = "Email is not valid!!!") String email,
			@NotEmpty @Size(min = 3, max = 10, message = "password must between 3 to 10 character!!!") String password,
			@NotEmpty String about) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.about = about;
	}
	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	
	
	
	

}
