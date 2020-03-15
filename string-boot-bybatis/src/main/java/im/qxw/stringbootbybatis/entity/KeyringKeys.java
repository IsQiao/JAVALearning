package im.qxw.stringbootbybatis.entity;

import javax.persistence.*;

@Table(name = "keyring_keys")
public class KeyringKeys {
    @Column(name = "KEY_ID")
    private String keyId;

    @Column(name = "KEY_OWNER")
    private String keyOwner;

    @Column(name = "BACKEND_KEY_ID")
    private String backendKeyId;

    /**
     * @return KEY_ID
     */
    public String getKeyId() {
        return keyId;
    }

    /**
     * @param keyId
     */
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    /**
     * @return KEY_OWNER
     */
    public String getKeyOwner() {
        return keyOwner;
    }

    /**
     * @param keyOwner
     */
    public void setKeyOwner(String keyOwner) {
        this.keyOwner = keyOwner;
    }

    /**
     * @return BACKEND_KEY_ID
     */
    public String getBackendKeyId() {
        return backendKeyId;
    }

    /**
     * @param backendKeyId
     */
    public void setBackendKeyId(String backendKeyId) {
        this.backendKeyId = backendKeyId;
    }
}