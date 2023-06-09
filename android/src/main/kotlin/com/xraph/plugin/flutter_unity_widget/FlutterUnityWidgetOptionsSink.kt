package com.xraph.plugin.flutter_unity_widget_custom

interface FlutterUnityWidgetOptionsSink {
    fun setFullscreenEnabled(fullscreenEnabled: Boolean)

    fun setHideStatusBar(hideStatusBar: Boolean)

    fun setRunImmediately(runImmediately: Boolean)

    fun setUnloadOnDispose(unloadOnDispose: Boolean)
}