package com.example.helloworldkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val webView: WebView = findViewById(R.id.webView)
        webView.webViewClient = WebViewClient()

        // Habilita JavaScript en el WebView si es necesario
        webView.settings.javaScriptEnabled = true

        // Carga la URL en el WebView
        webView.loadUrl("https://murachi.cenditel.gob.ve")
    }
}