// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DataClass: ImageVector
  get() {
    val current = _dataClass
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DataClass",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M26 16 a4 4 0 0 0 -2.02 .57 l-2.86 -2.86 2.3 -2.3 a2 2 0 0 0 0 -2.82 l-6 -6 a2 2 0 0 0 -2.83 0 l-6 6 a2 2 0 0 0 0 2.82 l2.29 2.3 -2.86 2.86 a4.04 4.04 0 1 0 1.41 1.41 l2.86 -2.86 2.3 2.3 a2 2 0 0 0 .41 .3 V22 h-3 v8 h8 v-8 h-3 v-4.28 a2 2 0 0 0 .41 -.3 l2.3 -2.3 2.86 2.86 A3.99 3.99 0 1 0 26 16 M8 20 a2 2 0 1 1 -2 -2 2 2 0 0 1 2 2 m10 4 v4 h-4 v-4z m-2 -8 -6 -6 6 -6 6 6Z m10 6 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26 16
          moveTo(x = 26.0f, y = 16.0f)
          // a 4 4 0 0 0 -2.02 0.57
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.02f,
            dy1 = 0.57f,
          )
          // l -2.86 -2.86
          lineToRelative(dx = -2.86f, dy = -2.86f)
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // a 2 2 0 0 0 0 -2.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.82f,
          )
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // a 2 2 0 0 0 -2.83 0
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.83f,
            dy1 = 0.0f,
          )
          // l -6 6
          lineToRelative(dx = -6.0f, dy = 6.0f)
          // a 2 2 0 0 0 0 2.82
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.82f,
          )
          // l 2.29 2.3
          lineToRelative(dx = 2.29f, dy = 2.3f)
          // l -2.86 2.86
          lineToRelative(dx = -2.86f, dy = 2.86f)
          // a 4.04 4.04 0 1 0 1.41 1.41
          arcToRelative(
            a = 4.04f,
            b = 4.04f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 1.41f,
            dy1 = 1.41f,
          )
          // l 2.86 -2.86
          lineToRelative(dx = 2.86f, dy = -2.86f)
          // l 2.3 2.3
          lineToRelative(dx = 2.3f, dy = 2.3f)
          // a 2 2 0 0 0 0.41 0.3
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.41f,
            dy1 = 0.3f,
          )
          // V 22
          verticalLineTo(y = 22.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 8
          verticalLineToRelative(dy = 8.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v -8
          verticalLineToRelative(dy = -8.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -4.28
          verticalLineToRelative(dy = -4.28f)
          // a 2 2 0 0 0 0.41 -0.3
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.41f,
            dy1 = -0.3f,
          )
          // l 2.3 -2.3
          lineToRelative(dx = 2.3f, dy = -2.3f)
          // l 2.86 2.86
          lineToRelative(dx = 2.86f, dy = 2.86f)
          // A 3.99 3.99 0 1 0 26 16
          arcTo(
            horizontalEllipseRadius = 3.99f,
            verticalEllipseRadius = 3.99f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 26.0f,
            y1 = 16.0f,
          )
          // M 8 20
          moveTo(x = 8.0f, y = 20.0f)
          // a 2 2 0 1 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
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
          // m 10 4
          moveToRelative(dx = 10.0f, dy = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // v -4z
          verticalLineToRelative(dy = -4.0f)
          close()
          // m -2 -8
          moveToRelative(dx = -2.0f, dy = -8.0f)
          // l -6 -6
          lineToRelative(dx = -6.0f, dy = -6.0f)
          // l 6 -6
          lineToRelative(dx = 6.0f, dy = -6.0f)
          // l 6 6z
          lineToRelative(dx = 6.0f, dy = 6.0f)
          close()
          // m 10 6
          moveToRelative(dx = 10.0f, dy = 6.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
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
      .also { _dataClass = it }
  }

@Suppress("ObjectPropertyName")
private var _dataClass: ImageVector? = null
