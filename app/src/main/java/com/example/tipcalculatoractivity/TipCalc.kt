package com.example.tipcalculatoractivity

enum class TipType {
    TENPERCENT,
    TWENTYPERCENT,
    THIRTYPERCENT
}

fun calculateTip(input: Float, tipType: TipType): Float {
    return when(tipType) {
        TipType.TENPERCENT -> ((input * 0.1).toFloat())
        TipType.TWENTYPERCENT -> (input * 0.2).toFloat()
        TipType.THIRTYPERCENT -> (input * 0.3).toFloat()
    }
}