package org.poc.stored.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class User {
	private int id;
	private String name;
	private String dept;
	private String role;
}
