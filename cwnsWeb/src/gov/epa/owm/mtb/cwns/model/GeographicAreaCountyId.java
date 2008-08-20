package gov.epa.owm.mtb.cwns.model;

// Generated Oct 31, 2007 10:35:21 AM by Hibernate Tools 3.2.0.beta8

/**
 * GeographicAreaCountyId generated by hbm2java
 */
public class GeographicAreaCountyId implements java.io.Serializable {

	// Fields

	private long geographicAreaId;

	private long countyId;

	// Constructors

	/** default constructor */
	public GeographicAreaCountyId() {
	}

	/** full constructor */
	public GeographicAreaCountyId(long geographicAreaId, long countyId) {
		this.geographicAreaId = geographicAreaId;
		this.countyId = countyId;
	}

	// Property accessors
	public long getGeographicAreaId() {
		return this.geographicAreaId;
	}

	public void setGeographicAreaId(long geographicAreaId) {
		this.geographicAreaId = geographicAreaId;
	}

	public long getCountyId() {
		return this.countyId;
	}

	public void setCountyId(long countyId) {
		this.countyId = countyId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof GeographicAreaCountyId))
			return false;
		GeographicAreaCountyId castOther = (GeographicAreaCountyId) other;

		return (this.getGeographicAreaId() == castOther
				.getGeographicAreaId())
				&& (this.getCountyId() == castOther.getCountyId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + (int) this.getGeographicAreaId();
		result = 37 * result + (int) this.getCountyId();
		return result;
	}

}