package com.sales.SpringBootApplication.model;

import java.sql.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table
public class SalesDetails{
	
	private static final String MY_TIME_ZONE="Asia/Kolkata";

	@Column(name="ID")
	@GeneratedValue
	@Id
	private int id;
	
	@Column(name="TRANSACTION_DATE")
	@JsonFormat(timezone = MY_TIME_ZONE)
	private Timestamp transaction_date ; 
	
	@Column(name="PRODUCT")
	private String product;
	
	@Column(name="PRICE")
	private int price;
	
	@Column(name="PAMENT_TYPE")
	private String pament_type;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name="CITY")
	private String city;
	
	@Column(name="STATE")
	private String state;
	
	@Column(name="COUNTRY")
	private String country;
	
	@Column(name="ACCOUNT_CREATED")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp account_created;
	
	@Column(name="LAST_LOGIN")
	@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
	private Timestamp last_login;
	
	@Column(name="LATITUDE")
	private float latitude;

	@Column(name="LONGITUDE")
	private float longitude;

	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getTransaction_date() {
		return transaction_date;
	}

	public void setTransaction_date(Timestamp transaction_date) {
		this.transaction_date = transaction_date;
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

	public void setAccount_created(Timestamp account_created) {
		this.account_created = account_created;
	}

	public Date getLast_login() {
		return last_login;
	}

	public void setLast_login(Timestamp last_login) {
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
	
	public SalesDetails( int id,Timestamp transaction_date, String product, int price, String pament_type, String name, String city,
			String state, String country, Timestamp account_created, Timestamp last_login, float latitude, float longitude) {
		super();
		this.id=id;
		this.transaction_date = transaction_date;
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
		return "SalesDetails [id=" + id + ", transaction_date=" + transaction_date + ", product=" + product + ", price="
				+ price + ", pament_type=" + pament_type + ", name=" + name + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", account_created=" + account_created + ", last_login=" + last_login
				+ ", latitude=" + latitude + ", longitude=" + longitude + "]";
	}
	

}
