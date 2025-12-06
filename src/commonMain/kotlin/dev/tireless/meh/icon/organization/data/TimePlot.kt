// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TimePlot: ImageVector
  get() {
    val current = _timePlot
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TimePlot",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="23.586 13.0 21.0 10.414 21.0 6.0 23.0 6.0 23.0 9.586 25.0 11.586 23.586 13.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23.586 13
          moveTo(x = 23.586f, y = 13.0f)
          // L 21 10.414
          lineTo(x = 21.0f, y = 10.414f)
          // L 21 6
          lineTo(x = 21.0f, y = 6.0f)
          // L 23 6
          lineTo(x = 23.0f, y = 6.0f)
          // L 23 9.586
          lineTo(x = 23.0f, y = 9.586f)
          // L 25 11.586
          lineTo(x = 25.0f, y = 11.586f)
          // L 23.586 13z
          lineTo(x = 23.586f, y = 13.0f)
          close()
        }
        // M22 18 a8 8 0 1 1 8 -8 8 8 0 0 1 -8 8 m0 -14 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 18
          moveTo(x = 22.0f, y = 18.0f)
          // a 8 8 0 1 1 8 -8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 8.0f,
            dy1 = -8.0f,
          )
          // a 8 8 0 0 1 -8 8
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -8.0f,
            dy1 = 8.0f,
          )
          // m 0 -14
          moveToRelative(dx = 0.0f, dy = -14.0f)
          // a 6 6 0 1 0 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // a 6 6 0 0 0 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
        }
        // m8.63 18 7 6 H30 v-2 H16.37 l-7 -6 H4 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2 H4 V18Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8.63 18
          moveTo(x = 8.63f, y = 18.0f)
          // l 7 6
          lineToRelative(dx = 7.0f, dy = 6.0f)
          // H 30
          horizontalLineTo(x = 30.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 16.37
          horizontalLineTo(x = 16.37f)
          // l -7 -6
          lineToRelative(dx = -7.0f, dy = -6.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 2
          verticalLineTo(y = 2.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v 26
          verticalLineToRelative(dy = 26.0f)
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
          // h 26
          horizontalLineToRelative(dx = 26.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 18z
          verticalLineTo(y = 18.0f)
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
      .also { _timePlot = it }
  }

@Suppress("ObjectPropertyName")
private var _timePlot: ImageVector? = null
