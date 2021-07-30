package com.app.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rcv: RecyclerView
    private  lateinit var adapter: itemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rcv = findViewById(R.id.rv1)

        var myList = ArrayList<ClassItem>()

        myList.add(ClassItem(R.drawable.img1, tv1 = "Riya Tyagi", tv2 = "10:40 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i2, tv1 = "A", tv2 = "10:20 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i3, tv1 = "B", tv2 = "10:10 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "C", tv2 = "11:20 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.img1, tv1 = "D", tv2 = "12:20 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i2, tv1 = "RT", tv2 = "1:40 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))
        myList.add(ClassItem(R.drawable.i4, tv1 = "E", tv2 = "5:30 am", tv3 = "Hello" ))


        adapter = itemAdapter(myList)
        rcv.setHasFixedSize(true)
        rcv.adapter = adapter


    }


}