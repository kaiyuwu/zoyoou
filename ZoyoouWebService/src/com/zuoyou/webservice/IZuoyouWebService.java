/**
 * 
 */
package com.zuoyou.webservice;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.zoyoou.common.entity.IEntity;

/**
 * @author kaiwu
 *
 */
public interface IZuoyouWebService <E extends IEntity>{
	
	@GET
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON})
	E findById(@PathParam("id") long id) throws Exception;
	
	@GET
	@Produces({ MediaType.APPLICATION_JSON})
	@Path("/all")
	List<E> findAll() throws Exception;
	
	@POST
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON})
	public E create(E entity) throws Exception;

	@PUT
	@Consumes({ MediaType.APPLICATION_JSON})
	@Produces({ MediaType.APPLICATION_JSON})
	public E update(E entity) throws Exception;

	@DELETE
	@Path("{id}")
	@Produces({ MediaType.APPLICATION_JSON})
	public E remove(@PathParam("id") long id) throws Exception;
	
}
