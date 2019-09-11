/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Embeddable;
/*    */ 
/*    */ @Embeddable
/*    */ public class VfePreparationConditionsAdpId
/*    */   implements Serializable
/*    */ {
/*    */   private long preparationId;
/*    */   private Long conditionId;
/*    */   /*    */   
/*    */   public VfePreparationConditionsAdpId() {}
/*    */   /*    */   
/*    */   public VfePreparationConditionsAdpId(long preparationId, Long conditionId) {
/* 18 */     this.preparationId = preparationId;
/* 19 */     this.conditionId = conditionId;
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
/*    */   @Column(name = "CONDITION_ID", precision = 10, scale = 0)
/* 33 */   public Long getConditionId() { return this.conditionId; }
/*    */ 
/*    */ 
/*    */   
/* 37 */   public void setConditionId(Long conditionId) { this.conditionId = conditionId; }
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
///* 47 */     if (!(other instanceof VfePreparationConditionsAdpId)) {
///* 48 */       return false;
///*    */     }
///* 50 */     VfePreparationConditionsAdpId castOther = (VfePreparationConditionsAdpId)other;
///*    */     
///* 52 */     return ((getPreparationId() == castOther.getPreparationId() || (getPreparationId() != null && castOther.getPreparationId() != null && getPreparationId().equals(castOther.getPreparationId()))) && (getConditionId() == castOther.getConditionId() || (getConditionId() != null && castOther.getConditionId() != null && getConditionId().equals(castOther.getConditionId()))));
///*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
///*    */   public int hashCode() {
///* 61 */     result = 17;
///*    */     
///* 63 */     result = 37 * result + ((getPreparationId() == null) ? 0 : getPreparationId().hashCode());
///* 64 */     return 37 * result + ((getConditionId() == null) ? 0 : getConditionId().hashCode());
///*    */   }
/*    */ }


