package com.github.tvbox.osc.util

import android.content.Context
import android.graphics.Typeface
import android.widget.TextView
import androidx.core.content.res.ResourcesCompat
import com.github.tvbox.osc.R

/**
 * Material Symbols字体加载器
 *
 * 用于加载Material Symbols字体并应用到TextView上
 */
object MaterialSymbolsLoader {

    // 字体缓存
    private var materialSymbolsTypeface: Typeface? = null

    /**
     * 初始化Material Symbols字体
     *
     * @param context 上下文
     */
    fun init(context: Context) {
        // 直接使用系统内置的Material Symbols字体
        materialSymbolsTypeface = Typeface.create("Material Symbols Rounded", Typeface.NORMAL)

        // 如果加载失败，尝试使用默认字体
        if (materialSymbolsTypeface == null || materialSymbolsTypeface.toString() == "null") {
            materialSymbolsTypeface = Typeface.DEFAULT
        }
    }

    /**
     * 应用Material Symbols字体到TextView
     *
     * @param textView 要应用字体的TextView
     */
    fun apply(textView: TextView) {
        if (materialSymbolsTypeface != null) {
            textView.typeface = materialSymbolsTypeface
        }
    }

    /**
     * 设置图标到TextView
     *
     * @param textView 要设置图标的TextView
     * @param icon 图标代码，如MaterialSymbols.HOME
     */
    fun setIcon(textView: TextView, icon: String) {
        apply(textView)
        textView.text = icon
    }
}
