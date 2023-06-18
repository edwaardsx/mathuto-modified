package tip.capstone.mathuto.fragments.lesson18

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
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

    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnTutorial.setOnClickListener {
            val intent = Intent(requireActivity(), Tutorial1Activity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            requireActivity().startActivity(intent)
        }
        binding.btnStartQuiz.setOnClickListener {
            val intent = Intent(requireActivity(), Quiz1Activity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK
            requireActivity().startActivity(intent)
        }
    }*/
}