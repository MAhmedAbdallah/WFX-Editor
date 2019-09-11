/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.AttributeOverride;
/*    */ import javax.persistence.AttributeOverrides;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_PREPARATION_PARAMETERS_ADP")
/*    */ @Identifier("getId.getParameterName")
/*    */ public class VfePreparationParametersAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfePreparationParametersAdpId id;
/*    */   private VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp;
/*    */   private String parameterValue;
/*    */   /*    */   
/*    */   public VfePreparationParametersAdp() {}
/*    */   /*    */   
/* 27 */   public VfePreparationParametersAdp(VfePreparationParametersAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   /*    */ 
/*    */ 
/*    */   
/*    */   public VfePreparationParametersAdp(VfePreparationParametersAdpId id, VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp, String parameterValue) {
/* 32 */     this.id = id;
/* 33 */     this.vfeWorkflowPreparationAdp = vfeWorkflowPreparationAdp;
/* 34 */     this.parameterValue = parameterValue;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "preparationId", column = @Column(name = "PREPARATION_ID", scale = 0)), @AttributeOverride(name = "parameterName", column = @Column(name = "PARAMETER_NAME", length = 200))})
/*    */   @Order(1)
/* 43 */   public VfePreparationParametersAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 47 */   public void setId(VfePreparationParametersAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumn(name = "PREPARATION_ID", insertable = false, updatable = false)
/* 53 */   public VfeWorkflowPreparationAdp getVfeWorkflowPreparationAdp() { return this.vfeWorkflowPreparationAdp; }
/*    */ 
/*    */ 
/*    */   
/* 57 */   public void setVfeWorkflowPreparationAdp(VfeWorkflowPreparationAdp vfeWorkflowPreparationAdp) { this.vfeWorkflowPreparationAdp = vfeWorkflowPreparationAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PARAMETER_VALUE", length = 4000)
/*    */   @Order(2)
/* 63 */   public String getParameterValue() { return this.parameterValue; }
/*    */ 
/*    */ 
/*    */   
/* 67 */   public void setParameterValue(String parameterValue) { this.parameterValue = parameterValue; }
/*    */ }


