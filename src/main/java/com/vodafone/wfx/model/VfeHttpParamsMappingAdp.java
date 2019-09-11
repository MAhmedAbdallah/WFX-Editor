/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.AttributeOverride;
/*    */ import javax.persistence.AttributeOverrides;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.JoinColumns;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_HTTP_PARAMS_MAPPING_ADP")
/*    */ @Identifier("getId.getHttpParam")
/*    */ public class VfeHttpParamsMappingAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeHttpParamsMappingAdpId id;
/*    */   private VfeWorkflowStepsAdp vfeWorkflowStepsAdp;
/*    */   private String poolMapParam;
/*    */   private String paramType;
/*    */   private String httpParamXpath;
/*    */   /*    */   
/*    */   public VfeHttpParamsMappingAdp() {}
/*    */   /*    */   
/* 30 */   public VfeHttpParamsMappingAdp(VfeHttpParamsMappingAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0)), @AttributeOverride(name = "activityId", column = @Column(name = "ACTIVITY_ID", precision = 18, scale = 0)), @AttributeOverride(name = "currentOrder", column = @Column(name = "CURRENT_ORDER", precision = 12, scale = 0)), @AttributeOverride(name = "httpParam", column = @Column(name = "HTTP_PARAM", length = 200))})
/*    */   @Order(1)
/* 42 */   public VfeHttpParamsMappingAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 46 */   public void setId(VfeHttpParamsMappingAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "POOL_MAP_PARAM", length = 200)
/*    */   @Order(4)
/* 52 */   public String getPoolMapParam() { return this.poolMapParam; }
/*    */ 
/*    */ 
/*    */   
/* 56 */   public void setPoolMapParam(String poolMapParam) { this.poolMapParam = poolMapParam; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PARAM_TYPE", length = 200)
/*    */   @Order(2)
/* 62 */   public String getParamType() { return this.paramType; }
/*    */ 
/*    */ 
/*    */   
/* 66 */   public void setParamType(String paramType) { this.paramType = paramType; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "HTTP_PARAM_XPATH", length = 200)
/*    */   @Order(3)
/* 72 */   public String getHttpParamXpath() { return this.httpParamXpath; }
/*    */ 
/*    */ 
/*    */   
/* 76 */   public void setHttpParamXpath(String httpParamXpath) { this.httpParamXpath = httpParamXpath; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "CURRENT_ORDER", referencedColumnName = "CURRENT_ORDER", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", nullable = false, insertable = false, updatable = false)})
/* 86 */   public VfeWorkflowStepsAdp getVfeWorkflowStepsAdp() { return this.vfeWorkflowStepsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 90 */   public void setVfeWorkflowStepsAdp(VfeWorkflowStepsAdp vfeWorkflowStepsAdp) { this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp; }
/*    */ }

