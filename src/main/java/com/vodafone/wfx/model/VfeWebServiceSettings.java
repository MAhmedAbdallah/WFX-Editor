/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_WEB_SERVICE_SETTINGS")
/*    */ public class VfeWebServiceSettings
/*    */   implements Serializable
/*    */ {
/*    */   private Long id;
/*    */   private String wsdlPath;
/*    */   private String urlEndpoint;
/*    */   /*    */   
/*    */   public VfeWebServiceSettings() {}
/*    */   /*    */   
/* 22 */   public VfeWebServiceSettings(Long id) { this.id = id; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeWebServiceSettings(Long id, String wsdlPath, String urlEndpoint) {
/* 26 */     this.id = id;
/* 27 */     this.wsdlPath = wsdlPath;
/* 28 */     this.urlEndpoint = urlEndpoint;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "ID", unique = true, precision = 22, scale = 0)
/* 34 */   public Long getId() { return this.id; }
/*    */ 
/*    */ 
/*    */   
/* 38 */   public void setId(Long id) { this.id = id; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "WSDL_PATH", length = 500)
/* 43 */   public String getWsdlPath() { return this.wsdlPath; }
/*    */ 
/*    */ 
/*    */   
/* 47 */   public void setWsdlPath(String wsdlPath) { this.wsdlPath = wsdlPath; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "URL_ENDPOINT", length = 500)
/* 52 */   public String getUrlEndpoint() { return this.urlEndpoint; }
/*    */ 
/*    */ 
/*    */   
/* 56 */   public void setUrlEndpoint(String urlEndpoint) { this.urlEndpoint = urlEndpoint; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 61 */   public String toString() { return "[" + this.wsdlPath + "] " + this.urlEndpoint; }
/*    */ }
