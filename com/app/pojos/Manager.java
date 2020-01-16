package com.app.pojos;


import javax.persistence.*;

@Entity
@Table(name = "Manager_Tb")
public class Manager {
	private Integer managerId;
	private User user;
	private EventDesc eventDesc;
	public Manager() {
		// TODO Auto-generated constructor stub
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "manager_id")
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	@OneToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	@OneToOne(mappedBy = "mgr",cascade = CascadeType.ALL)
	public EventDesc getEventDesc() {
		return eventDesc;
	}

	public void setEventDesc(EventDesc eventDesc) {
		this.eventDesc = eventDesc;
	}

	@Override
	public String toString() {
		return "Manger [managerId=" + managerId + "]";
	}
	

}
