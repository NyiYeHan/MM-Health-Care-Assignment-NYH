package com.padcmyanmar.mmhealthcarekotlin.activities.activities.viewholders

import android.view.View
import com.bumptech.glide.Glide
import com.padcmyanmar.mmhealthcare.data.vos.HealthCareVo
import kotlinx.android.synthetic.main.view_holder_health_care_details.view.*

class HealthCareDetailsViewHolder(itemView: View) : BaseViewHolder<HealthCareVo>(itemView) {
    override fun bindData(data: HealthCareVo) {
        Glide.with(itemView.iv_tech.context)
                .load(data.image)
                .into(itemView.iv_tech)

        itemView.title.text = data.title
        itemView.author_name.text = data.author!!.authorName

    }

}