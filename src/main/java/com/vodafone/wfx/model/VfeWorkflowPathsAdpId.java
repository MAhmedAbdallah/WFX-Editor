/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Embeddable;
/*     */ 
/*     */ 
/*     */ @Embeddable
/*     */ public class VfeWorkflowPathsAdpId
/*     */   implements Serializable
/*     */ {
/*     */   private Long pathId;
/*     */   private Long workflowId;
/*     */   private Long versionId;
/*     */   private Long currentOrder;
/*     */   /*     */   
/*     */   public VfeWorkflowPathsAdpId() {}
/*     */   /*     */   
/*     */   public VfeWorkflowPathsAdpId(Long pathId, Long workflowId, Long versionId, Long currentOrder) {
/*  20 */     this.pathId = pathId;
/*  21 */     this.workflowId = workflowId;
/*  22 */     this.versionId = versionId;
/*     */     
/*  24 */     this.currentOrder = currentOrder;
/*     */   }
/*     */ 
/*     */   
/*     */   @Column(name = "PATH_ID", precision = 10, scale = 0)
/*  29 */   public Long getPathId() { return this.pathId; }
/*     */ 
/*     */ 
/*     */   
/*  33 */   public void setPathId(Long pathId) { this.pathId = pathId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)
/*  38 */   public Long getWorkflowId() { return this.workflowId; }
/*     */ 
/*     */ 
/*     */   
/*  42 */   public void setWorkflowId(Long workflowId) { this.workflowId = workflowId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "VERSION_ID", precision = 18, scale = 0)
/*  47 */   public Long getVersionId() { return this.versionId; }
/*     */ 
/*     */ 
/*     */   
/*  51 */   public void setVersionId(Long versionId) { this.versionId = versionId; }
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
/*  65 */   public Long getCurrentOrder() { return this.currentOrder; }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public void setCurrentOrder(Long currentOrder) { this.currentOrder = currentOrder; }
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
/*  79 */     if (!(other instanceof VfeWorkflowPathsAdpId)) {
/*  80 */       return false;
/*     */     }
/*  82 */     VfeWorkflowPathsAdpId castOther = (VfeWorkflowPathsAdpId)other;
/*     */     
/*  84 */     return ((getPathId() == castOther.getPathId() || (getPathId() != null && castOther.getPathId() != null && getPathId().equals(castOther.getPathId()))) && (getWorkflowId() == castOther.getWorkflowId() || (getWorkflowId() != null && castOther.getWorkflowId() != null && getWorkflowId().equals(castOther.getWorkflowId()))) && (getVersionId() == castOther.getVersionId() || (getVersionId() != null && castOther.getVersionId() != null && getVersionId().equals(castOther.getVersionId()))) && (getCurrentOrder() == castOther.getCurrentOrder() || (getCurrentOrder() != null && castOther.getCurrentOrder() != null && getCurrentOrder().equals(castOther.getCurrentOrder()))));
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
///*  99 */     result = 17;
///*     */     
///* 101 */     result = 37 * result + ((getPathId() == null) ? 0 : getPathId().hashCode());
///* 102 */     result = 37 * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
///* 103 */     result = 37 * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
///*     */     
///* 105 */     return 37 * result + ((getCurrentOrder() == null) ? 0 : getCurrentOrder().hashCode());
///*     */   }
/*     */ }

