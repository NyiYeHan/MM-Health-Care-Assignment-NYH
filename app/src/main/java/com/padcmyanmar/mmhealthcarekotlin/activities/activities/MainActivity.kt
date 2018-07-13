package com.padcmyanmar.mmhealthcarekotlin.activities.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.padcmyanmar.mmhealthcare.data.vos.HealthCareVo
import com.padcmyanmar.mmhealthcarekotlin.R
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.adapters.HealthCareAdapter
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.data.models.HealthCareModel
import com.padcmyanmar.mmhealthcarekotlin.activities.activities.events.SuccessGetInfoEvent
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class MainActivity : AppCompatActivity() {
    private  var rvAdapter: HealthCareAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvAdapter = HealthCareAdapter(applicationContext)
        rv.adapter = rvAdapter
        rv.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        HealthCareModel.getObj().loadHealthcareInfo()

    }

    override fun onStart() {
        super.onStart()
        if (!EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().register(this)
        }
    }

    override fun onStop() {
        super.onStop()
        if (EventBus.getDefault().isRegistered(this)) {
            EventBus.getDefault().unregister(this)
        }
    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun onSucessGetInfo(successInfo: SuccessGetInfoEvent.HealthCareInfoLoadedEvent) {
        rvAdapter!!.setInfoList(successInfo.healthInfo as MutableList<HealthCareVo>)
    }
}
