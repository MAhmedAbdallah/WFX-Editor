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
/*    */ @Table(name = "VFE_WORKFLOW_DETAIL_OUTPUT_ADP")
/*    */ @Identifier("getId.getParameterName")
/*    */ public class VfeWorkflowDetailOutputAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeWorkflowDetailOutputAdpId id;
/*    */   private VfeLkBooleanAdp isList;
/*    */   private VfeWorkflowsAdp vfeWorkflowsAdp;
/*    */   private String classFullName;
/*    */   private String itemClassName;
/*    */   /*    */   
/*    */   public VfeWorkflowDetailOutputAdp() {}
/*    */   /*    */   
/* 30 */   public VfeWorkflowDetailOutputAdp(VfeWorkflowDetailOutputAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   /*    */ 
/*    */ 
/*    */   
/*    */   public VfeWorkflowDetailOutputAdp(VfeWorkflowDetailOutputAdpId id, VfeLkBooleanAdp isList, VfeWorkflowsAdp vfeWorkflowsAdp, String classFullName, String itemClassName) {
/* 35 */     this.id = id;
/* 36 */     this.isList = isList;
/* 37 */     this.vfeWorkflowsAdp = vfeWorkflowsAdp;
/* 38 */     this.classFullName = classFullName;
/* 39 */     this.itemClassName = itemClassName;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "parameterName", column = @Column(name = "PARAMETER_NAME", length = 500)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/*    */   @Order(1)
/* 49 */   public VfeWorkflowDetailOutputAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 53 */   public void setId(VfeWorkflowDetailOutputAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumn(name = "IS_LIST")
/*    */   @Order(2)
/* 60 */   public VfeLkBooleanAdp getIsList() { return this.isList; }
/*    */ 
/*    */ 
/*    */   
/* 64 */   public void setIsList(VfeLkBooleanAdp isList) { this.isList = isList; }
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", insertable = false, updatable = false)})
/* 72 */   public VfeWorkflowsAdp getVfeWorkflowsAdp() { return this.vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 76 */   public void setVfeWorkflowsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "CLASS_FULL_NAME", length = 2000)
/*    */   @Order(3)
/* 82 */   public String getClassFullName() { return this.classFullName; }
/*    */ 
/*    */ 
/*    */   
/* 86 */   public void setClassFullName(String classFullName) { this.classFullName = classFullName; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "ITEM_CLASS_NAME", length = 2000)
/*    */   @Order(4)
/* 92 */   public String getItemClassName() { return this.itemClassName; }
/*    */ 
/*    */ 
/*    */   
/* 96 */   public void setItemClassName(String itemClassName) { this.itemClassName = itemClassName; }
/*    */ }

