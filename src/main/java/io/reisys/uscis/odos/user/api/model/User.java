package io.reisys.uscis.odos.user.api.model;

import java.util.List;
import java.util.Objects;

import org.springframework.hateoas.ResourceSupport;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel
public class User  extends ResourceSupport {

	@ApiModelProperty(value="Id of user", required=true)
	private String userId;
	
	@ApiModelProperty(value="First Name for the user", required=true)
	private String firstName;
	
	@ApiModelProperty(value="Last Name for the user", required=true)
	private String lastName;
	
	@ApiModelProperty(value="Email for the user", required=true)
	private String email;
	
	@ApiModelProperty(value="Role name for the user", required=true)
	private List<String> roles;
	
	@ApiModelProperty(value="Status of the user", required=true)
	private String status;
	
	private List<String> errorMessages;
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public List<String> getRoles() {
		return roles;
	}
	public void setRoles(List<String> roles) {
		this.roles = roles;
	}
	public List<String> getErrorMessages() {
		return errorMessages;
	}
	public void setErrorMessages(List<String> errorMessages) {
		this.errorMessages = errorMessages;
	}
	
	@Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof User)) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(userId, user.userId);
    }
	
    @Override
    public int hashCode() {
        return Objects.hash(userId);
    }

}
