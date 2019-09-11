/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_LK_ACTIVITIES_TYPE_ADP")
/*    */ public class VfeLkActivitiesTypeAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Long activityTypeId;
/*    */   private String description;
/*    */   /*    */   
/*    */   public VfeLkActivitiesTypeAdp() {}
/*    */   /*    */   
/* 20 */   public VfeLkActivitiesTypeAdp(Long activityTypeId) { this.activityTypeId = activityTypeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ACTIVITY_TYPE_ID", unique = true, precision = 18, scale = 0)
/* 26 */   public Long getActivityTypeId() { return this.activityTypeId; }
/*    */ 
/*    */ 
/*    */   
/* 30 */   public void setActivityTypeId(Long activityTypeId) { this.activityTypeId = activityTypeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "DESCRIPTION", length = 200)
/* 35 */   public String getDescription() { return this.description; }
/*    */ 
/*    */ 
/*    */   
/* 39 */   public void setDescription(String description) { this.description = description; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 44 */   public String toString() { return this.description; }
/*    */ }


