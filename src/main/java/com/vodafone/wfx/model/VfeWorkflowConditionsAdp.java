/*     */ package com.vodafone.wfx.model;

/*     */
 /*     */ import java.io.Serializable;
/*     */ import javax.persistence.AttributeOverride;
/*     */ import javax.persistence.AttributeOverrides;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.JoinColumns;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.Table;

/*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */ @Entity
/*     */ @Table(name = "VFE_WORKFLOW_CONDITIONS_ADP")
/*     */ @Identifier("getConditionOrder,getVfeConditionsAdp.getParameterName,getVfeLkRelationTypesAdp.getDescription")
/*     */ public class VfeWorkflowConditionsAdp
        /*     */ implements Serializable /*     */ {

    /*     */ private VfeWorkflowConditionsAdpId id;
    /*     */    private VfeWorkflowStepsAdp vfeWorkflowStepsAdp;
    /*     */    private VfeConditionsAdp vfeConditionsAdp;
    /*     */    private VfeLkErrorCodesAdp vfeLkErrorCodesAdp;
    /*     */    private VfeLkRelationTypesAdp vfeLkRelationTypesAdp;
    /*     */    private Long conditionOrder;
    /*     */    private String description;
    /*     */    private Long pathId;
    /*     */    private Long negateActivityId;
    /*     */    private Long negatePathId;
    /*     */    private VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp;

    private Long activityId;

    /*     */ /*     */
 /*     */
    @Column(name = "ACTIVITY_ID")
    public Long getActivityId() {
        return activityId;
    }

    public void setActivityId(Long activityId) {
        this.activityId = activityId;
    }

    public VfeWorkflowConditionsAdp() {
    }

    /*     */ /*     */
 /*  40 */ public VfeWorkflowConditionsAdp(VfeWorkflowConditionsAdpId id) {
        this.id = id;
    }

    /*     */
 /*     */
 /*     */
 /*     */ /*     */
 /*     */
 /*     */
 /*     */
 /*     */ public VfeWorkflowConditionsAdp(VfeWorkflowConditionsAdpId id, VfeConditionsAdp vfeConditionsAdp, VfeLkErrorCodesAdp vfeLkErrorCodesAdp, VfeLkRelationTypesAdp vfeLkRelationTypesAdp, VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp) {
        /*  46 */ this.id = id;
        /*  47 */ this.vfeConditionsAdp = vfeConditionsAdp;
        /*  48 */ this.vfeLkErrorCodesAdp = vfeLkErrorCodesAdp;
        /*  49 */ this.vfeLkRelationTypesAdp = vfeLkRelationTypesAdp;
        /*  50 */ this.vfeWorkflowPreparationAdp = vfeWorkflowPreparationAdp;
        /*     */    }

    /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */ @EmbeddedId
    /*     */    @AttributeOverrides({
        @AttributeOverride(name = "conditionId", column = @Column(name = "CONDITION_ID", precision = 10, scale = 0))
        , @AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0))
        , @AttributeOverride(name = "currentOrder", column = @Column(name = "CURRENT_ORDER", precision = 12, scale = 0))
        , @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
    /*     */    @Order(1)
    /*  62 */ public VfeWorkflowConditionsAdpId getId() {
        return this.id;
    }

    /*     */
 /*     */
 /*     */
 /*  66 */ public void setId(VfeWorkflowConditionsAdpId id) {
        this.id = id;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "CONDITION_ID", insertable = false, updatable = false)
    /*     */    @Order(6)
    /*  73 */ public VfeConditionsAdp getVfeConditionsAdp() {
        return this.vfeConditionsAdp;
    }

    /*     */
 /*     */
 /*     */
 /*  77 */ public void setVfeConditionsAdp(VfeConditionsAdp vfeConditionsAdp) {
        this.vfeConditionsAdp = vfeConditionsAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "ERROR_CODE_ID", insertable = false, updatable = false)
    /*     */    @Order(5)
    /*  84 */ public VfeLkErrorCodesAdp getVfeLkErrorCodesAdp() {
        return this.vfeLkErrorCodesAdp;
    }

    /*     */
 /*     */
 /*     */
 /*  88 */ public void setVfeLkErrorCodesAdp(VfeLkErrorCodesAdp vfeLkErrorCodesAdp) {
        this.vfeLkErrorCodesAdp = vfeLkErrorCodesAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "REALTION_TYPE_ID", insertable = false, updatable = false)
    /*     */    @Order(4)
    /*  95 */ public VfeLkRelationTypesAdp getVfeLkRelationTypesAdp() {
        return this.vfeLkRelationTypesAdp;
    }

    /*     */
 /*     */
 /*     */
 /*  99 */ public void setVfeLkRelationTypesAdp(VfeLkRelationTypesAdp vfeLkRelationTypesAdp) {
        this.vfeLkRelationTypesAdp = vfeLkRelationTypesAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "PREPARATION_ID", insertable = false, updatable = false)
    /*     */    @Order(10)
    /* 106 */ public VfeWorkflowPreparationAdp getVfeWorkflowPreparationAdp() {
        return this.vfeWorkflowPreparationAdp;
    }

    /*     */
 /*     */
 /*     */
 /* 110 */ public void setVfeWorkflowPreparationAdp(VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp) {
        this.vfeWorkflowPreparationAdp = vfeWorkflowPreparationAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "CONDITION_ORDER", precision = 10, scale = 0)
    /*     */    @Order(3)
    /* 116 */ public Long getConditionOrder() {
        return this.conditionOrder;
    }

    /*     */
 /*     */
 /*     */
 /* 120 */ public void setConditionOrder(Long conditionOrder) {
        this.conditionOrder = conditionOrder;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "DESCRIPTION", length = 2000)
    /*     */    @Order(2)
    /* 126 */ public String getDescription() {
        return this.description;
    }

    /*     */
 /*     */
 /*     */
 /* 130 */ public void setDescription(String description) {
        this.description = description;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "PATH_ID", precision = 18, scale = 0)
    /*     */    @Order(7)
    /* 136 */ public Long getPathId() {
        return this.pathId;
    }

    /*     */
 /*     */
 /*     */
 /* 140 */ public void setPathId(Long pathId) {
        this.pathId = pathId;
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
 /*     */
 /*     */ @Column(name = "NEGATE_ACTIVITY_ID", precision = 18, scale = 0)
    /*     */    @Order(9)
    /* 156 */ public Long getNegateActivityId() {
        return this.negateActivityId;
    }

    /*     */
 /*     */
 /*     */
 /* 160 */ public void setNegateActivityId(Long negateActivityId) {
        this.negateActivityId = negateActivityId;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "NEGATE_PATH_ID", precision = 18, scale = 0)
    /*     */    @Order(8)
    /* 166 */ public Long getNegatePathId() {
        return this.negatePathId;
    }

    /*     */
 /*     */
 /*     */
 /* 170 */ public void setNegatePathId(Long negatePathId) {
        this.negatePathId = negatePathId;
    }

    /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */ @Ignore
    /*     */    @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumns({
        @JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", nullable = false, insertable = false, updatable = false)
        , @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID", nullable = false, insertable = false, updatable = false)
        , @JoinColumn(name = "CURRENT_ORDER", referencedColumnName = "CURRENT_ORDER", nullable = false, insertable = false, updatable = false)
        , @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", nullable = false, insertable = false, updatable = false)})
    /* 181 */ public VfeWorkflowStepsAdp getVfeWorkflowStepsAdp() {
        return this.vfeWorkflowStepsAdp;
    }

    /*     */
 /*     */
 /*     */
 /* 185 */ public void setVfeWorkflowStepsAdp(VfeWorkflowStepsAdp vfeWorkflowStepsAdp) {
        this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp;
    }
    /*     */ }
