package com.biginerdranch.android.criminalintent

import androidx.lifecycle.ViewModel

class CrimeListViewModel : ViewModel() { //데이터를 장기간 저장할 수 있는 저장소는 아니다.(장기간 데이터 처리는 11장에서)
    //val crimes = mutableListOf<Crime>()

    /*init {
        for(i in 0 until 100){ //모의 데이터 100개.
            val crime = Crime()
            crime.title = "Crime #$i"
            crime.isSolved = i % 2 == 0
            crimes += crime //산술연산자로 리스트에 추가할 수 있다.
        }
    }*/

    private val crimeRepository = CrimeRepository.get()
    val crimes = crimeRepository.getCrimes()
}