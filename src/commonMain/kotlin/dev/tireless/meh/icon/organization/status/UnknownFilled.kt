// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UnknownFilled: ImageVector
  get() {
    val current = _unknownFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.UnknownFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M29.4 14.53 17.46 2.6 a2.1 2.1 0 0 0 -2.94 0 L2.6 14.53 a2.1 2.1 0 0 0 0 2.94 L14.53 29.4 a2.1 2.1 0 0 0 2.94 0 L29.4 17.47 a2.1 2.1 0 0 0 0 -2.94 M16 24 a1.5 1.5 0 1 1 0 -3 1.5 1.5 0 0 1 0 3 m1.13 -6.75 v1.88 h-2.25 V15 H17 a1.88 1.88 0 0 0 0 -3.75 h-2 a1.9 1.9 0 0 0 -1.87 1.88 v.5 h-2.26 v-.5 A4.13 4.13 0 0 1 15 9 h2 a4.13 4.13 0 0 1 .13 8.25
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 29.4 14.53
          moveTo(x = 29.4f, y = 14.53f)
          // L 17.46 2.6
          lineTo(x = 17.46f, y = 2.6f)
          // a 2.1 2.1 0 0 0 -2.94 0
          arcToRelative(
            a = 2.1f,
            b = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.94f,
            dy1 = 0.0f,
          )
          // L 2.6 14.53
          lineTo(x = 2.6f, y = 14.53f)
          // a 2.1 2.1 0 0 0 0 2.94
          arcToRelative(
            a = 2.1f,
            b = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 2.94f,
          )
          // L 14.53 29.4
          lineTo(x = 14.53f, y = 29.4f)
          // a 2.1 2.1 0 0 0 2.94 0
          arcToRelative(
            a = 2.1f,
            b = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.94f,
            dy1 = 0.0f,
          )
          // L 29.4 17.47
          lineTo(x = 29.4f, y = 17.47f)
          // a 2.1 2.1 0 0 0 0 -2.94
          arcToRelative(
            a = 2.1f,
            b = 2.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -2.94f,
          )
          // M 16 24
          moveTo(x = 16.0f, y = 24.0f)
          // a 1.5 1.5 0 1 1 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.0f,
          )
          // a 1.5 1.5 0 0 1 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // m 1.13 -6.75
          moveToRelative(dx = 1.13f, dy = -6.75f)
          // v 1.88
          verticalLineToRelative(dy = 1.88f)
          // h -2.25
          horizontalLineToRelative(dx = -2.25f)
          // V 15
          verticalLineTo(y = 15.0f)
          // H 17
          horizontalLineTo(x = 17.0f)
          // a 1.88 1.88 0 0 0 0 -3.75
          arcToRelative(
            a = 1.88f,
            b = 1.88f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -3.75f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 1.9 1.9 0 0 0 -1.87 1.88
          arcToRelative(
            a = 1.9f,
            b = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.87f,
            dy1 = 1.88f,
          )
          // v 0.5
          verticalLineToRelative(dy = 0.5f)
          // h -2.26
          horizontalLineToRelative(dx = -2.26f)
          // v -0.5
          verticalLineToRelative(dy = -0.5f)
          // A 4.13 4.13 0 0 1 15 9
          arcTo(
            horizontalEllipseRadius = 4.13f,
            verticalEllipseRadius = 4.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 9.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // a 4.13 4.13 0 0 1 0.13 8.25
          arcToRelative(
            a = 4.13f,
            b = 4.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.13f,
            dy1 = 8.25f,
          )
        }
        // M16 21 a1.5 1.5 0 1 1 0 3 1.5 1.5 0 0 1 0 -3 m1.13 -3.75 A4.13 4.13 0 0 0 17 9 h-2 a4.13 4.13 0 0 0 -4.12 4.13 v.5 h2.24 v-.5 A1.9 1.9 0 0 1 15 11.25 h2 A1.88 1.88 0 0 1 17 15 h-2.12 v4.13 h2.24z
        path {
          // M 16 21
          moveTo(x = 16.0f, y = 21.0f)
          // a 1.5 1.5 0 1 1 0 3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 3.0f,
          )
          // a 1.5 1.5 0 0 1 0 -3
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = -3.0f,
          )
          // m 1.13 -3.75
          moveToRelative(dx = 1.13f, dy = -3.75f)
          // A 4.13 4.13 0 0 0 17 9
          arcTo(
            horizontalEllipseRadius = 4.13f,
            verticalEllipseRadius = 4.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 17.0f,
            y1 = 9.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 4.13 4.13 0 0 0 -4.12 4.13
          arcToRelative(
            a = 4.13f,
            b = 4.13f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -4.12f,
            dy1 = 4.13f,
          )
          // v 0.5
          verticalLineToRelative(dy = 0.5f)
          // h 2.24
          horizontalLineToRelative(dx = 2.24f)
          // v -0.5
          verticalLineToRelative(dy = -0.5f)
          // A 1.9 1.9 0 0 1 15 11.25
          arcTo(
            horizontalEllipseRadius = 1.9f,
            verticalEllipseRadius = 1.9f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.0f,
            y1 = 11.25f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // A 1.88 1.88 0 0 1 17 15
          arcTo(
            horizontalEllipseRadius = 1.88f,
            verticalEllipseRadius = 1.88f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 17.0f,
            y1 = 15.0f,
          )
          // h -2.12
          horizontalLineToRelative(dx = -2.12f)
          // v 4.13
          verticalLineToRelative(dy = 4.13f)
          // h 2.24z
          horizontalLineToRelative(dx = 2.24f)
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
      .also { _unknownFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _unknownFilled: ImageVector? = null
