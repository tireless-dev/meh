// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChargingStation: ImageVector
  get() {
    val current = _chargingStation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChargingStation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="11.857 21.514 10.143 20.486 12.234 17.0 7.234 17.0 11.143 10.486 12.857 11.514 10.766 15.0 15.766 15.0 11.857 21.514" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11.857 21.514
          moveTo(x = 11.857f, y = 21.514f)
          // L 10.143 20.486
          lineTo(x = 10.143f, y = 20.486f)
          // L 12.234 17
          lineTo(x = 12.234f, y = 17.0f)
          // L 7.234 17
          lineTo(x = 7.234f, y = 17.0f)
          // L 11.143 10.486
          lineTo(x = 11.143f, y = 10.486f)
          // L 12.857 11.514
          lineTo(x = 12.857f, y = 11.514f)
          // L 10.766 15
          lineTo(x = 10.766f, y = 15.0f)
          // L 15.766 15
          lineTo(x = 15.766f, y = 15.0f)
          // L 11.857 21.514z
          lineTo(x = 11.857f, y = 21.514f)
          close()
        }
        // M30 7 h-1 V4 h-2 v3 h-1 v6 h1 v11.5 a1.5 1.5 0 0 1 -3 0 V16 a1 1 0 0 0 -1 -1 h-4 V5 a1 1 0 0 0 -1 -1 H5 a1 1 0 0 0 -1 1 v21 H2 v2 h19 v-2 h-2 v-9 h3 v7.5 a3.5 3.5 0 0 0 7 0 V13 h1Z M17 26 H6 V6 h11Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 7
          moveTo(x = 30.0f, y = 7.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // h -1
          horizontalLineToRelative(dx = -1.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 11.5
          verticalLineToRelative(dy = 11.5f)
          // a 1.5 1.5 0 0 1 -3 0
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 0.0f,
          )
          // V 16
          verticalLineTo(y = 16.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 5
          verticalLineTo(y = 5.0f)
          // a 1 1 0 0 0 -1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = -1.0f,
          )
          // H 5
          horizontalLineTo(x = 5.0f)
          // a 1 1 0 0 0 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // v 21
          verticalLineToRelative(dy = 21.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 19
          horizontalLineToRelative(dx = 19.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -9
          verticalLineToRelative(dy = -9.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // v 7.5
          verticalLineToRelative(dy = 7.5f)
          // a 3.5 3.5 0 0 0 7 0
          arcToRelative(
            a = 3.5f,
            b = 3.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 7.0f,
            dy1 = 0.0f,
          )
          // V 13
          verticalLineTo(y = 13.0f)
          // h 1z
          horizontalLineToRelative(dx = 1.0f)
          close()
          // M 17 26
          moveTo(x = 17.0f, y = 26.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 11z
          horizontalLineToRelative(dx = 11.0f)
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
      .also { _chargingStation = it }
  }

@Suppress("ObjectPropertyName")
private var _chargingStation: ImageVector? = null
