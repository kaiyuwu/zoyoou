/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class SystemConfig extends AbstractEntity {
	private String configName;
	private String configValue;
	/**
	 * @return the configName
	 */
	public String getConfigName() {
		return configName;
	}
	/**
	 * @param configName the configName to set
	 */
	public void setConfigName(String configName) {
		this.configName = configName;
	}
	/**
	 * @return the configValue
	 */
	public String getConfigValue() {
		return configValue;
	}
	/**
	 * @param configValue the configValue to set
	 */
	public void setConfigValue(String configValue) {
		this.configValue = configValue;
	}
	
	
}
