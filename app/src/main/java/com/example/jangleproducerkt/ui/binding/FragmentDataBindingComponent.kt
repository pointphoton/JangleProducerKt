package com.example.jangleproducerkt.ui.binding

import androidx.databinding.DataBindingComponent
import androidx.fragment.app.Fragment


class FragmentDataBindingComponent(fragment: Fragment) : DataBindingComponent {
    private val adapter = FragmentBindingAdapters(fragment)

    override fun getFragmentBindingAdapters() = adapter
}