/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.JoinColumns;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_PRIVATE_POOL_ADP")
/*    */ public class VfePrivatePoolAdp
/*    */   implements Serializable
/*    */ {
/*    */   private BigDecimal id;
/*    */   private VfeWorkflowStepsAdp vfeWorkflowStepsAdp;
/*    */   private BigDecimal poolId;
/*    */   /*    */   
/*    */   public VfePrivatePoolAdp() {}
/*    */   /*    */   
/* 27 */   public VfePrivatePoolAdp(BigDecimal id) { this.id = id; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfePrivatePoolAdp(BigDecimal id, VfeWorkflowStepsAdp vfeWorkflowStepsAdp, BigDecimal poolId) {
/* 31 */     this.id = id;
/* 32 */     this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp;
/* 33 */     this.poolId = poolId;
/* 34 */     this.id = id;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ID", precision = 22, scale = 0)
/* 40 */   public BigDecimal getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 44 */   public void setId(BigDecimal id) { this.id = id; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", insertable = false, updatable = false), @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID", insertable = false, updatable = false), @JoinColumn(name = "CURRENT_ORDER", referencedColumnName = "CURRENT_ORDER", insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", insertable = false, updatable = false)})
/* 54 */   public VfeWorkflowStepsAdp getVfeWorkflowStepsAdp() { return this.vfeWorkflowStepsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 58 */   public void setVfeWorkflowStepsAdp(VfeWorkflowStepsAdp vfeWorkflowStepsAdp) { this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "POOL_ID", precision = 22, scale = 0)
/* 63 */   public BigDecimal getPoolId() { return this.poolId; }
/*    */ 
/*    */ 
/*    */   
/* 67 */   public void setPoolId(BigDecimal poolId) { this.poolId = poolId; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 72 */   public String toString() { return "poolId : " + this.poolId; }
/*    */ }

