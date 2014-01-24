/**
 * 
 */
package com.zoyoou.common.entity;

/**
 * @author kaiwu
 *
 */
public class AddressBook extends AbstractEntity {
	private short id;
	private EntityType ownerType;
	private long  ownerId;
	private EntityType addressSrcType;
	private long addressSrcId;
	/**
	 * @return the id
	 */
	public short getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(short id) {
		this.id = id;
	}
	/**
	 * @return the ownerType
	 */
	public EntityType getOwnerType() {
		return ownerType;
	}
	/**
	 * @param ownerType the ownerType to set
	 */
	public void setOwnerType(EntityType ownerType) {
		this.ownerType = ownerType;
	}
	/**
	 * @return the ownerId
	 */
	public long getOwnerId() {
		return ownerId;
	}
	/**
	 * @param ownerId the ownerId to set
	 */
	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}
	/**
	 * @return the addressSrcType
	 */
	public EntityType getAddressSrcType() {
		return addressSrcType;
	}
	/**
	 * @param addressSrcType the addressSrcType to set
	 */
	public void setAddressSrcType(EntityType addressSrcType) {
		this.addressSrcType = addressSrcType;
	}
	/**
	 * @return the addressSrcId
	 */
	public long getAddressSrcId() {
		return addressSrcId;
	}
	/**
	 * @param addressSrcId the addressSrcId to set
	 */
	public void setAddressSrcId(long addressSrcId) {
		this.addressSrcId = addressSrcId;
	}

	

}
