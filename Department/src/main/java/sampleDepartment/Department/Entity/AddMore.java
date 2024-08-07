package sampleDepartment.Department.Entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AddMore {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String userAddress;
	private String userCode;
	private String firstName;
	private String lastName;
	
	
	
	
	
//	@DateTimeFormat(pattern="yyyy-mm-dd")
	private String addition;
	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_dep_id")
	private Department department;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	public String getUserCode() {
		return userCode;
	}
	public void setUserCode(String userCode) {
		this.userCode = userCode;
	}
	public AddMore(Long userId, String userName, String userAddress, String userCode) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userAddress = userAddress;
		this.userCode = userCode;
	}
	

}
