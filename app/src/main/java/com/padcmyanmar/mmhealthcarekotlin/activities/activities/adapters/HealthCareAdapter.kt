package com.padcmyanmar.mmhealthcarekotlin.activities.activities.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.padcmyanmar.mmhealthcare.data.vos.HealthCareVo
import com.padcmyanmar.mmhealthcarekotlin.R
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.viewholders.HealthCareDetailsViewHolder

class HealthCareAdapter(context : Context) : BaseRecyclerAdapter<HealthCareDetailsViewHolder, HealthCareVo>(context) {
    private var mHealthInfo : List<HealthCareVo> ? = null
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HealthCareDetailsViewHolder {

        var view: View = mLayoutInflater.inflate(R.layout.view_holder_health_care_details, parent, false)
        return HealthCareDetailsViewHolder(view)
    }


}