/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.FetchType;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.JoinColumn;
/*     */ import javax.persistence.ManyToOne;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "VFE_SP_ACTIVITY_PARAMS_ADP")
/*     */ @Identifier("getParamName")
/*     */ public class VfeSpActivityParamsAdp
/*     */   implements Serializable
/*     */ {
/*     */   private BigDecimal paramId;
/*     */   private String paramName;
/*     */   private String paramDataType;
/*     */   private Long paramOrder;
/*     */   private VfeLkSpParamTypeAdp vfeLkSpParamTypeAdp;
/*     */   private VfeLkStoredProceduresAdp vfeLkStoredProceduresAdp;
/*     */   /*     */   
/*     */   public VfeSpActivityParamsAdp() {}
/*     */   /*     */   
/*  32 */   public VfeSpActivityParamsAdp(BigDecimal paramId) { this.paramId = paramId; }
/*     */ 
/*     */ 
/*     */   /*     */ 
/*     */ 
/*     */   
/*     */   public VfeSpActivityParamsAdp(BigDecimal paramId, VfeLkStoredProceduresAdp vfeLkStoredProceduresAdp, String paramName, String paramDataType, Long paramOrder, VfeLkSpParamTypeAdp vfeLkSpParamTypeAdp) {
/*  37 */     this.paramId = paramId;
/*  38 */     this.vfeLkStoredProceduresAdp = vfeLkStoredProceduresAdp;
/*  39 */     this.paramName = paramName;
/*  40 */     this.paramDataType = paramDataType;
/*  41 */     this.paramOrder = paramOrder;
/*  42 */     this.vfeLkSpParamTypeAdp = vfeLkSpParamTypeAdp;
/*     */   }
/*     */ 
/*     */   
/*     */   @Id
/*     */   @Column(name = "PARAM_ID", unique = true, precision = 22, scale = 0)
/*     */   @Order(1)
/*  49 */   public BigDecimal getParamId() { return this.paramId; }
/*     */ 
/*     */ 
/*     */   
/*  53 */   public void setParamId(BigDecimal paramId) { this.paramId = paramId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "SP_ID", nullable = false, insertable = false, updatable = false)
/*  59 */   public VfeLkStoredProceduresAdp getVfeLkStoredProceduresAdp() { return this.vfeLkStoredProceduresAdp; }
/*     */ 
/*     */ 
/*     */   
/*  63 */   public void setVfeLkStoredProceduresAdp(VfeLkStoredProceduresAdp vfeLkStoredProceduresAdp) { this.vfeLkStoredProceduresAdp = vfeLkStoredProceduresAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "PARAM_NAME", length = 500)
/*     */   @Order(3)
/*  69 */   public String getParamName() { return this.paramName; }
/*     */ 
/*     */ 
/*     */   
/*  73 */   public void setParamName(String paramName) { this.paramName = paramName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "PARAM_DATA_TYPE", length = 200)
/*     */   @Order(4)
/*  79 */   public String getParamDataType() { return this.paramDataType; }
/*     */ 
/*     */ 
/*     */   
/*  83 */   public void setParamDataType(String paramDataType) { this.paramDataType = paramDataType; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "PARAM_ORDER", precision = 10, scale = 0)
/*     */   @Order(2)
/*  89 */   public Long getParamOrder() { return this.paramOrder; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void setParamOrder(Long paramOrder) { this.paramOrder = paramOrder; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "PARAM_TYPE_ID")
/*     */   @Order(5)
/* 100 */   public VfeLkSpParamTypeAdp getVfeLkSpParamTypeAdp() { return this.vfeLkSpParamTypeAdp; }
/*     */ 
/*     */ 
/*     */   
/* 104 */   public void setVfeLkSpParamTypeAdp(VfeLkSpParamTypeAdp vfeLkSpParamTypeAdp) { this.vfeLkSpParamTypeAdp = vfeLkSpParamTypeAdp; }
/*     */ }

