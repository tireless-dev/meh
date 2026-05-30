// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WeatherStation: ImageVector
  get() {
    val current = _weatherStation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WeatherStation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M17 28 V17 h1 a2 2 0 0 0 2 -2 v-4 a2 2 0 0 0 -2 -2 h-4 a2 2 0 0 0 -2 2 v4 a2 2 0 0 0 2 2 h1 v11 H2 v2 h28 v-2Z m-3 -17 h4 v4 h-4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 28
          moveTo(x = 17.0f, y = 28.0f)
          // V 17
          verticalLineTo(y = 17.0f)
          // h 1
          horizontalLineToRelative(dx = 1.0f)
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
          // v -4
          verticalLineToRelative(dy = -4.0f)
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
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v -2z
          verticalLineToRelative(dy = -2.0f)
          close()
          // m -3 -17
          moveToRelative(dx = -3.0f, dy = -17.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M9.33 18.22 a7 7 0 0 1 0 -10.44 l1.34 1.5 a5 5 0 0 0 0 7.45Z m13.34 0 -1.34 -1.5 a5 5 0 0 0 0 -7.45 l1.34 -1.49 a7 7 0 0 1 0 10.44
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9.33 18.22
          moveTo(x = 9.33f, y = 18.22f)
          // a 7 7 0 0 1 0 -10.44
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -10.44f,
          )
          // l 1.34 1.5
          lineToRelative(dx = 1.34f, dy = 1.5f)
          // a 5 5 0 0 0 0 7.45z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 7.45f,
          )
          close()
          // m 13.34 0
          moveToRelative(dx = 13.34f, dy = 0.0f)
          // l -1.34 -1.5
          lineToRelative(dx = -1.34f, dy = -1.5f)
          // a 5 5 0 0 0 0 -7.45
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -7.45f,
          )
          // l 1.34 -1.49
          lineToRelative(dx = 1.34f, dy = -1.49f)
          // a 7 7 0 0 1 0 10.44
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 10.44f,
          )
        }
        // M6.4 21.8 a11 11 0 0 1 0 -17.6 l1.2 1.6 a9 9 0 0 0 0 14.4Z m19.2 0 -1.2 -1.6 a9 9 0 0 0 0 -14.4 l1.2 -1.6 a11 11 0 0 1 0 17.6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6.4 21.8
          moveTo(x = 6.4f, y = 21.8f)
          // a 11 11 0 0 1 0 -17.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -17.6f,
          )
          // l 1.2 1.6
          lineToRelative(dx = 1.2f, dy = 1.6f)
          // a 9 9 0 0 0 0 14.4z
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 14.4f,
          )
          close()
          // m 19.2 0
          moveToRelative(dx = 19.2f, dy = 0.0f)
          // l -1.2 -1.6
          lineToRelative(dx = -1.2f, dy = -1.6f)
          // a 9 9 0 0 0 0 -14.4
          arcToRelative(
            a = 9.0f,
            b = 9.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -14.4f,
          )
          // l 1.2 -1.6
          lineToRelative(dx = 1.2f, dy = -1.6f)
          // a 11 11 0 0 1 0 17.6
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 17.6f,
          )
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
      .also { _weatherStation = it }
  }

@Suppress("ObjectPropertyName")
private var _weatherStation: ImageVector? = null
