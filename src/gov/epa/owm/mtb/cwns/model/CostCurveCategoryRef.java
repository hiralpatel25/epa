package gov.epa.owm.mtb.cwns.model;

// Generated Oct 31, 2007 10:35:21 AM by Hibernate Tools 3.2.0.beta8

import java.util.Date;

/**
 * CostCurveCategoryRef generated by hbm2java
 */
public class CostCurveCategoryRef implements java.io.Serializable {

	// Fields    

	private CostCurveCategoryRefId id;

	private CategoryRef categoryRef;

	private CostCurveRef costCurveRef;

	private char allowDocumentCostFlag;

	private String lastUpdateUserid;

	private Date lastUpdateTs;

	// Constructors

	/** default constructor */
	public CostCurveCategoryRef() {
	}

	/** full constructor */
	public CostCurveCategoryRef(CostCurveCategoryRefId id,
			CategoryRef categoryRef, CostCurveRef costCurveRef,
			char allowDocumentCostFlag, String lastUpdateUserid,
			Date lastUpdateTs) {
		this.id = id;
		this.categoryRef = categoryRef;
		this.costCurveRef = costCurveRef;
		this.allowDocumentCostFlag = allowDocumentCostFlag;
		this.lastUpdateUserid = lastUpdateUserid;
		this.lastUpdateTs = lastUpdateTs;
	}

	// Property accessors
	public CostCurveCategoryRefId getId() {
		return this.id;
	}

	public void setId(CostCurveCategoryRefId id) {
		this.id = id;
	}

	public CategoryRef getCategoryRef() {
		return this.categoryRef;
	}

	public void setCategoryRef(CategoryRef categoryRef) {
		this.categoryRef = categoryRef;
	}

	public CostCurveRef getCostCurveRef() {
		return this.costCurveRef;
	}

	public void setCostCurveRef(CostCurveRef costCurveRef) {
		this.costCurveRef = costCurveRef;
	}

	public char getAllowDocumentCostFlag() {
		return this.allowDocumentCostFlag;
	}

	public void setAllowDocumentCostFlag(char allowDocumentCostFlag) {
		this.allowDocumentCostFlag = allowDocumentCostFlag;
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

}