// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Finance: ImageVector
  get() {
    val current = _finance
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Finance",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="28" height="2" x="2.0" y="28.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 2 28
          moveTo(x = 2.0f, y = 28.0f)
          // h 28
          horizontalLineToRelative(dx = 28.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -28z
          horizontalLineToRelative(dx = -28.0f)
          close()
        }
        // M27 11 a1 1 0 0 0 1 -1 V7 a1 1 0 0 0 -.66 -.94 l-11 -4 a1 1 0 0 0 -.68 0 l-11 4 A1 1 0 0 0 4 7 v3 a1 1 0 0 0 1 1 h1 v13 H4 v2 h24 v-2 h-2 V11Z M6 7.7 l10 -3.64 L26 7.7 V9 H6Z M18 24 h-4 V11 h4Z M8 11 h4 v13 H8Z m16 13 h-4 V11 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 11
          moveTo(x = 27.0f, y = 11.0f)
          // a 1 1 0 0 0 1 -1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = -1.0f,
          )
          // V 7
          verticalLineTo(y = 7.0f)
          // a 1 1 0 0 0 -0.66 -0.94
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.66f,
            dy1 = -0.94f,
          )
          // l -11 -4
          lineToRelative(dx = -11.0f, dy = -4.0f)
          // a 1 1 0 0 0 -0.68 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.68f,
            dy1 = 0.0f,
          )
          // l -11 4
          lineToRelative(dx = -11.0f, dy = 4.0f)
          // A 1 1 0 0 0 4 7
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 4.0f,
            y1 = 7.0f,
          )
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // a 1 1 0 0 0 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // h 1
          horizontalLineToRelative(dx = 1.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 24
          horizontalLineToRelative(dx = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 11z
          verticalLineTo(y = 11.0f)
          close()
          // M 6 7.7
          moveTo(x = 6.0f, y = 7.7f)
          // l 10 -3.64
          lineToRelative(dx = 10.0f, dy = -3.64f)
          // L 26 7.7
          lineTo(x = 26.0f, y = 7.7f)
          // V 9
          verticalLineTo(y = 9.0f)
          // H 6z
          horizontalLineTo(x = 6.0f)
          close()
          // M 18 24
          moveTo(x = 18.0f, y = 24.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
          close()
          // M 8 11
          moveTo(x = 8.0f, y = 11.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 13
          verticalLineToRelative(dy = 13.0f)
          // H 8z
          horizontalLineTo(x = 8.0f)
          close()
          // m 16 13
          moveToRelative(dx = 16.0f, dy = 13.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _finance = it }
  }

@Suppress("ObjectPropertyName")
private var _finance: ImageVector? = null
