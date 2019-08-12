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
import android.widget.*
import androidx.appcompat.widget.ButtonBarLayout
import androidx.core.view.get
import kotlinx.android.synthetic.main.normal.*


class Dialogs(context: Context) : Dialog(context) {

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
    }

    fun D2(context: Context, vi: Int) {
        val builde = Dialog(context)
        val But = Button(context)
        var Weda = androidx.constraintlayout.widget.ConstraintLayout(context)
        Weda.addView(But)
        Weda.layout(100, 100, 100, 100)
        But.text = "OkK"
        But.height = 50
        But.width = 50
        builde.addContentView(Weda, ViewGroup.LayoutParams(500, 500))
        //builde.setContentView(vi)
        builde.setTitle("Adel")
        /*builde.Normal_No.setOnClickListener {
            builde.Normal_7amada.text = "He Say No!!"
        }
        builde.Normal_Yes.setOnClickListener {
            builde.Normal_7amada.text = "He Say Yes!!"
        }*/
        builde.create()
        builde.show()

    }
}
