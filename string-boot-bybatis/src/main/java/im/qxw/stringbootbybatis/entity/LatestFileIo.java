package im.qxw.stringbootbybatis.entity;

import javax.persistence.*;

@Table(name = "latest_file_io")
public class LatestFileIo {
    private String thread;

    private String file;

    private String latency;

    private String operation;

    private String requested;

    /**
     * @return thread
     */
    public String getThread() {
        return thread;
    }

    /**
     * @param thread
     */
    public void setThread(String thread) {
        this.thread = thread;
    }

    /**
     * @return file
     */
    public String getFile() {
        return file;
    }

    /**
     * @param file
     */
    public void setFile(String file) {
        this.file = file;
    }

    /**
     * @return latency
     */
    public String getLatency() {
        return latency;
    }

    /**
     * @param latency
     */
    public void setLatency(String latency) {
        this.latency = latency;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * @param operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * @return requested
     */
    public String getRequested() {
        return requested;
    }

    /**
     * @param requested
     */
    public void setRequested(String requested) {
        this.requested = requested;
    }
}