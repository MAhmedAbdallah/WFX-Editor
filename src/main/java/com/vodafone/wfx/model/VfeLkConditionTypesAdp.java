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
/*    */ @Table(name = "VFE_LK_CONDITION_TYPES_ADP")
/*    */ public class VfeLkConditionTypesAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Long conditionTypeId;
/*    */   private String conditionTypeDesc;
/*    */   /*    */   
/*    */   public VfeLkConditionTypesAdp() {}
/*    */   /*    */   
/* 20 */   public VfeLkConditionTypesAdp(Long conditionTypeId) { this.conditionTypeId = conditionTypeId; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeLkConditionTypesAdp(Long conditionTypeId, String conditionTypeDesc) {
/* 24 */     this.conditionTypeId = conditionTypeId;
/* 25 */     this.conditionTypeDesc = conditionTypeDesc;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "CONDITION_TYPE_ID", unique = true, precision = 18, scale = 0)
/* 31 */   public Long getConditionTypeId() { return this.conditionTypeId; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setConditionTypeId(Long conditionTypeId) { this.conditionTypeId = conditionTypeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "CONDITION_TYPE_DESC", length = 200)
/* 40 */   public String getConditionTypeDesc() { return this.conditionTypeDesc; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setConditionTypeDesc(String conditionTypeDesc) { this.conditionTypeDesc = conditionTypeDesc; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String toString() { return this.conditionTypeDesc; }
/*    */ }


