/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_LK_ERROR_CODES_ADP")
/*    */ public class VfeLkErrorCodesAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Long errorCodeId;
/*    */   private String errorMessage;
/*    */   private Long errorCode;
/*    */   /*    */   
/*    */   public VfeLkErrorCodesAdp() {}
/*    */   /*    */   
/* 21 */   public VfeLkErrorCodesAdp(Long errorCodeId) { this.errorCodeId = errorCodeId; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeLkErrorCodesAdp(Long errorCodeId, String errorMessage, Long errorCode) {
/* 25 */     this.errorCodeId = errorCodeId;
/* 26 */     this.errorMessage = errorMessage;
/* 27 */     this.errorCode = errorCode;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ERROR_CODE_ID", unique = true, precision = 18, scale = 0)
/* 33 */   public Long getErrorCodeId() { return this.errorCodeId; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setErrorCodeId(Long errorCodeId) { this.errorCodeId = errorCodeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "ERROR_MESSAGE", length = 400)
/* 42 */   public String getErrorMessage() { return this.errorMessage; }
/*    */ 
/*    */ 
/*    */   
/* 46 */   public void setErrorMessage(String errorMessage) { this.errorMessage = errorMessage; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "ERROR_CODE", precision = 18, scale = 0)
/* 51 */   public Long getErrorCode() { return this.errorCode; }
/*    */ 
/*    */ 
/*    */   
/* 55 */   public void setErrorCode(Long errorCode) { this.errorCode = errorCode; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 60 */   public String toString() { return "[" + this.errorCode + "] " + this.errorMessage; }
/*    */ }


