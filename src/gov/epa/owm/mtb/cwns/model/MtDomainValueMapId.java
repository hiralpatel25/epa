package gov.epa.owm.mtb.cwns.model;

// Generated Oct 31, 2007 10:35:21 AM by Hibernate Tools 3.2.0.beta8

/**
 * MtDomainValueMapId generated by hbm2java
 */
public class MtDomainValueMapId implements java.io.Serializable {

	// Fields    

	private String tableId;

	private String attributeName;

	private String efCode;

	private String efDescription;

	private String cwnsCode;

	private String edrCode;

	// Constructors

	/** default constructor */
	public MtDomainValueMapId() {
	}

	/** full constructor */
	public MtDomainValueMapId(String tableId, String attributeName,
			String efCode, String efDescription, String cwnsCode, String edrCode) {
		this.tableId = tableId;
		this.attributeName = attributeName;
		this.efCode = efCode;
		this.efDescription = efDescription;
		this.cwnsCode = cwnsCode;
		this.edrCode = edrCode;
	}

	// Property accessors
	public String getTableId() {
		return this.tableId;
	}

	public void setTableId(String tableId) {
		this.tableId = tableId;
	}

	public String getAttributeName() {
		return this.attributeName;
	}

	public void setAttributeName(String attributeName) {
		this.attributeName = attributeName;
	}

	public String getEfCode() {
		return this.efCode;
	}

	public void setEfCode(String efCode) {
		this.efCode = efCode;
	}

	public String getEfDescription() {
		return this.efDescription;
	}

	public void setEfDescription(String efDescription) {
		this.efDescription = efDescription;
	}

	public String getCwnsCode() {
		return this.cwnsCode;
	}

	public void setCwnsCode(String cwnsCode) {
		this.cwnsCode = cwnsCode;
	}

	public String getEdrCode() {
		return this.edrCode;
	}

	public void setEdrCode(String edrCode) {
		this.edrCode = edrCode;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof MtDomainValueMapId))
			return false;
		MtDomainValueMapId castOther = (MtDomainValueMapId) other;

		return ((this.getTableId() == castOther.getTableId()) || (this
				.getTableId() != null
				&& castOther.getTableId() != null && this.getTableId().equals(
				castOther.getTableId())))
				&& ((this.getAttributeName() == castOther.getAttributeName()) || (this
						.getAttributeName() != null
						&& castOther.getAttributeName() != null && this
						.getAttributeName()
						.equals(castOther.getAttributeName())))
				&& ((this.getEfCode() == castOther.getEfCode()) || (this
						.getEfCode() != null
						&& castOther.getEfCode() != null && this.getEfCode()
						.equals(castOther.getEfCode())))
				&& ((this.getEfDescription() == castOther.getEfDescription()) || (this
						.getEfDescription() != null
						&& castOther.getEfDescription() != null && this
						.getEfDescription()
						.equals(castOther.getEfDescription())))
				&& ((this.getCwnsCode() == castOther.getCwnsCode()) || (this
						.getCwnsCode() != null
						&& castOther.getCwnsCode() != null && this
						.getCwnsCode().equals(castOther.getCwnsCode())))
				&& ((this.getEdrCode() == castOther.getEdrCode()) || (this
						.getEdrCode() != null
						&& castOther.getEdrCode() != null && this.getEdrCode()
						.equals(castOther.getEdrCode())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getTableId() == null ? 0 : this.getTableId().hashCode());
		result = 37
				* result
				+ (getAttributeName() == null ? 0 : this.getAttributeName()
						.hashCode());
		result = 37 * result
				+ (getEfCode() == null ? 0 : this.getEfCode().hashCode());
		result = 37
				* result
				+ (getEfDescription() == null ? 0 : this.getEfDescription()
						.hashCode());
		result = 37 * result
				+ (getCwnsCode() == null ? 0 : this.getCwnsCode().hashCode());
		result = 37 * result
				+ (getEdrCode() == null ? 0 : this.getEdrCode().hashCode());
		return result;
	}

}