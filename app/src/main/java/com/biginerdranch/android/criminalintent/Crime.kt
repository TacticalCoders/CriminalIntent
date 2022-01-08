package com.biginerdranch.android.criminalintent

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class Crime (@PrimaryKey var id: UUID = UUID.randomUUID(),
                  var title: String = "",
                  var date: Date = Date(),
                  var isSolved: Boolean = false)
//UUID는 유틸리티 클래스로, 고유한 ID 값을 쉽게 생성하는 방법을 제공한다.
//Date()는 현재 일자로 초기화 한다.
