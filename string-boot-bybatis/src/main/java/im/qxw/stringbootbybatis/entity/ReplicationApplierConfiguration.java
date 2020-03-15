package im.qxw.stringbootbybatis.entity;

import javax.persistence.*;

@Table(name = "replication_applier_configuration")
public class ReplicationApplierConfiguration {
    @Id
    @Column(name = "CHANNEL_NAME")
    private String channelName;

    @Column(name = "DESIRED_DELAY")
    private Integer desiredDelay;

    /**
     * Indicates whether the channel shall only accept row based events.
     */
    @Column(name = "REQUIRE_ROW_FORMAT")
    private String requireRowFormat;

    /**
     * User name for the security context of the applier.
     */
    @Column(name = "PRIVILEGE_CHECKS_USER")
    private String privilegeChecksUser;

    /**
     * @return CHANNEL_NAME
     */
    public String getChannelName() {
        return channelName;
    }

    /**
     * @param channelName
     */
    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    /**
     * @return DESIRED_DELAY
     */
    public Integer getDesiredDelay() {
        return desiredDelay;
    }

    /**
     * @param desiredDelay
     */
    public void setDesiredDelay(Integer desiredDelay) {
        this.desiredDelay = desiredDelay;
    }

    /**
     * 获取Indicates whether the channel shall only accept row based events.
     *
     * @return REQUIRE_ROW_FORMAT - Indicates whether the channel shall only accept row based events.
     */
    public String getRequireRowFormat() {
        return requireRowFormat;
    }

    /**
     * 设置Indicates whether the channel shall only accept row based events.
     *
     * @param requireRowFormat Indicates whether the channel shall only accept row based events.
     */
    public void setRequireRowFormat(String requireRowFormat) {
        this.requireRowFormat = requireRowFormat;
    }

    /**
     * 获取User name for the security context of the applier.
     *
     * @return PRIVILEGE_CHECKS_USER - User name for the security context of the applier.
     */
    public String getPrivilegeChecksUser() {
        return privilegeChecksUser;
    }

    /**
     * 设置User name for the security context of the applier.
     *
     * @param privilegeChecksUser User name for the security context of the applier.
     */
    public void setPrivilegeChecksUser(String privilegeChecksUser) {
        this.privilegeChecksUser = privilegeChecksUser;
    }
}