package com.xworkz.bbc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@Entity
@Table(name = "BBC")
public class BBCEntity {
	@Id
	@GenericGenerator(name="auto" , strategy = "increment")
	@GeneratedValue(generator = "auto")
	@Column(name = "ID")
	public int id;
	@Column(name = "NAME")
	public String name;
	@Column(name = "SEASON_NO")
	public int seasonNo;
	@Column(name = "CONTESTANT_TYPE")
	public String contestantType;
	@Column(name = "GENDER")
	public String gender;
	@Column(name = "DAYSIN")
	public int daysIn;
	@Column(name = "NOOFTASK")
	public int noOfTask;

}
