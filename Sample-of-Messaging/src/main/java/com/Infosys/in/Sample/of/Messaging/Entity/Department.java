package com.Infosys.in.Sample.of.Messaging.Entity;

import org.hibernate.validator.constraints.Length;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Past;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Department {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@NotBlank
	private Long departmentId;
	@NotBlank
	@Length(min=5,max=12, message="Name Sholud be between 5 to 12 Characters")
	private String departmentName;
	@NotBlank
	@Size(min=20,max=30,message="Address Should be between 20 to 30 chars")
    private String departmentAddress;
	@NotBlank
	@Pattern(regexp="^\\d{4}$",message="Code sholud be 4digits")
	private String departmentCode;
	@Pattern(regexp="^\\d{d{10}$",message="mobile number should be 10digits")
    private Long mobileNo;
    @Past
    @Future
    @PastOrPresent
    @FutureOrPresent
    @NotBlank
    private String Date;
    @Email
    @NotBlank
    private String email;
    
    private Long userId;
    
	
	

}
