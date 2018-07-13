package com.padcmyanmar.mmhealthcarekotlin.activities.activities.viewholders

import android.support.v7.widget.RecyclerView
import android.view.View

open abstract class BaseViewHolder<D>(itemView: View?) : RecyclerView.ViewHolder(itemView) {

    var mData: D? = null

    abstract fun bindData(data : D)


}