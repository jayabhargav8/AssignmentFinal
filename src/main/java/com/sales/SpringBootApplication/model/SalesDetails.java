package com.sales.SpringBootApplication.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.transaction.Transaction;

<<<<<<< HEAD
=======
import com.fasterxml.jackson.annotation.JsonFormat;

import io.swagger.annotations.ApiModelProperty;

>>>>>>> 4bd96e9... Data execute in h2 database
@Entity
@Table
public class SalesDetails {

	@Column
<<<<<<< HEAD
	private Date Transaction_date ; 
	
	@Column
	private String  product;
	
	@Column
	private int price;
	
	@Column
	private String pament_type;
	
	@Column
	private String name;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private String country;
	
	@Column
	private Date account_created;
	
	@Column
	private Date last_login;
	@Id
	@Column
	private float latitude;
	
	@Column
=======
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(notes = "Transaction_date of the Sales",name="Transaction_date",required=true,value="test Transaction_date")
	private Date Transaction_date ; 
	
	@Column
	@ApiModelProperty(notes = "product of the Sales",name="product",required=true,value="test product")
	private String  product;
	
	@Column
	@ApiModelProperty(notes = "product of the price",name="price",required=true,value="test price")
	private int price;
	
	@Column
	@ApiModelProperty(notes = "product of the pament_type",name="pament_type",required=true,value="test pament_type")
	private String pament_type;
	
	@Column
	@ApiModelProperty(notes = "product of the name",name="name",required=true,value="test name")
	private String name;
	
	@Column
	@ApiModelProperty(notes = "product of the city",name="city",required=true,value="test city")
	private String city;
	
	@Column
	@ApiModelProperty(notes = "product of the state",name="state",required=true,value="test state")
	private String state;
	
	@Column
	@ApiModelProperty(notes = "product of the country",name="country",required=true,value="test country")
	private String country;
	
	@Column
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(notes = "product of the account_created",name="account_created",required=true,value="test account_created")
	private Date account_created;
	
	@Column
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	@ApiModelProperty(notes = "product of the last_login",name="last_login",required=true,value="test last_login")
	private Date last_login;
	
	@Id
	@Column
	@ApiModelProperty(notes = "product of the latitude",name="latitude",required=true,value="test latitude")
	private float latitude;
	
	@Column
	@ApiModelProperty(notes = "product of the longitude",name="longitude",required=true,value="test longitude")
>>>>>>> 4bd96e9... Data execute in h2 database
	private float longitude;

	public Date getTransaction_date() {
		return Transaction_date;
	}

	public void setTransaction_date(Date transaction_date) {
		Transaction_date = transaction_date;
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getPament_type() {
		return pament_type;
	}

	public void setPament_type(String pament_type) {
		this.pament_type = pament_type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getAccount_created() {
		return account_created;
	}

	public void setAccount_created(Date account_created) {
		this.account_created = account_created;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}

	public float getLatitude() {
		return latitude;
	}

	public void setLatitude(float latitude) {
		this.latitude = latitude;
	}

	public float getLongitude() {
		return longitude;
	}

	public void setLongitude(float longitude) {
		this.longitude = longitude;
	}
	
	public SalesDetails()
	{
		
	}
	
	public SalesDetails(Date transaction_date, String product, int price, String pament_type, String name, String city,
			String state, String country, Date account_created, Date last_login, float latitude, float longitude) {
		super();
		Transaction_date = transaction_date;
		this.product = product;
		this.price = price;
		this.pament_type = pament_type;
		this.name = name;
		this.city = city;
		this.state = state;
		this.country = country;
		this.account_created = account_created;
		this.last_login = last_login;
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	public String toString() {
		return "Sales [Transaction_date=" + Transaction_date + ", product=" + product + ", price=" + price
				+ ", pament_type=" + pament_type + ", name=" + name + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", account_created=" + account_created + ", last_login=" + last_login
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
