package dev.mobilegeeks.feature1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import dev.mobilegeeks.core.CommonModel

class FragmentFeature1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_feature_1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.apply {
            findViewById<Button>(R.id.btn_navigate).setOnClickListener {
                findNavController().navigate(
                    FragmentFeature1Directions.actionToFeature2(
                        CommonModel(
                            findViewById<TextView>(R.id.et_input).editableText.toString()
                        )
                    )
                )
            }
        }
    }
}