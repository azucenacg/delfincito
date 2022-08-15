package org.generation.app.entity;

import javax.persistence.*;


import lombok.Data;

@Data
@Entity
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="role_id")
	private Long roleId;
	@Column(name="role_type")
	private String roleType;
	@Column(name="description")
	private String description;

}
