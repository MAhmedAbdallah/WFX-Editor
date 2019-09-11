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
/*    */ @Table(name = "VFE_LK_RELATION_TYPES_ADP")
/*    */ public class VfeLkRelationTypesAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Long realtionTypeId;
/*    */   private String description;
/*    */   /*    */   
/*    */   public VfeLkRelationTypesAdp() {}
/*    */   /*    */   
/* 20 */   public VfeLkRelationTypesAdp(Long realtionTypeId) { this.realtionTypeId = realtionTypeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "REALTION_TYPE_ID", unique = true, precision = 18, scale = 0)
/* 26 */   public Long getRealtionTypeId() { return this.realtionTypeId; }
/*    */ 
/*    */ 
/*    */   
/* 30 */   public void setRealtionTypeId(Long realtionTypeId) { this.realtionTypeId = realtionTypeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "DESCRIPTION", length = 200)
/* 35 */   public String getDescription() { return this.description; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public void setDescription(String description) { this.description = description; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 44 */   public String toString() { return this.description; }
/*    */ }


