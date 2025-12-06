// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Harbor: ImageVector
  get() {
    val current = _harbor
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Harbor",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 17 a11 11 0 0 1 -10 10.95 V14 h6 v-2 h-6 V9.86 a4 4 0 1 0 -2 0 V12 H9 v2 h6 v13.95 A11 11 0 0 1 5 17 H3 a13 13 0 0 0 26 0Z M14 6 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 17
          moveTo(x = 27.0f, y = 17.0f)
          // a 11 11 0 0 1 -10 10.95
          arcToRelative(
            a = 11.0f,
            b = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -10.0f,
            dy1 = 10.95f,
          )
          // V 14
          verticalLineTo(y = 14.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // V 9.86
          verticalLineTo(y = 9.86f)
          // a 4 4 0 1 0 -2 0
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 0.0f,
          )
          // V 12
          verticalLineTo(y = 12.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // v 13.95
          verticalLineToRelative(dy = 13.95f)
          // A 11 11 0 0 1 5 17
          arcTo(
            horizontalEllipseRadius = 11.0f,
            verticalEllipseRadius = 11.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 5.0f,
            y1 = 17.0f,
          )
          // H 3
          horizontalLineTo(x = 3.0f)
          // a 13 13 0 0 0 26 0z
          arcToRelative(
            a = 13.0f,
            b = 13.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 26.0f,
            dy1 = 0.0f,
          )
          close()
          // M 14 6
          moveTo(x = 14.0f, y = 6.0f)
          // a 2 2 0 1 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
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
      .also { _harbor = it }
  }

@Suppress("ObjectPropertyName")
private var _harbor: ImageVector? = null
