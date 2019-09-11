/*    */ package com.vodafone.wfx.model;
/*    */ 
/*    */ import java.io.Serializable;
/*    */ import java.math.BigDecimal;
/*    */ import javax.persistence.Column;
/*    */ import javax.persistence.Entity;
/*    */ import javax.persistence.Id;
/*    */ import javax.persistence.Table;
/*    */ 
/*    */ @Entity
/*    */ @Table(name = "VFE_LK_SSH_SERVERS_ADP")
/*    */ public class VfeLkSshServersAdp
/*    */   implements Serializable
/*    */ {
/*    */   private Long sshServerId;
/*    */   private String ip;
/*    */   private String username;
/*    */   private String password;
/*    */   private Integer port;
/*    */   /*    */   
/*    */   public VfeLkSshServersAdp() {}
/*    */   /*    */   
/* 23 */   public VfeLkSshServersAdp(Long sshServerId) { this.sshServerId = sshServerId; }
/*    */ 
/*    */   /*    */ 
/*    */   
/*    */   public VfeLkSshServersAdp(Long sshServerId, String ip, String username, String password, Integer port) {
/* 27 */     this.sshServerId = sshServerId;
/* 28 */     this.ip = ip;
/* 29 */     this.username = username;
/* 30 */     this.password = password;
/* 31 */     this.port = port;
/*    */   }
/*    */ 
/*    */   
/*    */   @Id
/*    */   @Column(name = "SSH_SERVER_ID", unique = true, precision = 22, scale = 0)
/* 37 */   public Long getSshServerId() { return this.sshServerId; }
/*    */ 
/*    */ 
/*    */   
/* 41 */   public void setSshServerId(Long sshServerId) { this.sshServerId = sshServerId; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "IP", length = 100)
/* 46 */   public String getIp() { return this.ip; }
/*    */ 
/*    */ 
/*    */   
/* 50 */   public void setIp(String ip) { this.ip = ip; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "USERNAME", length = 500)
/* 55 */   public String getUsername() { return this.username; }
/*    */ 
/*    */ 
/*    */   
/* 59 */   public void setUsername(String username) { this.username = username; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PASSWORD", length = 500)
/* 64 */   public String getPassword() { return this.password; }
/*    */ 
/*    */ 
/*    */   
/* 68 */   public void setPassword(String password) { this.password = password; }
/*    */ 
/*    */ 
/*    */   
/*    */   @Column(name = "PORT", precision = 6, scale = 0)
/* 73 */   public Integer getPort() { return this.port; }
/*    */ 
/*    */ 
/*    */   
/* 77 */   public void setPort(Integer port) { this.port = port; }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/* 82 */   public String toString() { return "[" + this.sshServerId + "] " + this.ip + ":" + this.port; }
/*    */ }


