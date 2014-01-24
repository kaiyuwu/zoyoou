/**
 * 
 */
package com.zoyoou.resource;

/**
 * @author kaiwu
 *
 */
public class DataBaseConfig {
	
	//All attributes will be loaded from a configuration file later....
	public static String DRIVER_CLASS_NAME = "com.mysql.jdbc.Driver";
	public static String URL = "jdbc:mysql://localhost/NPro";
	public static String USERNAME = "root";
	public static String PASSWORD="123456";
	
	public static int CONNECTION_POOL_MAX_ACTIVE= 100;
	public static int CONNECTION_POOL_MAX_WAIT=1000;
	public static int CONNECTION_POOL_MAX_IDLE=10;
	
}
