package com.Infosys.in.Sample.of.Messaging.Entity;

import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@GenericGenerator(name="uuid2",strategy="org.hybernte.id.UUIDGenerator")
	@NotNull
	private Long userId;
	private String userName;
	private String userCode;
	private String userAddress;

}
