package com.imooc.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "friends_request")
public class FriendsRequest {
	@Id
	private String id;

	/**
	 * 发送用户的id
	 */
	@Column(name = "send_user_id")
	private String sendUserId;

	/**
	 * 接受用户的id
	 */
	@Column(name = "accept_user_id")
	private String acceptUserId;

	/**
	 * 发送请求的事件
	 */
	@Column(name = "request_date_time")
	private Date requestDateTime;

	/**
	 * @return id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id
	 */
	public void setId(String id) {
		this.id = id;
	}

	/**
	 * 获取发送用户的id
	 *
	 * @return send_user_id - 发送用户的id
	 */
	public String getSendUserId() {
		return sendUserId;
	}

	/**
	 * 设置发送用户的id
	 *
	 * @param sendUserId
	 *            发送用户的id
	 */
	public void setSendUserId(String sendUserId) {
		this.sendUserId = sendUserId;
	}

	/**
	 * 获取接受用户的id
	 *
	 * @return accept_user_id - 接受用户的id
	 */
	public String getAcceptUserId() {
		return acceptUserId;
	}

	/**
	 * 设置接受用户的id
	 *
	 * @param acceptUserId
	 *            接受用户的id
	 */
	public void setAcceptUserId(String acceptUserId) {
		this.acceptUserId = acceptUserId;
	}

	/**
	 * 获取发送请求的事件
	 *
	 * @return request_date_time - 发送请求的事件
	 */
	public Date getRequestDateTime() {
		return requestDateTime;
	}

	/**
	 * 设置发送请求的事件
	 *
	 * @param requestDateTime
	 *            发送请求的事件
	 */
	public void setRequestDateTime(Date requestDateTime) {
		this.requestDateTime = requestDateTime;
	}
}