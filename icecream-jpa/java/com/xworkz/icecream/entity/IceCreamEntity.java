package com.xworkz.icecream.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Data
	@Entity
	@Table(name="ICECREAM")
@NamedQueries( { @NamedQuery(name="getAll", query="select ice from IceCreamEntity ice "),
	@NamedQuery(name = "updatePriceByName", query = "Update IceCreamEntity ice set ice.price=:pr where ice.name=:nm"),
	@NamedQuery(name="deleteByName", query="delete IceCreamEntity ice where ice.name=:nm"),
	@NamedQuery(name="findByNameAndPrice",query="select ice from IceCreamEntity ice where ice.name=:nm and ice.price=:pr"),
	@NamedQuery(name="getByMaxPrice",query="select ice from IceCreamEntity ice where ice.price=(select max(ice.price) from IceCreamEntity ice)"),
	@NamedQuery(name="getByMinPrice",query="select ice from IceCreamEntity ice where ice.price=(select min(ice.price) from IceCreamEntity ice)"),
	@NamedQuery(name="getBySumPrice",query="select sum(price) from IceCreamEntity"),
	@NamedQuery(name="getNameAndFlavourByPrice",query="select ice.name from IceCreamEntity ice where ice.price=:pr")})

	public class IceCreamEntity {
		
			@Id
			@Column(name="ID")
			private int id;
			@Column(name="NAME")
			
			private String name;
			@Column(name="FLAVOUR")
			@Enumerated(EnumType.STRING)

			private Flavour flavour;
			@Column(name="COMPANY")
			
			private String company;
			@Column(name="PRICE")
			
			private double price;
			@Column(name="COLOR")
			@Enumerated(EnumType.STRING)

			private Color color;

			public enum Color{
				RED,GREEN,PURPOLE,YELLOW,BLACK,ORANGE
			}
			public enum Flavour{
				VANILLA,BUTTERSCOTCH,
			}
			public IceCreamEntity(String name, Flavour flavour, String company, double price, Color color) {
				super();
				this.name = name;
				this.flavour = flavour;
				this.company = company;
				this.price = price;
				this.color = color;
			}
			public IceCreamEntity() {
			
			}
	}

