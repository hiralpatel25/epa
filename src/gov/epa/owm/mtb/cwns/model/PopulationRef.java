package gov.epa.owm.mtb.cwns.model;

// Generated Oct 31, 2007 10:35:21 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PopulationRef generated by hbm2java
 */
public class PopulationRef implements java.io.Serializable {

	// Fields    

	private long populationId;

	private CostCurveRef costCurveRef;

	private String name;

	private char typeCode;

	private String lastUpdateUserid;

	private Date lastUpdateTs;

	private Set facilityPopulationUnits = new HashSet(0);

	private Set facilityPopulations = new HashSet(0);

	// Constructors

	/** default constructor */
	public PopulationRef() {
	}

	/** minimal constructor */
	public PopulationRef(long populationId, String name, char typeCode,
			String lastUpdateUserid, Date lastUpdateTs) {
		this.populationId = populationId;
		this.name = name;
		this.typeCode = typeCode;
		this.lastUpdateUserid = lastUpdateUserid;
		this.lastUpdateTs = lastUpdateTs;
	}

	/** full constructor */
	public PopulationRef(long populationId, CostCurveRef costCurveRef,
			String name, char typeCode, String lastUpdateUserid,
			Date lastUpdateTs, Set facilityPopulationUnits,
			Set facilityPopulations) {
		this.populationId = populationId;
		this.costCurveRef = costCurveRef;
		this.name = name;
		this.typeCode = typeCode;
		this.lastUpdateUserid = lastUpdateUserid;
		this.lastUpdateTs = lastUpdateTs;
		this.facilityPopulationUnits = facilityPopulationUnits;
		this.facilityPopulations = facilityPopulations;
	}

	// Property accessors
	public long getPopulationId() {
		return this.populationId;
	}

	public void setPopulationId(long populationId) {
		this.populationId = populationId;
	}

	public CostCurveRef getCostCurveRef() {
		return this.costCurveRef;
	}

	public void setCostCurveRef(CostCurveRef costCurveRef) {
		this.costCurveRef = costCurveRef;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getTypeCode() {
		return this.typeCode;
	}

	public void setTypeCode(char typeCode) {
		this.typeCode = typeCode;
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

	public Set getFacilityPopulationUnits() {
		return this.facilityPopulationUnits;
	}

	public void setFacilityPopulationUnits(Set facilityPopulationUnits) {
		this.facilityPopulationUnits = facilityPopulationUnits;
	}

	public Set getFacilityPopulations() {
		return this.facilityPopulations;
	}

	public void setFacilityPopulations(Set facilityPopulations) {
		this.facilityPopulations = facilityPopulations;
	}

}