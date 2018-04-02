package com.word.gen.json;

import java.util.Map;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "message", "code", "error", "timeStamp", "port", "host" })
public class ErrorResponse {

	public ErrorResponse() {
	}

	public ErrorResponse(int status, String hostName, String portNum, Map<String, Object> errorAttributes) {
		this.code = status;
		this.error = (String) errorAttributes.get("error");
		this.port = portNum;
		this.host = hostName;
		this.message = (String) errorAttributes.get("message");
		if (null != errorAttributes.get("timestamp")) {
			this.timeStamp = errorAttributes.get("timestamp").toString();
		}
	}

	@JsonProperty("code")
	private Integer code;

	@JsonProperty("message")
	private String message;

	@JsonProperty("error")
	private String error;

	@JsonProperty("timeStamp")
	private String timeStamp;

	@JsonProperty("host")
	private String host;

	@JsonProperty("port")
	private String port;

	public Integer getCode() {
		return code;
	}

	public String getMessage() {
		return message;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getTimeStamp() {
		return timeStamp;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(String port) {
		this.port = port;
	}

}
