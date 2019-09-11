/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_LK_STORED_PROCEDURES_ADP")
/*    */ @Identifier("getSpName")
/*    */ public class VfeLkStoredProceduresAdp
/*    */   implements Serializable {
/*    */   private Long spId;
/*    */   private VfeSpActivityParamsAdp vfeSpActivityParamsAdp;
/*    */   private String spName;
/*    */   private String spSuccessCodes;
/* 24 */   private Set<VfeSpActivityParamsAdp> vfeSpActivityParamsAdps = new HashSet();
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeLkStoredProceduresAdp() {}
/*    */ 
/*    */   /*    */ 
/*    */   
/* 30 */   public VfeLkStoredProceduresAdp(Long spId) { this.spId = spId; }
/*    */ 
/*    */ 
/*    */   /*    */ 
/*    */ 
/*    */   
/*    */   public VfeLkStoredProceduresAdp(Long spId, VfeSpActivityParamsAdp vfeSpActivityParamsAdp, String spName, String spSuccessCodes) {
/* 35 */     this.spId = spId;
/* 36 */     this.vfeSpActivityParamsAdp = vfeSpActivityParamsAdp;
/* 37 */     this.spName = spName;
/* 38 */     this.spSuccessCodes = spSuccessCodes;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "SP_ID", unique = true, precision = 10, scale = 0)
/*    */   @Order(1)
/* 45 */   public Long getSpId() { return this.spId; }
/*    */ 
/*    */ 
/*    */   
/* 49 */   public void setSpId(Long spId) { this.spId = spId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumn(name = "SP_CODE_PARAM_ID")
/*    */   @Order(4)
/* 56 */   public VfeSpActivityParamsAdp getVfeSpActivityParamsAdp() { return this.vfeSpActivityParamsAdp; }
/*    */ 
/*    */ 
/*    */   
/* 60 */   public void setVfeSpActivityParamsAdp(VfeSpActivityParamsAdp vfeSpActivityParamsAdp) { this.vfeSpActivityParamsAdp = vfeSpActivityParamsAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "SP_NAME", length = 200)
/*    */   @Order(2)
/* 66 */   public String getSpName() { return this.spName; }
/*    */ 
/*    */ 
/*    */   
/* 70 */   public void setSpName(String spName) { this.spName = spName; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "SP_SUCCESS_CODES", length = 200)
/*    */   @Order(3)
/* 76 */   public String getSpSuccessCodes() { return this.spSuccessCodes; }
/*    */ 
/*    */ 
/*    */   
/* 80 */   public void setSpSuccessCodes(String spSuccessCodes) { this.spSuccessCodes = spSuccessCodes; }
/*    */ 
/*    */ 
/*    */   
/*    */   @OneToMany(fetch = FetchType.EAGER, mappedBy = "vfeLkStoredProceduresAdp")
/*    */   @Order(5)
/* 86 */   public Set<VfeSpActivityParamsAdp> getVfeSpActivityParamsAdps() { return this.vfeSpActivityParamsAdps; }
/*    */ 
/*    */ 
/*    */   
/* 90 */   public void setVfeSpActivityParamsAdps(Set<VfeSpActivityParamsAdp> vfeSpActivityParamsAdps) { this.vfeSpActivityParamsAdps = vfeSpActivityParamsAdps; }
/*    */ }


