package tip.capstone.mathuto.fragments.lesson13

import android.app.Dialog
import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import tip.capstone.mathuto.CalculatorActivity
import tip.capstone.mathuto.FullScreenImageAdapter
import tip.capstone.mathuto.FullScreenVideoActivity
import tip.capstone.mathuto.R
import tip.capstone.mathuto.databinding.Lesson13SimulationBinding

class SimulationFragment : Fragment() {

    private lateinit var binding: Lesson13SimulationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Lesson13SimulationBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCalculator.setOnClickListener {
            val intent = Intent(context, CalculatorActivity::class.java)
            startActivity(intent)
        }

        binding.simulation.setOnClickListener {
            val dialog = Dialog(requireContext())
            dialog.setContentView(R.layout.activity_full_screen_image)
            dialog.window?.setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT)
            dialog.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))

            val viewPager: ViewPager = dialog.findViewById(R.id.view_pager)
            val images = listOf(
                R.drawable.simulation_13_1, R.drawable.simulation_13_2,
                R.drawable.simulation_13_3, R.drawable.simulation_13_4, R.drawable.simulation_13_5, R.drawable.simulation_13_6,
                R.drawable.simulation_13_7, R.drawable.simulation_13_8, R.drawable.simulation_13_9, R.drawable.simulation_13_10)
            val adapter = FullScreenImageAdapter(requireContext(), images)
            viewPager.adapter = adapter

            dialog.show()
        }

        binding.btnWatchVideo.setOnClickListener{
            val videoUri = Uri.parse("android.resource://" + requireActivity().packageName + "/" + R.raw.simulation_13)
            val intent = Intent(context, FullScreenVideoActivity::class.java)
            intent.putExtra("videoUri", videoUri.toString())
            startActivity(intent)
        }
    }
}