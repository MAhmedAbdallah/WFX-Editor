/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Embeddable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Embeddable
/*     */ public class VfeErrorsMappingAdpId
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal workflowId;
/*     */   private String errorCode;
/*     */   private String maskedErrorCode;
/*     */   private String errorMessage;
/*     */   private String maskedErrorMessage;
/*     */   private BigDecimal priority;
/*     */   /*     */   
/*     */   public VfeErrorsMappingAdpId() {}
/*     */   /*     */   
/*     */   public VfeErrorsMappingAdpId(BigDecimal workflowId, String errorCode, String maskedErrorCode, String errorMessage, String maskedErrorMessage, BigDecimal priority) {
/*  26 */     this.workflowId = workflowId;
/*  27 */     this.errorCode = errorCode;
/*  28 */     this.maskedErrorCode = maskedErrorCode;
/*  29 */     this.errorMessage = errorMessage;
/*  30 */     this.maskedErrorMessage = maskedErrorMessage;
/*  31 */     this.priority = priority;
/*     */   }
/*     */ 
/*     */   
/*     */   @Column(name = "WORKFLOW_ID", precision = 22, scale = 0)
/*  36 */   public BigDecimal getWorkflowId() { return this.workflowId; }
/*     */ 
/*     */ 
/*     */   
/*  40 */   public void setWorkflowId(BigDecimal workflowId) { this.workflowId = workflowId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "ERROR_CODE", length = 400)
/*  45 */   public String getErrorCode() { return this.errorCode; }
/*     */ 
/*     */ 
/*     */   
/*  49 */   public void setErrorCode(String errorCode) { this.errorCode = errorCode; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "MASKED_ERROR_CODE", length = 400)
/*  54 */   public String getMaskedErrorCode() { return this.maskedErrorCode; }
/*     */ 
/*     */ 
/*     */   
/*  58 */   public void setMaskedErrorCode(String maskedErrorCode) { this.maskedErrorCode = maskedErrorCode; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "ERROR_MESSAGE", length = 400)
/*  63 */   public String getErrorMessage() { return this.errorMessage; }
/*     */ 
/*     */ 
/*     */   
/*  67 */   public void setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "MASKED_ERROR_MESSAGE", length = 400)
/*  72 */   public String getMaskedErrorMessage() { return this.maskedErrorMessage; }
/*     */ 
/*     */ 
/*     */   
/*  76 */   public void setMaskedErrorMessage(String maskedErrorMessage) { this.maskedErrorMessage = maskedErrorMessage; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "PRIORITY", precision = 22, scale = 0)
/*  81 */   public BigDecimal getPriority() { return this.priority; }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public void setPriority(BigDecimal priority) { this.priority = priority; }
/*     */ 
/*     */   /*     */ 
/*     */   
/*     */   public boolean equals(Object other) {
/*  89 */     if (this == other)
/*  90 */       return true; 
/*  91 */     if (other == null)
/*  92 */       return false; 
/*  93 */     if (!(other instanceof VfeErrorsMappingAdpId))
/*  94 */       return false; 
/*  95 */     VfeErrorsMappingAdpId castOther = (VfeErrorsMappingAdpId)other;
/*     */     
/*  97 */     return ((getWorkflowId() == castOther.getWorkflowId() || (getWorkflowId() != null && castOther.getWorkflowId() != null && getWorkflowId().equals(castOther.getWorkflowId()))) && (getErrorCode() == castOther.getErrorCode() || (getErrorCode() != null && castOther.getErrorCode() != null && getErrorCode().equals(castOther.getErrorCode()))) && (getMaskedErrorCode() == castOther.getMaskedErrorCode() || (getMaskedErrorCode() != null && castOther.getMaskedErrorCode() != null && getMaskedErrorCode().equals(castOther.getMaskedErrorCode()))) && (getErrorMessage() == castOther.getErrorMessage() || (getErrorMessage() != null && castOther.getErrorMessage() != null && getErrorMessage().equals(castOther.getErrorMessage()))) && (getMaskedErrorMessage() == castOther.getMaskedErrorMessage() || (getMaskedErrorMessage() != null && castOther.getMaskedErrorMessage() != null && getMaskedErrorMessage().equals(castOther.getMaskedErrorMessage()))) && (getPriority() == castOther.getPriority() || (getPriority() != null && castOther.getPriority() != null && getPriority().equals(castOther.getPriority()))));
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
/*     */ 
/*     */ 
///*     */   
///*     */   public int hashCode() {
///* 115 */     result = 17;
///*     */     
///* 117 */     result = 37 * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
///* 118 */     result = 37 * result + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
///* 119 */     result = 37 * result + ((getMaskedErrorCode() == null) ? 0 : getMaskedErrorCode().hashCode());
///* 120 */     result = 37 * result + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
///* 121 */     result = 37 * result + ((getMaskedErrorMessage() == null) ? 0 : getMaskedErrorMessage().hashCode());
///* 122 */     return 37 * result + ((getPriority() == null) ? 0 : getPriority().hashCode());
///*     */   }
/*     */ }

