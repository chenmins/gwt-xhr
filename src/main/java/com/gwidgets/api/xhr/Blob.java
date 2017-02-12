package com.gwidgets.api.xhr;

import static jsinterop.annotations.JsPackage.GLOBAL;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = GLOBAL)
public class Blob {

	@JsConstructor
	public Blob(String[] data, BlobOptions options) {

	}

	@JsConstructor
	public Blob(Blob[] data, BlobOptions options) {

	}

	
	@JsProperty
	private boolean isClosed;
	
	@JsProperty
	private int size;
	
	@JsProperty
	private String type;
	
    @JsOverlay
	public final boolean isClosed() {
		return this.isClosed;
	}

    @JsOverlay
	public final int getSize() {
		return this.size;
	}

    @JsOverlay
	public final String getType() {
		return this.type;
	}
    
    @JsMethod
    public native void close();
    
    @JsMethod
    public native Blob slice(int start, int end, String contentType);

}
