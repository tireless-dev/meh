// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val WarningHexFilled: ImageVector
  get() {
    val current = _warningHexFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.WarningHexFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M14.88 8 h2.24 v11 h-2.25Z M16 25 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 25
        path {
          // M 14.88 8
          moveTo(x = 14.88f, y = 8.0f)
          // h 2.24
          horizontalLineToRelative(dx = 2.24f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h -2.25z
          horizontalLineToRelative(dx = -2.25f)
          close()
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
        }
        // M30.85 15.45 23.9 3.53 A1.1 1.1 0 0 0 22.96 3 H9.04 A1.1 1.1 0 0 0 8.1 3.53 L1.15 15.45 a1.1 1.1 0 0 0 0 1.1 L8.1 28.47 A1.1 1.1 0 0 0 9.04 29 h13.92 a1.1 1.1 0 0 0 .93 -.53 l6.96 -11.92 a1.1 1.1 0 0 0 0 -1.1 M14.87 8 h2.26 v11 h-2.25Z M16 25 a1.5 1.5 0 1 1 1.5 -1.5 A1.5 1.5 0 0 1 16 25
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 30.85 15.45
          moveTo(x = 30.85f, y = 15.45f)
          // L 23.9 3.53
          lineTo(x = 23.9f, y = 3.53f)
          // A 1.1 1.1 0 0 0 22.96 3
          arcTo(
            horizontalEllipseRadius = 1.1f,
            verticalEllipseRadius = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.96f,
            y1 = 3.0f,
          )
          // H 9.04
          horizontalLineTo(x = 9.04f)
          // A 1.1 1.1 0 0 0 8.1 3.53
          arcTo(
            horizontalEllipseRadius = 1.1f,
            verticalEllipseRadius = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 8.1f,
            y1 = 3.53f,
          )
          // L 1.15 15.45
          lineTo(x = 1.15f, y = 15.45f)
          // a 1.1 1.1 0 0 0 0 1.1
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = 1.1f,
          )
          // L 8.1 28.47
          lineTo(x = 8.1f, y = 28.47f)
          // A 1.1 1.1 0 0 0 9.04 29
          arcTo(
            horizontalEllipseRadius = 1.1f,
            verticalEllipseRadius = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.04f,
            y1 = 29.0f,
          )
          // h 13.92
          horizontalLineToRelative(dx = 13.92f)
          // a 1.1 1.1 0 0 0 0.93 -0.53
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.93f,
            dy1 = -0.53f,
          )
          // l 6.96 -11.92
          lineToRelative(dx = 6.96f, dy = -11.92f)
          // a 1.1 1.1 0 0 0 0 -1.1
          arcToRelative(
            a = 1.1f,
            b = 1.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.0f,
            dy1 = -1.1f,
          )
          // M 14.87 8
          moveTo(x = 14.87f, y = 8.0f)
          // h 2.26
          horizontalLineToRelative(dx = 2.26f)
          // v 11
          verticalLineToRelative(dy = 11.0f)
          // h -2.25z
          horizontalLineToRelative(dx = -2.25f)
          close()
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
      .also { _warningHexFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _warningHexFilled: ImageVector? = null
