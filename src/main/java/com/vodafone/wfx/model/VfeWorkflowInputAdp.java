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
/*    */ import javax.persistence.JoinColumns;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_WORKFLOW_INPUT_ADP")
/*    */ @Identifier("getId.getParameterName")
/*    */ public class VfeWorkflowInputAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeWorkflowInputAdpId id;
/*    */   private VfeLkBooleanAdp isList;
/*    */   private VfeWorkflowsAdp vfeWorkflowsAdp;
/*    */   private String parameterType;
/*    */   private String subFields;
/*    */   /*    */   
/*    */   public VfeWorkflowInputAdp() {}
/*    */   /*    */   
/* 30 */   public VfeWorkflowInputAdp(VfeWorkflowInputAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   /*    */ 
/*    */ 
/*    */   
/*    */   public VfeWorkflowInputAdp(VfeWorkflowInputAdpId id, VfeLkBooleanAdp isList, VfeWorkflowsAdp vfeWorkflowsAdp, String parameterType, String subFields) {
/* 35 */     this.id = id;
/* 36 */     this.isList = isList;
/* 37 */     this.vfeWorkflowsAdp = vfeWorkflowsAdp;
/* 38 */     this.parameterType = parameterType;
/* 39 */     this.subFields = subFields;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "parameterName", column = @Column(name = "PARAMETER_NAME", length = 200)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/*    */   @Order(1)
/* 49 */   public VfeWorkflowInputAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setId(VfeWorkflowInputAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumn(name = "IS_LIST")
/*    */   @Order(3)
/* 60 */   public VfeLkBooleanAdp getIsList() { return this.isList; }
/*    */ 
/*    */ 
/*    */   
/* 64 */   public void setIsList(VfeLkBooleanAdp isList) { this.isList = isList; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", insertable = false, updatable = false)})
/* 72 */   public VfeWorkflowsAdp getVfeWorkflowsAdp() { return this.vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 76 */   public void setVfeWorkflowsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PARAMETER_TYPE", length = 200)
/*    */   @Order(2)
/* 82 */   public String getParameterType() { return this.parameterType; }
/*    */ 
/*    */ 
/*    */   
/* 86 */   public void setParameterType(String parameterType) { this.parameterType = parameterType; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "SUB_FIELDS", length = 4000)
/*    */   @Order(4)
/* 92 */   public String getSubFields() { return this.subFields; }
/*    */ 
/*    */ 
/*    */   
/* 96 */   public void setSubFields(String subFields) { this.subFields = subFields; }
/*    */ }


