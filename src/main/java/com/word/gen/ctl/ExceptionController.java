package com.word.gen.ctl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.web.ErrorAttributes;
import org.springframework.boot.autoconfigure.web.ErrorController;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.ServletRequestAttributes;

import com.word.gen.json.ErrorResponse;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class ExceptionController implements ErrorController {

	private static final String PATH = "/error";

	@Value("${server.host}")
	private String host;

	@Value("${server.port}")
	private String port;

	@Override
	public String getErrorPath() {
		return PATH;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public void setPort(String port) {
		this.port = port;
	}

	@Autowired
	private ErrorAttributes errorAttributes;

	@RequestMapping(value = PATH)
	ErrorResponse error(HttpServletRequest request, HttpServletResponse response) {
		return new ErrorResponse(response.getStatus(), host, port, getErrorAttributes(request, true));
	}

	Map<String, Object> getErrorAttributes(HttpServletRequest request, boolean includeStackTrace) {
		RequestAttributes requestAttributes = new ServletRequestAttributes(request);
		errorAttributes.getError(requestAttributes);
		Map<String, Object> errAtts = errorAttributes.getErrorAttributes(requestAttributes, includeStackTrace);
		return errAtts;
	}

}
