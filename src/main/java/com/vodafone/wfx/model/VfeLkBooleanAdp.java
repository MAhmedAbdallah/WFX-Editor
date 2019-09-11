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
/*    */ @Table(name = "VFE_LK_BOOLEAN_ADP")
/*    */ public class VfeLkBooleanAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Byte booleanId;
/*    */   private String booleanValue;
/*    */   /*    */   
/*    */   public VfeLkBooleanAdp() {}
/*    */   /*    */   
/* 20 */   public VfeLkBooleanAdp(Byte booleanId) { this.booleanId = booleanId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "BOOLEAN_ID", unique = true, precision = 1, scale = 0)
/* 26 */   public Byte getBooleanId() { return this.booleanId; }
/*    */ 
/*    */ 
/*    */   
/* 30 */   public void setBooleanId(Byte booleanId) { this.booleanId = booleanId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "BOOLEAN_VALUE", length = 20)
/* 35 */   public String getBooleanValue() { return this.booleanValue; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public void setBooleanValue(String booleanValue) { this.booleanValue = booleanValue; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 44 */   public String toString() { return this.booleanValue; }
/*    */ }
