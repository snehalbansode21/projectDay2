package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "Report_Tb")
public class Report 
{
	private Integer reportId;
	private Event event;
	private User user;
	public Report() {
		// TODO Auto-generated constructor stub
	}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "report_id")
	public Integer getReportId() {
		return reportId;
	}
	public void setReportId(Integer reportId) {
		this.reportId = reportId;
	}
	@OneToOne
	@JoinColumn(name = "event_id")
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	@ManyToOne
	@JoinColumn(name = "user_id")
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	@Override
	public String toString() {
		return "Report [reportId=" + reportId + "]";
	}
	

}
