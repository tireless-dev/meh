// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextLinkAnalysis: ImageVector
  get() {
    val current = _textLinkAnalysis
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextLinkAnalysis",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="8" height="2" x="8.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 10
          moveTo(x = 8.0f, y = 10.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // <rect width="12" height="2" x="8.0" y="6.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 6
          moveTo(x = 8.0f, y = 6.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="8.0" y="2.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 8 2
          moveTo(x = 8.0f, y = 2.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // m4.71 28 5.63 -10 7.44 6.5 a2 2 0 0 0 3.08 -.54 l6.97 -10.4 -1.66 -1.12 -7 10.45 L19.1 23 l-7.44 -6.49 a2 2 0 0 0 -3.08 .53 L4 25.18 V2 H2 v26 a2 2 0 0 0 2 2 h26 v-2Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4.71 28
          moveTo(x = 4.71f, y = 28.0f)
          // l 5.63 -10
          lineToRelative(dx = 5.63f, dy = -10.0f)
          // l 7.44 6.5
          lineToRelative(dx = 7.44f, dy = 6.5f)
          // a 2 2 0 0 0 3.08 -0.54
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.08f,
            dy1 = -0.54f,
          )
          // l 6.97 -10.4
          lineToRelative(dx = 6.97f, dy = -10.4f)
          // l -1.66 -1.12
          lineToRelative(dx = -1.66f, dy = -1.12f)
          // l -7 10.45
          lineToRelative(dx = -7.0f, dy = 10.45f)
          // L 19.1 23
          lineTo(x = 19.1f, y = 23.0f)
          // l -7.44 -6.49
          lineToRelative(dx = -7.44f, dy = -6.49f)
          // a 2 2 0 0 0 -3.08 0.53
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.08f,
            dy1 = 0.53f,
          )
          // L 4 25.18
          lineTo(x = 4.0f, y = 25.18f)
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
      .also { _textLinkAnalysis = it }
  }

@Suppress("ObjectPropertyName")
private var _textLinkAnalysis: ImageVector? = null
