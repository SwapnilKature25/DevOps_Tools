package com.nit.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data     // gives setters+getters + toString() + hashCode() + equals() methods
@NoArgsConstructor   // gives 0 param constructor
@AllArgsConstructor   // gives All args constructor
public class Student {
	private Integer sno;
	private String sname;
	private String sadd;
	private Float avg;
}
