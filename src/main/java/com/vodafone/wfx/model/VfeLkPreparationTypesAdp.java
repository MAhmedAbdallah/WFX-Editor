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
/*    */ @Table(name = "VFE_LK_PREPARATION_TYPES_ADP")
/*    */ public class VfeLkPreparationTypesAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Long preparationTypeId;
/*    */   private String preparationDescription;
/*    */   /*    */   
/*    */   public VfeLkPreparationTypesAdp() {}
/*    */   /*    */   
/* 20 */   public VfeLkPreparationTypesAdp(Long preparationTypeId) { this.preparationTypeId = preparationTypeId; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeLkPreparationTypesAdp(Long preparationTypeId, String preparationDescription) {
/* 24 */     this.preparationTypeId = preparationTypeId;
/* 25 */     this.preparationDescription = preparationDescription;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "PREPARATION_TYPE_ID", unique = true, precision = 18, scale = 0)
/* 31 */   public Long getPreparationTypeId() { return this.preparationTypeId; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setPreparationTypeId(Long preparationTypeId) { this.preparationTypeId = preparationTypeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PREPARATION_DESCRIPTION", length = 200)
/* 40 */   public String getPreparationDescription() { return this.preparationDescription; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setPreparationDescription(String preparationDescription) { this.preparationDescription = preparationDescription; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String toString() { return this.preparationDescription; }
/*    */ }

