/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.util.HashSet;
/*     */ import java.util.Set;
/*     */ import javax.persistence.AttributeOverride;
/*     */ import javax.persistence.AttributeOverrides;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.EmbeddedId;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.JoinColumns;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.OrderBy;
/*     */ import javax.persistence.Table;
/*     */ import javax.persistence.UniqueConstraint;
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "VFE_WORKFLOW_STEPS_ADP", uniqueConstraints = {@UniqueConstraint(columnNames = {"WORKFLOW_ID", "ACTIVITY_ID", "CURRENT_ORDER", "VERSION_ID"})})
/*     */ @Identifier("getId.getCurrentOrder,getActivityId.getVfeLkActivitiesTypeAdp")
/*     */ public class VfeWorkflowStepsAdp
/*     */   implements Serializable
/*     */ {
/*     */   private VfeWorkflowStepsAdpId id;
/*     */   private VfeLkBooleanAdp outputFlag;
/*     */   private VfeWorkflowsAdp vfeWorkflowsAdp;
/*     */   private VfeLkBooleanAdp onExit;
/*     */   private VfeLkBooleanAdp doCommit;
/*     */   private VfeLkBooleanAdp takeSnapshot;
/*     */   private VfeLkBooleanAdp ignoreErrors;
/*     */   private Long subOrder;
/*     */   private String appendToOutput;
/*     */   private String appendToInput;
/*     */   private String repeatListName;
/*     */   private String description;
/*     */   private VfeActivitiesAdp activityId;
/*     */   private VfeActivitiesAdp activityLoopId;
/*  41 */   private Set<VfeWorkflowPathsAdp> vfeWorkflowPathsAdps = new HashSet();
/*  42 */   private Set<VfePrivatePoolAdp> vfePrivatePoolAdps = new HashSet();
/*     */ 
/*     */   
/*  45 */   private Set<VfeActivityErrorsAdp> vfeActivityErrorsAdps = new HashSet();
/*  46 */   private Set<VfeJavaActivityParamsAdp> vfeJavaActivityParamsAdps = new HashSet();
/*  47 */   private Set<VfeHttpParamsMappingAdp> vfeHttpParamsMappingAdps = new HashSet();
/*  48 */   private Set<VfeWorkflowConditionsAdp> vfeWorkflowConditionsAdps = new HashSet();
/*  49 */   private Set<VfeWorkflowPreparationAdp> vfeWorkflowPreparationAdps = new HashSet();
/*  50 */   private Set<VfeWorkflowRollbackAdp> vfeWorkflowRollbackAdps = new HashSet();
/*     */ 
/*     */ 
/*     */   /*     */ 
/*     */ 
/*     */   
/*     */   public VfeWorkflowStepsAdp() {}
/*     */ 
/*     */   /*     */ 
/*     */   
/*  57 */   public VfeWorkflowStepsAdp(VfeWorkflowStepsAdpId id) { this.id = id; }
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
/*     */   public VfeWorkflowStepsAdp(VfeWorkflowStepsAdpId id, VfeLkBooleanAdp outputFlag, VfeWorkflowsAdp vfeWorkflowsAdp, VfeLkBooleanAdp onExit, VfeLkBooleanAdp doCommit, VfeLkBooleanAdp takeSnapshot, VfeLkBooleanAdp ignoreErrors, Long subOrder, VfeActivitiesAdp activityLoopId, String appendToOutput, String appendToInput, String repeatListName, String description) {
/*  65 */     this.id = id;
/*  66 */     this.outputFlag = outputFlag;
/*  67 */     this.vfeWorkflowsAdp = vfeWorkflowsAdp;
/*  68 */     this.onExit = onExit;
/*  69 */     this.doCommit = doCommit;
/*  70 */     this.takeSnapshot = takeSnapshot;
/*  71 */     this.ignoreErrors = ignoreErrors;
/*  72 */     this.subOrder = subOrder;
/*  73 */     this.activityLoopId = activityLoopId;
/*  74 */     this.appendToOutput = appendToOutput;
/*  75 */     this.appendToInput = appendToInput;
/*  76 */     this.repeatListName = repeatListName;
/*  77 */     this.description = description;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @EmbeddedId
/*     */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "activityId", column = @Column(name = "ACTIVITY_ID", precision = 18, scale = 0)), @AttributeOverride(name = "currentOrder", column = @Column(name = "CURRENT_ORDER", precision = 12, scale = 0)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/*     */   @Order(1)
/*  89 */   public VfeWorkflowStepsAdpId getId() { return this.id; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void setId(VfeWorkflowStepsAdpId id) { this.id = id; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "OUTPUT_FLAG")
/*     */   @Order(13)
/* 100 */   public VfeLkBooleanAdp getOutputFlag() { return this.outputFlag; }
/*     */ 
/*     */ 
/*     */   
/* 104 */   public void setOutputFlag(VfeLkBooleanAdp outputFlag) { this.outputFlag = outputFlag; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", insertable = false, updatable = false)})
/* 112 */   public VfeWorkflowsAdp getVfeWorkflowsAdp() { return this.vfeWorkflowsAdp; }
/*     */ 
/*     */ 
/*     */   
/* 116 */   public void setVfeWorkflowsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "ON_EXIT", insertable = false, updatable = false)
/*     */   @Order(6)
/* 123 */   public VfeLkBooleanAdp getOnExit() { return this.onExit; }
/*     */ 
/*     */ 
/*     */   
/* 127 */   public void setOnExit(VfeLkBooleanAdp onExit) { this.onExit = onExit; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "DO_COMMIT")
/*     */   @Order(7)
/* 134 */   public VfeLkBooleanAdp getDoCommit() { return this.doCommit; }
/*     */ 
/*     */ 
/*     */   
/* 138 */   public void setDoCommit(VfeLkBooleanAdp doCommit) { this.doCommit = doCommit; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "TAKE_SNAPSHOT")
/*     */   @Order(11)
/* 145 */   public VfeLkBooleanAdp getTakeSnapshot() { return this.takeSnapshot; }
/*     */ 
/*     */ 
/*     */   
/* 149 */   public void setTakeSnapshot(VfeLkBooleanAdp takeSnapshot) { this.takeSnapshot = takeSnapshot; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "IGNORE_ERRORS")
/*     */   @Order(10)
/* 156 */   public VfeLkBooleanAdp getIgnoreErrors() { return this.ignoreErrors; }
/*     */ 
/*     */ 
/*     */   
/* 160 */   public void setIgnoreErrors(VfeLkBooleanAdp ignoreErrors) { this.ignoreErrors = ignoreErrors; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "SUB_ORDER", precision = 18, scale = 0)
/*     */   @Order(5)
/* 166 */   public Long getSubOrder() { return this.subOrder; }
/*     */ 
/*     */ 
/*     */   
/* 170 */   public void setSubOrder(Long subOrder) { this.subOrder = subOrder; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "ACTIVITY_ID", nullable = false, insertable = false, updatable = false)
/*     */   @Order(3)
/* 177 */   public VfeActivitiesAdp getActivityId() { return this.activityId; }
/*     */ 
/*     */ 
/*     */   
/* 181 */   public void setActivityId(VfeActivitiesAdp activityId) { this.activityId = activityId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "ACTIVITY_LOOP_ID")
/*     */   @Order(4)
/* 188 */   public VfeActivitiesAdp getActivityLoopId() { return this.activityLoopId; }
/*     */ 
/*     */ 
/*     */   
/* 192 */   public void setActivityLoopId(VfeActivitiesAdp activityLoopId) { this.activityLoopId = activityLoopId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "APPEND_TO_OUTPUT", length = 4000)
/*     */   @Order(9)
/* 198 */   public String getAppendToOutput() { return this.appendToOutput; }
/*     */ 
/*     */ 
/*     */   
/* 202 */   public void setAppendToOutput(String appendToOutput) { this.appendToOutput = appendToOutput; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "APPEND_TO_INPUT", length = 4000)
/*     */   @Order(8)
/* 208 */   public String getAppendToInput() { return this.appendToInput; }
/*     */ 
/*     */ 
/*     */   
/* 212 */   public void setAppendToInput(String appendToInput) { this.appendToInput = appendToInput; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "REPEAT_LIST_NAME", length = 200)
/*     */   @Order(12)
/* 218 */   public String getRepeatListName() { return this.repeatListName; }
/*     */ 
/*     */ 
/*     */   
/* 222 */   public void setRepeatListName(String repeatListName) { this.repeatListName = repeatListName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "DESCRIPTION", length = 2000)
/*     */   @Order(2)
/* 228 */   public String getDescription() { return this.description; }
/*     */ 
/*     */ 
/*     */   
/* 232 */   public void setDescription(String description) { this.description = description; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowStepsAdp")
/*     */   @Order(16)
/* 238 */   public Set<VfeActivityErrorsAdp> getVfeActivityErrorsAdps() { return this.vfeActivityErrorsAdps; }
/*     */ 
/*     */ 
/*     */   
/* 242 */   public void setVfeActivityErrorsAdps(Set<VfeActivityErrorsAdp> vfeActivityErrorsAdps) { this.vfeActivityErrorsAdps = vfeActivityErrorsAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowStepsAdp")
/*     */   @Order(17)
/* 248 */   public Set<VfeJavaActivityParamsAdp> getVfeJavaActivityParamsAdps() { return this.vfeJavaActivityParamsAdps; }
/*     */ 
/*     */ 
/*     */   
/* 252 */   public void setVfeJavaActivityParamsAdps(Set<VfeJavaActivityParamsAdp> vfeJavaActivityParamsAdps) { this.vfeJavaActivityParamsAdps = vfeJavaActivityParamsAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowStepsAdp")
/*     */   @Order(18)
/* 258 */   public Set<VfeHttpParamsMappingAdp> getVfeHttpParamsMappingAdps() { return this.vfeHttpParamsMappingAdps; }
/*     */ 
/*     */ 
/*     */   
/* 262 */   public void setVfeHttpParamsMappingAdps(Set<VfeHttpParamsMappingAdp> vfeHttpParamsMappingAdps) { this.vfeHttpParamsMappingAdps = vfeHttpParamsMappingAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OrderBy("priority asc")
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowStepsAdp")
/*     */   @Order(21)
/* 269 */   public Set<VfeWorkflowRollbackAdp> getVfeWorkflowRollbackAdps() { return this.vfeWorkflowRollbackAdps; }
/*     */ 
/*     */ 
/*     */   
/* 273 */   public void setVfeWorkflowRollbackAdps(Set<VfeWorkflowRollbackAdp> vfeWorkflowRollbackAdps) { this.vfeWorkflowRollbackAdps = vfeWorkflowRollbackAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OrderBy("vfePreparationModeAdp asc, preparationOrder asc")
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowStepsAdp")
/*     */   @Order(20)
/* 280 */   public Set<VfeWorkflowPreparationAdp> getVfeWorkflowPreparationAdps() { return this.vfeWorkflowPreparationAdps; }
/*     */ 
/*     */ 
/*     */   
/* 284 */   public void setVfeWorkflowPreparationAdps(Set<VfeWorkflowPreparationAdp> vfeWorkflowPreparationAdps) { this.vfeWorkflowPreparationAdps = vfeWorkflowPreparationAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OrderBy("conditionOrder asc")
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowStepsAdp")
/*     */   @Order(19)
/* 291 */   public Set<VfeWorkflowConditionsAdp> getVfeWorkflowConditionsAdps() { return this.vfeWorkflowConditionsAdps; }
/*     */ 
/*     */ 
/*     */   
/* 295 */   public void setVfeWorkflowConditionsAdps(Set<VfeWorkflowConditionsAdp> vfeWorkflowConditionsAdps) { this.vfeWorkflowConditionsAdps = vfeWorkflowConditionsAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowStepsAdp")
/*     */   @Order(15)
/* 301 */   public Set<VfeWorkflowPathsAdp> getVfeWorkflowPathsAdps() { return this.vfeWorkflowPathsAdps; }
/*     */ 
/*     */ 
/*     */   
/* 305 */   public void setVfeWorkflowPathsAdps(Set<VfeWorkflowPathsAdp> vfeWorkflowPathsAdps) { this.vfeWorkflowPathsAdps = vfeWorkflowPathsAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowStepsAdp")
/*     */   @Order(14)
/* 311 */   public Set<VfePrivatePoolAdp> getVfePrivatePoolAdps() { return this.vfePrivatePoolAdps; }
/*     */ 
/*     */ 
/*     */   
/* 315 */   public void setVfePrivatePoolAdps(Set<VfePrivatePoolAdp> vfePrivatePoolAdps) { this.vfePrivatePoolAdps = vfePrivatePoolAdps; }
/*     */ }

