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
/*    */ @Table(name = "VFE_WORKFLOW_OUTPUT_ADP")
/*    */ @Identifier("getId.getParameterName")
/*    */ public class VfeWorkflowOutputAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeWorkflowOutputAdpId id;
/*    */   private VfeWorkflowsAdp vfeWorkflowsAdp;
/*    */   /*    */   
/*    */   public VfeWorkflowOutputAdp() {}
/*    */   /*    */   
/* 27 */   public VfeWorkflowOutputAdp(VfeWorkflowOutputAdpId id) { this.id = id; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeWorkflowOutputAdp(VfeWorkflowOutputAdpId id, VfeWorkflowsAdp vfeWorkflowsAdp) {
/* 31 */     this.id = id;
/* 32 */     this.vfeWorkflowsAdp = vfeWorkflowsAdp;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "parameterName", column = @Column(name = "PARAMETER_NAME", length = 200)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/*    */   @Order(1)
/* 42 */   public VfeWorkflowOutputAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 46 */   public void setId(VfeWorkflowOutputAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", insertable = false, updatable = false)})
/* 54 */   public VfeWorkflowsAdp getVfeWorkflowsAdp() { return this.vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 58 */   public void setVfeWorkflowsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ }


