// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CharacterUpperCase: ImageVector
  get() {
    val current = _characterUpperCase
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.CharacterUpperCase",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M30 23 h-6 a2 2 0 0 1 -2 -2 V11 a2 2 0 0 1 2 -2 h6 v2 h-6 v10 h6Z M20 12 a3 3 0 0 0 -3 -3 h-5 v14 h5 a3 3 0 0 0 3 -3 v-2 a3 3 0 0 0 -.78 -2 A3 3 0 0 0 20 14Z m-6 -1 h3 a1 1 0 0 1 1 1 v2 a1 1 0 0 1 -1 1 h-3Z m4 9 a1 1 0 0 1 -1 1 h-3 v-4 h3 a1 1 0 0 1 1 1Z M8 9 H4 a2 2 0 0 0 -2 2 v12 h2 v-5 h4 v5 h2 V11 a2 2 0 0 0 -2 -2 m-4 7 v-5 h4 v5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30 23
          moveTo(x = 30.0f, y = 23.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // V 11
          verticalLineTo(y = 11.0f)
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
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // M 20 12
          moveTo(x = 20.0f, y = 12.0f)
          // a 3 3 0 0 0 -3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = -3.0f,
          )
          // h -5
          horizontalLineToRelative(dx = -5.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 5
          horizontalLineToRelative(dx = 5.0f)
          // a 3 3 0 0 0 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // a 3 3 0 0 0 -0.78 -2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.78f,
            dy1 = -2.0f,
          )
          // A 3 3 0 0 0 20 14z
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 14.0f,
          )
          close()
          // m -6 -1
          moveToRelative(dx = -6.0f, dy = -1.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 1 1 0 0 1 1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // h -3z
          horizontalLineToRelative(dx = -3.0f)
          close()
          // m 4 9
          moveToRelative(dx = 4.0f, dy = 9.0f)
          // a 1 1 0 0 1 -1 1
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 1.0f,
          )
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v -4
          verticalLineToRelative(dy = -4.0f)
          // h 3
          horizontalLineToRelative(dx = 3.0f)
          // a 1 1 0 0 1 1 1z
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 1.0f,
          )
          close()
          // M 8 9
          moveTo(x = 8.0f, y = 9.0f)
          // H 4
          horizontalLineTo(x = 4.0f)
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
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 11
          verticalLineTo(y = 11.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m -4 7
          moveToRelative(dx = -4.0f, dy = 7.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 5z
          verticalLineToRelative(dy = 5.0f)
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
      .also { _characterUpperCase = it }
  }

@Suppress("ObjectPropertyName")
private var _characterUpperCase: ImageVector? = null
