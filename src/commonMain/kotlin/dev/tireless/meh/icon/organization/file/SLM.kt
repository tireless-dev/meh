// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SLM: ImageVector
  get() {
    val current = _sLM
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SLM",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="28.0 9.0 26.5 14.0 26.0 16.0 25.5 14.0 24.0 9.0 22.0 9.0 22.0 23.0 24.0 23.0 24.0 15.0 23.8 13.0 24.4 15.0 26.0 19.6 27.6 15.0 28.2 13.0 28.0 15.0 28.0 23.0 30.0 23.0 30.0 9.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 9
          moveTo(x = 28.0f, y = 9.0f)
          // L 26.5 14
          lineTo(x = 26.5f, y = 14.0f)
          // L 26 16
          lineTo(x = 26.0f, y = 16.0f)
          // L 25.5 14
          lineTo(x = 25.5f, y = 14.0f)
          // L 24 9
          lineTo(x = 24.0f, y = 9.0f)
          // L 22 9
          lineTo(x = 22.0f, y = 9.0f)
          // L 22 23
          lineTo(x = 22.0f, y = 23.0f)
          // L 24 23
          lineTo(x = 24.0f, y = 23.0f)
          // L 24 15
          lineTo(x = 24.0f, y = 15.0f)
          // L 23.8 13
          lineTo(x = 23.8f, y = 13.0f)
          // L 24.4 15
          lineTo(x = 24.4f, y = 15.0f)
          // L 26 19.6
          lineTo(x = 26.0f, y = 19.6f)
          // L 27.6 15
          lineTo(x = 27.6f, y = 15.0f)
          // L 28.2 13
          lineTo(x = 28.2f, y = 13.0f)
          // L 28 15
          lineTo(x = 28.0f, y = 15.0f)
          // L 28 23
          lineTo(x = 28.0f, y = 23.0f)
          // L 30 23
          lineTo(x = 30.0f, y = 23.0f)
          // L 30 9z
          lineTo(x = 30.0f, y = 9.0f)
          close()
        }
        // <polygon points="14.0 21.0 14.0 9.0 12.0 9.0 12.0 23.0 20.0 23.0 20.0 21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 21
          moveTo(x = 14.0f, y = 21.0f)
          // L 14 9
          lineTo(x = 14.0f, y = 9.0f)
          // L 12 9
          lineTo(x = 12.0f, y = 9.0f)
          // L 12 23
          lineTo(x = 12.0f, y = 23.0f)
          // L 20 23
          lineTo(x = 20.0f, y = 23.0f)
          // L 20 21z
          lineTo(x = 20.0f, y = 21.0f)
          close()
        }
        // M8 23 H2 v-2 h6 v-4 H4 a2 2 0 0 1 -2 -2 v-4 a2 2 0 0 1 2 -2 h6 v2 H4 v4 h4 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 23
          moveTo(x = 8.0f, y = 23.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 2 2 0 0 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
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
      .also { _sLM = it }
  }

@Suppress("ObjectPropertyName")
private var _sLM: ImageVector? = null
