package com.xworkz.cartoon.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
@Table(name = "CARTOON")
public class CartoonEntity {
	@Id
	@Column(name = "CID")
	@GenericGenerator(name = "auto", strategy = "increment")
	@GeneratedValue(generator = "auto")
	public int cid;
	@Column(name = "NAME")
	public String name;
	@Column(name = "SHOWNAME")
	public String showName;
	@Enumerated(EnumType.STRING)
	@Column(name = "CHANNEL_NAME")
	public ChannelName channelName;
	@Column(name = "LANG")
	public String language;

	public CartoonEntity(String name, String showName, ChannelName channelName, String language) {
		super();

		this.name = name;
		this.showName = showName;
		this.channelName = channelName;
		this.language = language;
	}

	public enum ChannelName {
		POGO, NICK, CHINTU,CN,DISINEY,ABC,XYZ,MNO
	}

}
