package com.github.tvbox.osc.ui.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.github.tvbox.osc.R
import com.github.tvbox.osc.util.MaterialSymbols
import com.github.tvbox.osc.util.MaterialSymbolsLoader

/**
 * Material Symbols图标演示Activity
 * 
 * 用于展示如何使用Material Symbols图标
 */
class MaterialSymbolsDemoActivity : AppCompatActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.material_symbols_demo)
        
        // 代码中动态设置图标示例
        val dynamicIconTextView = findViewById<TextView>(R.id.dynamicIconTextView)
        if (dynamicIconTextView != null) {
            // 使用MaterialSymbolsLoader设置图标
            MaterialSymbolsLoader.setIcon(dynamicIconTextView, MaterialSymbols.PICTURE_IN_PICTURE)
        }
    }
}
