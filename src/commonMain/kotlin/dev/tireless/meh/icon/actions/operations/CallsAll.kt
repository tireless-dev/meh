// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CallsAll: ImageVector
  get() {
    val current = _callsAll
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CallsAll",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 12 a4 4 0 1 0 0 8 4 4 0 0 0 0 -8 m0 6 a2 2 0 1 1 0 -4 2 2 0 0 1 0 4 m-11 3 v2 h2.59 l-2.3 2.3 a3 3 0 1 0 1.41 1.41 l2.3 -2.3 V27 h2 v-6z m-1 8 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 m-2.59 -17.59 L10 12.83 12.17 15 H7.82 a3 3 0 1 0 0 2 h4.35 L10 19.17 l1.41 1.42 L16 16z M5 17 a1 1 0 1 1 0 -2 1 1 0 0 1 0 2 M19 5 v2.59 l-2.3 -2.3 A3 3 0 1 0 14 7 q.7 0 1.29 -.3 l2.3 2.3 H15 v2 h6 V5z m-6 -1 a1 1 0 1 1 2 0 1 1 0 0 1 -2 0
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 12
          moveTo(x = 26.0f, y = 12.0f)
          // a 4 4 0 1 0 0 8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 8.0f,
          )
          // a 4 4 0 0 0 0 -8
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -8.0f,
          )
          // m 0 6
          moveToRelative(dx = 0.0f, dy = 6.0f)
          // a 2 2 0 1 1 0 -4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -4.0f,
          )
          // a 2 2 0 0 1 0 4
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 4.0f,
          )
          // m -11 3
          moveToRelative(dx = -11.0f, dy = 3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.59
          horizontalLineToRelative(dx = 2.59f)
          // l -2.3 2.3
          lineToRelative(dx = -2.3f, dy = 2.3f)
          // a 3 3 0 1 0 1.41 1.41
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.41f,
            dy1 = 1.41f,
          )
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // V 27
          verticalLineTo(y = 27.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -6z
          verticalLineToRelative(dy = -6.0f)
          close()
          // m -1 8
          moveToRelative(dx = -1.0f, dy = 8.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // m -2.59 -17.59
          moveToRelative(dx = -2.59f, dy = -17.59f)
          // L 10 12.83
          lineTo(x = 10.0f, y = 12.83f)
          // L 12.17 15
          lineTo(x = 12.17f, y = 15.0f)
          // H 7.82
          horizontalLineTo(x = 7.82f)
          // a 3 3 0 1 0 0 2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // h 4.35
          horizontalLineToRelative(dx = 4.35f)
          // L 10 19.17
          lineTo(x = 10.0f, y = 19.17f)
          // l 1.41 1.42
          lineToRelative(dx = 1.41f, dy = 1.42f)
          // L 16 16z
          lineTo(x = 16.0f, y = 16.0f)
          close()
          // M 5 17
          moveTo(x = 5.0f, y = 17.0f)
          // a 1 1 0 1 1 0 -2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -2.0f,
          )
          // a 1 1 0 0 1 0 2
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 2.0f,
          )
          // M 19 5
          moveTo(x = 19.0f, y = 5.0f)
          // v 2.59
          verticalLineToRelative(dy = 2.59f)
          // l -2.3 -2.3
          lineToRelative(dx = -2.3f, dy = -2.3f)
          // A 3 3 0 1 0 14 7
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 7.0f,
          )
          // q 0.7 0 1.29 -0.3
          quadToRelative(
            dx1 = 0.7f,
            dy1 = 0.0f,
            dx2 = 1.29f,
            dy2 = -0.3f,
          )
          // l 2.3 2.3
          lineToRelative(dx = 2.3f, dy = 2.3f)
          // H 15
          horizontalLineTo(x = 15.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // V 5z
          verticalLineTo(y = 5.0f)
          close()
          // m -6 -1
          moveToRelative(dx = -6.0f, dy = -1.0f)
          // a 1 1 0 1 1 2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 0.0f,
          )
          // a 1 1 0 0 1 -2 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 0.0f,
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
      .also { _callsAll = it }
  }

@Suppress("ObjectPropertyName")
private var _callsAll: ImageVector? = null
