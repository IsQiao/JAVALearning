package im.qxw.stringbootbybatis.entity;

import javax.persistence.*;

@Table(name = "user_summary_by_statement_type")
public class UserSummaryByStatementType {
    private String user;

    private String statement;

    private Long total;

    @Column(name = "total_latency")
    private String totalLatency;

    @Column(name = "max_latency")
    private String maxLatency;

    @Column(name = "lock_latency")
    private String lockLatency;

    @Column(name = "rows_sent")
    private Long rowsSent;

    @Column(name = "rows_examined")
    private Long rowsExamined;

    @Column(name = "rows_affected")
    private Long rowsAffected;

    @Column(name = "full_scans")
    private Long fullScans;

    /**
     * @return user
     */
    public String getUser() {
        return user;
    }

    /**
     * @param user
     */
    public void setUser(String user) {
        this.user = user;
    }

    /**
     * @return statement
     */
    public String getStatement() {
        return statement;
    }

    /**
     * @param statement
     */
    public void setStatement(String statement) {
        this.statement = statement;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return total;
    }

    /**
     * @param total
     */
    public void setTotal(Long total) {
        this.total = total;
    }

    /**
     * @return total_latency
     */
    public String getTotalLatency() {
        return totalLatency;
    }

    /**
     * @param totalLatency
     */
    public void setTotalLatency(String totalLatency) {
        this.totalLatency = totalLatency;
    }

    /**
     * @return max_latency
     */
    public String getMaxLatency() {
        return maxLatency;
    }

    /**
     * @param maxLatency
     */
    public void setMaxLatency(String maxLatency) {
        this.maxLatency = maxLatency;
    }

    /**
     * @return lock_latency
     */
    public String getLockLatency() {
        return lockLatency;
    }

    /**
     * @param lockLatency
     */
    public void setLockLatency(String lockLatency) {
        this.lockLatency = lockLatency;
    }

    /**
     * @return rows_sent
     */
    public Long getRowsSent() {
        return rowsSent;
    }

    /**
     * @param rowsSent
     */
    public void setRowsSent(Long rowsSent) {
        this.rowsSent = rowsSent;
    }

    /**
     * @return rows_examined
     */
    public Long getRowsExamined() {
        return rowsExamined;
    }

    /**
     * @param rowsExamined
     */
    public void setRowsExamined(Long rowsExamined) {
        this.rowsExamined = rowsExamined;
    }

    /**
     * @return rows_affected
     */
    public Long getRowsAffected() {
        return rowsAffected;
    }

    /**
     * @param rowsAffected
     */
    public void setRowsAffected(Long rowsAffected) {
        this.rowsAffected = rowsAffected;
    }

    /**
     * @return full_scans
     */
    public Long getFullScans() {
        return fullScans;
    }

    /**
     * @param fullScans
     */
    public void setFullScans(Long fullScans) {
        this.fullScans = fullScans;
    }
}