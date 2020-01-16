package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "Address_Tb")
public class Address {
	private Integer addressId;
	private String city;
	private String state;
	private String pinCode;
	private User user;
	
	public Address() 
	{
		// TODO Auto-generated constructor stub
	}
	public Address(String city, String state, String pinCode) {
		super();
		this.city = city;
		this.state = state;
		this.pinCode = pinCode;
	}
		
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
    public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	@Column(length = 30)
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	 @Column(length = 30)
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	  @Column(length = 30)
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	@OneToOne(mappedBy = "addr",cascade = CascadeType.ALL)
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", state=" + state + ", pinCode=" + pinCode
				+ ", user=" + user + "]";
	}
	
	
	
	

}
