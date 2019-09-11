/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Embeddable;
/*     */ 
/*     */ 
/*     */ @Embeddable
/*     */ public class VfeHttpParamsMappingAdpId
/*     */   implements Serializable
/*     */ {
/*     */   private Long workflowId;
/*     */   private Long versionId;
/*     */   private Long activityId;
/*     */   private Long currentOrder;
/*     */   private String httpParam;
/*     */   /*     */   
/*     */   public VfeHttpParamsMappingAdpId() {}
/*     */   /*     */   
/*     */   public VfeHttpParamsMappingAdpId(Long workflowId, Long versionId, Long activityId, Long currentOrder, String httpParam) {
/*  21 */     this.workflowId = workflowId;
/*  22 */     this.versionId = versionId;
/*  23 */     this.activityId = activityId;
/*  24 */     this.currentOrder = currentOrder;
/*  25 */     this.httpParam = httpParam;
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
/*     */   @Column(name = "VERSION_ID", precision = 18, scale = 0)
/*  39 */   public Long getVersionId() { return this.versionId; }
/*     */ 
/*     */ 
/*     */   
/*  43 */   public void setVersionId(Long versionId) { this.versionId = versionId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "ACTIVITY_ID", precision = 18, scale = 0)
/*  48 */   public Long getActivityId() { return this.activityId; }
/*     */ 
/*     */ 
/*     */   
/*  52 */   public void setActivityId(Long activityId) { this.activityId = activityId; }
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
/*     */   @Column(name = "HTTP_PARAM", length = 200)
/*  66 */   public String getHttpParam() { return this.httpParam; }
/*     */ 
/*     */ 
/*     */   
/*  70 */   public void setHttpParam(String httpParam) { this.httpParam = httpParam; }
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
/*  80 */     if (!(other instanceof VfeHttpParamsMappingAdpId)) {
/*  81 */       return false;
/*     */     }
/*  83 */     VfeHttpParamsMappingAdpId castOther = (VfeHttpParamsMappingAdpId)other;
/*     */     
/*  85 */     return ((getWorkflowId() == castOther.getWorkflowId() || (getWorkflowId() != null && castOther.getWorkflowId() != null && getWorkflowId().equals(castOther.getWorkflowId()))) && (getVersionId() == castOther.getVersionId() || (getVersionId() != null && castOther.getVersionId() != null && getVersionId().equals(castOther.getVersionId()))) && (getActivityId() == castOther.getActivityId() || (getActivityId() != null && castOther.getActivityId() != null && getActivityId().equals(castOther.getActivityId()))) && (getCurrentOrder() == castOther.getCurrentOrder() || (getCurrentOrder() != null && castOther.getCurrentOrder() != null && getCurrentOrder().equals(castOther.getCurrentOrder()))) && (getHttpParam() == castOther.getHttpParam() || (getHttpParam() != null && castOther.getHttpParam() != null && getHttpParam().equals(castOther.getHttpParam()))));
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
///*  99 */     result = 17;
///*     */     
///* 101 */     result = 37 * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
///* 102 */     result = 37 * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
///* 103 */     result = 37 * result + ((getActivityId() == null) ? 0 : getActivityId().hashCode());
///* 104 */     result = 37 * result + ((getCurrentOrder() == null) ? 0 : getCurrentOrder().hashCode());
///* 105 */     return 37 * result + ((getHttpParam() == null) ? 0 : getHttpParam().hashCode());
///*     */   }
/*     */ }

