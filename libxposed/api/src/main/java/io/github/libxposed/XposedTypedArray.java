package io.github.libxposed;

import android.content.res.Resources;
import android.content.res.TypedArray;

public abstract class XposedTypedArray extends TypedArray {
    public XposedTypedArray(Resources resources) {
        super(resources);
    }
}