package im.qxw.stringbootbybatis.entity;

import javax.persistence.*;

@Table(name = "memory_global_total")
public class MemoryGlobalTotal {
    @Column(name = "total_allocated")
    private String totalAllocated;

    /**
     * @return total_allocated
     */
    public String getTotalAllocated() {
        return totalAllocated;
    }

    /**
     * @param totalAllocated
     */
    public void setTotalAllocated(String totalAllocated) {
        this.totalAllocated = totalAllocated;
    }
}