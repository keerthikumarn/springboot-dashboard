package com.springboot.dashboard.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class KeyEntity {

	@Id
	@Column(name = "pk", unique = true)
	private Long pk;

	public Long getPk() {
		return pk;
	}

	public void setPk(Long pk) {
		this.pk = pk;
	}

}
