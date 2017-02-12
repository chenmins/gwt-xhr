package com.gwidgets.api.xhr;

import com.google.gwt.core.client.JavaScriptObject;

import jsinterop.annotations.JsFunction;


@JsFunction
@FunctionalInterface
public interface Function {
	
	
	public Object call(Object event);

}
