/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.JoinColumns;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_ACTIVITY_ERRORS_ADP")
/*    */ @Identifier("getErrorCode")
/*    */ public class VfeActivityErrorsAdp
/*    */   implements Serializable
/*    */ {
/*    */   private String errorCode;
/*    */   private VfeWorkflowStepsAdp vfeWorkflowStepsAdp;
/*    */   /*    */   
/*    */   public VfeActivityErrorsAdp() {}
/*    */   /*    */   
/* 25 */   public VfeActivityErrorsAdp(String errorCode) { this.errorCode = errorCode; }
/*    */ 
/*    */ 
/*    */   /*    */ 
/*    */ 
/*    */   
/* 29 */   public VfeActivityErrorsAdp(String errorCode, Long currentOrder, Long activityId, Long workflowId, Long versionId) { this.errorCode = errorCode; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ERROR_CODE", unique = true, length = 200)
/* 35 */   public String getErrorCode() { return this.errorCode; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public void setErrorCode(String errorCode) { this.errorCode = errorCode; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "CURRENT_ORDER", referencedColumnName = "CURRENT_ORDER", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", nullable = false, insertable = false, updatable = false)})
/* 49 */   public VfeWorkflowStepsAdp getVfeWorkflowStepsAdp() { return this.vfeWorkflowStepsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setVfeWorkflowStepsAdp(VfeWorkflowStepsAdp vfeWorkflowStepsAdp) { this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp; }
/*    */ }

