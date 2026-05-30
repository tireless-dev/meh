// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Industry: ImageVector
  get() {
    val current = _industry
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Industry",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.53 6.15 a1 1 0 0 0 -1 0 L20 10.38 V7 a1 1 0 0 0 -1.45 -.89 L10 10.38 V3 a1 1 0 0 0 -1 -1 H3 a1 1 0 0 0 -1 1 v25 h28 V7 a1 1 0 0 0 -.47 -.85 M22 26 h-4 v-7 h4Z m6 0 h-4 v-8 a1 1 0 0 0 -1 -1 h-6 a1 1 0 0 0 -1 1 v8 H4 V4 h4 v9.62 l10 -5 v5 l10 -5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.53 6.15
          moveTo(x = 29.53f, y = 6.15f)
          // a 1 1 0 0 0 -1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.0f,
            dy1 = 0.0f,
          )
          // L 20 10.38
          lineTo(x = 20.0f, y = 10.38f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 0 -1.45 -0.89
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.45f,
            dy1 = -0.89f,
          )
          // L 10 10.38
          lineTo(x = 10.0f, y = 10.38f)
          // V 3
          verticalLineTo(y = 3.0f)
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
          // H 3
          horizontalLineTo(x = 3.0f)
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
          // v 25
          verticalLineToRelative(dy = 25.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 0 -0.47 -0.85
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.47f,
            dy1 = -0.85f,
          )
          // M 22 26
          moveTo(x = 22.0f, y = 26.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -7
          verticalLineToRelative(dy = -7.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // m 6 0
          moveToRelative(dx = 6.0f, dy = 0.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
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
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 9.62
          verticalLineToRelative(dy = 9.62f)
          // l 10 -5
          lineToRelative(dx = 10.0f, dy = -5.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // l 10 -5z
          lineToRelative(dx = 10.0f, dy = -5.0f)
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
      .also { _industry = it }
  }

@Suppress("ObjectPropertyName")
private var _industry: ImageVector? = null
