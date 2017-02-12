package com.gwidgets.api.xhr;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public class XMLHttpRequestEventTarget extends EventTarget{
	
	
	@JsProperty
	public Function onabort;
	
	@JsProperty
	public Function onerror;
	
	@JsProperty
	public Function onload;
	
	@JsProperty
	public Function onloadstart;
	
	@JsProperty
	public Function onprogress;
	
	@JsProperty
	public Function ontimeout;
	
	@JsProperty
	public Function onloadend;

}
