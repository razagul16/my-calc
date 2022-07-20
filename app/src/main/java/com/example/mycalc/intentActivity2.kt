package com.example.mycalc

import android.content.Intent
import android.content.pm.PackageManager
import android.net.Uri
import android.os.Bundle
import android.provider.MediaStore
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import java.util.jar.Manifest

lateinit var buttonSms:Button
lateinit var buttonEmail:Button
lateinit var buttonCamera:Button
lateinit var buttonMpesa:Button
lateinit var buttonShare:Button
lateinit var buttonCall:Button
lateinit var buttonDial:Button


class intentActivity2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent2)
        buttonSms = findViewById(R.id.button9)
        buttonEmail = findViewById(R.id.button6)
        buttonCamera = findViewById(R.id.button8)
        buttonMpesa = findViewById(R.id.button10)
        buttonShare = findViewById(R.id.button7)
        buttonCall = findViewById(R.id.button13)
        buttonDial = findViewById(R.id.button14)

        buttonSms.setOnClickListener {
            val uri: Uri = Uri.parse("smsto:0700175002")
            val intent = Intent(Intent.ACTION_SENDTO, uri)
            intent.putExtra("Hello", "How's todays weather")
            startActivity(intent)
        }
        buttonEmail.setOnClickListener {
            val emailIntent = Intent(
                Intent.ACTION_SENDTO, Uri.fromParts(
                    "mailto", "migueltosh16@gmail.com",
                    null
                )
            )
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Job Application")
            emailIntent.putExtra(Intent.EXTRA_TEXT, "Dear sir with regards.......,")
            startActivity(Intent.createChooser(emailIntent, "Send email..."))
        }
        buttonCamera.setOnClickListener {
            val takePictureIntent = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(takePictureIntent, 1)
        }
        buttonMpesa.setOnClickListener {
            val simToolKitLaunchIntent =
                applicationContext.packageManager.getLaunchIntentForPackage("com.android.stk")
            simToolKitLaunchIntent?.let { startActivity(it) }
        }
        buttonShare.setOnClickListener {
            val shareIntent = Intent(Intent.ACTION_SEND)
            shareIntent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            shareIntent.type = "type"
            intent.putExtra("Hello", "Thank you Sir/Madam")
        }
        buttonCall
        intent = Intent(Intent.ACTION_CALL, Uri.parse("tel:" + "+254700175002"));

        if (ContextCompat.checkSelfPermission(
                this@intentActivity2,

                android.Manifest.permission.CALL_PHONE
            ) != PackageManager.PERMISSION_GRANTED
        ) {
        }
        buttonDial.setOnClickListener {
            val phone = "+254700175002"

            val intent = Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phone, null))
            startActivity(intent)
        }


    }
}

