package tip.capstone.mathuto.fragments.lesson1

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import tip.capstone.mathuto.databinding.Lesson1WhatsInBinding

class WhatsInFragment : Fragment() {

    private lateinit var binding: Lesson1WhatsInBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = Lesson1WhatsInBinding.inflate(inflater, container, false)
        return binding.root
    }
    
    /*override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }*/
}