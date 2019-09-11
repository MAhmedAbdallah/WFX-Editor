/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Embeddable;
/*     */ 
/*     */ 
/*     */ @Embeddable
/*     */ public class VfeWorkflowStepsAdpId
/*     */   implements Serializable
/*     */ {
/*     */   private Long workflowId;
/*     */   private Long activityId;
/*     */   private Long currentOrder;
/*     */   private Long versionId;
/*     */   /*     */   
/*     */   public VfeWorkflowStepsAdpId() {}
/*     */   /*     */   
/*     */   public VfeWorkflowStepsAdpId(Long workflowId, Long activityId, Long currentOrder, Long versionId) {
/*  20 */     this.workflowId = workflowId;
/*     */     
/*  22 */     this.activityId = activityId;
/*  23 */     this.currentOrder = currentOrder;
/*  24 */     this.versionId = versionId;
/*     */   }
/*     */ 
/*     */   
/*     */   @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)
/*  29 */   public Long getWorkflowId() { return this.workflowId; }
/*     */ 
/*     */ 
/*     */   
/*  33 */   public void setWorkflowId(Long workflowId) { this.workflowId = workflowId; }
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
/*     */   @Column(name = "ACTIVITY_ID", precision = 18, scale = 0)
/*  47 */   public Long getActivityId() { return this.activityId; }
/*     */ 
/*     */ 
/*     */   
/*  51 */   public void setActivityId(Long activityId) { this.activityId = activityId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "CURRENT_ORDER", precision = 12, scale = 0)
/*  56 */   public Long getCurrentOrder() { return this.currentOrder; }
/*     */ 
/*     */ 
/*     */   
/*  60 */   public void setCurrentOrder(Long currentOrder) { this.currentOrder = currentOrder; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "VERSION_ID", precision = 18, scale = 0)
/*  65 */   public Long getVersionId() { return this.versionId; }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public void setVersionId(Long versionId) { this.versionId = versionId; }
/*     */ 
/*     */   /*     */ 
/*     */   
/*     */   public boolean equals(Object other) {
/*  73 */     if (this == other) {
/*  74 */       return true;
/*     */     }
/*  76 */     if (other == null) {
/*  77 */       return false;
/*     */     }
/*  79 */     if (!(other instanceof VfeWorkflowStepsAdpId)) {
/*  80 */       return false;
/*     */     }
/*  82 */     VfeWorkflowStepsAdpId castOther = (VfeWorkflowStepsAdpId)other;
/*     */     
/*  84 */     return ((getWorkflowId() == castOther.getWorkflowId() || (getWorkflowId() != null && castOther.getWorkflowId() != null && getWorkflowId().equals(castOther.getWorkflowId()))) && (getActivityId() == castOther.getActivityId() || (getActivityId() != null && castOther.getActivityId() != null && getActivityId().equals(castOther.getActivityId()))) && (getCurrentOrder() == castOther.getCurrentOrder() || (getCurrentOrder() != null && castOther.getCurrentOrder() != null && getCurrentOrder().equals(castOther.getCurrentOrder()))) && (getVersionId() == castOther.getVersionId() || (getVersionId() != null && castOther.getVersionId() != null && getVersionId().equals(castOther.getVersionId()))));
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
///*     */   public int hashCode() {
///*  98 */     result = 17;
///*     */     
///* 100 */     result = 37 * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
///*     */     
///* 102 */     result = 37 * result + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
///* 103 */     result = 37 * result + ((getCurrentOrder() == null) ? 0 : getCurrentOrder().hashCode());
///* 104 */     return 37 * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
///*     */   }
/*     */ }

