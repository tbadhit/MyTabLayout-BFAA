package com.tbadhit.mytablayout

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

// (1) add "(activity: AppCompatActivity): FragmentStateAdapter(activity)"
/*
Untuk mengatur ViewPager2 dan komponen yang ada di dalamnya, kita memerlukan "SectionsPagerAdapter"
yang extend ke kelas "FragmentStateAdapter"
 */
// (FragmentStateAdapter) = merupakan base adapter yang digunakan untuk mengatur data pada ViewPager2
class SectionsPagerAdapter(activity: AppCompatActivity) : FragmentStateAdapter(activity) {
    // (1)
    // (getItemCount) = digunakan untuk menentukan jumlah tab yang ingin ditampilkan
    override fun getItemCount(): Int {
        // (1) Not One Fragment
        // return 2

        // (OneFragment)
        return 3
    }

    // (1)
    // (createFragment) = digunakan untuk menampilkan fragment sesuai dengan posisi tab-nya
    override fun createFragment(position: Int): Fragment {
        // (1) Not One Fragment
        // var fragment: Fragment? = null
        // when (position) {
        //     0 -> fragment = HomeFragment()
        //     1 -> fragment = ProfileFragment()
        // }
        // return fragment as Fragment
        //-----

        // (OneFragment)
        return HomeFragment.newInstance(position + 1)
    }
}