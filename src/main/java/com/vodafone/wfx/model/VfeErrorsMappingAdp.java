/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.AttributeOverride;
/*    */ import javax.persistence.AttributeOverrides;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.EmbeddedId;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_ERRORS_MAPPING_ADP")
/*    */ public class VfeErrorsMappingAdp
/*    */   implements Serializable
/*    */ {
/*    */   private VfeErrorsMappingAdpId id;
/*    */   /*    */   
/*    */   public VfeErrorsMappingAdp() {}
/*    */   /*    */   
/* 25 */   public VfeErrorsMappingAdp(VfeErrorsMappingAdpId id) { this.id = id; }
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
/*    */   @EmbeddedId
/*    */   @AttributeOverrides({@AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 22, scale = 0)), @AttributeOverride(name = "errorCode", column = @Column(name = "ERROR_CODE", length = 400)), @AttributeOverride(name = "maskedErrorCode", column = @Column(name = "MASKED_ERROR_CODE", length = 400)), @AttributeOverride(name = "errorMessage", column = @Column(name = "ERROR_MESSAGE", length = 400)), @AttributeOverride(name = "maskedErrorMessage", column = @Column(name = "MASKED_ERROR_MESSAGE", length = 400)), @AttributeOverride(name = "priority", column = @Column(name = "PRIORITY", precision = 22, scale = 0))})
/* 38 */   public VfeErrorsMappingAdpId getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 42 */   public void setId(VfeErrorsMappingAdpId id) { this.id = id; }
/*    */ }


