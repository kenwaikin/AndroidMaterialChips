package com.example.androidmaterialchips

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class FilterChipDemoFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_filter_chip_demo, container, false)
    }

    companion object {
        @JvmStatic
        fun newInstance() = FilterChipDemoFragment()
    }
}
