// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.BasicText
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.unit.dp
import dev.tireless.meh.theme.ControlSize
import dev.tireless.meh.theme.IconSize
import dev.tireless.meh.theme.Icons
import dev.tireless.meh.theme.MehTheme
import dev.tireless.meh.theme.dp

/**
 * Carbon Design System v11 Date Picker (simple or single-calendar) built on [TextInput] and
 * [Popover].
 */
@Composable
fun DatePicker(
  value: String,
  onValueChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  label: String? = null,
  placeholder: String = "mm/dd/yyyy",
  helper: String? = null,
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  readOnly: Boolean = false,
  showCalendarIcon: Boolean = true,
  size: ControlSize = ControlSize.Medium,
  interactionSource: MutableInteractionSource = remember { MutableInteractionSource() },
) {
  var calendarOpen by remember { mutableStateOf(false) }

  Box(modifier = modifier.fillMaxWidth()) {
    TextInput(
      value = value,
      onValueChange = onValueChange,
      label = label,
      placeholder = placeholder,
      helper = helper,
      error = error,
      warning = warning,
      enabled = enabled,
      readOnly = readOnly,
      size = size,
      interactionSource = interactionSource,
      trailingIcon =
      if (showCalendarIcon) {
        {
          Box(
            modifier = Modifier
              .size(24.dp)
              .semantics { contentDescription = "Open calendar" }
              .clickable(enabled = enabled && !readOnly, role = Role.Button) {
                calendarOpen = !calendarOpen
              },
            contentAlignment = Alignment.Center,
          ) {
            Icon(
              image = Icons.Calendar,
              size = IconSize.Small,
              tint = if (enabled) MehTheme.colors.iconPrimary else MehTheme.colors.iconDisabled,
            )
          }
        }
      } else {
        null
      },
    )

    if (calendarOpen) {
      Popover(
        expanded = true,
        onDismissRequest = { calendarOpen = false },
        align = PopoverAlign.BottomStart,
        caret = false,
        dropShadow = true,
        tabTip = true,
        contentPadding = PaddingValues(0.dp),
      ) {
        DatePickerCalendar(
          monthLabel = "November 2026",
          daysInMonth = 30,
          firstDayOfWeekOffset = 0,
          selectedDay = 15,
          todayDay = 28,
          onDaySelect = { day ->
            val padded = day.toString().padStart(2, '0')
            onValueChange("11/$padded/2026")
            calendarOpen = false
          },
        )
      }
    }
  }
}

/**
 * Carbon Design System v11 Date Range Picker pairing start and end date inputs.
 */
@Composable
fun DateRangePicker(
  startDate: String,
  endDate: String,
  onStartDateChange: (String) -> Unit,
  onEndDateChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  startLabel: String = "Start date",
  endLabel: String = "End date",
  placeholder: String = "mm/dd/yyyy",
  helper: String? = null,
  error: String? = null,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Medium,
) {
  Row(
    modifier = modifier.fillMaxWidth(),
    horizontalArrangement = Arrangement.spacedBy(MehTheme.spacing.spacing03),
  ) {
    DatePicker(
      value = startDate,
      onValueChange = onStartDateChange,
      label = startLabel,
      placeholder = placeholder,
      helper = helper,
      error = error,
      enabled = enabled,
      size = size,
      modifier = Modifier.weight(1f),
    )
    DatePicker(
      value = endDate,
      onValueChange = onEndDateChange,
      label = endLabel,
      placeholder = placeholder,
      enabled = enabled,
      size = size,
      modifier = Modifier.weight(1f),
    )
  }
}

/**
 * Carbon Design System v11 Calendar surface (`288.dp` width, month header with prev/next arrows,
 * 7-column day grid, selected/range/today highlights).
 */
