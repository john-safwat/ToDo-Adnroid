package com.john.todoandroid.Home.BottomSheet

import android.app.Dialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetBehavior
import com.google.android.material.bottomsheet.BottomSheetDialog
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.john.todoandroid.databinding.FragmentBottomSheetBinding

class AddTaskModalBottomSheet : BottomSheetDialogFragment() {

    private lateinit var binding :FragmentBottomSheetBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {
        binding = FragmentBottomSheetBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        // used to show the bottom sheet dialog
        dialog?.setOnShowListener { it ->
            val d = it as BottomSheetDialog
            val bottomSheet = R.layout.
            bottomSheet?.let {
                val behavior = BottomSheetBehavior.from(it)
                behavior.state = BottomSheetBehavior.STATE_EXPANDED
            }
        }
        return super.onCreateDialog(savedInstanceState)
    }

    companion object {
        const val TAG = "ModalBottomSheetDialog"
    }

}