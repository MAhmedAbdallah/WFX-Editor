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
/*    */ @Table(name = "VFE_PREPARATION_MODE_ADP")
/*    */ public class VfePreparationModeAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Byte preparationModeId;
/*    */   private String modeDesc;
/*    */   /*    */   
/*    */   public VfePreparationModeAdp() {}
/*    */   /*    */   
/* 20 */   public VfePreparationModeAdp(Byte preparationModeId) { this.preparationModeId = preparationModeId; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfePreparationModeAdp(Byte preparationModeId, String modeDesc) {
/* 24 */     this.preparationModeId = preparationModeId;
/* 25 */     this.modeDesc = modeDesc;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "PREPARATION_MODE_ID", unique = true, precision = 1, scale = 0)
/* 31 */   public Byte getPreparationModeId() { return this.preparationModeId; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setPreparationModeId(Byte preparationModeId) { this.preparationModeId = preparationModeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "MODE_DESC", length = 200)
/* 40 */   public String getModeDesc() { return this.modeDesc; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setModeDesc(String modeDesc) { this.modeDesc = modeDesc; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String toString() { return this.modeDesc; }
/*    */ }


