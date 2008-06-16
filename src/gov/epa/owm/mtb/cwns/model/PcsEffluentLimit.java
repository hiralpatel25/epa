package gov.epa.owm.mtb.cwns.model;

// Generated Oct 31, 2007 10:35:21 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * PcsEffluentLimit generated by hbm2java
 */
public class PcsEffluentLimit implements java.io.Serializable {

	// Fields    

	private PcsEffluentLimitId id;

	private PcsPipeSched pcsPipeSched;

	private Date modifPeriodStartDate;

	private Date modifPeriodEndDate;

	private String changeOfLimitStat;

	private String contestedParamInd;

	private String docketNumber;

	private Set pcsEffluentLimitConcentrs = new HashSet(0);

	private Set pcsEffluentLimitQties = new HashSet(0);

	private Set pcsDmrMeasurements = new HashSet(0);

	// Constructors

	/** default constructor */
	public PcsEffluentLimit() {
	}

	/** minimal constructor */
	public PcsEffluentLimit(PcsEffluentLimitId id, PcsPipeSched pcsPipeSched) {
		this.id = id;
		this.pcsPipeSched = pcsPipeSched;
	}

	/** full constructor */
	public PcsEffluentLimit(PcsEffluentLimitId id, PcsPipeSched pcsPipeSched,
			Date modifPeriodStartDate, Date modifPeriodEndDate,
			String changeOfLimitStat, String contestedParamInd,
			String docketNumber, Set pcsEffluentLimitConcentrs,
			Set pcsEffluentLimitQties, Set pcsDmrMeasurements) {
		this.id = id;
		this.pcsPipeSched = pcsPipeSched;
		this.modifPeriodStartDate = modifPeriodStartDate;
		this.modifPeriodEndDate = modifPeriodEndDate;
		this.changeOfLimitStat = changeOfLimitStat;
		this.contestedParamInd = contestedParamInd;
		this.docketNumber = docketNumber;
		this.pcsEffluentLimitConcentrs = pcsEffluentLimitConcentrs;
		this.pcsEffluentLimitQties = pcsEffluentLimitQties;
		this.pcsDmrMeasurements = pcsDmrMeasurements;
	}

	// Property accessors
	public PcsEffluentLimitId getId() {
		return this.id;
	}

	public void setId(PcsEffluentLimitId id) {
		this.id = id;
	}

	public PcsPipeSched getPcsPipeSched() {
		return this.pcsPipeSched;
	}

	public void setPcsPipeSched(PcsPipeSched pcsPipeSched) {
		this.pcsPipeSched = pcsPipeSched;
	}

	public Date getModifPeriodStartDate() {
		return this.modifPeriodStartDate;
	}

	public void setModifPeriodStartDate(Date modifPeriodStartDate) {
		this.modifPeriodStartDate = modifPeriodStartDate;
	}

	public Date getModifPeriodEndDate() {
		return this.modifPeriodEndDate;
	}

	public void setModifPeriodEndDate(Date modifPeriodEndDate) {
		this.modifPeriodEndDate = modifPeriodEndDate;
	}

	public String getChangeOfLimitStat() {
		return this.changeOfLimitStat;
	}

	public void setChangeOfLimitStat(String changeOfLimitStat) {
		this.changeOfLimitStat = changeOfLimitStat;
	}

	public String getContestedParamInd() {
		return this.contestedParamInd;
	}

	public void setContestedParamInd(String contestedParamInd) {
		this.contestedParamInd = contestedParamInd;
	}

	public String getDocketNumber() {
		return this.docketNumber;
	}

	public void setDocketNumber(String docketNumber) {
		this.docketNumber = docketNumber;
	}

	public Set getPcsEffluentLimitConcentrs() {
		return this.pcsEffluentLimitConcentrs;
	}

	public void setPcsEffluentLimitConcentrs(Set pcsEffluentLimitConcentrs) {
		this.pcsEffluentLimitConcentrs = pcsEffluentLimitConcentrs;
	}

	public Set getPcsEffluentLimitQties() {
		return this.pcsEffluentLimitQties;
	}

	public void setPcsEffluentLimitQties(Set pcsEffluentLimitQties) {
		this.pcsEffluentLimitQties = pcsEffluentLimitQties;
	}

	public Set getPcsDmrMeasurements() {
		return this.pcsDmrMeasurements;
	}

	public void setPcsDmrMeasurements(Set pcsDmrMeasurements) {
		this.pcsDmrMeasurements = pcsDmrMeasurements;
	}

}