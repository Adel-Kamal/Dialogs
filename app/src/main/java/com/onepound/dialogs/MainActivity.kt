package com.onepound.dialogs

import android.app.Activity
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.facebook.share.model.ShareLinkContent
import com.facebook.share.widget.ShareDialog
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.normal.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val a = Dialogs(this@MainActivity)
        Dialogs_button_normal.setOnClickListener() {
            a.D2(this@MainActivity, R.layout.normal)

        }

        Dialogs_button_alert.setOnClickListener() {
            //a.D1("hello Adel","welcome Msg","yes","No","Cancel",this@MainActivity)
            val Content = ShareLinkContent.Builder()
            Content.setContentUrl(Uri.parse("https://www.facebook.com/adeltttttt"))
            Content.build()
        }
    }
}

