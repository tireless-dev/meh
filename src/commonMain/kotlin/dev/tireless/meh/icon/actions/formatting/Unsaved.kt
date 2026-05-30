// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Unsaved: ImageVector
  get() {
    val current = _unsaved
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Unsaved",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="30.0 19.4 28.6 18.0 25.0 21.6 21.4 18.0 20.0 19.4 23.6 23.0 20.0 26.6 21.4 28.0 25.0 24.4 28.6 28.0 30.0 26.6 26.4 23.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 19.4
          moveTo(x = 30.0f, y = 19.4f)
          // L 28.6 18
          lineTo(x = 28.6f, y = 18.0f)
          // L 25 21.6
          lineTo(x = 25.0f, y = 21.6f)
          // L 21.4 18
          lineTo(x = 21.4f, y = 18.0f)
          // L 20 19.4
          lineTo(x = 20.0f, y = 19.4f)
          // L 23.6 23
          lineTo(x = 23.6f, y = 23.0f)
          // L 20 26.6
          lineTo(x = 20.0f, y = 26.6f)
          // L 21.4 28
          lineTo(x = 21.4f, y = 28.0f)
          // L 25 24.4
          lineTo(x = 25.0f, y = 24.4f)
          // L 28.6 28
          lineTo(x = 28.6f, y = 28.0f)
          // L 30 26.6
          lineTo(x = 30.0f, y = 26.6f)
          // L 26.4 23z
          lineTo(x = 26.4f, y = 23.0f)
          close()
        }
        // M16 26 h-4 v-8 h4 v-2 h-4 a2 2 0 0 0 -2 2 v8 H6 V6 h4 v4 a2 2 0 0 0 2 2 h8 a2 2 0 0 0 2 -2 V6.4 l4 4 V16 h2 v-6 c0 -.3 -.1 -.5 -.3 -.7 l-5 -5 A1 1 0 0 0 22 4 H6 a2 2 0 0 0 -2 2 v20 a2 2 0 0 0 2 2 h10z M12 6 h8 v4 h-8z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 26
          moveTo(x = 16.0f, y = 26.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
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
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // V 6
          verticalLineTo(y = 6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
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
          // h 8
          horizontalLineToRelative(dx = 8.0f)
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
          // V 6.4
          verticalLineTo(y = 6.4f)
          // l 4 4
          lineToRelative(dx = 4.0f, dy = 4.0f)
          // V 16
          verticalLineTo(y = 16.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // c 0 -0.3 -0.1 -0.5 -0.3 -0.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.3f,
            dx2 = -0.1f,
            dy2 = -0.5f,
            dx3 = -0.3f,
            dy3 = -0.7f,
          )
          // l -5 -5
          lineToRelative(dx = -5.0f, dy = -5.0f)
          // A 1 1 0 0 0 22 4
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.0f,
            y1 = 4.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // v 20
          verticalLineToRelative(dy = 20.0f)
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
          // h 10z
          horizontalLineToRelative(dx = 10.0f)
          close()
          // M 12 6
          moveTo(x = 12.0f, y = 6.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
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
      .also { _unsaved = it }
  }

@Suppress("ObjectPropertyName")
private var _unsaved: ImageVector? = null
