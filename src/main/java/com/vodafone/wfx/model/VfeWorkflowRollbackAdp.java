/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.JoinColumns;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "VFE_WORKFLOW_ROLLBACK_ADP")
/*     */ @Identifier("getPriority")
/*     */ public class VfeWorkflowRollbackAdp
/*     */   implements Serializable {
/*     */   private Long rollbackId;
/*     */   private VfeLkBooleanAdp connectionRollback;
/*     */   private VfeLkBooleanAdp resume;
/*     */   private VfeWorkflowStepsAdp vfeWorkflowStepsAdp;
/*     */   private String errorCode;
/*     */   private String errorDesc;
/*     */   private Integer retryCounter;
/*     */   private Long retryIntetrval;
/*     */   private String rollbackWorkflowName;
/*     */   private Integer priority;
/*     */   private Long resumeStep;
/*     */   private Short workflowFlag;
/*  33 */   private Set<VfeWorkflowPreparationAdp> vfeWorkflowPreparationAdps = new HashSet();
/*     */ 
/*     */   /*     */ 
/*     */   
/*     */   public VfeWorkflowRollbackAdp() {}
/*     */ 
/*     */   /*     */ 
/*     */   
/*  39 */   public VfeWorkflowRollbackAdp(Long rollbackId) { this.rollbackId = rollbackId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   /*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VfeWorkflowRollbackAdp(Long rollbackId, VfeLkBooleanAdp connectionRollback, VfeLkBooleanAdp resume, String errorCode, String errorDesc, Integer retryCounter, Long retryIntetrval, String rollbackWorkflowName, Integer priority, Long resumeStep, Short workflowFlag, Set<VfeWorkflowPreparationAdp> vfeWorkflowPreparationAdps) {
/*  47 */     this.rollbackId = rollbackId;
/*  48 */     this.connectionRollback = connectionRollback;
/*  49 */     this.resume = resume;
/*  50 */     this.errorCode = errorCode;
/*  51 */     this.errorDesc = errorDesc;
/*  52 */     this.retryCounter = retryCounter;
/*  53 */     this.retryIntetrval = retryIntetrval;
/*  54 */     this.rollbackWorkflowName = rollbackWorkflowName;
/*  55 */     this.priority = priority;
/*  56 */     this.resumeStep = resumeStep;
/*  57 */     this.workflowFlag = workflowFlag;
/*  58 */     this.vfeWorkflowPreparationAdps = vfeWorkflowPreparationAdps;
/*     */   }
/*     */ 
/*     */   
/*     */   @Id
/*     */   @Column(name = "ROLLBACK_ID", unique = true, precision = 18, scale = 0)
/*     */   @Order(1)
/*  65 */   public Long getRollbackId() { return this.rollbackId; }
/*     */ 
/*     */ 
/*     */   
/*  69 */   public void setRollbackId(Long rollbackId) { this.rollbackId = rollbackId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "CONNECTION_ROLLBACK")
/*     */   @Order(11)
/*  76 */   public VfeLkBooleanAdp getConnectionRollback() { return this.connectionRollback; }
/*     */ 
/*     */ 
/*     */   
/*  80 */   public void setConnectionRollback(VfeLkBooleanAdp connectionRollback) { this.connectionRollback = connectionRollback; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "RESUME")
/*     */   @Order(8)
/*  87 */   public VfeLkBooleanAdp getResume() { return this.resume; }
/*     */ 
/*     */ 
/*     */   
/*  91 */   public void setResume(VfeLkBooleanAdp resume) { this.resume = resume; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "ERROR_CODE", length = 200)
/*     */   @Order(6)
/*  97 */   public String getErrorCode() { return this.errorCode; }
/*     */ 
/*     */ 
/*     */   
/* 101 */   public void setErrorCode(String errorCode) { this.errorCode = errorCode; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "ERROR_DESC", length = 500)
/*     */   @Order(7)
/* 107 */   public String getErrorDesc() { return this.errorDesc; }
/*     */ 
/*     */ 
/*     */   
/* 111 */   public void setErrorDesc(String errorDesc) { this.errorDesc = errorDesc; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RETRY_COUNTER", precision = 5, scale = 0)
/*     */   @Order(4)
/* 117 */   public Integer getRetryCounter() { return this.retryCounter; }
/*     */ 
/*     */ 
/*     */   
/* 121 */   public void setRetryCounter(Integer retryCounter) { this.retryCounter = retryCounter; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RETRY_INTETRVAL", precision = 18, scale = 0)
/*     */   @Order(5)
/* 127 */   public Long getRetryIntetrval() { return this.retryIntetrval; }
/*     */ 
/*     */ 
/*     */   
/* 131 */   public void setRetryIntetrval(Long retryIntetrval) { this.retryIntetrval = retryIntetrval; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "ROLLBACK_WORKFLOW_NAME", length = 200)
/*     */   @Order(2)
/* 137 */   public String getRollbackWorkflowName() { return this.rollbackWorkflowName; }
/*     */ 
/*     */ 
/*     */   
/* 141 */   public void setRollbackWorkflowName(String rollbackWorkflowName) { this.rollbackWorkflowName = rollbackWorkflowName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "PRIORITY", precision = 5, scale = 0)
/*     */   @Order(3)
/* 147 */   public Integer getPriority() { return this.priority; }
/*     */ 
/*     */ 
/*     */   
/* 151 */   public void setPriority(Integer priority) { this.priority = priority; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RESUME_STEP", precision = 18, scale = 0)
/*     */   @Order(9)
/* 157 */   public Long getresumeStep() { return this.resumeStep; }
/*     */ 
/*     */ 
/*     */   
/* 161 */   public void setresumeStep(Long resumeStep) { this.resumeStep = resumeStep; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "WORKFLOW_FLAG", precision = 3, scale = 0)
/*     */   @Order(10)
/* 167 */   public Short getWorkflowFlag() { return this.workflowFlag; }
/*     */ 
/*     */ 
/*     */   
/* 171 */   public void setWorkflowFlag(Short workflowFlag) { this.workflowFlag = workflowFlag; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowRollbackAdp")
/* 176 */   public Set<VfeWorkflowPreparationAdp> getVfeWorkflowPreparationAdps() { return this.vfeWorkflowPreparationAdps; }
/*     */ 
/*     */ 
/*     */   
/* 180 */   public void setVfeWorkflowPreparationAdps(Set<VfeWorkflowPreparationAdp> vfeWorkflowPreparationAdps) { this.vfeWorkflowPreparationAdps = vfeWorkflowPreparationAdps; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID"), @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID"), @JoinColumn(name = "CURRENT_ORDER", referencedColumnName = "CURRENT_ORDER"), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID")})
/* 190 */   public VfeWorkflowStepsAdp getVfeWorkflowStepsAdp() { return this.vfeWorkflowStepsAdp; }
/*     */ 
/*     */ 
/*     */   
/* 194 */   public void setVfeWorkflowStepsAdp(VfeWorkflowStepsAdp vfeWorkflowStepsAdp) { this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp; }
/*     */ }


