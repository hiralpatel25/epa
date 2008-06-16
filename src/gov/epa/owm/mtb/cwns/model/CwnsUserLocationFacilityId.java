package gov.epa.owm.mtb.cwns.model;

// Generated Oct 31, 2007 10:35:21 AM by Hibernate Tools 3.2.0.beta8

/**
 * CwnsUserLocationFacilityId generated by hbm2java
 */
public class CwnsUserLocationFacilityId implements java.io.Serializable {

	// Fields

	private String cwnsUserId;

	private String locationTypeId;

	private String locationId;

	private long facilityId;

	// Constructors

	/** default constructor */
	public CwnsUserLocationFacilityId() {
	}

	/** full constructor */
	public CwnsUserLocationFacilityId(String cwnsUserId,
			String locationTypeId, String locationId, long facilityId) {
		this.cwnsUserId = cwnsUserId;
		this.locationTypeId = locationTypeId;
		this.locationId = locationId;
		this.facilityId = facilityId;
	}

	// Property accessors
	public String getCwnsUserId() {
		return this.cwnsUserId;
	}

	public void setCwnsUserId(String cwnsUserId) {
		this.cwnsUserId = cwnsUserId;
	}

	public String getLocationTypeId() {
		return this.locationTypeId;
	}

	public void setLocationTypeId(String locationTypeId) {
		this.locationTypeId = locationTypeId;
	}

	public String getLocationId() {
		return this.locationId;
	}

	public void setLocationId(String locationId) {
		this.locationId = locationId;
	}

	public long getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(long facilityId) {
		this.facilityId = facilityId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof CwnsUserLocationFacilityId))
			return false;
		CwnsUserLocationFacilityId castOther = (CwnsUserLocationFacilityId) other;

		return ((this.getCwnsUserId() == castOther.getCwnsUserId()) || (this
				.getCwnsUserId() != null
				&& castOther.getCwnsUserId() != null && this
				.getCwnsUserId().equals(castOther.getCwnsUserId())))
				&& ((this.getLocationTypeId() == castOther
						.getLocationTypeId()) || (this.getLocationTypeId() != null
						&& castOther.getLocationTypeId() != null && this
						.getLocationTypeId().equals(
								castOther.getLocationTypeId())))
				&& ((this.getLocationId() == castOther.getLocationId()) || (this
						.getLocationId() != null
						&& castOther.getLocationId() != null && this
						.getLocationId().equals(castOther.getLocationId())))
				&& (this.getFacilityId() == castOther.getFacilityId());
	}

	public int hashCode() {
		int result = 17;

		result = 37
				* result
				+ (getCwnsUserId() == null ? 0 : this.getCwnsUserId()
						.hashCode());
		result = 37
				* result
				+ (getLocationTypeId() == null ? 0 : this
						.getLocationTypeId().hashCode());
		result = 37
				* result
				+ (getLocationId() == null ? 0 : this.getLocationId()
						.hashCode());
		result = 37 * result + (int) this.getFacilityId();
		return result;
	}

}