package com.example.tiptime

import org.junit.Assert.assertEquals
import org.junit.Test
import java.text.NumberFormat

class TipCalculatorTests() {

    @Test
    fun `チップ２０%の時→切り上げしない`() {
        val amount = 10.00
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculate_20_percent_tip_roundup() {
        val amount = 11.10
        val tipPercent = 20.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(3)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun `チップ15%の時→切り上げしない`() {
        val amount = 10.00
        val tipPercent = 15.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(1.5)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, false)
        assertEquals(expectedTip, actualTip)
    }

    @Test
    fun calculate_15_percent_tip_roundup() {
        val amount = 10.00
        val tipPercent = 15.00
        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        val actualTip = calculateTip(amount = amount, tipPercent = tipPercent, true)
        assertEquals(expectedTip, actualTip)
    }
}
