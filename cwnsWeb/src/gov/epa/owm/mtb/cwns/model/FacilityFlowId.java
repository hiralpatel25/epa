package gov.epa.owm.mtb.cwns.model;

// Generated Oct 31, 2007 10:35:21 AM by Hibernate Tools 3.2.0.beta8

/**
 * FacilityFlowId generated by hbm2java
 */
public class FacilityFlowId implements java.io.Serializable {

	// Fields

	private long facilityId;

	private long flowTypeId;

	// Constructors

	/** default constructor */
	public FacilityFlowId() {
	}

	/** full constructor */
	public FacilityFlowId(long facilityId, long flowTypeId) {
		this.facilityId = facilityId;
		this.flowTypeId = flowTypeId;
	}

	// Property accessors
	public long getFacilityId() {
		return this.facilityId;
	}

	public void setFacilityId(long facilityId) {
		this.facilityId = facilityId;
	}

	public long getFlowTypeId() {
		return this.flowTypeId;
	}

	public void setFlowTypeId(long flowTypeId) {
		this.flowTypeId = flowTypeId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof FacilityFlowId))
			return false;
		FacilityFlowId castOther = (FacilityFlowId) other;

		return (this.getFacilityId() == castOther.getFacilityId())
				&& (this.getFlowTypeId() == castOther.getFlowTypeId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getFacilityId();
		result = 37 * result + (int) this.getFlowTypeId();
		return result;
	}

}