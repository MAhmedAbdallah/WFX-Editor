/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;
/*    */ 
/*    */ @Embeddable
/*    */ public class VfePreparationParametersAdpId
/*    */   implements Serializable
/*    */ {
/*    */   private long preparationId;
/*    */   private String parameterName;
/*    */   /*    */   
/*    */   public VfePreparationParametersAdpId() {}
/*    */   /*    */   
/*    */   public VfePreparationParametersAdpId(long preparationId, String parameterName) {
/* 18 */     this.preparationId = preparationId;
/* 19 */     this.parameterName = parameterName;
/*    */   }
/*    */ 
/*    */   
/*    */   @Column(name = "PREPARATION_ID", scale = 0)
/* 24 */   public long getPreparationId() { return this.preparationId; }
/*    */ 
/*    */ 
/*    */   
/* 28 */   public void setPreparationId(long preparationId) { this.preparationId = preparationId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PARAMETER_NAME", length = 200)
/* 33 */   public String getParameterName() { return this.parameterName; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setParameterName(String parameterName) { this.parameterName = parameterName; }
/*    */ 
/*    */   /*    */ 
/*    */   
///*    */   public boolean equals(Object other) {
///* 41 */     if (this == other) {
///* 42 */       return true;
///*    */     }
///* 44 */     if (other == null) {
///* 45 */       return false;
///*    */     }
///* 47 */     if (!(other instanceof VfePreparationParametersAdpId)) {
///* 48 */       return false;
///*    */     }
///* 50 */     VfePreparationParametersAdpId castOther = (VfePreparationParametersAdpId)other;
///*    */     
///* 52 */     return ((getPreparationId() == castOther.getPreparationId() || (getPreparationId() != null && castOther.getPreparationId() != null && getPreparationId().equals(castOther.getPreparationId()))) && (getParameterName() == castOther.getParameterName() || (getParameterName() != null && castOther.getParameterName() != null && getParameterName().equals(castOther.getParameterName()))));
///*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
///*    */   
///*    */   public int hashCode() {
///* 61 */     result = 17;
///*    */     
///* 63 */     result = 37 * result + ((getPreparationId() == null) ? 0 : getPreparationId().hashCode());
///* 64 */     return 37 * result + ((getParameterName() == null) ? 0 : getParameterName().hashCode());
///*    */   }
/*    */ }


