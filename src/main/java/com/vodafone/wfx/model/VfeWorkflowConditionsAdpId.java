/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Embeddable;
/*     */ 
/*     */ 
/*     */ 
/*     */ @Embeddable
/*     */ public class VfeWorkflowConditionsAdpId
/*     */   implements Serializable
/*     */ {
/*     */   private Long conditionId;
/*     */   private Long workflowId;
/*     */   private Long currentOrder;
/*     */   private Long versionId;
/*     */   /*     */   
/*     */   public VfeWorkflowConditionsAdpId() {}
/*     */   /*     */   
/*     */   public VfeWorkflowConditionsAdpId(Long conditionId, Long versionId, Long workflowId, Long currentOrder) {
/*  21 */     this.conditionId = conditionId;
/*  22 */     this.workflowId = workflowId;
/*     */     
/*  24 */     this.currentOrder = currentOrder;
/*  25 */     this.versionId = versionId;
/*     */   }
/*     */ 
/*     */   
/*     */   @Column(name = "CONDITION_ID", precision = 10, scale = 0)
/*  30 */   public Long getConditionId() { return this.conditionId; }
/*     */ 
/*     */ 
/*     */   
/*  34 */   public void setConditionId(Long conditionId) { this.conditionId = conditionId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)
/*  39 */   public Long getWorkflowId() { return this.workflowId; }
/*     */ 
/*     */ 
/*     */   
/*  43 */   public void setWorkflowId(Long workflowId) { this.workflowId = workflowId; }
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
/*  80 */     if (!(other instanceof VfeWorkflowConditionsAdpId)) {
/*  81 */       return false;
/*     */     }
/*  83 */     VfeWorkflowConditionsAdpId castOther = (VfeWorkflowConditionsAdpId)other;
/*     */     
/*  85 */     return ((getConditionId() == castOther.getConditionId() || (getConditionId() != null && castOther.getConditionId() != null && getConditionId().equals(castOther.getConditionId()))) && (getWorkflowId() == castOther.getWorkflowId() || (getWorkflowId() != null && castOther.getWorkflowId() != null && getWorkflowId().equals(castOther.getWorkflowId()))) && (getCurrentOrder() == castOther.getCurrentOrder() || (getCurrentOrder() != null && castOther.getCurrentOrder() != null && getCurrentOrder().equals(castOther.getCurrentOrder()))) && (getVersionId() == castOther.getVersionId() || (getVersionId() != null && castOther.getVersionId() != null && getVersionId().equals(castOther.getVersionId()))));
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
///* 101 */     result = 37 * result + ((getConditionId() == null) ? 0 : getConditionId().hashCode());
///* 102 */     result = 37 * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
///*     */     
///* 104 */     result = 37 * result + ((getCurrentOrder() == null) ? 0 : getCurrentOrder().hashCode());
///* 105 */     return 37 * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
///*     */   }
/*     */ }

