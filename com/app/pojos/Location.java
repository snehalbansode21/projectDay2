package com.app.pojos;

import javax.persistence.*;

@Entity
@Table(name = "Location_Tb")
public class Location 
{
	private Integer locationId;
	private String locationName;
	private double locationCost;
	private byte locationImage;
	private Event event;
	private VenueCity venueCity;
	public Location() {
		// TODO Auto-generated constructor stub
	}
	
	public Location(String locationName, double locationCost, byte locationImage) {
		super();
		this.locationName = locationName;
		this.locationCost = locationCost;
		this.locationImage = locationImage;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id")
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}
	@Column(length = 50,name = "location_name")
	public String getLocationName() {
		return locationName;
	}
	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}
	
	public double getLocationCost() {
		return locationCost;
	}
	public void setLocationCost(double locationCost) {
		this.locationCost = locationCost;
	}
	@Lob
	public byte getLocationImage() {
		return locationImage;
	}
	public void setLocationImage(byte locationImage) {
		this.locationImage = locationImage;
	}
	@OneToOne(mappedBy = "loc",cascade = CascadeType.ALL)
	public Event getEvent() {
		return event;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
	@ManyToOne
	@JoinColumn(name = "venueCity_id")
	public VenueCity getVenueCity() {
		return venueCity;
	}
	public void setVenueCity(VenueCity venueCity) {
		this.venueCity = venueCity;
	}
	@Override
	public String toString() {
		return "Location [locationId=" + locationId + ", locationName=" + locationName + "]";
	}
	
}
