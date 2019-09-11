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
/*     */ @Table(name = "VFE_LK_DB_ADP")
/*     */ public class VfeLkDbAdp
/*     */   implements Serializable
/*     */ {
/*     */   private Long id;
/*     */   private String databaseName;
/*     */   private String databaseUsername;
/*     */   private String databasePassword;
/*     */   private String databaseUrl;
/*     */   private Long initialPoolSize;
/*     */   private Long maxPoolSize;
/*     */   private Long minPoolSize;
/*     */   /*     */   
/*     */   public VfeLkDbAdp() {}
/*     */   /*     */   
/*  27 */   public VfeLkDbAdp(Long id) { this.id = id; }
/*     */ 
/*     */ 
/*     */   /*     */ 
/*     */ 
/*     */   
/*     */   public VfeLkDbAdp(Long id, String databaseName, String databaseUsername, String databasePassword, String databaseUrl, Long initialPoolSize, Long maxPoolSize, Long minPoolSize) {
/*  32 */     this.id = id;
/*  33 */     this.databaseName = databaseName;
/*  34 */     this.databaseUsername = databaseUsername;
/*  35 */     this.databasePassword = databasePassword;
/*  36 */     this.databaseUrl = databaseUrl;
/*  37 */     this.initialPoolSize = initialPoolSize;
/*  38 */     this.maxPoolSize = maxPoolSize;
/*  39 */     this.minPoolSize = minPoolSize;
/*     */   }
/*     */ 
/*     */   
/*     */   @Id
/*     */   @Column(name = "ID", unique = true, precision = 22, scale = 0)
/*  45 */   public Long getId() { return this.id; }
/*     */ 
/*     */ 
/*     */   
/*  49 */   public void setId(Long id) { this.id = id; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "DATABASE_NAME", length = 50)
/*  54 */   public String getDatabaseName() { return this.databaseName; }
/*     */ 
/*     */ 
/*     */   
/*  58 */   public void setDatabaseName(String databaseName) { this.databaseName = databaseName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "DATABASE_USERNAME", length = 50)
/*  63 */   public String getDatabaseUsername() { return this.databaseUsername; }
/*     */ 
/*     */ 
/*     */   
/*  67 */   public void setDatabaseUsername(String databaseUsername) { this.databaseUsername = databaseUsername; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "DATABASE_PASSWORD", length = 50)
/*  72 */   public String getDatabasePassword() { return this.databasePassword; }
/*     */ 
/*     */ 
/*     */   
/*  76 */   public void setDatabasePassword(String databasePassword) { this.databasePassword = databasePassword; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "DATABASE_URL", length = 200)
/*  81 */   public String getDatabaseUrl() { return this.databaseUrl; }
/*     */ 
/*     */ 
/*     */   
/*  85 */   public void setDatabaseUrl(String databaseUrl) { this.databaseUrl = databaseUrl; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "INITIAL_POOL_SIZE", precision = 22, scale = 0)
/*  90 */   public Long getInitialPoolSize() { return this.initialPoolSize; }
/*     */ 
/*     */ 
/*     */   
/*  94 */   public void setInitialPoolSize(Long initialPoolSize) { this.initialPoolSize = initialPoolSize; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "MAX_POOL_SIZE", precision = 22, scale = 0)
/*  99 */   public Long getMaxPoolSize() { return this.maxPoolSize; }
/*     */ 
/*     */ 
/*     */   
/* 103 */   public void setMaxPoolSize(Long maxPoolSize) { this.maxPoolSize = maxPoolSize; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "MIN_POOL_SIZE", precision = 22, scale = 0)
/* 108 */   public Long getMinPoolSize() { return this.minPoolSize; }
/*     */ 
/*     */ 
/*     */   
/* 112 */   public void setMinPoolSize(Long minPoolSize) { this.minPoolSize = minPoolSize; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/* 117 */   public String toString() { return "[" + this.databaseName + "] " + this.databaseUrl; }
/*     */ }


