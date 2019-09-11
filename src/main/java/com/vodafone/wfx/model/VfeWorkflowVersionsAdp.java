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
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.OneToOne;
/*    */ import javax.persistence.PrimaryKeyJoinColumn;
/*    */ import javax.persistence.Table;
/*    */ import javax.persistence.UniqueConstraint;
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_WORKFLOW_VERSIONS_ADP", uniqueConstraints = {@UniqueConstraint(columnNames = {"WORKFLOW_ID", "IS_DEFAULT"})})
/*    */ public class VfeWorkflowVersionsAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeWorkflowsAdpId id;
/*    */   private VfeWorkflowsAdp vfeWorkflowsAdp;
/*    */   private VfeLkBooleanAdp isDefault;
/*    */   private String comments;
/*    */   /*    */   
/*    */   public VfeWorkflowVersionsAdp() {}
/*    */   /*    */   
/* 31 */   public VfeWorkflowVersionsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeWorkflowVersionsAdp(VfeWorkflowsAdp vfeWorkflowsAdp, VfeLkBooleanAdp isDefault, String comments) {
/* 35 */     this.vfeWorkflowsAdp = vfeWorkflowsAdp;
/* 36 */     this.isDefault = isDefault;
/* 37 */     this.comments = comments;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({
          @AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0))
        , @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0))})
/* 45 */   public VfeWorkflowsAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public void setId(VfeWorkflowsAdpId id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @OneToOne(fetch = FetchType.EAGER)
/*    */   @PrimaryKeyJoinColumn
/* 55 */   public VfeWorkflowsAdp getVfeWorkflowsAdp() { return this.vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 59 */   public void setVfeWorkflowsAdp(VfeWorkflowsAdp vfeWorkflowsAdp) { this.vfeWorkflowsAdp = vfeWorkflowsAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumn(name = "IS_DEFAULT")
/* 65 */   public VfeLkBooleanAdp getIsDefault() { return this.isDefault; }
/*    */ 
/*    */ 
/*    */   
/* 69 */   public void setIsDefault(VfeLkBooleanAdp isDefault) { this.isDefault = isDefault; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "COMMENTS", length = 2000)
/* 74 */   public String getComments() { return this.comments; }
/*    */ 
/*    */ 
/*    */   
/* 78 */   public void setComments(String comments) { this.comments = comments; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 83 */   public String toString() { return "[" + this.id.getVersionId() + "] " + this.isDefault.toString(); }
/*    */ }

