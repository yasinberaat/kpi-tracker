package com.trippy.kpitracker.data

import java.util.Date

data class DailyKpi(
    val id: Int = 0,
    val date: Date = Date(),
    val callCount: Int = 0, // Arama Sayısı
    val reachedCount: Int = 0, // Ulaşılan
    val appointmentCount: Int = 0, // Randevu
    val followUpCount: Int = 0 // Takip
)