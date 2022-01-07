package com.biginerdranch.android.criminalintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val currentFragment = supportFragmentManager.findFragmentById(R.id.framgent_container)

        if(currentFragment == null){
            val fragment = CrimeListFragment.newInstacne()
            supportFragmentManager //프래그먼트 트랜잭션은 프래그먼트 리스트에 프래그먼트를 추가, 삭제, 첨부, 분리, 변경하는 데 사용된다.
                .beginTransaction() //FragmentTransaction의 인스턴스를 생성해 반환한다.
                .add(R.id.framgent_container, fragment) //컨테이너 뷰ID와 프래그먼트 인스턴스를 매개 변수로 갖는다.
                .commit()
        } //런타임 시에 화면을 구성 또는 변경하는 방법의 핵심.
    }
}