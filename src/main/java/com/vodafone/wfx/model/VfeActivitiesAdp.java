/*     */ package com.vodafone.wfx.model;
/*     */ 
/*     */ import java.io.Serializable;
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
/*     */ @Entity
/*     */ @Table(name = "VFE_ACTIVITIES_ADP")
/*     */ @Identifier("getDescription")
/*     */ public class VfeActivitiesAdp
/*     */   implements Serializable
/*     */ {
/*     */   private Long activityId;
/*     */   private VfeWebServiceSettings vfeWebServiceSettings;
/*     */   private VfeLkSshServersAdp vfeLkSshServersAdp;
/*     */   private VfeLkActivitiesTypeAdp vfeLkActivitiesTypeAdp;
/*     */   private VfeLkBooleanAdp doCache;
/*     */   private VfeLkHttpRequestTypeAdp vfeLkHttpRequestTypeAdp;
/*     */   private VfeLkStoredProceduresAdp vfeLkStoredProceduresAdp;
/*     */   private VfeLkDbAdp vfeLkDbAdp;
/*     */   private String description;
/*     */   private String dbQuery;
/*     */   private String workflowName;
/*     */   private String cmsFunction;
/*     */   private String httpUrl;
/*     */   private VfeHttpSystemsAdp systemId;
/*     */   private Long sleepTime;
/*     */   private String httpXmlInput;
/*     */   private String interfaceName;
/*     */   private String operationName;
/*     */   private String inputName;
/*     */   private Long queryTimeout;
/*     */   private String inputCommand;
/*     */   private String commandOutputSeparator;
/*     */   private String successCodes;
/*     */   /*     */   
/*     */   public VfeActivitiesAdp() {}
/*     */   /*     */   
/*  48 */   public VfeActivitiesAdp(Long activityId) { this.activityId = activityId; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   /*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public VfeActivitiesAdp(Long activityId, VfeWebServiceSettings vfeWebServiceSettings, VfeLkSshServersAdp vfeLkSshServersAdp, VfeLkActivitiesTypeAdp vfeLkActivitiesTypeAdp, VfeLkBooleanAdp doCache, VfeLkHttpRequestTypeAdp vfeLkHttpRequestTypeAdp, VfeLkStoredProceduresAdp vfeLkStoredProceduresAdp, VfeLkDbAdp vfeLkDbAdp, String description, String dbQuery, String workflowName, String cmsFunction, String httpUrl, VfeHttpSystemsAdp systemId, Long sleepTime, String httpXmlInput, String interfaceName, String operationName, String inputName, Long queryTimeout, String inputCommand, String commandOutputSeparator, String successCodes) {
/*  59 */     this.activityId = activityId;
/*  60 */     this.vfeWebServiceSettings = vfeWebServiceSettings;
/*  61 */     this.vfeLkSshServersAdp = vfeLkSshServersAdp;
/*  62 */     this.vfeLkActivitiesTypeAdp = vfeLkActivitiesTypeAdp;
/*  63 */     this.doCache = doCache;
/*  64 */     this.vfeLkHttpRequestTypeAdp = vfeLkHttpRequestTypeAdp;
/*  65 */     this.vfeLkStoredProceduresAdp = vfeLkStoredProceduresAdp;
/*  66 */     this.vfeLkDbAdp = vfeLkDbAdp;
/*  67 */     this.description = description;
/*  68 */     this.dbQuery = dbQuery;
/*  69 */     this.workflowName = workflowName;
/*  70 */     this.cmsFunction = cmsFunction;
/*  71 */     this.httpUrl = httpUrl;
/*  72 */     this.systemId = systemId;
/*  73 */     this.sleepTime = sleepTime;
/*  74 */     this.httpXmlInput = httpXmlInput;
/*  75 */     this.interfaceName = interfaceName;
/*  76 */     this.operationName = operationName;
/*  77 */     this.inputName = inputName;
/*  78 */     this.queryTimeout = queryTimeout;
/*  79 */     this.inputCommand = inputCommand;
/*  80 */     this.commandOutputSeparator = commandOutputSeparator;
/*  81 */     this.successCodes = successCodes;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Id
/*     */   @Column(name = "ACTIVITY_ID", unique = true, precision = 18, scale = 0)
/*     */   @Order(1)
/*  89 */   public Long getActivityId() { return this.activityId; }
/*     */ 
/*     */ 
/*     */   
/*  93 */   public void setActivityId(Long activityId) { this.activityId = activityId; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "WEB_SERVICE_ID")
/*     */   @Order(16)
/* 100 */   public VfeWebServiceSettings getVfeWebServiceSettings() { return this.vfeWebServiceSettings; }
/*     */ 
/*     */ 
/*     */   
/* 104 */   public void setVfeWebServiceSettings(VfeWebServiceSettings vfeWebServiceSettings) { this.vfeWebServiceSettings = vfeWebServiceSettings; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "SSH_SERVER_ID")
/*     */   @Order(20)
/* 111 */   public VfeLkSshServersAdp getVfeLkSshServersAdp() { return this.vfeLkSshServersAdp; }
/*     */ 
/*     */ 
/*     */   
/* 115 */   public void setVfeLkSshServersAdp(VfeLkSshServersAdp vfeLkSshServersAdp) { this.vfeLkSshServersAdp = vfeLkSshServersAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "ACTIVITY_TYPE_ID")
/*     */   @Order(3)
/* 122 */   public VfeLkActivitiesTypeAdp getVfeLkActivitiesTypeAdp() { return this.vfeLkActivitiesTypeAdp; }
/*     */ 
/*     */ 
/*     */   
/* 126 */   public void setVfeLkActivitiesTypeAdp(VfeLkActivitiesTypeAdp vfeLkActivitiesTypeAdp) { this.vfeLkActivitiesTypeAdp = vfeLkActivitiesTypeAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "DO_CACHE")
/*     */   @Order(6)
/* 133 */   public VfeLkBooleanAdp getDoCache() { return this.doCache; }
/*     */ 
/*     */ 
/*     */   
/* 137 */   public void setDoCache(VfeLkBooleanAdp doCache) { this.doCache = doCache; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "HTTP_REQUEST_TYPE")
/*     */   @Order(14)
/* 144 */   public VfeLkHttpRequestTypeAdp getVfeLkHttpRequestTypeAdp() { return this.vfeLkHttpRequestTypeAdp; }
/*     */ 
/*     */ 
/*     */   
/* 148 */   public void setVfeLkHttpRequestTypeAdp(VfeLkHttpRequestTypeAdp vfeLkHttpRequestTypeAdp) { this.vfeLkHttpRequestTypeAdp = vfeLkHttpRequestTypeAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "SP_ID")
/*     */   @Order(11)
/* 155 */   public VfeLkStoredProceduresAdp getVfeLkStoredProceduresAdp() { return this.vfeLkStoredProceduresAdp; }
/*     */ 
/*     */ 
/*     */   
/* 159 */   public void setVfeLkStoredProceduresAdp(VfeLkStoredProceduresAdp vfeLkStoredProceduresAdp) { this.vfeLkStoredProceduresAdp = vfeLkStoredProceduresAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "DB_ID")
/*     */   @Order(7)
/* 166 */   public VfeLkDbAdp getVfeLkDbAdp() { return this.vfeLkDbAdp; }
/*     */ 
/*     */ 
/*     */   
/* 170 */   public void setVfeLkDbAdp(VfeLkDbAdp vfeLkDbAdp) { this.vfeLkDbAdp = vfeLkDbAdp; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "DESCRIPTION", length = 400)
/*     */   @Order(2)
/* 176 */   public String getDescription() { return this.description; }
/*     */ 
/*     */ 
/*     */   
/* 180 */   public void setDescription(String description) { this.description = description; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "DB_QUERY", length = 4000)
/*     */   @Order(5)
/* 186 */   public String getDbQuery() { return this.dbQuery; }
/*     */ 
/*     */ 
/*     */   
/* 190 */   public void setDbQuery(String dbQuery) { this.dbQuery = dbQuery; }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "WORKFLOW_NAME", length = 200)
/*     */   @Order(9)
/* 197 */   public String getWorkflowName() { return this.workflowName; }
/*     */ 
/*     */ 
/*     */   
/* 201 */   public void setWorkflowName(String workflowName) { this.workflowName = workflowName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "CMS_FUNCTION", length = 200)
/*     */   @Order(4)
/* 207 */   public String getCmsFunction() { return this.cmsFunction; }
/*     */ 
/*     */ 
/*     */   
/* 211 */   public void setCmsFunction(String cmsFunction) { this.cmsFunction = cmsFunction; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "HTTP_URL", length = 500)
/*     */   @Order(13)
/* 217 */   public String getHttpUrl() { return this.httpUrl; }
/*     */ 
/*     */ 
/*     */   
/* 221 */   public void setHttpUrl(String httpUrl) { this.httpUrl = httpUrl; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "SLEEP_TIME", precision = 18, scale = 0)
/*     */   @Order(10)
/* 227 */   public Long getSleepTime() { return this.sleepTime; }
/*     */ 
/*     */ 
/*     */   
/* 231 */   public void setSleepTime(Long sleepTime) { this.sleepTime = sleepTime; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "HTTP_XML_INPUT")
/*     */   @Order(15)
/* 237 */   public String getHttpXmlInput() { return this.httpXmlInput; }
/*     */ 
/*     */ 
/*     */   
/* 241 */   public void setHttpXmlInput(String httpXmlInput) { this.httpXmlInput = httpXmlInput; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "INTERFACE_NAME", length = 200)
/*     */   @Order(17)
/* 247 */   public String getInterfaceName() { return this.interfaceName; }
/*     */ 
/*     */ 
/*     */   
/* 251 */   public void setInterfaceName(String interfaceName) { this.interfaceName = interfaceName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "OPERATION_NAME", length = 200)
/*     */   @Order(18)
/* 257 */   public String getOperationName() { return this.operationName; }
/*     */ 
/*     */ 
/*     */   
/* 261 */   public void setOperationName(String operationName) { this.operationName = operationName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "INPUT_NAME", length = 200)
/*     */   @Order(19)
/* 267 */   public String getInputName() { return this.inputName; }
/*     */ 
/*     */ 
/*     */   
/* 271 */   public void setInputName(String inputName) { this.inputName = inputName; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "QUERY_TIMEOUT", precision = 22, scale = 0)
/*     */   @Order(8)
/* 277 */   public Long getQueryTimeout() { return this.queryTimeout; }
/*     */ 
/*     */ 
/*     */   
/* 281 */   public void setQueryTimeout(Long queryTimeout) { this.queryTimeout = queryTimeout; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "INPUT_COMMAND", length = 600)
/*     */   @Order(21)
/* 287 */   public String getInputCommand() { return this.inputCommand; }
/*     */ 
/*     */ 
/*     */   
/* 291 */   public void setInputCommand(String inputCommand) { this.inputCommand = inputCommand; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "COMMAND_OUTPUT_SEPARATOR", length = 600)
/*     */   @Order(22)
/* 297 */   public String getCommandOutputSeparator() { return this.commandOutputSeparator; }
/*     */ 
/*     */ 
/*     */   
/* 301 */   public void setCommandOutputSeparator(String commandOutputSeparator) { this.commandOutputSeparator = commandOutputSeparator; }
/*     */ 
/*     */ 
/*     */   
/*     */   @Column(name = "SUCCESS_CODES", length = 200)
/*     */   @Order(23)
/* 307 */   public String getSuccessCodes() { return this.successCodes; }
/*     */ 
/*     */ 
/*     */   
/* 311 */   public void setSuccessCodes(String successCodes) { this.successCodes = successCodes; }
/*     */ 
/*     */ 
/*     */   
/*     */   @ManyToOne(fetch = FetchType.EAGER)
/*     */   @JoinColumn(name = "SYSTEM_ID")
/*     */   @Order(12)
/* 318 */   public VfeHttpSystemsAdp getSystemId() { return this.systemId; }
/*     */ 
/*     */ 
/*     */   
/* 322 */   public void setSystemId(VfeHttpSystemsAdp systemId) { this.systemId = systemId; }
/*     */ }

