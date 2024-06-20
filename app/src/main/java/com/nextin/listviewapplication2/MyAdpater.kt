package com.nextin.listviewapplication2

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import de.hdodenhof.circleimageview.CircleImageView

class MyAdpater(private val context:Activity, private val arrayList: ArrayList<Users>)
    : ArrayAdapter<Users>(context,R.layout.each_item_view, arrayList) {

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

     val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.each_item_view, null)


        val name = view.findViewById<TextView>(R.id.personName)
        val lastMgs = view.findViewById<TextView>(R.id.lastMsg)
        val lastMsgTime = view.findViewById<TextView>(R.id.lastMsgtime)
        val profileImage = view.findViewById<CircleImageView>(R.id.profile_image)


        name.text = arrayList[position].name
        lastMgs.text = arrayList[position].lastMsg
        lastMsgTime.text = arrayList[position].lastMsgTime
        profileImage.setImageResource(arrayList[position].profileImage)

        return view

    }
}
