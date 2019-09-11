/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
/*     */ import java.math.BigDecimal;
/*     */ import javax.persistence.Column;
/*     */ import javax.persistence.Entity;
/*     */ import javax.persistence.Id;
/*     */ import javax.persistence.Table;
/*     */ 
/*     */ 
/*     */ @Entity
/*     */ @Table(name = "VFE_HTTP_SYSTEMS_ADP")
/*     */ public class VfeHttpSystemsAdp
/*     */   implements Serializable
/*     */ {
/*     */   private Long systemId;
/*     */   private String responseStartIndex;
/*     */   private String responseEndIndex;
/*     */   private String responseSuccessCodes;
/*     */   private String systemName;
/*     */   private String responseParamSeparator;
/*     */   private String responseKeySeparator;
/*     */   private String responseXpathKey;
/*     */   private BigDecimal connectTimeout;
/*     */   private BigDecimal readTimeout;
/*     */   /*     */   
/*     */   public VfeHttpSystemsAdp() {}
/*     */   /*     */   
/*  29 */   public VfeHttpSystemsAdp(Long systemId) { this.systemId = systemId; }
/*     */ 
/*     */ 
/*     */ 
/*     */   /*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VfeHttpSystemsAdp(Long systemId, String responseStartIndex, String responseEndIndex, String responseSuccessCodes, String systemName, String responseParamSeparator, String responseKeySeparator, String responseXpathKey, BigDecimal connectTimeout, BigDecimal readTimeout) {
/*  35 */     this.systemId = systemId;
/*  36 */     this.responseStartIndex = responseStartIndex;
/*  37 */     this.responseEndIndex = responseEndIndex;
/*  38 */     this.responseSuccessCodes = responseSuccessCodes;
/*  39 */     this.systemName = systemName;
/*  40 */     this.responseParamSeparator = responseParamSeparator;
/*  41 */     this.responseKeySeparator = responseKeySeparator;
/*  42 */     this.responseXpathKey = responseXpathKey;
/*  43 */     this.connectTimeout = connectTimeout;
/*  44 */     this.readTimeout = readTimeout;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Id
/*     */   @Column(name = "SYSTEM_ID", unique = true, precision = 10, scale = 0)
/*  51 */   public Long getSystemId() { return this.systemId; }
/*     */ 
/*     */ 
/*     */   
/*  55 */   public void setSystemId(Long systemId) { this.systemId = systemId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RESPONSE_START_INDEX", length = 200)
/*  60 */   public String getResponseStartIndex() { return this.responseStartIndex; }
/*     */ 
/*     */ 
/*     */   
/*  64 */   public void setResponseStartIndex(String responseStartIndex) { this.responseStartIndex = responseStartIndex; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RESPONSE_END_INDEX", length = 200)
/*  69 */   public String getResponseEndIndex() { return this.responseEndIndex; }
/*     */ 
/*     */ 
/*     */   
/*  73 */   public void setResponseEndIndex(String responseEndIndex) { this.responseEndIndex = responseEndIndex; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RESPONSE_SUCCESS_CODES", length = 200)
/*  78 */   public String getResponseSuccessCodes() { return this.responseSuccessCodes; }
/*     */ 
/*     */ 
/*     */   
/*  82 */   public void setResponseSuccessCodes(String responseSuccessCodes) { this.responseSuccessCodes = responseSuccessCodes; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "SYSTEM_NAME", length = 200)
/*  87 */   public String getSystemName() { return this.systemName; }
/*     */ 
/*     */ 
/*     */   
/*  91 */   public void setSystemName(String systemName) { this.systemName = systemName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RESPONSE_PARAM_SEPARATOR", length = 200)
/*  96 */   public String getResponseParamSeparator() { return this.responseParamSeparator; }
/*     */ 
/*     */ 
/*     */   
/* 100 */   public void setResponseParamSeparator(String responseParamSeparator) { this.responseParamSeparator = responseParamSeparator; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RESPONSE_KEY_SEPARATOR", length = 200)
/* 105 */   public String getResponseKeySeparator() { return this.responseKeySeparator; }
/*     */ 
/*     */ 
/*     */   
/* 109 */   public void setResponseKeySeparator(String responseKeySeparator) { this.responseKeySeparator = responseKeySeparator; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "RESPONSE_XPATH_KEY", length = 200)
/* 114 */   public String getResponseXpathKey() { return this.responseXpathKey; }
/*     */ 
/*     */ 
/*     */   
/* 118 */   public void setResponseXpathKey(String responseXpathKey) { this.responseXpathKey = responseXpathKey; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "CONNECT_TIMEOUT", precision = 22, scale = 0)
/* 123 */   public BigDecimal getConnectTimeout() { return this.connectTimeout; }
/*     */ 
/*     */ 
/*     */   
/* 127 */   public void setConnectTimeout(BigDecimal connectTimeout) { this.connectTimeout = connectTimeout; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "READ_TIMEOUT", precision = 22, scale = 0)
/* 132 */   public BigDecimal getReadTimeout() { return this.readTimeout; }
/*     */ 
/*     */ 
/*     */   
/* 136 */   public void setReadTimeout(BigDecimal readTimeout) { this.readTimeout = readTimeout; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 141 */   public String toString() { return "[" + this.systemId + "] " + this.systemName; }
/*     */ }


