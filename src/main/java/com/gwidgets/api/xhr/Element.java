package com.gwidgets.api.xhr;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace = GLOBAL)
public class Element extends Node{
	
	@JsProperty
   public String innerHTML;
	
	@JsProperty
	public String outerHTML;
	
	@JsProperty
	public String id;
	
	@JsProperty
	public Function onload;
	
	@JsMethod
	public native void setAttribute(String attribute, String value);
	
	
	
	
	
	
}
