/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_CONDITIONS_ADP")
/*    */ @Identifier("getParameterName")
/*    */ public class VfeConditionsAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Long conditionId;
/*    */   private VfeLkConditionTypesAdp vfeLkConditionTypesAdp;
/*    */   private String parameterName;
/*    */   private String otherParameterName;
/*    */   private String conditionValue;
/*    */   
/*    */   public VfeConditionsAdp() {}
/*    */   
/* 27 */   public VfeConditionsAdp(Long conditionId) { this.conditionId = conditionId; }
/*    */ 
/*    */ 
/*    */   
/*    */   public VfeConditionsAdp(Long conditionId, VfeLkConditionTypesAdp vfeLkConditionTypesAdp, String parameterName, String otherParameterName, String conditionValue) {
/* 32 */     this.conditionId = conditionId;
/* 33 */     this.vfeLkConditionTypesAdp = vfeLkConditionTypesAdp;
/* 34 */     this.parameterName = parameterName;
/* 35 */     this.otherParameterName = otherParameterName;
/* 36 */     this.conditionValue = conditionValue;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "CONDITION_ID", unique = true, precision = 10, scale = 0)
/*    */   @Order(1)
/* 43 */   public Long getConditionId() { return this.conditionId; }
/*    */ 
/*    */ 
/*    */   
/* 47 */   public void setConditionId(Long conditionId) { this.conditionId = conditionId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumn(name = "CONDITION_TYPE_ID")
/*    */   @Order(3)
/* 54 */   public VfeLkConditionTypesAdp getVfeLkConditionTypesAdp() { return this.vfeLkConditionTypesAdp; }
/*    */ 
/*    */ 
/*    */   
/* 58 */   public void setVfeLkConditionTypesAdp(VfeLkConditionTypesAdp vfeLkConditionTypesAdp) { this.vfeLkConditionTypesAdp = vfeLkConditionTypesAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PARAMETER_NAME", length = 200)
/*    */   @Order(2)
/* 64 */   public String getParameterName() { return this.parameterName; }
/*    */ 
/*    */ 
/*    */   
/* 68 */   public void setParameterName(String parameterName) { this.parameterName = parameterName; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "OTHER_PARAMETER_NAME", length = 200)
/*    */   @Order(4)
/* 74 */   public String getOtherParameterName() { return this.otherParameterName; }
/*    */ 
/*    */ 
/*    */   
/* 78 */   public void setOtherParameterName(String otherParameterName) { this.otherParameterName = otherParameterName; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "CONDITION_VALUE", length = 200)
/*    */   @Order(5)
/* 84 */   public String getConditionValue() { return this.conditionValue; }
/*    */ 
/*    */ 
/*    */   
/* 88 */   public void setConditionValue(String conditionValue) { this.conditionValue = conditionValue; }
/*    */ }
