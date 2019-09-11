/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_WORKFLOW_AIR_SERVERS_ADP")
/*    */ @Identifier("getVfeLkAirServersAdp")
/*    */ public class VfeWorkflowAirServersAdp
/*    */   implements Serializable
/*    */ {
/*    */   private BigDecimal id;
/*    */   private VfeWorkflowsAdp vfeWorkflowsAdp;
/*    */   private VfeLkAirServersAdp vfeLkAirServersAdp;
/*    */   /*    */   
/*    */   public VfeWorkflowAirServersAdp() {}
/*    */   /*    */   
/* 27 */   public VfeWorkflowAirServersAdp(BigDecimal id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ID", unique = true, precision = 22, scale = 5)
/*    */   @Order(1)
/* 34 */   public BigDecimal getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 38 */   public void setId(BigDecimal id) { this.id = id; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumn(name = "AIR_SERVER_ID")
/*    */   @Order(2)
/* 61 */   public VfeLkAirServersAdp getVfeLkAirServersAdp() { return this.vfeLkAirServersAdp; }
/*    */ 
/*    */ 
/*    */   
/* 65 */   public void setVfeLkAirServersAdp(VfeLkAirServersAdp vfeLkAirServersAdp) { this.vfeLkAirServersAdp = vfeLkAirServersAdp; }
/*    */ }


