package com.example.cankaya_final_project.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cankaya_final_project.R
import com.example.cankaya_final_project.ui.quizUi.TestDetay



class UnitTestAdapter(private var unitTests: List<TestDetay>, private val listener: OnTestClickListener) : RecyclerView.Adapter<UnitTestAdapter.UnitTestViewHolder>() {

    interface OnTestClickListener {
        fun onTestClick(testDetay: TestDetay)
        fun onAchievementsClick(achievementId: String)
    }

    class UnitTestViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(unitTest: TestDetay, listener: OnTestClickListener) {
            itemView.findViewById<TextView>(R.id.tvTestTitle).text = unitTest.title
            itemView.findViewById<TextView>(R.id.tvSubjectTitle).text = unitTest.subject_title
            itemView.findViewById<TextView>(R.id.tvQuestionCount).text = unitTest.questionCount
            itemView.findViewById<TextView>(R.id.tvDifficultyLevel).text = unitTest.level
            itemView.findViewById<Button>(R.id.btnStartTest).setOnClickListener {
                listener.onTestClick(unitTest)
            }
            itemView.findViewById<Button>(R.id.btnAchievements).setOnClickListener {
                listener.onAchievementsClick(unitTest.achievement_id)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UnitTestViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_test_details, parent, false)
        return UnitTestViewHolder(view)
    }

    override fun onBindViewHolder(holder: UnitTestViewHolder, position: Int) {
        holder.bind(unitTests[position], listener)
    }

    override fun getItemCount() = unitTests.size

    fun updateTests(unitTests: List<TestDetay>) {
        this.unitTests = unitTests
        notifyDataSetChanged()
    }
}
