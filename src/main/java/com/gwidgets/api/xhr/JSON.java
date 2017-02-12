package com.gwidgets.api.xhr;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsType;

@JsType(isNative=true, namespace=GLOBAL)
public class JSON {
	
	public native static String stringify(Object obj);
	
	public native static Object parse(String obj);

}
