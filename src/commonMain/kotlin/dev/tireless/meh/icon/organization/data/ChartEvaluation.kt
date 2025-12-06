// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ChartEvaluation: ImageVector
  get() {
    val current = _chartEvaluation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ChartEvaluation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="2" x="25.672" y="6.207" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.586395 8.000437
          moveTo(x = 25.586395f, y = 8.000437f)
          // l 2.8274395 -2.8294144
          lineToRelative(dx = 2.8274395f, dy = -2.8294144f)
          // l 1.4147072 1.4137198
          lineToRelative(dx = 1.4147072f, dy = 1.4137198f)
          // l -2.8274395 2.8294144z
          lineToRelative(dx = -2.8274395f, dy = 2.8294144f)
          close()
        }
        // <polygon points="16.0 20.5 11.0 15.539 12.59 13.969 16.0 17.349 23.41 10.0 25.0 11.579 16.0 20.5" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 20.5
          moveTo(x = 16.0f, y = 20.5f)
          // L 11 15.539
          lineTo(x = 11.0f, y = 15.539f)
          // L 12.59 13.969
          lineTo(x = 12.59f, y = 13.969f)
          // L 16 17.349
          lineTo(x = 16.0f, y = 17.349f)
          // L 23.41 10
          lineTo(x = 23.41f, y = 10.0f)
          // L 25 11.579
          lineTo(x = 25.0f, y = 11.579f)
          // L 16 20.5z
          lineTo(x = 16.0f, y = 20.5f)
          close()
        }
        // M4 28 v-2.59 L10.41 19 9 17.59 l-5 5 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 28
          moveTo(x = 4.0f, y = 28.0f)
          // v -2.59
          verticalLineToRelative(dy = -2.59f)
          // L 10.41 19
          lineTo(x = 10.41f, y = 19.0f)
          // L 9 17.59
          lineTo(x = 9.0f, y = 17.59f)
          // l -5 5
          lineToRelative(dx = -5.0f, dy = 5.0f)
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
          // v -2z
          verticalLineToRelative(dy = -2.0f)
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
      .also { _chartEvaluation = it }
  }

@Suppress("ObjectPropertyName")
private var _chartEvaluation: ImageVector? = null
