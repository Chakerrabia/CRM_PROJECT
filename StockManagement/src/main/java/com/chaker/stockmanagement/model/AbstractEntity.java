package com.chaker.stockmanagement.model;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@EntityListeners(AuditingEntityListener.class)
public class AbstractEntity implements Serializable{

	
		@Id
		@GeneratedValue
		private Integer id;
		
		@CreatedDate
		@JsonIgnore
		@Column(name ="creationDate", nullable=false)
		private Instant creationDate;
		
		@LastModifiedDate
		@Column(name = "lastModifiedDate")
		@JsonIgnore
		private Instant lastModifiedDate;
}
