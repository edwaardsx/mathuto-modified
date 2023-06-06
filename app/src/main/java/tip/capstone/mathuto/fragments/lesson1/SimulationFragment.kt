package tip.capstone.mathuto.fragments.lesson1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tip.capstone.mathuto.databinding.Lesson1SimulationBinding

class SimulationFragment : Fragment() {

    private lateinit var binding: Lesson1SimulationBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Lesson1SimulationBinding.inflate(inflater, container, false)
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