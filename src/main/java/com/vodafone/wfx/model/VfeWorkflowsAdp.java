/*     */ package com.vodafone.wfx.model;
/*     */ 
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
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
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.OneToMany;
/*     */ import javax.persistence.OneToOne;
/*     */ import javax.persistence.OrderBy;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "VFE_WORKFLOWS_ADP")
/*     */ @Identifier("getFlowName")
         
/*     */ public class VfeWorkflowsAdp
/*     */  // implements Serializable
/*     */ {
/*     */   private VfeWorkflowsAdpId id;
/*     */   private VfeLkBooleanAdp mapOutputToXml;
/*     */   private VfeLkBooleanAdp returnAllOutputs;
/*     */   private VfeLkBooleanAdp doCommit;
/*     */   private VfeLkBooleanAdp eligibleToCreate;
/*     */   private String xmlTemplate;
/*     */   private String xmlParamName;
/*     */   private String listenerName;
/*     */   private String outputClassName;
/*     */   private String operationName;
/*     */   private String actionType;
/*     */   private String flowName;
/*     */   private VfeWorkflowVersionsAdp vfeWorkflowVersionsAdp;
/*     */   private VfeWorkflowLogAdp vfeWorkflowLogAdp;
/*     */   private VfeCmsLoadingExceptionsAdp vfeCmsLoadingExceptionsAdp;


/*  41 */   private Set<VfeWorkflowInputAdp> vfeWorkflowInputAdps = new HashSet();
/*  42 */   private Set<VfeWorkflowOutputAdp> vfeWorkflowOutputAdps = new HashSet();
/*  43 */   private Set<VfeWorkflowDetailOutputAdp> vfeWorkflowDetailOutputAdps = new HashSet();
/*  44 */   private Set<VfeWorkflowStepsAdp> vfeWorkflowStepsAdps =new HashSet();
/*     */ 
/*     */   /*     */ 
/*     */   
/*     */   public VfeWorkflowsAdp() {}
/*     */ 
/*     */   /*     */ 
/*     */   
/*  50 */   public VfeWorkflowsAdp(VfeWorkflowsAdpId id) { this.id = id; }
/*     */ 
/*     */ 
/*     */ 
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
/*     */ 
/*     */ 
/*     */   
/*     */   public VfeWorkflowsAdp(VfeWorkflowsAdpId id, VfeLkBooleanAdp mapOutputToXml, VfeLkBooleanAdp returnAllOutputs, VfeLkBooleanAdp doCommit, VfeLkBooleanAdp eligibleToCreate, String xmlTemplate, String xmlParamName, String listenerName, String outputClassName, String operationName, String actionType, String flowName, VfeWorkflowVersionsAdp vfeWorkflowVersionsAdp, VfeWorkflowLogAdp vfeWorkflowLogAdp, VfeCmsLoadingExceptionsAdp vfeCmsLoadingExceptionsAdp, Set<VfeWorkflowStepsAdp> vfeWorkflowStepsAdps, Set<VfeWorkflowOutputAdp> vfeWorkflowOutputAdps, Set<VfeWorkflowDetailOutputAdp> vfeWorkflowDetailOutputAdps, Set<VfeWorkflowInputAdp> vfeWorkflowInputAdps) {
/*  61 */     this.id = id;
/*  62 */     this.mapOutputToXml = mapOutputToXml;
/*  63 */     this.returnAllOutputs = returnAllOutputs;
/*  64 */     this.doCommit = doCommit;
/*  65 */     this.eligibleToCreate = eligibleToCreate;
/*  66 */     this.xmlTemplate = xmlTemplate;
/*  67 */     this.xmlParamName = xmlParamName;
/*  68 */     this.listenerName = listenerName;
/*  69 */     this.outputClassName = outputClassName;
/*  70 */     this.operationName = operationName;
/*  71 */     this.actionType = actionType;
/*  72 */     this.flowName = flowName;
/*  73 */     this.vfeWorkflowVersionsAdp = vfeWorkflowVersionsAdp;
/*  74 */     this.vfeWorkflowLogAdp = vfeWorkflowLogAdp;
/*  75 */     this.vfeCmsLoadingExceptionsAdp = vfeCmsLoadingExceptionsAdp;
/*  76 */     this.vfeWorkflowStepsAdps = vfeWorkflowStepsAdps;
/*  77 */     this.vfeWorkflowOutputAdps = vfeWorkflowOutputAdps;
/*  78 */     this.vfeWorkflowDetailOutputAdps = vfeWorkflowDetailOutputAdps;
/*  79 */     this.vfeWorkflowInputAdps = vfeWorkflowInputAdps;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @EmbeddedId
/*     */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)),
            @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/*     */   @Order(1)
