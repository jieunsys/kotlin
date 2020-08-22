package com.example.listviewmusic

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView

class MusicAdapter (
    val mContext: Context,
    val resId: Int,
    val mList: List<Music>
) : ArrayAdapter<Music>(mContext, resId, mList) {
    val inf = LayoutInflater.from(mContext)
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val data = mList[position]

        var row = convertView
        if (row == null) row = inf.inflate(R.layout.music_item, null)
        row = row!!
        row.findViewById<TextView>(R.id.labelTitle).text = data.title
        row.findViewById<TextView>(R.id.labelSinger).text = data.singer
        return row
    }
}