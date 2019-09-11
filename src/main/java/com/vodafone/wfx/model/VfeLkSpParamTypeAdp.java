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
/*    */ @Table(name = "VFE_LK_SP_PARAM_TYPE_ADP")
/*    */ public class VfeLkSpParamTypeAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Long paramTypeId;
/*    */   private String paramTypeName;
/*    */   /*    */   
/*    */   public VfeLkSpParamTypeAdp() {}
/*    */   /*    */   
/* 20 */   public VfeLkSpParamTypeAdp(Long paramTypeId) { this.paramTypeId = paramTypeId; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeLkSpParamTypeAdp(Long paramTypeId, String paramTypeName) {
/* 24 */     this.paramTypeId = paramTypeId;
/* 25 */     this.paramTypeName = paramTypeName;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "PARAM_TYPE_ID", unique = true, precision = 10, scale = 0)
/* 31 */   public Long getParamTypeId() { return this.paramTypeId; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setParamTypeId(Long paramTypeId) { this.paramTypeId = paramTypeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PARAM_TYPE_NAME", length = 100)
/* 40 */   public String getParamTypeName() { return this.paramTypeName; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setParamTypeName(String paramTypeName) { this.paramTypeName = paramTypeName; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String toString() { return this.paramTypeName; }
/*    */ }


