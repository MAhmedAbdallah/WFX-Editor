/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;
/*    */ 
/*    */ @Embeddable
/*    */ public class VfeWorkflowDetailOutputAdpId
/*    */   implements Serializable
/*    */ {
/*    */   private Long workflowId;
/*    */   private String parameterName;
/*    */   private Long versionId;
/*    */   /*    */   
/*    */   public VfeWorkflowDetailOutputAdpId() {}
/*    */   /*    */   
/*    */   public VfeWorkflowDetailOutputAdpId(Long workflowId, String parameterName, Long versionId) {
/* 18 */     this.workflowId = workflowId;
/* 19 */     this.parameterName = parameterName;
/* 20 */     this.versionId = versionId;
/*    */   }
/*    */ 
/*    */   
/*    */   @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)
/*    */   @Order(1)
/* 26 */   public Long getWorkflowId() { return this.workflowId; }
/*    */ 
/*    */ 
/*    */   
/* 30 */   public void setWorkflowId(Long workflowId) { this.workflowId = workflowId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PARAMETER_NAME", length = 500)
/*    */   @Order(3)
/* 36 */   public String getParameterName() { return this.parameterName; }
/*    */ 
/*    */ 
/*    */   
/* 40 */   public void setParameterName(String parameterName) { this.parameterName = parameterName; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "VERSION_ID", precision = 18, scale = 0)
/*    */   @Order(2)
/* 46 */   public Long getVersionId() { return this.versionId; }
/*    */ 
/*    */ 
/*    */   
/* 50 */   public void setVersionId(Long versionId) { this.versionId = versionId; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public boolean equals(Object other) {
/* 54 */     if (this == other) {
/* 55 */       return true;
/*    */     }
/* 57 */     if (other == null) {
/* 58 */       return false;
/*    */     }
/* 60 */     if (!(other instanceof VfeWorkflowDetailOutputAdpId)) {
/* 61 */       return false;
/*    */     }
/* 63 */     VfeWorkflowDetailOutputAdpId castOther = (VfeWorkflowDetailOutputAdpId)other;
/*    */     
/* 65 */     return ((getWorkflowId() == castOther.getWorkflowId() || (getWorkflowId() != null && castOther.getWorkflowId() != null && getWorkflowId().equals(castOther.getWorkflowId()))) && (getParameterName() == castOther.getParameterName() || (getParameterName() != null && castOther.getParameterName() != null && getParameterName().equals(castOther.getParameterName()))) && (getVersionId() == castOther.getVersionId() || (getVersionId() != null && castOther.getVersionId() != null && getVersionId().equals(castOther.getVersionId()))));
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
///*    */   public int hashCode() {
///* 75 */     result = 17;
///*    */     
///* 77 */     result = 37 * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
///* 78 */     result = 37 * result + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
///* 79 */     return 37 * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
///*    */   }
/*    */ }

