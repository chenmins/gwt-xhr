package com.gwidgets.api.xhr;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace = GLOBAL)
public class Node extends EventTarget{
	
	@JsMethod
	public native void appendChild(Object child);
	
	@JsMethod
	public native void removeChild(Object child);

}
