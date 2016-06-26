package com.huaxia.call400.facade;

import java.sql.Date;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.alibaba.dubbo.rpc.protocol.rest.support.ContentType;
import com.alibaba.fastjson.JSONObject;

@Path("/call400Service")
@Consumes({ MediaType.APPLICATION_JSON, MediaType.TEXT_XML })
@Produces({ ContentType.APPLICATION_JSON_UTF_8, ContentType.TEXT_XML_UTF_8 })
public interface Call400Facade {

	/**
	 * <b>方法名称：</b>查询400工单信息<br>
	 * <b>概要说明：</b><br>
	 */
	@GET
	@Path("/query400CallsAll")
	public String get400Calls() throws Exception;

	/**
	 * 
	 * <b>方法名称：</b>插入到ERP商机表<br>
	 * <b>概要说明：</b><br>
	 */
	public void batchInsert2Opp(String json) throws Exception;

	/**
	 * 
	 * <b>方法名称：</b>查询400工单当天的数据，并返回list<br>
	 * <b>概要说明：</b><br>
	 */
	@GET
	@Path("/query400CallsToday")
	public List<JSONObject> query400CallsToday() throws Exception;

	/**
	 * 
	 * <b>方法名称：</b>单笔插入工单信息到ERP商机表<br>
	 * <b>概要说明：</b><br>
	 */
	public int singleInsert2Opp(JSONObject jsonObject) throws Exception;
	
	/**
	 * 
	 * <b>方法名称：</b>获取当前时间<br>
	 * <b>概要说明：</b><br>
	 */
	public Date getCurrentTime();
}