/*  88 */   public VfeWorkflowsAdpId getId() { return this.id; }
/*     */ 
/*     */ 
/*     */   
/*  92 */   public void setId(VfeWorkflowsAdpId id) { this.id = id; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "MAP_OUTPUT_TO_XML")
/*     */   @Order(8)
/*  99 */   public VfeLkBooleanAdp getMapOutputToXml() { return this.mapOutputToXml; }
/*     */ 
/*     */ 
/*     */   
/* 103 */   public void setMapOutputToXml(VfeLkBooleanAdp mapOutputToXml) { this.mapOutputToXml = mapOutputToXml; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "RETURN_ALL_OUTPUTS")
/*     */   @Order(5)
/* 110 */   public VfeLkBooleanAdp getReturnAllOutputs() { return this.returnAllOutputs; }
/*     */ 
/*     */ 
/*     */   
/* 114 */   public void setReturnAllOutputs(VfeLkBooleanAdp returnAllOutputs) { this.returnAllOutputs = returnAllOutputs; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "DO_COMMIT")
/*     */   @Order(6)
/* 121 */   public VfeLkBooleanAdp getDoCommit() { return this.doCommit; }
/*     */ 
/*     */ 
/*     */   
/* 125 */   public void setDoCommit(VfeLkBooleanAdp doCommit) { this.doCommit = doCommit; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "ELIGIBLE_TO_CREATE")
/*     */   @Order(7)
/* 132 */   public VfeLkBooleanAdp getEligibleToCreate() { return this.eligibleToCreate; }
/*     */ 
/*     */ 
/*     */   
/* 136 */   public void setEligibleToCreate(VfeLkBooleanAdp eligibleToCreate) { this.eligibleToCreate = eligibleToCreate; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "XML_TEMPLATE", length = 2000)
/*     */   @Order(9)
/* 142 */   public String getXmlTemplate() { return this.xmlTemplate; }
/*     */ 
/*     */ 
/*     */   
/* 146 */   public void setXmlTemplate(String xmlTemplate) { this.xmlTemplate = xmlTemplate; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "XML_PARAM_NAME", length = 200)
/*     */   @Order(10)
/* 152 */   public String getXmlParamName() { return this.xmlParamName; }
/*     */ 
/*     */ 
/*     */   
/* 156 */   public void setXmlParamName(String xmlParamName) { this.xmlParamName = xmlParamName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "LISTENER_NAME", length = 900)
/*     */   @Order(11)
/* 162 */   public String getListenerName() { return this.listenerName; }
/*     */ 
/*     */ 
/*     */   
/* 166 */   public void setListenerName(String listenerName) { this.listenerName = listenerName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "OUTPUT_CLASS_NAME", length = 4000)
/*     */   @Order(12)
/* 172 */   public String getOutputClassName() { return this.outputClassName; }
/*     */ 
/*     */ 
/*     */   
/* 176 */   public void setOutputClassName(String outputClassName) { this.outputClassName = outputClassName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "OPERATION_NAME", length = 200)
/*     */   @Order(13)
/* 182 */   public String getOperationName() { return this.operationName; }
/*     */ 
/*     */ 
/*     */   
/* 186 */   public void setOperationName(String operationName) { this.operationName = operationName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "ACTION_TYPE", length = 200)
/*     */   @Order(4)
/* 192 */   public String getActionType() { return this.actionType; }
/*     */ 
/*     */ 
/*     */   
/* 196 */   public void setActionType(String actionType) { this.actionType = actionType; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "FLOW_NAME", length = 200)
/*     */   @Order(2)
/* 202 */   public String getFlowName() { return this.flowName; }
/*     */ 
/*     */ 
/*     */   
/* 206 */   public void setFlowName(String flowName) { this.flowName = flowName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToOne(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowsAdp")
/*     */   @Order(3)
/* 212 */   public VfeWorkflowVersionsAdp getVfeWorkflowVersionsAdp() { return this.vfeWorkflowVersionsAdp; }
/*     */ 
/*     */ 
/*     */   
/* 216 */   public void setVfeWorkflowVersionsAdp(VfeWorkflowVersionsAdp vfeWorkflowVersionsAdp) { this.vfeWorkflowVersionsAdp = vfeWorkflowVersionsAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToOne(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowsAdp")
/*     */   @Order(19)
/* 222 */   public VfeWorkflowLogAdp getVfeWorkflowLogAdp() { return this.vfeWorkflowLogAdp; }
/*     */ 
/*     */ 
/*     */   
/* 226 */   public void setVfeWorkflowLogAdp(VfeWorkflowLogAdp vfeWorkflowLogAdp) { this.vfeWorkflowLogAdp = vfeWorkflowLogAdp; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToOne(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowsAdp")
/*     */   @Order(15)
/* 242 */   public VfeCmsLoadingExceptionsAdp getVfeCmsLoadingExceptionsAdp() { return this.vfeCmsLoadingExceptionsAdp; }
/*     */ 
/*     */ 
/*     */   
/* 246 */   public void setVfeCmsLoadingExceptionsAdp(VfeCmsLoadingExceptionsAdp vfeCmsLoadingExceptionsAdp) { this.vfeCmsLoadingExceptionsAdp = vfeCmsLoadingExceptionsAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OrderBy("id.currentOrder asc, id.activityId asc, subOrder asc")
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowsAdp")
/*     */   @Order(20)
/* 253 */   public Set<VfeWorkflowStepsAdp> getVfeWorkflowStepsAdps() { return this.vfeWorkflowStepsAdps; }
/*     */ 
/*     */ 
/*     */   
/* 257 */   public void setVfeWorkflowStepsAdps(Set<VfeWorkflowStepsAdp> vfeWorkflowStepsAdps) { this.vfeWorkflowStepsAdps = vfeWorkflowStepsAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowsAdp")
/*     */   @Order(17)
/* 263 */   public Set<VfeWorkflowOutputAdp> getVfeWorkflowOutputAdps() { return this.vfeWorkflowOutputAdps; }
/*     */ 
/*     */ 
/*     */   
/* 267 */   public void setVfeWorkflowOutputAdps(Set<VfeWorkflowOutputAdp> vfeWorkflowOutputAdps) { this.vfeWorkflowOutputAdps = vfeWorkflowOutputAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowsAdp")
/*     */   @Order(18)
/* 273 */   public Set<VfeWorkflowDetailOutputAdp> getVfeWorkflowDetailOutputAdps() { return this.vfeWorkflowDetailOutputAdps; }
/*     */ 
/*     */ 
/*     */   
/* 277 */   public void setVfeWorkflowDetailOutputAdps(Set<VfeWorkflowDetailOutputAdp> vfeWorkflowDetailOutputAdps) { this.vfeWorkflowDetailOutputAdps = vfeWorkflowDetailOutputAdps; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeWorkflowsAdp")
/*     */   @Order(16)
/* 283 */   public Set<VfeWorkflowInputAdp> getVfeWorkflowInputAdps() { return this.vfeWorkflowInputAdps; }
/*     */ 
/*     */ 
/*     */   
/* 287 */   public void setVfeWorkflowInputAdps(Set<VfeWorkflowInputAdp> vfeWorkflowInputAdps) { this.vfeWorkflowInputAdps = vfeWorkflowInputAdps; }
/*     */ }


