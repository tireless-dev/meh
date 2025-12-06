// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HelpFilled: ImageVector
  get() {
    val current = _helpFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.HelpFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m0 23 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 25 m1.14 -7.75 v2.5 H14.9 V15 h2.13 a2.38 2.38 0 0 0 0 -4.75 h-1.5 a2.4 2.4 0 0 0 -2.38 2.37 v.64 H10.9 v-.64 A4.63 4.63 0 0 1 15.52 8 h1.5 a4.62 4.62 0 0 1 .12 9.25
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 2
          moveTo(x = 16.0f, y = 2.0f)
          // a 14 14 0 1 0 14 14
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 14.0f,
            dy1 = 14.0f,
          )
          // A 14 14 0 0 0 16 2
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 2.0f,
          )
          // m 0 23
          moveToRelative(dx = 0.0f, dy = 23.0f)
          // a 1.5 1.5 0 1 1 1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = -1.5f,
          )
          // A 1.5 1.5 0 0 1 16 25
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 25.0f,
          )
          // m 1.14 -7.75
          moveToRelative(dx = 1.14f, dy = -7.75f)
          // v 2.5
          verticalLineToRelative(dy = 2.5f)
          // H 14.9
          horizontalLineTo(x = 14.9f)
          // V 15
          verticalLineTo(y = 15.0f)
          // h 2.13
          horizontalLineToRelative(dx = 2.13f)
          // a 2.38 2.38 0 0 0 0 -4.75
          arcToRelative(
            a = 2.38f,
            b = 2.38f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -4.75f,
          )
          // h -1.5
          horizontalLineToRelative(dx = -1.5f)
          // a 2.4 2.4 0 0 0 -2.38 2.37
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.38f,
            dy1 = 2.37f,
          )
          // v 0.64
          verticalLineToRelative(dy = 0.64f)
          // H 10.9
          horizontalLineTo(x = 10.9f)
          // v -0.64
          verticalLineToRelative(dy = -0.64f)
          // A 4.63 4.63 0 0 1 15.52 8
          arcTo(
            horizontalEllipseRadius = 4.63f,
            verticalEllipseRadius = 4.63f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.52f,
            y1 = 8.0f,
          )
          // h 1.5
          horizontalLineToRelative(dx = 1.5f)
          // a 4.62 4.62 0 0 1 0.12 9.25
          arcToRelative(
            a = 4.62f,
            b = 4.62f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.12f,
            dy1 = 9.25f,
          )
        }
        // M16 25 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 25 m1.14 -7.75 v2.5 H14.9 V15 h2.13 a2.38 2.38 0 0 0 0 -4.75 h-1.5 a2.4 2.4 0 0 0 -2.38 2.37 v.64 H10.9 v-.64 A4.63 4.63 0 0 1 15.52 8 h1.5 a4.62 4.62 0 0 1 .12 9.25
        path {
          // M 16 25
          moveTo(x = 16.0f, y = 25.0f)
          // a 1.5 1.5 0 1 1 1.5 -1.5
          arcToRelative(
            a = 1.5f,
            b = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 1.5f,
            dy1 = -1.5f,
          )
          // A 1.5 1.5 0 0 1 16 25
          arcTo(
            horizontalEllipseRadius = 1.5f,
            verticalEllipseRadius = 1.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 16.0f,
            y1 = 25.0f,
          )
          // m 1.14 -7.75
          moveToRelative(dx = 1.14f, dy = -7.75f)
          // v 2.5
          verticalLineToRelative(dy = 2.5f)
          // H 14.9
          horizontalLineTo(x = 14.9f)
          // V 15
          verticalLineTo(y = 15.0f)
          // h 2.13
          horizontalLineToRelative(dx = 2.13f)
          // a 2.38 2.38 0 0 0 0 -4.75
          arcToRelative(
            a = 2.38f,
            b = 2.38f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -4.75f,
          )
          // h -1.5
          horizontalLineToRelative(dx = -1.5f)
          // a 2.4 2.4 0 0 0 -2.38 2.37
          arcToRelative(
            a = 2.4f,
            b = 2.4f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.38f,
            dy1 = 2.37f,
          )
          // v 0.64
          verticalLineToRelative(dy = 0.64f)
          // H 10.9
          horizontalLineTo(x = 10.9f)
          // v -0.64
          verticalLineToRelative(dy = -0.64f)
          // A 4.63 4.63 0 0 1 15.52 8
          arcTo(
            horizontalEllipseRadius = 4.63f,
            verticalEllipseRadius = 4.63f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 15.52f,
            y1 = 8.0f,
          )
          // h 1.5
          horizontalLineToRelative(dx = 1.5f)
          // a 4.62 4.62 0 0 1 0.12 9.25
          arcToRelative(
            a = 4.62f,
            b = 4.62f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.12f,
            dy1 = 9.25f,
          )
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
      .also { _helpFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _helpFilled: ImageVector? = null
