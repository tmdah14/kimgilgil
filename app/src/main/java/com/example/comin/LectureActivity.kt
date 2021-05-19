package com.example.comin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.widget.TextView
import com.example.comin.Fragment.FragmentAdapter
import kotlinx.android.synthetic.main.activity_lecture.*
import kotlinx.android.synthetic.main.custom_tab.*
import kotlinx.android.synthetic.main.custom_tab.view.*

class LectureActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lecture)


        val fragmentAdapter = FragmentAdapter(supportFragmentManager)
        list_viewpager.adapter = fragmentAdapter

        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("munee")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("saramchatgi")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("witchseol")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("joomun")))
        tab_layout.addTab(tab_layout.newTab().setCustomView(createTabView("geuljakseong")))


    }

    private fun createTabView(tabName : String) : View {

        val tabView = LayoutInflater.from(baseContext).inflate(R.layout.custom_tab, null)

        val txt_name = tabView.findViewById(R.id.txt_name) as TextView

        tabView.txt_name.text = tabName

        return tabView
    }

}