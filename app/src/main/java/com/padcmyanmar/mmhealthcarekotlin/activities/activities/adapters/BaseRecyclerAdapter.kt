package com.padcmyanmar.mmhealthcarekotlin.activities.activities.adapters

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.padcmyanmar.mmhealthcare.data.vos.HealthCareVo
import com.padcmyanmar.mmhealthcarekotlin.R
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.viewholders.BaseViewHolder
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.viewholders.HealthCareDetailsViewHolder


open abstract class BaseRecyclerAdapter<VH : BaseViewHolder<D>, D>(context: Context) : RecyclerView.Adapter<BaseViewHolder<D>>() {
    protected var mData: List<D>? = null
    protected var mLayoutInflater: LayoutInflater


    init {
        mData = ArrayList()
        mLayoutInflater = LayoutInflater.from(context)
    }

    override fun getItemCount(): Int {
        return mData!!.size
    }


    override fun onBindViewHolder(holder: BaseViewHolder<D>, position: Int) {
        holder.bindData(mData!![position])
    }

    fun setInfoList(healthInfo: List<D>?) {
        mData = healthInfo
        notifyDataSetChanged()
    }


}