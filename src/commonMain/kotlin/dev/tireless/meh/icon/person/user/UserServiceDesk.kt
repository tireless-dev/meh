// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.person.user

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserServiceDesk: ImageVector
  get() {
    val current = _userServiceDesk
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UserServiceDesk",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m25.33 11.95 1.21 -1.2 a1.2 1.2 0 0 1 1.26 -.26 l1.47 .58 A1.2 1.2 0 0 1 30 12.15 v2.7 A1.17 1.17 0 0 1 28.82 16 h-.05 C18.47 15.36 16.4 6.64 16.01 3.3 A1.17 1.17 0 0 1 17.04 2 h2.74 a1.2 1.2 0 0 1 1.07 .73 l.59 1.47 a1.2 1.2 0 0 1 -.26 1.26 l-1.2 1.2 s.7 4.7 5.35 5.29 M16 30 h-2 v-5 a3 3 0 0 0 -3 -3 H7 a3 3 0 0 0 -3 3 v5 H2 v-5 a5 5 0 0 1 5 -5 h4 a5 5 0 0 1 5 5Z M9 10 a3 3 0 1 1 -3 3 3 3 0 0 1 3 -3 m0 -2 a5 5 0 1 0 5 5 5 5 0 0 0 -5 -5
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 25.33 11.95
          moveTo(x = 25.33f, y = 11.95f)
          // l 1.21 -1.2
          lineToRelative(dx = 1.21f, dy = -1.2f)
          // a 1.2 1.2 0 0 1 1.26 -0.26
          arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.26f,
            dy1 = -0.26f,
          )
          // l 1.47 0.58
          lineToRelative(dx = 1.47f, dy = 0.58f)
          // A 1.2 1.2 0 0 1 30 12.15
          arcTo(
            horizontalEllipseRadius = 1.2f,
            verticalEllipseRadius = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 30.0f,
            y1 = 12.15f,
          )
          // v 2.7
          verticalLineToRelative(dy = 2.7f)
          // A 1.17 1.17 0 0 1 28.82 16
          arcTo(
            horizontalEllipseRadius = 1.17f,
            verticalEllipseRadius = 1.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.82f,
            y1 = 16.0f,
          )
          // h -0.05
          horizontalLineToRelative(dx = -0.05f)
          // C 18.47 15.36 16.4 6.64 16.01 3.3
          curveTo(
            x1 = 18.47f,
            y1 = 15.36f,
            x2 = 16.4f,
            y2 = 6.64f,
            x3 = 16.01f,
            y3 = 3.3f,
          )
          // A 1.17 1.17 0 0 1 17.04 2
          arcTo(
            horizontalEllipseRadius = 1.17f,
            verticalEllipseRadius = 1.17f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.04f,
            y1 = 2.0f,
          )
          // h 2.74
          horizontalLineToRelative(dx = 2.74f)
          // a 1.2 1.2 0 0 1 1.07 0.73
          arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.07f,
            dy1 = 0.73f,
          )
          // l 0.59 1.47
          lineToRelative(dx = 0.59f, dy = 1.47f)
          // a 1.2 1.2 0 0 1 -0.26 1.26
          arcToRelative(
            a = 1.2f,
            b = 1.2f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.26f,
            dy1 = 1.26f,
          )
          // l -1.2 1.2
          lineToRelative(dx = -1.2f, dy = 1.2f)
          // s 0.7 4.7 5.35 5.29
          reflectiveCurveToRelative(
            dx1 = 0.7f,
            dy1 = 4.7f,
            dx2 = 5.35f,
            dy2 = 5.29f,
          )
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
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
          // a 3 3 0 0 0 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // v 5
          verticalLineToRelative(dy = 5.0f)
          // H 2
          horizontalLineTo(x = 2.0f)
          // v -5
          verticalLineToRelative(dy = -5.0f)
          // a 5 5 0 0 1 5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = -5.0f,
          )
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // a 5 5 0 0 1 5 5z
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          close()
          // M 9 10
          moveTo(x = 9.0f, y = 10.0f)
          // a 3 3 0 1 1 -3 3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -3.0f,
            dy1 = 3.0f,
          )
          // a 3 3 0 0 1 3 -3
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 3.0f,
            dy1 = -3.0f,
          )
          // m 0 -2
          moveToRelative(dx = 0.0f, dy = -2.0f)
          // a 5 5 0 1 0 5 5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 5.0f,
            dy1 = 5.0f,
          )
          // a 5 5 0 0 0 -5 -5
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -5.0f,
            dy1 = -5.0f,
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
      .also { _userServiceDesk = it }
  }

@Suppress("ObjectPropertyName")
private var _userServiceDesk: ImageVector? = null
