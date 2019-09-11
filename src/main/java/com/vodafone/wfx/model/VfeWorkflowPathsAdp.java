/*     */ package com.vodafone.wfx.model;
/*     */ 
import com.vodafone.wfx.util.HibernateUtil;
/*     */ import java.io.Serializable;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
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
/*     */ import javax.persistence.Table;
/*     */ import org.hibernate.Session;
/*     */ import org.hibernate.criterion.Restrictions;
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "VFE_WORKFLOW_PATHS_ADP")
/*     */ @Identifier("getId.getPathId")
/*     */ public class VfeWorkflowPathsAdp
/*     */   implements Serializable
/*     */ {
/*     */   private VfeWorkflowPathsAdpId id;
/*     */   private VfeWorkflowStepsAdp vfeWorkflowStepsAdp;
/*     */   private Long parentPathId;
/*     */   private VfeLkBooleanAdp onExit;
/*     */   private Long subOrder;
/*  33 */   private Set<VfeWorkflowConditionsAdp> vfeWorkflowConditionsAdps = new HashSet();
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
/*     */   @EmbeddedId
/*     */   @AttributeOverrides({@AttributeOverride(name = "pathId", column = @Column(name = "PATH_ID", precision = 10, scale = 0)), @AttributeOverride(name = "workflowId", column = @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)), @AttributeOverride(name = "versionId", column = @Column(name = "VERSION_ID", precision = 18, scale = 0)), @AttributeOverride(name = "currentOrder", column = @Column(name = "CURRENT_ORDER", precision = 12, scale = 0))})
/*  48 */   public VfeWorkflowPathsAdpId getId() { return this.id; }
/*     */ 
/*     */ 
/*     */   
/*  52 */   public void setId(VfeWorkflowPathsAdpId id) { this.id = id; }
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Ignore
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumns({@JoinColumn(name = "WORKFLOW_ID", referencedColumnName = "WORKFLOW_ID", insertable = false, updatable = false), @JoinColumn(name = "ACTIVITY_ID", referencedColumnName = "ACTIVITY_ID", insertable = false, updatable = false), @JoinColumn(name = "CURRENT_ORDER", referencedColumnName = "CURRENT_ORDER", insertable = false, updatable = false), @JoinColumn(name = "VERSION_ID", referencedColumnName = "VERSION_ID", insertable = false, updatable = false)})
/*  74 */   public VfeWorkflowStepsAdp getVfeWorkflowStepsAdp() { return this.vfeWorkflowStepsAdp; }
/*     */ 
/*     */ 
/*     */   
/*  78 */   public void setVfeWorkflowStepsAdp(VfeWorkflowStepsAdp vfeWorkflowStepsAdp) { this.vfeWorkflowStepsAdp = vfeWorkflowStepsAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "ON_EXIT", insertable = false, updatable = false)
/*  84 */   public VfeLkBooleanAdp getOnExit() { return this.onExit; }
/*     */ 
/*     */ 
/*     */   
/*  88 */   public void setOnExit(VfeLkBooleanAdp onExit) { this.onExit = onExit; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "PARENT_PATH_ID", precision = 10, scale = 0)
/*  93 */   public Long getParentPathId() { return this.parentPathId; }
/*     */ 
/*     */ 
/*     */   
/*  97 */   public void setParentPathId(Long parentPathId) { this.parentPathId = parentPathId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "SUB_ORDER", precision = 18, scale = 0)
/* 102 */   public Long getSubOrder() { return this.subOrder; }
/*     */ 
/*     */ 
/*     */   
/* 106 */   public void setSubOrder(Long subOrder) { this.subOrder = subOrder; }
/*     */ 
/*     */ 
/*     */   
/*     */   @OneToMany(fetch = FetchType.LAZY)
/*     */   public Set<VfeWorkflowConditionsAdp> getVfeWorkflowConditionsAdps() {
/* 112 */     Session session = HibernateUtil.getSessionFactory().openSession();
/* 113 */     session.beginTransaction();
/* 114 */     List conditions = session.createCriteria(VfeWorkflowConditionsAdp.class).add(Restrictions.eq("pathId", this.id.getPathId())).add(Restrictions.eq("id.workflowId", this.id.getWorkflowId())).add(Restrictions.eq("id.versionId", this.id.getVersionId())).list();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 120 */     return new HashSet(conditions);
/*     */   }
/*     */ 
/*     */   
/* 124 */   public void setVfeWorkflowConditionsAdps(Set<VfeWorkflowConditionsAdp> vfeWorkflowConditionsAdps) { this.vfeWorkflowConditionsAdps = vfeWorkflowConditionsAdps; }
/*     */ }
