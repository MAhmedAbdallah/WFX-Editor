/*     */ package com.vodafone.wfx.model;

/*     */
 /*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.JoinColumns;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;

/*     */
 /*     */ @Entity
/*     */ @Table(name = "VFE_WORKFLOW_PREPARATION_ADP")
/*     */ @Identifier("getPreparationOrder,getParameterName")
/*     */ public class VfeWorkflowPreparationAdp
        /*     */ implements Serializable {

    /*     */    private long preparationId;
    /*     */    private VfeLkPreparationTypesAdp vfeLkPreparationTypesAdp;
    /*     */    private VfeLkBooleanAdp saveToPool;
    /*     */    private VfeLkErrorCodesAdp vfeLkErrorCodesAdp;
    /*     */    private VfeWorkflowRollbackAdp vfeWorkflowRollbackAdp;
    /*     */    private VfePreparationModeAdp vfePreparationModeAdp;
    /*     */    private VfeWorkflowStepsAdp vfeWorkflowStepsAdp;
    /*     */    private String parameterName;
    /*     */    private Long preparationOrder;
    /*     */    private String description;
    /*     */    private VfeLkDbAdp dbId;
    /*     */    private VfeLkBooleanAdp doCommit;
    /*     */    private BigDecimal queryTimeout;
    /*  35 */    private Set<VfePreparationConditionsAdp> vfePreparationConditionsAdps = new HashSet();
    /*  36 */    private Set<VfePreparationParametersAdp> vfePreparationParametersAdps = new HashSet();
                 
    
    
    private long activityId;

    /*     */
 /*     */ /*     */
 /*     */
 /*     */ public VfeWorkflowPreparationAdp() {
    }

    /*     */
 /*     */ /*     */
 /*     */
 /*  42 */ public VfeWorkflowPreparationAdp(long preparationId) {
        this.preparationId = preparationId;
    }

    /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */ /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */ public VfeWorkflowPreparationAdp(long preparationId, VfeLkPreparationTypesAdp vfeLkPreparationTypesAdp, VfeLkBooleanAdp saveToPool, VfeLkErrorCodesAdp vfeLkErrorCodesAdp, VfeWorkflowRollbackAdp vfeWorkflowRollbackAdp, VfePreparationModeAdp vfePreparationModeAdp, String parameterName, Long preparationOrder, Long workflowId, Long activityId, Long currentOrder, String description, Long versionId, VfeLkDbAdp dbId, VfeLkBooleanAdp doCommit, BigDecimal queryTimeout, Set<VfePreparationConditionsAdp> vfePreparationConditionsAdps, Set<VfePreparationParametersAdp> vfePreparationParametersAdps) {
        /*  53 */ this.preparationId = preparationId;
        /*  54 */ this.vfeLkPreparationTypesAdp = vfeLkPreparationTypesAdp;
        /*  55 */ this.saveToPool = saveToPool;
        /*  56 */ this.vfeLkErrorCodesAdp = vfeLkErrorCodesAdp;
        /*  57 */ this.vfeWorkflowRollbackAdp = vfeWorkflowRollbackAdp;
        /*  58 */ this.vfePreparationModeAdp = vfePreparationModeAdp;
        /*  59 */ this.parameterName = parameterName;
        /*  60 */ this.preparationOrder = preparationOrder;
        /*  61 */ this.description = description;
        /*  62 */ this.dbId = dbId;
        /*  63 */ this.doCommit = doCommit;
        /*  64 */ this.queryTimeout = queryTimeout;
        /*  65 */ this.vfePreparationConditionsAdps = vfePreparationConditionsAdps;
        /*     */
 /*  67 */ this.vfePreparationParametersAdps = vfePreparationParametersAdps;
        /*     */    }

    /*     */
 /*     */
 /*     */ @Id
    /*     */    @Column(name = "PREPARATION_ID", unique = true, scale = 0)
    /*     */    @Order(1)
    /*  74 */ public long getPreparationId() {
        return this.preparationId;
    }

    /*     */
 /*     */
 /*     */
 /*  78 */ public void setPreparationId(long preparationId) {
        this.preparationId = preparationId;
    }

    /*     */
    @Column(name = "ACTIVITY_ID" , insertable = false  , updatable = false)

    public long getActivityId() {
        return this.activityId;
    }

    /*     */
 /*     */
 /*     */
 /*  78 */ public void setActivityId(long activityId) {
        this.activityId = activityId;
    }

    /*     */

 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "PREPARATION_TYPE_ID")
    /*     */    @Order(4)
    /*  85 */ public VfeLkPreparationTypesAdp getVfeLkPreparationTypesAdp() {
        return this.vfeLkPreparationTypesAdp;
    }

    /*     */
 /*     */
 /*     */
 /*  89 */ public void setVfeLkPreparationTypesAdp(VfeLkPreparationTypesAdp vfeLkPreparationTypesAdp) {
        this.vfeLkPreparationTypesAdp = vfeLkPreparationTypesAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "SAVE_TO_POOL")
    /*     */    @Order(7)
    /*  96 */ public VfeLkBooleanAdp getSaveToPool() {
        return this.saveToPool;
    }

    /*     */
 /*     */
 /*     */
 /* 100 */ public void setSaveToPool(VfeLkBooleanAdp saveToPool) {
        this.saveToPool = saveToPool;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "ERROR_CODE_ID")
    /*     */    @Order(8)
    /* 107 */ public VfeLkErrorCodesAdp getVfeLkErrorCodesAdp() {
        return this.vfeLkErrorCodesAdp;
    }

    /*     */
 /*     */
 /*     */
 /* 111 */ public void setVfeLkErrorCodesAdp(VfeLkErrorCodesAdp vfeLkErrorCodesAdp) {
        this.vfeLkErrorCodesAdp = vfeLkErrorCodesAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "ROLLBACK_ID")
    /*     */    @Order(14)
    /* 118 */ public VfeWorkflowRollbackAdp getVfeWorkflowRollbackAdp() {
        return this.vfeWorkflowRollbackAdp;
    }

    /*     */
 /*     */
 /*     */
 /* 122 */ public void setVfeWorkflowRollbackAdp(VfeWorkflowRollbackAdp vfeWorkflowRollbackAdp) {
        this.vfeWorkflowRollbackAdp = vfeWorkflowRollbackAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "PREPARATION_MODE_ID")
    /*     */    @Order(5)
    /* 129 */ public VfePreparationModeAdp getVfePreparationModeAdp() {
        return this.vfePreparationModeAdp;
    }

    /*     */
 /*     */
 /*     */
 /* 133 */ public void setVfePreparationModeAdp(VfePreparationModeAdp vfePreparationModeAdp) {
        this.vfePreparationModeAdp = vfePreparationModeAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "PARAMETER_NAME", length = 200)
    /*     */    @Order(6)
    /* 139 */ public String getParameterName() {
        return this.parameterName;
    }

    /*     */
 /*     */
 /*     */
 /* 143 */ public void setParameterName(String parameterName) {
        this.parameterName = parameterName;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "PREPARATION_ORDER", precision = 2, scale = 0)
    /*     */    @Order(3)
    /* 149 */ public Long getPreparationOrder() {
        return this.preparationOrder;
    }

    /*     */
 /*     */
 /*     */
 /* 153 */ public void setPreparationOrder(Long preparationOrder) {
        this.preparationOrder = preparationOrder;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "DESCRIPTION", length = 2000)
    /*     */    @Order(2)
    /* 159 */ public String getDescription() {
        return this.description;
    }

    /*     */
 /*     */
 /*     */
 /* 163 */ public void setDescription(String description) {
        this.description = description;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "DB_ID")
    /*     */    @Order(9)
    /* 170 */ public VfeLkDbAdp getDbId() {
        return this.dbId;
    }

    /*     */
 /*     */
 /*     */
 /* 174 */ public void setDbId(VfeLkDbAdp dbId) {
        this.dbId = dbId;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "DO_COMMIT")
    /*     */    @Order(10)
    /* 181 */ public VfeLkBooleanAdp getDoCommit() {
        return this.doCommit;
    }

    /*     */
 /*     */
 /*     */
 /* 185 */ public void setDoCommit(VfeLkBooleanAdp doCommit) {
        this.doCommit = doCommit;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "QUERY_TIMEOUT", precision = 22, scale = 0)
    /*     */    @Order(11)
    /* 191 */ public BigDecimal getQueryTimeout() {
        return this.queryTimeout;
    }

    /*     */
 /*     */
 /*     */
 /* 195 */ public void setQueryTimeout(BigDecimal queryTimeout) {
        this.queryTimeout = queryTimeout;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowPreparationAdp")
    /*     */    @Order(12)
    /* 201 */ public Set<VfePreparationConditionsAdp> getVfePreparationConditionsAdps() {
        return this.vfePreparationConditionsAdps;
    }

    /*     */
 /*     */
 /*     */
 /* 205 */ public void setVfePreparationConditionsAdps(Set<VfePreparationConditionsAdp> vfePreparationConditionsAdps) {
        this.vfePreparationConditionsAdps = vfePreparationConditionsAdps;
    }

    /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */ @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowPreparationAdp")
    /*     */    @Order(13)
    /* 220 */ public Set<VfePreparationParametersAdp> getVfePreparationParametersAdps() {
        return this.vfePreparationParametersAdps;
    }

    /*     */
 /*     */
 /*     */
 /* 224 */ public void setVfePreparationParametersAdps(Set<VfePreparationParametersAdp> vfePreparationParametersAdps) {
        this.vfePreparationParametersAdps = vfePreparationParametersAdps;
    }

    /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumns({
        @JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID")
        , @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID")
        , @JoinColumn(name = "CURRENT_ORDER", referencedColumnName = "CURRENT_ORDER")
        , @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID")})
    /* 234 */ public VfeWorkflowStepsAdp getVfeWorkflowStepsAdp() {
        return this.vfeWorkflowStepsAdp;
    }

    /*     */
 /*     */
 /*     */
 /* 238 */ public void setVfeWorkflowStepsAdp(VfeWorkflowStepsAdp vfeWorkflowStepsAdp) {
        this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp;
    }
    /*     */ }
