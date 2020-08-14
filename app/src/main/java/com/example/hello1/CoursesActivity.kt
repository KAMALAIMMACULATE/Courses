package com.example.hello1

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_courses.*

class CoursesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_courses)
        var courseList = listOf<Course>(

            Course("1", "Kotlin", "kT542", "James", "Kotlin Intro"),
            Course("2", "Python", "py676", "Joyce", "Backend development training"),
            Course("3", "UI/UX Design", "UD445", "Wema", "UI/UX design"),
            Course("4", "Entrprenuership", "ENT567", "Mary", "Entreprenuership intro"),
            Course("2", "HTML/CSS", "HC302", "Joyce", "Intro to HTML/CSS"),
            Course("4", "Professional Development", "PD432", "Becky", "Professional Development"),
             Course("2", "Hardware Electronics", "HE880", "Anne ", "Hardware Electronics intro"),
             Course("3", "Hardware Design", "HE454", "Mary", "Hardware Design itro"),
             Course("4", "Javascript", "JS 122", "Joy", "React intro")
        rvCourses.layoutManager = LinearLayoutManager(baseContext)
        rvCourses.adapter = CoursesAdapter(courseList)
    }
}