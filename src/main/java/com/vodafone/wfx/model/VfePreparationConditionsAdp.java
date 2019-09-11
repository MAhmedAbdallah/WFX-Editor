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
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.Table;

/*     */
 /*     */
 /*     */
 /*     */ @Entity
/*     */ @Table(name = "VFE_PREPARATION_CONDITIONS_ADP")
/*     */ @Identifier("getVfeConditionsAdp.getConditionId")
/*     */ public class VfePreparationConditionsAdp
        /*     */ implements Serializable /*     */ {

    /*     */ private VfePreparationConditionsAdpId id;
    /*     */    private String description;
    /*     */    private Long conditionOrder;
    /*     */    private Long relationTypeId;
    /*     */    private VfeConditionsAdp vfeConditionsAdp;
    /*     */    private VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp;

                     private long preparationId;

    /*     */ /*     */
 /*     */ public VfePreparationConditionsAdp() {
    }

    /*     */ /*     */
 /*  31 */ public VfePreparationConditionsAdp(VfePreparationConditionsAdpId id) {
        this.id = id;
    }

    /*     */
 /*     */
 /*     */ /*     */
 /*     */
 /*     */
 /*     */ public VfePreparationConditionsAdp(VfePreparationConditionsAdpId id, VfeConditionsAdp vfeConditionsAdp, VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp) {
        /*  36 */ this.id = id;
        /*  37 */ this.vfeConditionsAdp = vfeConditionsAdp;
        /*  38 */ this.vfeWorkflowPreparationAdp = vfeWorkflowPreparationAdp;
        /*     */    }

    /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */
 /*     */ @EmbeddedId
    /*     */    @AttributeOverrides({
        @AttributeOverride(name = "preparationId", column = @Column(name = "PREPARATION_ID", scale = 0))
        , @AttributeOverride(name = "conditionId", column = @Column(name = "CONDITION_ID", precision = 10, scale = 0))})
    /*     */    @Order(1)
    /*  51 */ public VfePreparationConditionsAdpId getId() {
        return this.id;
    }

    /*     */
 /*     */
 /*     */
 /*  55 */ public void setId(VfePreparationConditionsAdpId id) {
        this.id = id;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "CONDITION_ID", insertable = false, updatable = false)
    /*     */    @Order(5)
    /*  62 */ public VfeConditionsAdp getVfeConditionsAdp() {
        return this.vfeConditionsAdp;
    }

    /*     */
 /*     */
 /*     */
 /*  66 */ public void setVfeConditionsAdp(VfeConditionsAdp vfeConditionsAdp) {
        this.vfeConditionsAdp = vfeConditionsAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @ManyToOne(fetch = FetchType.EAGER)
    /*     */    @JoinColumn(name = "PREPARATION_ID", insertable = false, updatable = false)
    /*  72 */ public VfeWorkflowPreparationAdp getVfeWorkflowPreparationAdp() {
        return this.vfeWorkflowPreparationAdp;
    }

    /*     */
 /*     */
 /*     */
 /*  76 */ public void setVfeWorkflowPreparationAdp(VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp) {
        this.vfeWorkflowPreparationAdp = vfeWorkflowPreparationAdp;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "DESCRIPTION", length = 2000)
    /*     */    @Order(2)
    /*  82 */ public String getDescription() {
        return this.description;
    }

    /*     */
 /*     */
 /*     */
 /*  86 */ public void setDescription(String description) {
        this.description = description;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "CONDITION_ORDER", precision = 10, scale = 0)
    /*     */    @Order(4)
    /*  92 */ public Long getConditionOrder() {
        return this.conditionOrder;
    }

    /*     */
 /*     */
 /*     */
 /*  96 */ public void setConditionOrder(Long conditionOrder) {
        this.conditionOrder = conditionOrder;
    }

    /*     */
 /*     */
 /*     */
 /*     */ @Column(name = "RELATION_TYPE_ID", precision = 18, scale = 0)
    /*     */    @Order(6)
    /* 102 */ public Long getRelationTypeId() {
        return this.relationTypeId;
    }

    /*     */
 /*     */
 /*     */
 /* 106 */ public void setRelationTypeId(Long relationTypeId) {
        this.relationTypeId = relationTypeId;
    }
    /*     */ 
    @Column(name = "PREPARATION_ID",insertable = false , updatable = false)
    public long getPreparationId() {
        return preparationId;
    }

    public void setPreparationId(long preparationId) {
        this.preparationId = preparationId;
    }
 
 
 
 
 
 
 }
