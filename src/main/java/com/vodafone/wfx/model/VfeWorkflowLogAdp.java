/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.AttributeOverride;
/*    */ import javax.persistence.AttributeOverrides;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.OneToOne;
/*    */ import javax.persistence.PrimaryKeyJoinColumn;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_WORKFLOW_LOG_ADP")
/*    */ public class VfeWorkflowLogAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeWorkflowsAdpId id;
/*    */   private VfeWorkflowsAdp vfeWorkflowsAdp;
/*    */   private String input;
/*    */   private String output;
/*    */   private String poolLog;
/*    */   /*    */   
/*    */   public VfeWorkflowLogAdp() {}
/*    */   /*    */   
/* 30 */   public VfeWorkflowLogAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeWorkflowLogAdp(VfeWorkflowsAdp vfeWorkflowsAdp, String input, String output, String poolLog) {
/* 34 */     this.vfeWorkflowsAdp = vfeWorkflowsAdp;
/* 35 */     this.input = input;
/* 36 */     this.output = output;
/* 37 */     this.poolLog = poolLog;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/*    */   @Order(1)
/* 46 */   public VfeWorkflowsAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 50 */   public void setId(VfeWorkflowsAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @OneToOne(fetch = FetchType.EAGER)
/*    */   @PrimaryKeyJoinColumn
/* 56 */   public VfeWorkflowsAdp getVfeWorkflowsAdp() { return this.vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 60 */   public void setVfeWorkflowsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "INPUT", length = 1000)
/*    */   @Order(2)
/* 66 */   public String getInput() { return this.input; }
/*    */ 
/*    */ 
/*    */   
/* 70 */   public void setInput(String input) { this.input = input; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "OUTPUT", length = 1000)
/*    */   @Order(3)
/* 76 */   public String getOutput() { return this.output; }
/*    */ 
/*    */ 
/*    */   
/* 80 */   public void setOutput(String output) { this.output = output; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "POOL_LOG")
/*    */   @Order(4)
/* 86 */   public String getPoolLog() { return this.poolLog; }
/*    */ 
/*    */ 
/*    */   
/* 90 */   public void setPoolLog(String poolLog) { this.poolLog = poolLog; }
/*    */ }


