package com.xraph.plugin.flutter_unity_widget_custom

import androidx.annotation.Nullable
import androidx.lifecycle.Lifecycle

interface LifecycleProvider {
    @Nullable
    fun getLifecycle(): Lifecycle
}