// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.preview.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_NIGHT_YES
import androidx.compose.ui.tooling.preview.AndroidUiModes.UI_MODE_TYPE_NORMAL
import androidx.compose.ui.tooling.preview.Preview
import dev.tireless.meh.component.DatePicker
import dev.tireless.meh.component.DatePickerCalendar
import dev.tireless.meh.component.DateRangePicker
import dev.tireless.meh.component.TimePicker
import dev.tireless.meh.preview.PreviewTheme
import dev.tireless.meh.theme.MehTheme

@Preview(name = "Light", widthDp = 760)
@Preview(name = "Dark", widthDp = 760, uiMode = UI_MODE_NIGHT_YES or UI_MODE_TYPE_NORMAL)
@Composable
internal fun DatePickerPreview() {
  PreviewTheme {
    val colors = MehTheme.colors
    val spacing = MehTheme.spacing
    val typography = MehTheme.typography
    val sectionStyle = typography.heading01.copy(color = colors.textPrimary)

    Column(
      modifier = Modifier.fillMaxWidth(),
      verticalArrangement = Arrangement.spacedBy(spacing.spacing06),
    ) {
      BasicText(text = "Date Picker, Range Picker & Time Picker", style = sectionStyle)

      Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.spacedBy(spacing.spacing06),
      ) {
        Column(
          modifier = Modifier.weight(1f),
          verticalArrangement = Arrangement.spacedBy(spacing.spacing05),
        ) {
          DatePicker(
            value = "11/15/2026",
            onValueChange = {},
            label = "Single date",
            helper = "Format: mm/dd/yyyy",
          )
          DatePicker(
            value = "99/99/2026",
            onValueChange = {},
            label = "Invalid date",
            error = "Enter a valid date",
          )
          DateRangePicker(
            startDate = "11/10/2026",
            endDate = "11/18/2026",
            onStartDateChange = {},
            onEndDateChange = {},
          )
          TimePicker(
            value = "09:30",
            onValueChange = {},
            period = "AM",
            onPeriodChange = {},
            timeZone = "UTC",
            onTimeZoneChange = {},
          )
        }

        Column(verticalArrangement = Arrangement.spacedBy(spacing.spacing03)) {
          BasicText(text = "Calendar (with range & today)", style = sectionStyle)
          DatePickerCalendar(
            monthLabel = "November 2026",
            daysInMonth = 30,
            firstDayOfWeekOffset = 0,
            rangeStartDay = 10,
            rangeEndDay = 18,
            todayDay = 28,
            onDaySelect = {},
          )
        }
      }
    }
  }
}
