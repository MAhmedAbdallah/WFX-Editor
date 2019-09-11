/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import java.util.HashSet;
/*    */ import java.util.Set;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.OneToMany;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_LK_AIR_SERVER_TYPES_ADP")
/*    */ public class VfeLkAirServerTypesAdp
/*    */   implements Serializable {
/*    */   private BigDecimal airServerTypeId;
/*    */   private String airServerTypeName;
/* 20 */   private Set<VfeLkAirServersAdp> vfeLkAirServersAdps = new HashSet();
/*    */ 
/*    */ 
/*    */   /*    */ 
/*    */ 
/*    */   
/*    */   public VfeLkAirServerTypesAdp() {}
/*    */ 
/*    */   /*    */ 
/*    */   
/* 27 */   public VfeLkAirServerTypesAdp(BigDecimal airServerTypeId) { this.airServerTypeId = airServerTypeId; }
/*    */ 
/*    */ 
/*    */   /*    */ 
/*    */ 
/*    */   
/*    */   public VfeLkAirServerTypesAdp(BigDecimal airServerTypeId, String airServerTypeName, Set<VfeLkAirServersAdp> vfeLkAirServersAdps) {
/* 32 */     this.airServerTypeId = airServerTypeId;
/* 33 */     this.airServerTypeName = airServerTypeName;
/* 34 */     this.vfeLkAirServersAdps = vfeLkAirServersAdps;
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "AIR_SERVER_TYPE_ID", unique = true, precision = 22, scale = 1)
/* 41 */   public BigDecimal getAirServerTypeId() { return this.airServerTypeId; }
/*    */ 
/*    */ 
/*    */   
/* 45 */   public void setAirServerTypeId(BigDecimal airServerTypeId) { this.airServerTypeId = airServerTypeId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "AIR_SERVER_TYPE_NAME", length = 25)
/* 50 */   public String getAirServerTypeName() { return this.airServerTypeName; }
/*    */ 
/*    */ 
/*    */   
/* 54 */   public void setAirServerTypeName(String airServerTypeName) { this.airServerTypeName = airServerTypeName; }
/*    */ 
/*    */ 
/*    */   
/*    */   @OneToMany(fetch = FetchType.LAZY, mappedBy = "vfeLkAirServerTypesAdp")
/* 59 */   public Set<VfeLkAirServersAdp> getVfeLkAirServersAdps() { return this.vfeLkAirServersAdps; }
/*    */ 
/*    */ 
/*    */   
/* 63 */   public void setVfeLkAirServersAdps(Set<VfeLkAirServersAdp> vfeLkAirServersAdps) { this.vfeLkAirServersAdps = vfeLkAirServersAdps; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 68 */   public String toString() { return this.airServerTypeName; }
/*    */ }


