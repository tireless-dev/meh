// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrainHeart: ImageVector
  get() {
    val current = _trainHeart
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TrainHeart",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.3 2 a2.7 2.7 0 0 0 -1.9 .8 L25 3.22 l-.4 -.4 a2.66 2.66 0 0 0 -3.81 0 2.8 2.8 0 0 0 0 3.9 L25 11 l4.21 -4.3 a2.8 2.8 0 0 0 0 -3.9 2.7 2.7 0 0 0 -1.9 -.8 M22 13 v3 H6 v-6 h9 V8 H6.18 A3 3 0 0 1 9 6 h6 V4 H9 a5 5 0 0 0 -5 5 v12 a5 5 0 0 0 3.58 4.77 L5.77 30 h2.18 l1.7 -4 h8.7 l1.7 4 h2.18 l-1.81 -4.23 A5 5 0 0 0 24 21 v-8Z m0 7 h-3 v2 h2.82 A3 3 0 0 1 19 24 H9 a3 3 0 0 1 -2.82 -2 H9 v-2 H6 v-2 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.3 2
          moveTo(x = 27.3f, y = 2.0f)
          // a 2.7 2.7 0 0 0 -1.9 0.8
          arcToRelative(
            a = 2.7f,
            b = 2.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = 0.8f,
          )
          // L 25 3.22
          lineTo(x = 25.0f, y = 3.22f)
          // l -0.4 -0.4
          lineToRelative(dx = -0.4f, dy = -0.4f)
          // a 2.66 2.66 0 0 0 -3.81 0
          arcToRelative(
            a = 2.66f,
            b = 2.66f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.81f,
            dy1 = 0.0f,
          )
          // a 2.8 2.8 0 0 0 0 3.9
          arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 3.9f,
          )
          // L 25 11
          lineTo(x = 25.0f, y = 11.0f)
          // l 4.21 -4.3
          lineToRelative(dx = 4.21f, dy = -4.3f)
          // a 2.8 2.8 0 0 0 0 -3.9
          arcToRelative(
            a = 2.8f,
            b = 2.8f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.9f,
          )
          // a 2.7 2.7 0 0 0 -1.9 -0.8
          arcToRelative(
            a = 2.7f,
            b = 2.7f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.9f,
            dy1 = -0.8f,
          )
          // M 22 13
          moveTo(x = 22.0f, y = 13.0f)
          // v 3
          verticalLineToRelative(dy = 3.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -6
          verticalLineToRelative(dy = -6.0f)
          // h 9
          horizontalLineToRelative(dx = 9.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // H 6.18
          horizontalLineTo(x = 6.18f)
          // A 3 3 0 0 1 9 6
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 6.0f,
          )
          // h 6
          horizontalLineToRelative(dx = 6.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 5 5 0 0 0 -5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = 5.0f,
          )
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // a 5 5 0 0 0 3.58 4.77
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.58f,
            dy1 = 4.77f,
          )
          // L 5.77 30
          lineTo(x = 5.77f, y = 30.0f)
          // h 2.18
          horizontalLineToRelative(dx = 2.18f)
          // l 1.7 -4
          lineToRelative(dx = 1.7f, dy = -4.0f)
          // h 8.7
          horizontalLineToRelative(dx = 8.7f)
          // l 1.7 4
          lineToRelative(dx = 1.7f, dy = 4.0f)
          // h 2.18
          horizontalLineToRelative(dx = 2.18f)
          // l -1.81 -4.23
          lineToRelative(dx = -1.81f, dy = -4.23f)
          // A 5 5 0 0 0 24 21
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 21.0f,
          )
          // v -8z
          verticalLineToRelative(dy = -8.0f)
          close()
          // m 0 7
          moveToRelative(dx = 0.0f, dy = 7.0f)
          // h -3
          horizontalLineToRelative(dx = -3.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h 2.82
          horizontalLineToRelative(dx = 2.82f)
          // A 3 3 0 0 1 19 24
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 19.0f,
            y1 = 24.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 3 3 0 0 1 -2.82 -2
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.82f,
            dy1 = -2.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 16z
          horizontalLineToRelative(dx = 16.0f)
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
      .also { _trainHeart = it }
  }

@Suppress("ObjectPropertyName")
private var _trainHeart: ImageVector? = null
