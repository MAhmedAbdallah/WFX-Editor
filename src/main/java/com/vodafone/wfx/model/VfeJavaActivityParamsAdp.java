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
/*    */ @Table(name = "VFE_JAVA_ACTIVITY_PARAMS_ADP")
/*    */ @Identifier("getId.getParameterName")
/*    */ public class VfeJavaActivityParamsAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeJavaActivityParamsAdpId id;
/*    */   private VfeWorkflowStepsAdp vfeWorkflowStepsAdp;
/*    */   private String parameterPath;
/*    */   /*    */   
/*    */   public VfeJavaActivityParamsAdp() {}
/*    */   /*    */   
/* 28 */   public VfeJavaActivityParamsAdp(VfeJavaActivityParamsAdpId id) { this.id = id; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeJavaActivityParamsAdp(VfeJavaActivityParamsAdpId id, String parameterPath) {
/* 32 */     this.id = id;
/* 33 */     this.parameterPath = parameterPath;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "activityId", column = @Column(name = "ACTIVITY_ID", precision = 18, scale = 0)), @AttributeOverride(name = "parameterName", column = @Column(name = "PARAMETER_NAME", length = 200)), @AttributeOverride(name = "currentOrder", column = @Column(name = "CURRENT_ORDER", precision = 12, scale = 0)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/*    */   @Order(1)
/* 45 */   public VfeJavaActivityParamsAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public void setId(VfeJavaActivityParamsAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PARAMETER_PATH", length = 200)
/*    */   @Order(2)
/* 55 */   public String getParameterPath() { return this.parameterPath; }
/*    */ 
/*    */ 
/*    */   
/* 59 */   public void setParameterPath(String parameterPath) { this.parameterPath = parameterPath; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "CURRENT_ORDER", referencedColumnName = "CURRENT_ORDER", nullable = false, insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", nullable = false, insertable = false, updatable = false)})
/* 69 */   public VfeWorkflowStepsAdp getVfeWorkflowStepsAdp() { return this.vfeWorkflowStepsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 73 */   public void setVfeWorkflowStepsAdp(VfeWorkflowStepsAdp vfeWorkflowStepsAdp) { this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp; }
/*    */ }


