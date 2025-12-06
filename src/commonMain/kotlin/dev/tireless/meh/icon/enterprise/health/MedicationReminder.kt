// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.health

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MedicationReminder: ImageVector
  get() {
    val current = _medicationReminder
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MedicationReminder",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20 2 H4 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 v18 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 V10 a2 2 0 0 0 2 -2 V4 a2 2 0 0 0 -2 -2 M6 14 h3 v10 H6Z m12 14 H6 v-2 h5 V12 H6 v-2 h12Z M4 8 V4 h16 v4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20 2
          moveTo(x = 20.0f, y = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 18
          verticalLineToRelative(dy = 18.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // M 6 14
          moveTo(x = 6.0f, y = 14.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // m 12 14
          moveToRelative(dx = 12.0f, dy = 14.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // V 12
          verticalLineTo(y = 12.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
          // M 4 8
          moveTo(x = 4.0f, y = 8.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 16
          horizontalLineToRelative(dx = 16.0f)
          // v 4z
          verticalLineToRelative(dy = 4.0f)
          close()
        }
        // <circle cx="26.0" cy="16.0" radius="4.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 16
          moveTo(x = 26.0f, y = 16.0f)
          // m -4 0
          moveToRelative(dx = -4.0f, dy = 0.0f)
          // a 4 4 0 1 1 8 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = 0.0f,
          )
          // a 4 4 0 1 1 -8 0z
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 0.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
        // M 0 0
        moveTo(x = 0.0f, y = 0.0f)
        // h 32
        horizontalLineToRelative(dx = 32.0f)
        // v 32
        verticalLineToRelative(dy = 32.0f)
        // h -32z
        horizontalLineToRelative(dx = -32.0f)
        close()
      }
    }.build()
      .also { _medicationReminder = it }
  }

@Suppress("ObjectPropertyName")
private var _medicationReminder: ImageVector? = null
