package tip.capstone.mathuto.fragments.lesson18

import android.app.Dialog
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import tip.capstone.mathuto.FullScreenImageAdapter
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.*

class SimulationFragment : Fragment() {

    private lateinit var binding: Lesson18SimulationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Lesson18SimulationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.simulation.setOnClickListener {
            val dialog = Dialog(requireContext())
            dialog.setContentView(R.layout.activity_full_screen_image)
            dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val viewPager: ViewPager = dialog.findViewById(R.id.view_pager)
            val images = listOf(
                R.drawable.simulation_18_1, R.drawable.simulation_18_2,
                R.drawable.simulation_18_3, R.drawable.simulation_18_4, R.drawable.simulation_18_5, R.drawable.simulation_18_6,
                R.drawable.simulation_18_7, R.drawable.simulation_18_8, R.drawable.simulation_18_9, R.drawable.simulation_18_10)
            val adapter = FullScreenImageAdapter(requireContext(), images)
            viewPager.adapter = adapter

            dialog.show()
        }
    }
}