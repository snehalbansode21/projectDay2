package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "User_Tb")
public class User 
{
	private Integer userId;
	private String name;
	private String email;
	private String password;
	private String confirmPassword;
	private UserRole role;
	private String mobNo;
	private Address addr;
	private List<Feedback> feedBackList = new ArrayList<>();
	private List<Event> eventList = new ArrayList<>();
	private Manager mgr;
	private List<Report> reportList = new ArrayList<>();
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	
	public User(String name, String email, String password, String confirmPassword, UserRole role, String mobNo) 
	{
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.confirmPassword = confirmPassword;
		this.role = role;
		this.mobNo = mobNo;	
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	@Column(length = 30, name = "u_name")
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(length = 30, name = "u_email", unique = true)
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
    
	@Column(length = 30, name = "u_password", nullable = false)
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
    @Transient
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	@Enumerated(EnumType.STRING)
	@Column(length = 30, name = "u_role")
	public UserRole getRole() {
		return role;
	}

	public void setRole(UserRole role) {
		this.role = role;
	}

	@Column(length = 30, name = "u_mobNo")
	public String getMobNo() {
		return mobNo;
	}

	public void setMobNo(String mobNo) {
		this.mobNo = mobNo;
	}
	@OneToOne
	@JoinColumn(name = "address_id")
	public Address getAddr() {
		return addr;
	}

	public void setAddr(Address addr) {
		this.addr = addr;
	}
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	public List<Feedback> getFeedBackList() {
		return feedBackList;
	}

	public void setFeedBackList(List<Feedback> feedBackList) {
		this.feedBackList = feedBackList;
	}
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	public List<Event> getEventList() {
		return eventList;
	}

	public void setEventList(List<Event> eventList) {
		this.eventList = eventList;
	}
	@OneToOne(mappedBy = "user",cascade = CascadeType.ALL)
	public Manager getMgr() {
		return mgr;
	}

	public void setMgr(Manager mgr) {
		this.mgr = mgr;
	}
	@OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
	public List<Report> getReportList() {
		return reportList;
	}

	public void setReportList(List<Report> reportList) {
		this.reportList = reportList;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", email=" + email + ", password=" + password
				+ ", confirmPassword=" + confirmPassword + ", role=" + role + ", mobNo=" + mobNo + ", addr=" + addr
				+ "]";
	}

	
	
}
