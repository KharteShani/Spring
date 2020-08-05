package com.sk.beans;

public class WebContainer {
	private RequestHandler handler;
	
	public WebContainer(RequestHandler handler) {
		System.out.println("WebContainer:: 1-param constructor");
		this.handler=handler;
	}
	
	public void processRequest(String data) {
		System.out.println("WebContainer.processRequest() is ++processing the Request with data->"+data);
		//use handler
		handler.handleRequest(data);
	}
}
