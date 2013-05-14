package com.testdroid.api.model;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author kajdus
 */
@XmlRootElement
public class APIDeviceGroup extends APIDeviceProperty {
    private Long userId;

    public APIDeviceGroup() {}

    public APIDeviceGroup(Long id, String name, String displayName, Integer deviceCount, Integer creditsPrice, Long userId) {
        super(id, name, displayName, deviceCount, creditsPrice);
        this.userId = userId;;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
    
    public boolean isPublic() {
        return userId == null;
    }
}