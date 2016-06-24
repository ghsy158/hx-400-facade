package com.huaxia.call400.facade;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;

@Path("/call400Service")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public interface Call400Facade {

	/**
	 * <b>方法名称：</b>查询400工单信息<br>
	 * <b>概要说明：</b><br>
	 */
	@GET
	@Path("/get400Calls")
	public String get400Calls() throws Exception;

	/**
	 * 
	 * <b>方法名称：</b>插入到ERP商机表<br>
	 * <b>概要说明：</b><br>
	 */
	public void batchInsert2Opp(String json)  throws Exception;
}
