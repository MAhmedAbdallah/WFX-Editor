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
/*    */ @Table(name = "VFE_LK_HTTP_REQUEST_TYPE_ADP")
/*    */ public class VfeLkHttpRequestTypeAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Byte id;
/*    */   private String type;
/*    */   /*    */   
/*    */   public VfeLkHttpRequestTypeAdp() {}
/*    */   /*    */   
/* 20 */   public VfeLkHttpRequestTypeAdp(Byte id) { this.id = id; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeLkHttpRequestTypeAdp(Byte id, String type) {
/* 24 */     this.id = id;
/* 25 */     this.type = type;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ID", unique = true, precision = 1, scale = 0)
/* 31 */   public Byte getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 35 */   public void setId(Byte id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "TYPE", length = 200)
/* 40 */   public String getType() { return this.type; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setType(String type) { this.type = type; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 49 */   public String toString() { return this.type; }
/*    */ }

