// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.time

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AlarmSubtract: ImageVector
  get() {
    val current = _alarmSubtract
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.AlarmSubtract",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 28 a11 11 0 1 1 11 -11 11 11 0 0 1 -11 11 m0 -20 a9 9 0 1 0 9 9 9 9 0 0 0 -9 -9
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 28
          moveTo(x = 16.0f, y = 28.0f)
          // a 11 11 0 1 1 11 -11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 11.0f,
            dy1 = -11.0f,
          )
          // a 11 11 0 0 1 -11 11
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -11.0f,
            dy1 = 11.0f,
          )
          // m 0 -20
          moveToRelative(dx = 0.0f, dy = -20.0f)
          // a 9 9 0 1 0 9 9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 9.0f,
            dy1 = 9.0f,
          )
          // a 9 9 0 0 0 -9 -9
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -9.0f,
            dy1 = -9.0f,
          )
        }
        // <rect width="5" height="2" x="3.96" y="5.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.0006943 7.5921
          moveTo(x = 4.0006943f, y = 7.5921f)
          // l 3.5318294 -3.5392346
          lineToRelative(dx = 3.5318294f, dy = -3.5392346f)
          // l 1.4156939 1.4127318
          lineToRelative(dx = 1.4156939f, dy = 1.4127318f)
          // l -3.5318294 3.5392346z
          lineToRelative(dx = -3.5318294f, dy = 3.5392346f)
          close()
        }
        // <rect width="2" height="5" x="24.5" y="3.96" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22.999397 5.4078503
          moveTo(x = 22.999397f, y = 5.4078503f)
          // l 1.4156938 -1.4127318
          lineToRelative(dx = 1.4156938f, dy = -1.4127318f)
          // l 3.5318294 3.5392344
          lineToRelative(dx = 3.5318294f, dy = 3.5392344f)
          // l -1.4156938 1.4127318z
          lineToRelative(dx = -1.4156938f, dy = 1.4127318f)
          close()
        }
        // <rect width="10" height="2" x="11.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 16
          moveTo(x = 11.0f, y = 16.0f)
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -10z
          horizontalLineToRelative(dx = -10.0f)
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
      .also { _alarmSubtract = it }
  }

@Suppress("ObjectPropertyName")
private var _alarmSubtract: ImageVector? = null
