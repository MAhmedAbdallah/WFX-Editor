/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.AttributeOverride;
/*    */ import javax.persistence.AttributeOverrides;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.OneToOne;
/*    */ import javax.persistence.PrimaryKeyJoinColumn;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_CMS_LOADING_EXCEPTIONS_ADP")
/*    */ @Identifier("getCoreId")
/*    */ public class VfeCmsLoadingExceptionsAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeWorkflowsAdpId id;
/*    */   private Long coreId;
/*    */   private VfeWorkflowsAdp vfeWorkflowsAdp;
/*    */   /*    */   
/*    */   public VfeCmsLoadingExceptionsAdp() {}
/*    */   /*    */   
/* 27 */   public VfeCmsLoadingExceptionsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeCmsLoadingExceptionsAdp(Long coreId, VfeWorkflowsAdp vfeWorkflowsAdp) {
/* 31 */     this.coreId = coreId;
/* 32 */     this.vfeWorkflowsAdp = vfeWorkflowsAdp;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/* 40 */   public VfeWorkflowsAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setId(VfeWorkflowsAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "CORE_ID", unique = true, precision = 18, scale = 0)
/* 49 */   public Long getCoreId() { return this.coreId; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setCoreId(Long coreId) { this.coreId = coreId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @OneToOne(fetch = FetchType.EAGER)
/*    */   @PrimaryKeyJoinColumn
/* 59 */   public VfeWorkflowsAdp getVfeWorkflowsAdp() { return this.vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 63 */   public void setVfeWorkflowsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 68 */   public String toString() { return "CoreId : " + this.coreId.toString(); }
/*    */ }


