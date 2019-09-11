  package com.vodafone.wfx.model;
  
  import java.io.Serializable;
  import javax.persistence.Column;
  import javax.persistence.Embeddable;
  
  @Embeddable
  public class VfeWorkflowsAdpId
    implements Serializable
  {
    private Long workflowId;
    private Long versionId;
        
    public VfeWorkflowsAdpId() {}
        
    public VfeWorkflowsAdpId(Long workflowId, Long versionId) {
/* 17 */     this.workflowId = workflowId;
/* 18 */     this.versionId = versionId;
    }
  
    
    @Column(name = "WORKFLOW_ID", precision = 18, scale = 0)
/* 23 */   public Long getWorkflowId() { return this.workflowId; }
  
  
    
/* 27 */   public void setWorkflowId(Long workflowId) { this.workflowId = workflowId; }
  
  
    
    @Column(name = "VERSION_ID", precision = 18, scale = 0)
    public Long getVersionId() { return this.versionId; }
  
  
    
/* 36 */   public void setVersionId(Long versionId) { this.versionId = versionId; }
  
      
    
    public boolean equals(Object other) {
/* 40 */     if (this == other) {
/* 41 */       return true;
      }
/* 43 */     if (other == null) {
/* 44 */       return false;
      }
/* 46 */     if (!(other instanceof VfeWorkflowsAdpId)) {
/* 47 */       return false;
      }
/* 49 */     VfeWorkflowsAdpId castOther = (VfeWorkflowsAdpId)other;
      
/* 51 */     return ((getWorkflowId() == castOther.getWorkflowId() || (getWorkflowId() != null && castOther.getWorkflowId() != null && getWorkflowId().equals(castOther.getWorkflowId()))) && (getVersionId() == castOther.getVersionId() || (getVersionId() != null && castOther.getVersionId() != null && getVersionId().equals(castOther.getVersionId()))));
    }
  
  
  
//    
//    public int hashCode() {
///* 58 */     result = 17;
//      
///* 60 */     result = 37 * result + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode());
///* 61 */     return 37 * result + ((getVersionId() == null) ? 0 : getVersionId().hashCode());
//    }
  }
