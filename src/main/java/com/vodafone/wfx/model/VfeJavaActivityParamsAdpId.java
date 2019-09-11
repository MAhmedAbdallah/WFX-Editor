/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Embeddable;
/*     */ 
/*     */ 
/*     */ @Embeddable
/*     */ public class VfeJavaActivityParamsAdpId
/*     */   implements Serializable
/*     */ {
/*     */   private Long workflowId;
/*     */   private Long activityId;
/*     */   private String parameterName;
/*     */   private Long currentOrder;
/*     */   private Long versionId;
/*     */   /*     */   
/*     */   public VfeJavaActivityParamsAdpId() {}
/*     */   /*     */   
/*     */   public VfeJavaActivityParamsAdpId(Long workflowId, Long activityId, String parameterName, Long currentOrder, Long versionId) {
/*  21 */     this.workflowId = workflowId;
/*  22 */     this.activityId = activityId;
/*  23 */     this.parameterName = parameterName;
/*  24 */     this.currentOrder = currentOrder;
/*  25 */     this.versionId = versionId;
/*     */   }
/*     */ 
/*     */   
/*     */   @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)
/*  30 */   public Long getWorkflowId() { return this.workflowId; }
/*     */ 
/*     */ 
/*     */   
/*  34 */   public void setWorkflowId(Long workflowId) { this.workflowId = workflowId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "ACTIVITY_ID", precision = 18, scale = 0)
/*  39 */   public Long getActivityId() { return this.activityId; }
/*     */ 
/*     */ 
/*     */   
/*  43 */   public void setActivityId(Long activityId) { this.activityId = activityId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "PARAMETER_NAME", length = 200)
/*  48 */   public String getParameterName() { return this.parameterName; }
/*     */ 
/*     */ 
/*     */   
/*  52 */   public void setParameterName(String parameterName) { this.parameterName = parameterName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "CURRENT_ORDER", precision = 12, scale = 0)
/*  57 */   public Long getCurrentOrder() { return this.currentOrder; }
/*     */ 
/*     */ 
/*     */   
/*  61 */   public void setCurrentOrder(Long currentOrder) { this.currentOrder = currentOrder; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "VERSION_ID", precision = 18, scale = 0)
/*  66 */   public Long getVersionId() { return this.versionId; }
/*     */ 
/*     */ 
/*     */   
/*  70 */   public void setVersionId(Long versionId) { this.versionId = versionId; }
/*     */ 
/*     */   /*     */ 
/*     */   
/*     */   public boolean equals(Object other) {
/*  74 */     if (this == other) {
/*  75 */       return true;
/*     */     }
/*  77 */     if (other == null) {
/*  78 */       return false;
/*     */     }
/*  80 */     if (!(other instanceof VfeJavaActivityParamsAdpId)) {
/*  81 */       return false;
/*     */     }
/*  83 */     VfeJavaActivityParamsAdpId castOther = (VfeJavaActivityParamsAdpId)other;
/*     */     
/*  85 */     return ((getWorkflowId() == castOther.getWorkflowId() || (getWorkflowId() != null && castOther.getWorkflowId() != null && getWorkflowId().equals(castOther.getWorkflowId()))) && (getActivityId() == castOther.getActivityId() || (getActivityId() != null && castOther.getActivityId() != null && getActivityId().equals(castOther.getActivityId()))) && (getParameterName() == castOther.getParameterName() || (getParameterName() != null && castOther.getParameterName() != null && getParameterName().equals(castOther.getParameterName()))) && (getCurrentOrder() == castOther.getCurrentOrder() || (getCurrentOrder() != null && castOther.getCurrentOrder() != null && getCurrentOrder().equals(castOther.getCurrentOrder()))) && (getVersionId() == castOther.getVersionId() || (getVersionId() != null && castOther.getVersionId() != null && getVersionId().equals(castOther.getVersionId()))));
/*     */   }
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
///*     */   public int hashCode() {
///* 100 */     result = 17;
///*     */     
///* 102 */     result = 37 * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
///* 103 */     result = 37 * result + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
///* 104 */     result = 37 * result + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
///* 105 */     result = 37 * result + ((getCurrentOrder() == null) ? 0 : getCurrentOrder().hashCode());
///* 106 */     return 37 * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
///*     */   }
/*     */ }


