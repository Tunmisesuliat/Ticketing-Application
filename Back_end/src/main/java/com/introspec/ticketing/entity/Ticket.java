package com.introspec.ticketing.entity;

import java.util.Date;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;
import lombok.Data;

@Entity
@Data
@JsonIgnoreProperties(
	value = {"createdAt", "updatedAt"},
	allowGetters = true
)
public class Ticket {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private Long terminalId;
	private String accountNo;
	private String pan;
	private String phoneNumber;
	private Date transactionDate;
	private Double amount;	
	private String channel;
	@DateTimeFormat(pattern="yyy-MM-dd'T'HH:mm:ss")
	@Column(nullable=false, updatable=false)
	@CreatedDate
	private Date createdAt = new Date();
	@Column(nullable=false)
	@LastModifiedDate
	private Date updatedAt = new Date();
}