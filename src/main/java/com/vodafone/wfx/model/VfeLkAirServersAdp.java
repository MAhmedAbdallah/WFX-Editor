/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.FetchType;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.JoinColumn;
/*    */ import javax.persistence.ManyToOne;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_LK_AIR_SERVERS_ADP")
/*    */ public class VfeLkAirServersAdp
/*    */   implements Serializable
/*    */ {
/*    */   private BigDecimal airServerId;
/*    */   private VfeLkAirServerTypesAdp vfeLkAirServerTypesAdp;
/*    */   private String airServerUrl;
/*    */   private String host;
/*    */   private String authorization;
/*    */   private String agent;
/*    */   /*    */   
/*    */   public VfeLkAirServersAdp() {}
/*    */   /*    */   
/* 28 */   public VfeLkAirServersAdp(BigDecimal airServerId) { this.airServerId = airServerId; }
/*    */ 
/*    */ 
/*    */   /*    */ 
/*    */ 
/*    */   
/*    */   public VfeLkAirServersAdp(BigDecimal airServerId, VfeLkAirServerTypesAdp vfeLkAirServerTypesAdp, String airServerUrl, String host, String authorization, String agent) {
/* 33 */     this.airServerId = airServerId;
/* 34 */     this.vfeLkAirServerTypesAdp = vfeLkAirServerTypesAdp;
/* 35 */     this.airServerUrl = airServerUrl;
/* 36 */     this.host = host;
/* 37 */     this.authorization = authorization;
/* 38 */     this.agent = agent;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "AIR_SERVER_ID", unique = true, precision = 22)
/* 44 */   public BigDecimal getAirServerId() { return this.airServerId; }
/*    */ 
/*    */ 
/*    */   
/* 48 */   public void setAirServerId(BigDecimal airServerId) { this.airServerId = airServerId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @ManyToOne(fetch = FetchType.EAGER)
/*    */   @JoinColumn(name = "SERVER_TYPE")
/* 54 */   public VfeLkAirServerTypesAdp getVfeLkAirServerTypesAdp() { return this.vfeLkAirServerTypesAdp; }
/*    */ 
/*    */ 
/*    */   
/* 58 */   public void setVfeLkAirServerTypesAdp(VfeLkAirServerTypesAdp vfeLkAirServerTypesAdp) { this.vfeLkAirServerTypesAdp = vfeLkAirServerTypesAdp; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "AIR_SERVER_URL", length = 75)
/* 63 */   public String getAirServerUrl() { return this.airServerUrl; }
/*    */ 
/*    */ 
/*    */   
/* 67 */   public void setAirServerUrl(String airServerUrl) { this.airServerUrl = airServerUrl; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "HOST", length = 25)
/* 72 */   public String getHost() { return this.host; }
/*    */ 
/*    */ 
/*    */   
/* 76 */   public void setHost(String host) { this.host = host; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "AUTHORIZATION", length = 50)
/* 81 */   public String getAuthorization() { return this.authorization; }
/*    */ 
/*    */ 
/*    */   
/* 85 */   public void setAuthorization(String authorization) { this.authorization = authorization; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "AGENT", length = 25)
/* 90 */   public String getAgent() { return this.agent; }
/*    */ 
/*    */ 
/*    */   
/* 94 */   public void setAgent(String agent) { this.agent = agent; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 99 */   public String toString() { return "[" + this.vfeLkAirServerTypesAdp.toString() + " ]" + this.airServerUrl; }
/*    */ }


