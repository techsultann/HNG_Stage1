package com.techsultan.hngstage1

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebViewClient
import com.techsultan.hngstage1.databinding.ActivityWebviewBinding

const val GITHUB = "https://github.com/techsultann"
class WebviewActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWebviewBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWebviewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        openGithub()
    }


    @SuppressLint("SetJavaScriptEnabled")
    fun openGithub() {

        binding.webView.apply {

            webViewClient = WebViewClient()
            loadUrl(GITHUB)
        }

        val settings = binding.webView.settings
        settings.javaScriptEnabled = true
    }
}