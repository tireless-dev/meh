// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val LetterBb: ImageVector
  get() {
    val current = _letterBb
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.LetterBb",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M23 13 h-4 V9 h-2 v14 h6 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2 m-4 8 v-6 h4 v6Z m-4 -9 a3 3 0 0 0 -3 -3 H7 v14 h5 a3 3 0 0 0 3 -3 v-2 a3 3 0 0 0 -.78 -2 A3 3 0 0 0 15 14Z m-6 -1 h3 a1 1 0 0 1 1 1 v2 a1 1 0 0 1 -1 1 H9Z m4 9 a1 1 0 0 1 -1 1 H9 v-4 h3 a1 1 0 0 1 1 1Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 23 13
          moveTo(x = 23.0f, y = 13.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // V 9
          verticalLineTo(y = 9.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v 14
          verticalLineToRelative(dy = 14.0f)
          // h 6
          horizontalLineToRelative(dx = 6.0f)
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
          // v -6
          verticalLineToRelative(dy = -6.0f)
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
          // m -4 8
          moveToRelative(dx = -4.0f, dy = 8.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 6z
          verticalLineToRelative(dy = 6.0f)
          close()
          // m -4 -9
          moveToRelative(dx = -4.0f, dy = -9.0f)
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
          // H 7
          horizontalLineTo(x = 7.0f)
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
          // A 3 3 0 0 0 15 14z
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 15.0f,
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
          // H 9z
          horizontalLineTo(x = 9.0f)
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
          // H 9
          horizontalLineTo(x = 9.0f)
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
      .also { _letterBb = it }
  }

@Suppress("ObjectPropertyName")
private var _letterBb: ImageVector? = null
