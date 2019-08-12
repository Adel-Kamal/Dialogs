package com.onepound.dialogs


import android.app.ActionBar
import android.app.AlertDialog
import android.app.Dialog
import android.app.Notification
import android.content.Context
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.normal.*


public class Dialogs(context: Context) : Dialog(context) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.normal)

        Normal_Yes.setOnClickListener() {
            Normal_7amada.text = "He Say Yes!!"
        }

        Normal_No.setOnClickListener() {
            Normal_7amada.text = "He Say No!!"
        }
    }

    fun D1(
        msg: String,
        Title: String,
        PositiveButton: String,
        NegativeButton: String,
        NeutralButton: String,
        context: Context
    ) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(Title)
        builder.setMessage(msg)
        builder.setPositiveButton(PositiveButton) { dialog, wich -> }
        builder.setNegativeButton(NegativeButton) { dialog, wich -> }
        builder.setNeutralButton(NeutralButton) { dialog, wich -> }
        val dialog: AlertDialog = builder.create()
        dialog.show()
    }//a

    fun D2(context: Context, vi: Int) {

        val builde = Dialog(context)
        builde.setContentView(vi)
        builde.setTitle("Adel")
        builde.create()
        builde.show()

    }
}