@Composable
fun DatePickerCalendar(
  monthLabel: String,
  daysInMonth: Int,
  firstDayOfWeekOffset: Int,
  onDaySelect: (Int) -> Unit,
  modifier: Modifier = Modifier,
  selectedDay: Int? = null,
  rangeStartDay: Int? = null,
  rangeEndDay: Int? = null,
  todayDay: Int? = null,
  onPreviousMonth: () -> Unit = {},
  onNextMonth: () -> Unit = {},
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val weekdays = listOf("S", "M", "T", "W", "T", "F", "S")

  Column(
    modifier = modifier
      .width(288.dp)
      .background(colors.layer01)
      .padding(spacing.spacing04),
    verticalArrangement = Arrangement.spacedBy(spacing.spacing03),
  ) {
    // Month header
    Row(
      modifier = Modifier.fillMaxWidth(),
      verticalAlignment = Alignment.CenterVertically,
    ) {
      Box(
        modifier = Modifier
          .size(32.dp)
          .semantics { contentDescription = "Previous month" }
          .clickable(role = Role.Button, onClick = onPreviousMonth),
        contentAlignment = Alignment.Center,
      ) {
        Icon(image = Icons.ChevronLeft, size = IconSize.Small, tint = colors.iconPrimary)
      }

      Box(
        modifier = Modifier.weight(1f),
        contentAlignment = Alignment.Center,
      ) {
        BasicText(
          text = monthLabel,
          style = typography.headingCompact01.copy(color = colors.textPrimary),
        )
      }

      Box(
        modifier = Modifier
          .size(32.dp)
          .semantics { contentDescription = "Next month" }
          .clickable(role = Role.Button, onClick = onNextMonth),
        contentAlignment = Alignment.Center,
      ) {
        Icon(image = Icons.ChevronRight, size = IconSize.Small, tint = colors.iconPrimary)
      }
    }

    // Weekday headers
    Row(modifier = Modifier.fillMaxWidth()) {
      weekdays.forEach { dayName ->
        Box(
          modifier = Modifier
            .weight(1f)
            .height(32.dp),
          contentAlignment = Alignment.Center,
        ) {
          BasicText(
            text = dayName,
            style = typography.label01.copy(color = colors.textSecondary),
          )
        }
      }
    }

    // Day cells
    val totalCells = firstDayOfWeekOffset + daysInMonth
    val rows = (totalCells + 6) / 7
    Column(verticalArrangement = Arrangement.spacedBy(2.dp)) {
      for (row in 0 until rows) {
        Row(modifier = Modifier.fillMaxWidth()) {
          for (col in 0 until 7) {
            val cellIndex = row * 7 + col
            val day = cellIndex - firstDayOfWeekOffset + 1
            if (day in 1..daysInMonth) {
              val isEndpoint = day == selectedDay || day == rangeStartDay || day == rangeEndDay
              val isInRange =
                rangeStartDay != null && rangeEndDay != null && day in rangeStartDay..rangeEndDay
              val isToday = day == todayDay

              val cellBg =
                when {
                  isEndpoint -> colors.backgroundBrand
                  isInRange -> colors.highlight
                  else -> Color.Transparent
                }
              val cellTextColor =
                when {
                  isEndpoint -> colors.textOnColor
                  isToday -> colors.linkPrimary
                  else -> colors.textPrimary
                }

              Box(
                modifier = Modifier
                  .weight(1f)
                  .height(36.dp)
                  .background(cellBg)
                  .drawBehind {
                    if (isToday && !isEndpoint) {
                      val dotRadius = 2.dp.toPx()
                      drawCircle(
                        color = colors.linkPrimary,
                        radius = dotRadius,
                        center = Offset(size.width / 2f, size.height - 5.dp.toPx()),
                      )
                    }
                  }
                  .clickable(role = Role.Button) { onDaySelect(day) },
                contentAlignment = Alignment.Center,
              ) {
                BasicText(
                  text = day.toString(),
                  style = (if (isEndpoint || isToday) typography.headingCompact01 else typography.bodyCompact01)
                    .copy(color = cellTextColor),
                )
              }
            } else {
              Spacer(modifier = Modifier.weight(1f).height(36.dp))
            }
          }
        }
      }
    }
  }
}

/**
 * Carbon Design System v11 Time Picker pairing a `hh:mm` text input with AM/PM and optional
 * timezone selectors.
 */
@Composable
fun TimePicker(
  value: String,
  onValueChange: (String) -> Unit,
  modifier: Modifier = Modifier,
  period: String = "AM",
  onPeriodChange: ((String) -> Unit)? = null,
  timeZone: String? = null,
  onTimeZoneChange: ((String) -> Unit)? = null,
  label: String? = "Select a time",
  placeholder: String = "hh:mm",
  error: String? = null,
  warning: String? = null,
  enabled: Boolean = true,
  size: ControlSize = ControlSize.Medium,
) {
  val colors = MehTheme.colors
  val spacing = MehTheme.spacing
  val typography = MehTheme.typography
  val isInvalid = error != null && enabled
  val isWarning = warning != null && !isInvalid && enabled

  Column(modifier = modifier.fillMaxWidth()) {
    if (label != null) {
      BasicText(
        text = label,
        style = typography.label01.copy(
          color = if (enabled) colors.textSecondary else colors.textDisabled,
        ),
        modifier = Modifier.padding(bottom = spacing.spacing03),
      )
    }

    Row(
      horizontalArrangement = Arrangement.spacedBy(2.dp),
      verticalAlignment = Alignment.Top,
    ) {
      TextInput(
        value = value,
        onValueChange = onValueChange,
        placeholder = placeholder,
        error = if (isInvalid) "" else null,
        warning = if (isWarning) "" else null,
        enabled = enabled,
        size = size,
        modifier = Modifier.width(108.dp),
      )

      if (onPeriodChange != null) {
        Select(
          selectedOption = period,
          options = listOf("AM", "PM"),
          onOptionSelect = onPeriodChange,
          enabled = enabled,
          size = size,
          modifier = Modifier.width(88.dp),
        )
      }

      if (timeZone != null && onTimeZoneChange != null) {
        Select(
          selectedOption = timeZone,
          options = listOf("UTC", "EST", "PST", "CET"),
          onOptionSelect = onTimeZoneChange,
          enabled = enabled,
          size = size,
          modifier = Modifier.width(96.dp),
        )
      }
    }

    if (isInvalid) {
      BasicText(
        text = error,
        style = typography.label01.copy(color = colors.textError),
        modifier = Modifier.padding(top = spacing.spacing02),
      )
    } else if (isWarning) {
      BasicText(
        text = warning,
        style = typography.label01.copy(color = colors.textPrimary),
        modifier = Modifier.padding(top = spacing.spacing02),
      )
    }
  }
}
