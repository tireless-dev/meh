// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TrainTime: ImageVector
  get() {
    val current = _trainTime
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TrainTime",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <polygon points="25.496 10.088 22.874 7.466 22.874 3.0 25.124 3.0 25.124 6.534 27.088 8.498 25.496 10.088" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 25.496 10.088
          moveTo(x = 25.496f, y = 10.088f)
          // L 22.874 7.466
          lineTo(x = 22.874f, y = 7.466f)
          // L 22.874 3
          lineTo(x = 22.874f, y = 3.0f)
          // L 25.124 3
          lineTo(x = 25.124f, y = 3.0f)
          // L 25.124 6.534
          lineTo(x = 25.124f, y = 6.534f)
          // L 27.088 8.498
          lineTo(x = 27.088f, y = 8.498f)
          // L 25.496 10.088z
          lineTo(x = 25.496f, y = 10.088f)
          close()
        }
        // M24 1 a6 6 0 1 0 6 6 6 6 0 0 0 -6 -6 m1.5 9.09 -2.62 -2.62 V3 h2.25 v3.53 l1.96 1.97Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24 1
          moveTo(x = 24.0f, y = 1.0f)
          // a 6 6 0 1 0 6 6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = 6.0f,
          )
          // a 6 6 0 0 0 -6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -6.0f,
            dy1 = -6.0f,
          )
          // m 1.5 9.09
          moveToRelative(dx = 1.5f, dy = 9.09f)
          // l -2.62 -2.62
          lineToRelative(dx = -2.62f, dy = -2.62f)
          // V 3
          verticalLineTo(y = 3.0f)
          // h 2.25
          horizontalLineToRelative(dx = 2.25f)
          // v 3.53
          verticalLineToRelative(dy = 3.53f)
          // l 1.96 1.97z
          lineToRelative(dx = 1.96f, dy = 1.97f)
          close()
        }
        // M6 16 v-6 h9 V8 H6.18 A3 3 0 0 1 9 6 h6 V4 H9 a5 5 0 0 0 -5 5 v12 a5 5 0 0 0 3.58 4.77 L5.77 30 h2.18 l1.7 -4 h8.7 l1.7 4 h2.18 l-1.81 -4.23 A5 5 0 0 0 24 21 v-5Z m16 4 h-3 v2 h2.82 A3 3 0 0 1 19 24 H9 a3 3 0 0 1 -2.82 -2 H9 v-2 H6 v-2 h16Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 6 16
          moveTo(x = 6.0f, y = 16.0f)
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
          // v -5z
          verticalLineToRelative(dy = -5.0f)
          close()
          // m 16 4
          moveToRelative(dx = 16.0f, dy = 4.0f)
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
        // <rect width="32" height="32" fill="#000" />
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
      .also { _trainTime = it }
  }

@Suppress("ObjectPropertyName")
private var _trainTime: ImageVector? = null
