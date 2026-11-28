// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.ui.test.junit4.v2.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import dev.tireless.meh.theme.MehTheme
import org.junit.Assert.assertEquals
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config

@RunWith(RobolectricTestRunner::class)
@Config(sdk = [35])
class DatePickerAndFormTest {

  @get:Rule
  val composeTestRule = createComposeRule()

  @Test
  fun calendarSelectsDay() {
    var selectedDay = -1

    composeTestRule.setContent {
      MehTheme {
        DatePickerCalendar(
          monthLabel = "November 2026",
          daysInMonth = 30,
          firstDayOfWeekOffset = 0,
          onDaySelect = { selectedDay = it },
        )
      }
    }

    composeTestRule.onNodeWithText("14").performClick()
    assertEquals(14, selectedDay)
  }
}
