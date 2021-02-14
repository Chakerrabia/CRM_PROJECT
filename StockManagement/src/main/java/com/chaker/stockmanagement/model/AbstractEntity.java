package com.chaker.stockmanagement.model;

import java.io.Serializable;

import javax.persistence.MappedSuperclass;

import lombok.Data;

@Data
@MappedSuperclass
public class AbstractEntity implements Serializable{

}
