package gov.epa.owm.mtb.cwns.model;

// Generated Oct 31, 2007 10:35:21 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * BoundaryRef generated by hbm2java
 */
public class BoundaryRef implements java.io.Serializable {

	// Fields    

	private long boundaryId;

	private BoundaryTypeRef boundaryTypeRef;

	private String name;

	private String lastUpdateUserid;

	private Date lastUpdateTs;

	private Set geographicAreaBoundaries = new HashSet(0);

	private Set boundaryLocationRefs = new HashSet(0);

	// Constructors

	/** default constructor */
	public BoundaryRef() {
	}

	/** minimal constructor */
	public BoundaryRef(long boundaryId, BoundaryTypeRef boundaryTypeRef,
			String name, String lastUpdateUserid, Date lastUpdateTs) {
		this.boundaryId = boundaryId;
		this.boundaryTypeRef = boundaryTypeRef;
		this.name = name;
		this.lastUpdateUserid = lastUpdateUserid;
		this.lastUpdateTs = lastUpdateTs;
	}

	/** full constructor */
	public BoundaryRef(long boundaryId, BoundaryTypeRef boundaryTypeRef,
			String name, String lastUpdateUserid, Date lastUpdateTs,
			Set geographicAreaBoundaries, Set boundaryLocationRefs) {
		this.boundaryId = boundaryId;
		this.boundaryTypeRef = boundaryTypeRef;
		this.name = name;
		this.lastUpdateUserid = lastUpdateUserid;
		this.lastUpdateTs = lastUpdateTs;
		this.geographicAreaBoundaries = geographicAreaBoundaries;
		this.boundaryLocationRefs = boundaryLocationRefs;
	}

	// Property accessors
	public long getBoundaryId() {
		return this.boundaryId;
	}

	public void setBoundaryId(long boundaryId) {
		this.boundaryId = boundaryId;
	}

	public BoundaryTypeRef getBoundaryTypeRef() {
		return this.boundaryTypeRef;
	}

	public void setBoundaryTypeRef(BoundaryTypeRef boundaryTypeRef) {
		this.boundaryTypeRef = boundaryTypeRef;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastUpdateUserid() {
		return this.lastUpdateUserid;
	}

	public void setLastUpdateUserid(String lastUpdateUserid) {
		this.lastUpdateUserid = lastUpdateUserid;
	}

	public Date getLastUpdateTs() {
		return this.lastUpdateTs;
	}

	public void setLastUpdateTs(Date lastUpdateTs) {
		this.lastUpdateTs = lastUpdateTs;
	}

	public Set getGeographicAreaBoundaries() {
		return this.geographicAreaBoundaries;
	}

	public void setGeographicAreaBoundaries(Set geographicAreaBoundaries) {
		this.geographicAreaBoundaries = geographicAreaBoundaries;
	}

	public Set getBoundaryLocationRefs() {
		return this.boundaryLocationRefs;
	}

	public void setBoundaryLocationRefs(Set boundaryLocationRefs) {
		this.boundaryLocationRefs = boundaryLocationRefs;
	}

}