package com.tbadhit.mytablayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.annotation.StringRes
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayoutMediator
import com.tbadhit.mytablayout.databinding.ActivityMainBinding

// Add library ViewPager2 and Material Design (build.gradle module) (1)
// Update code "activity_main.xml" (1)
// Create new fragment "HomeFragment"
// Update code "fragment_home.xml"
// Create new fragment "ProfileFragment"
// Update code "fragment_profile.xml"
// Create new kotlin class "SectionsPagerAdapter" (Kelas ini digunakan untuk mengatur ViewPager2 dan TabLayout)
// Add code "SectionsPagerAdapter" (1)
// Add code "MainActivity" (1)

// TAB LAYOUT WITH ONE FRAGMENT :
// Update code "HomeFragment" (1)
// Update code "SectionPagerAdapter" (OneFragment)
// Add code "MainActivity" (2)
class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // (1)
        val sectionsPagerAdapter = SectionsPagerAdapter(this)
        val viewPager= binding.viewPager
        viewPager.adapter = sectionsPagerAdapter
        val tabs = binding.tabs
        // kode dibawah untuk menghubungkan ViewPager2 dengan TabLayout
        TabLayoutMediator(tabs, viewPager) {tab, position ->
            tab.text = resources.getString(TAB_TITLES[position])
        }.attach()

        supportActionBar?.elevation = 0f
        //-----
    }

    // (1)
    companion object {
        @StringRes
        private val TAB_TITLES = intArrayOf(
            R.string.tab_text_1,
            R.string.tab_text_2,
            // (2)
            R.string.tab_text_3
        )
    }
}