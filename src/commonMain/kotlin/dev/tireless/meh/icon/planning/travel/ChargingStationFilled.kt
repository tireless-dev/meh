// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChargingStationFilled: ImageVector
  get() {
    val current = _chargingStationFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChargingStationFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29 7 V4 h-2 v3 h-1 v6 h1 v11.5 a1.5 1.5 0 0 1 -3 0 V16 a1 1 0 0 0 -1 -1 h-4 V5 a1 1 0 0 0 -1 -1 H5 a1 1 0 0 0 -1 1 v21 H2 v2 h19 v-2 h-2 v-9 h3 v7.5 a3.5 3.5 0 0 0 7 0 V13 h1 V7Z M11.86 21.51 l-1.72 -1.02 2.1 -3.49 h-5 l3.9 -6.51 1.72 1.02 -2.1 3.49 h5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29 7
          moveTo(x = 29.0f, y = 7.0f)
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
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // V 7z
          verticalLineTo(y = 7.0f)
          close()
          // M 11.86 21.51
          moveTo(x = 11.86f, y = 21.51f)
          // l -1.72 -1.02
          lineToRelative(dx = -1.72f, dy = -1.02f)
          // l 2.1 -3.49
          lineToRelative(dx = 2.1f, dy = -3.49f)
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // l 3.9 -6.51
          lineToRelative(dx = 3.9f, dy = -6.51f)
          // l 1.72 1.02
          lineToRelative(dx = 1.72f, dy = 1.02f)
          // l -2.1 3.49
          lineToRelative(dx = -2.1f, dy = 3.49f)
          // h 5z
          horizontalLineToRelative(dx = 5.0f)
          close()
        }
        // <polygon points="11.857 21.514 10.143 20.486 12.234 17.0 7.234 17.0 11.143 10.486 12.857 11.514 10.766 15.0 15.766 15.0 11.857 21.514" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
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
        // <rect width="32" height="32" fill="#000" />
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
      .also { _chargingStationFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _chargingStationFilled: ImageVector? = null
