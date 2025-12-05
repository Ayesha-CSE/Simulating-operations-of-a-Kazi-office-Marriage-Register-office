package com.csc213.kazioffice_marriageregisteroffice.LegalAdvisor.ModelClass;

import java.time.LocalDate;

public class LegalNoticeOrderDraft {
    private String caseId;
    private String noticeTitle;
    private String noticeType;
    private LocalDate issueDate;
    private String noticeContent;
    private String remarks;

    public LegalNoticeOrderDraft(String caseId, String noticeTitle, String noticeType, LocalDate issueDate, String noticeContent, String remarks) {
        this.caseId = caseId;
        this.noticeTitle = noticeTitle;
        this.noticeType = noticeType;
        this.issueDate = issueDate;
        this.noticeContent = noticeContent;
        this.remarks = remarks;
    }

    public String getCaseId() {
        return caseId;
    }

    public void setCaseId(String caseId) {
        this.caseId = caseId;
    }

    public String getNoticeTitle() {
        return noticeTitle;
    }

    public void setNoticeTitle(String noticeTitle) {
        this.noticeTitle = noticeTitle;
    }

    public String getNoticeType() {
        return noticeType;
    }

    public void setNoticeType(String noticeType) {
        this.noticeType = noticeType;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getNoticeContent() {
        return noticeContent;
    }

    public void setNoticeContent(String noticeContent) {
        this.noticeContent = noticeContent;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "LegalNoticeOrderDraft{" +
                "caseId='" + caseId + '\'' +
                ", noticeTitle='" + noticeTitle + '\'' +
                ", noticeType='" + noticeType + '\'' +
                ", issueDate=" + issueDate +
                ", noticeContent='" + noticeContent + '\'' +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}
