// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CalendarSettings: ImageVector
  get() {
    val current = _calendarSettings
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CalendarSettings",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 23 v-2 h-2.09 a6 6 0 0 0 -1.02 -2.47 l1.47 -1.48 -1.41 -1.41 -1.48 1.47 A6 6 0 0 0 23 16.1 V14 h-2 v2.09 a6 6 0 0 0 -2.47 1.02 l-1.48 -1.47 -1.41 1.41 1.47 1.48 A6 6 0 0 0 16.1 21 H14 v2 h2.09 a6 6 0 0 0 1.02 2.47 l-1.47 1.48 1.41 1.41 1.48 -1.47 A6 6 0 0 0 21 27.9 V30 h2 v-2.09 a6 6 0 0 0 2.47 -1.02 l1.48 1.47 1.41 -1.41 -1.47 -1.48 A6 6 0 0 0 27.9 23Z m-8 3 a4 4 0 1 1 4 -4 4 4 0 0 1 -4 4
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 23
          moveTo(x = 30.0f, y = 23.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2.09
          horizontalLineToRelative(dx = -2.09f)
          // a 6 6 0 0 0 -1.02 -2.47
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.02f,
            dy1 = -2.47f,
          )
          // l 1.47 -1.48
          lineToRelative(dx = 1.47f, dy = -1.48f)
          // l -1.41 -1.41
          lineToRelative(dx = -1.41f, dy = -1.41f)
          // l -1.48 1.47
          lineToRelative(dx = -1.48f, dy = 1.47f)
          // A 6 6 0 0 0 23 16.1
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 23.0f,
            y1 = 16.1f,
          )
          // V 14
          verticalLineTo(y = 14.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2.09
          verticalLineToRelative(dy = 2.09f)
          // a 6 6 0 0 0 -2.47 1.02
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.47f,
            dy1 = 1.02f,
          )
          // l -1.48 -1.47
          lineToRelative(dx = -1.48f, dy = -1.47f)
          // l -1.41 1.41
          lineToRelative(dx = -1.41f, dy = 1.41f)
          // l 1.47 1.48
          lineToRelative(dx = 1.47f, dy = 1.48f)
          // A 6 6 0 0 0 16.1 21
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.1f,
            y1 = 21.0f,
          )
          // H 14
          horizontalLineTo(x = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.09
          horizontalLineToRelative(dx = 2.09f)
          // a 6 6 0 0 0 1.02 2.47
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.02f,
            dy1 = 2.47f,
          )
          // l -1.47 1.48
          lineToRelative(dx = -1.47f, dy = 1.48f)
          // l 1.41 1.41
          lineToRelative(dx = 1.41f, dy = 1.41f)
          // l 1.48 -1.47
          lineToRelative(dx = 1.48f, dy = -1.47f)
          // A 6 6 0 0 0 21 27.9
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 21.0f,
            y1 = 27.9f,
          )
          // V 30
          verticalLineTo(y = 30.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -2.09
          verticalLineToRelative(dy = -2.09f)
          // a 6 6 0 0 0 2.47 -1.02
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.47f,
            dy1 = -1.02f,
          )
          // l 1.48 1.47
          lineToRelative(dx = 1.48f, dy = 1.47f)
          // l 1.41 -1.41
          lineToRelative(dx = 1.41f, dy = -1.41f)
          // l -1.47 -1.48
          lineToRelative(dx = -1.47f, dy = -1.48f)
          // A 6 6 0 0 0 27.9 23z
          arcTo(
            horizontalEllipseRadius = 6.0f,
            verticalEllipseRadius = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 27.9f,
            y1 = 23.0f,
          )
          close()
          // m -8 3
          moveToRelative(dx = -8.0f, dy = 3.0f)
          // a 4 4 0 1 1 4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 4.0f,
            dy1 = -4.0f,
          )
          // a 4 4 0 0 1 -4 4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = 4.0f,
          )
        }
        // M28 6 a2 2 0 0 0 -2 -2 h-4 V2 h-2 v2 h-8 V2 h-2 v2 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h4 v-2 H6 V6 h4 v2 h2 V6 h8 v2 h2 V6 h4 v6 h2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 6
          moveTo(x = 28.0f, y = 6.0f)
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
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8
          horizontalLineToRelative(dx = -8.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
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
      .also { _calendarSettings = it }
  }

@Suppress("ObjectPropertyName")
private var _calendarSettings: ImageVector? = null
