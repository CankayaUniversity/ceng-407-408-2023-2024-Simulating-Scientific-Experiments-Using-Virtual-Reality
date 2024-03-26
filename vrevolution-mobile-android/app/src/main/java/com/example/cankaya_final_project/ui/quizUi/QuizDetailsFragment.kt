package com.example.cankaya_final_project.ui.quizUi

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.adapters.UnitTestAdapter
import com.example.cankaya_final_project.databinding.FragmentQuizDetailsBinding
import com.example.cankaya_final_project.ui.AchievementDialogFragment

class QuizDetailsFragment : Fragment(), UnitTestAdapter.OnTestClickListener {

    private lateinit var unitTestAdapter: UnitTestAdapter
    private var testDetails: List<TestDetay> = emptyList()
    private lateinit var binding: FragmentQuizDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
         binding = FragmentQuizDetailsBinding.inflate(inflater, container, false)
         return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val classType = arguments?.getString("classType")
        testDetails = getTestDetailsForClass(classType)

        unitTestAdapter = UnitTestAdapter(testDetails, this)

        // RecyclerView'ı ayarla
        binding.rvQuizDetails.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = unitTestAdapter
        }
    }

    override fun onTestClick(testDetay: TestDetay) {
        val quizQuestionsFragment = QuestionsFragment().apply {
            arguments = Bundle().apply {
                putString("testId", testDetay.test_id)
                // Diğer parametreler buraya eklenebilir.
            }
        }


        // QuizQuestionsFragment'a yönlendirme yapma
        requireActivity().supportFragmentManager.beginTransaction()
            .replace(R.id.nav_host_fragment, quizQuestionsFragment)
            .addToBackStack(null)
            .commit()
    }

    override fun onAchievementsClick(achievementId: String) {
        val achievementDialogFragment = AchievementDialogFragment.newInstance(achievementId)
        achievementDialogFragment.show(parentFragmentManager, "AchievementDialogFragment")
    }



    private fun getTestDetailsForClass(classType: String?): List<TestDetay> {
        // Test detaylarınızı burada sınıf tipine göre döndürün
        return when (classType) {
            "5" -> listOf(
                TestDetay("test1grade5","unit1grade5achievement","Test 1 - Class 5", "Description for Test 1", "5", "Kolay"),
                TestDetay("test2grade5","unit1grade5achievement","Test 2 - Class 5", "Description for Test 2", "5", "Orta"),
                TestDetay("test3grade5","unit1grade5achievement","Test 3 - Class 5", "Description for Test 3", "5", "Zor"),
                TestDetay("test4grade5","unit2grade5achievement","Test 4 - Class 5", "Description for Test 3", "5", "Kolay"),
                TestDetay("test5grade5","unit2grade5achievement","Test 5 - Class 5", "Description for Test 3", "5", "Orta"),
                TestDetay("test6grade5","unit2grade5achievement","Test 6 - Class 5", "Description for Test 3", "5", "Zor"),
                TestDetay("test7grade5","unit3grade5achievement","Test 7 - Class 5", "Description for Test 3", "5", "Kolay"),
                TestDetay("test8grade5","unit3grade5achievement","Test 8 - Class 5", "Description for Test 3", "5", "Orta"),
                TestDetay("test9grade5","unit3grade5achievement","Test 9 - Class 5", "Description for Test 3", "5", "Zor"),
                TestDetay("test10grade5","unit4grade5achievement","Test 10 - Class 5", "Description for Test 3", "5", "Kolay")


            )
            "6" -> listOf(
                TestDetay("test1grade6","unit1grade6achievement","Test 1 - Class 6", "Description for Test 1", "5", "Kolay"),
                TestDetay("test2grade6","unit1grade6achievement","Test 2 - Class 6", "Description for Test 2", "5", "Orta"),
                TestDetay("test3grade6","unit1grade6achievement","Test 3 - Class 6", "Description for Test 3", "5", "Zor"),
                TestDetay("test4grade6","unit2grade6achievement","Test 4 - Class 6", "Description for Test 3", "5", "Kolay"),
                TestDetay("test5grade6","unit2grade6achievement","Test 5 - Class 6", "Description for Test 3", "5", "Orta"),
                TestDetay("test6grade6","unit2grade6achievement","Test 6 - Class 6", "Description for Test 3", "5", "Zor"),
                TestDetay("test7grade6","unit3grade6achievement","Test 7 - Class 6", "Description for Test 3", "5", "Kolay"),
                TestDetay("test8grade6","unit3grade6achievement","Test 8 - Class 6", "Description for Test 3", "5", "Orta"),
                TestDetay("test9grade6","unit3grade6achievement","Test 9 - Class 6", "Description for Test 3", "5", "Zor"),
                TestDetay("test10grade6","unit4grade6achievement","Test 10 - Class 6", "Description for Test 3", "5", "Kolay")

            )
            "7" -> listOf(
                TestDetay("test1grade7","unit1grade7achievement","Test 1 - Class 7", "Description for Test 1", "5", "Kolay"),
                TestDetay("test2grade7","unit1grade7achievement","Test 2 - Class 7", "Description for Test 2", "5", "Orta"),
                TestDetay("test3grade7","unit1grade7achievement","Test 3 - Class 7", "Description for Test 3", "5", "Zor"),
                TestDetay("test4grade7","unit2grade7achievement","Test 4 - Class 7", "Description for Test 4", "5", "Kolay"),
                TestDetay("test5grade7","unit2grade7achievement","Test 5 - Class 7", "Description for Test 5", "5", "Orta"),
                TestDetay("test6grade7","unit2grade7achievement","Test 6 - Class 7", "Description for Test 6", "5", "Zor"),
                TestDetay("test7grade7","unit3grade7achievement","Test 7 - Class 7", "Description for Test 7", "5", "Kolay"),
                TestDetay("test8grade7","unit3grade7achievement","Test 8 - Class 7", "Description for Test 8", "5", "Orta"),
                TestDetay("test9grade7","unit3grade7achievement","Test 9 - Class 7", "Description for Test 9", "5", "Zor"),
                TestDetay("test10grade7","unit4grade7achievement","Test 10 - Class 7", "Description for Test 10", "5", "Kolay"),
            )
            else -> emptyList()
        }
    }



}


