package me.shikasd.twittershortcut

import android.app.Activity
import android.content.ComponentName
import android.content.Intent
import android.os.Bundle


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val intent = Intent()
        intent.addCategory("android.intent.category.LAUNCHER")
        intent.action = "android.intent.action.MAIN"
        intent.component = ComponentName("com.twitter.android", "com.twitter.android.StartActivity")
        startActivity(intent)

        finish()
    }
}