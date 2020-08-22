package com.example.listview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class OneRoomAdapter(
    val mContext: Context,
    val resId: Int,
    val mList: List<OneRoom>
) : ArrayAdapter<OneRoom>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val data = mList[position]

        var row = convertView
        if (row == null) row = inf.inflate(R.layout.one_room_list_item, null)
        row = row!!

        row.findViewById<TextView>(R.id.labelTitle).text = data.title
        row.findViewById<TextView>(R.id.labelDeposit).text = data.deposit.toString()
        row.findViewById<TextView>(R.id.labelMonthlyRent).text = data.monthlyRent.toString()

        return row
    }

}