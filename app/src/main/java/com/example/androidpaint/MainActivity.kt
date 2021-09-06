package com.example.androidpaint

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import androidx.core.content.ContextCompat
import androidx.core.view.get
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.dialog_brush_size.*


class MainActivity : AppCompatActivity() {

    private var mImageButtonCurrentPaint: ImageButton? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        We want to call the setSizeForBrush function here in our main and pass the brush size
        drawing_view.setSizeForBrush(20.toFloat())

        mImageButtonCurrentPaint = ll_paint_colors[1] as ImageButton
        mImageButtonCurrentPaint!!.setImageDrawable(
            ContextCompat.getDrawable(this, R.drawable.pallet_pressed)
        )
        ib_brush.setOnClickListener{
            showBrushSizeChooserDialog()
        }

    }

    private fun showBrushSizeChooserDialog() {
        val brushDialog = Dialog(this)

        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.setTitle("Brush Size: ")
        val smallButton = brushDialog.ib_small_brush
        smallButton.setOnClickListener{
//            We want to set the brush size to 10 and close the dialog
            drawing_view.setSizeForBrush(10.toFloat())
            brushDialog.dismiss()
        }

        val mediumButton = brushDialog.ib_medium_brush
        mediumButton.setOnClickListener{
//            We want to set the brush size to 10 and close the dialog
            drawing_view.setSizeForBrush(20.toFloat())
            brushDialog.dismiss()
        }

        val largeButton = brushDialog.ib_large_brush
        largeButton.setOnClickListener{
//            We want to set the brush size to 10 and close the dialog
            drawing_view.setSizeForBrush(30.toFloat())
            brushDialog.dismiss()
        }

        brushDialog.show()
    }
}