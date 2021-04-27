package org.d3if4054.hitungbmi.ui.histori

import androidx.lifecycle.ViewModel
import org.d3if4054.hitungbmi.db.BmiDao

class HistoriViewModel(db: BmiDao): ViewModel() {
    val data = db.getLastBmi()
}