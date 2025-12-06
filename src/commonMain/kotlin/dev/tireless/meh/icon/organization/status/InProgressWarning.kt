// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.organization.status

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InProgressWarning: ImageVector
  get() {
    val current = _inProgressWarning
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InProgressWarning",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.38 28 h-6.76 L24 21.24Z M24 18 a1 1 0 0 0 -.9 .55 l-5 10 A1 1 0 0 0 19 30 h10 a1 1 0 0 0 .92 -1.39 L24.9 18.55 A1 1 0 0 0 24 18
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.38 28
          moveTo(x = 27.38f, y = 28.0f)
          // h -6.76
          horizontalLineToRelative(dx = -6.76f)
          // L 24 21.24z
          lineTo(x = 24.0f, y = 21.24f)
          close()
          // M 24 18
          moveTo(x = 24.0f, y = 18.0f)
          // a 1 1 0 0 0 -0.9 0.55
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -0.9f,
            dy1 = 0.55f,
          )
          // l -5 10
          lineToRelative(dx = -5.0f, dy = 10.0f)
          // A 1 1 0 0 0 19 30
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 19.0f,
            y1 = 30.0f,
          )
          // h 10
          horizontalLineToRelative(dx = 10.0f)
          // a 1 1 0 0 0 0.92 -1.39
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.92f,
            dy1 = -1.39f,
          )
          // L 24.9 18.55
          lineTo(x = 24.9f, y = 18.55f)
          // A 1 1 0 0 0 24 18
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 24.0f,
            y1 = 18.0f,
          )
        }
        // M18.75 22.8 A10 10 0 1 1 14 4 v10 l6.1 6.1 1.22 -2.44 A3 3 0 0 1 24 16 h1.82 A12 12 0 1 0 14 26 a12 12 0 0 0 3.4 -.5Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18.75 22.8
          moveTo(x = 18.75f, y = 22.8f)
          // A 10 10 0 1 1 14 4
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            x1 = 14.0f,
            y1 = 4.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // l 6.1 6.1
          lineToRelative(dx = 6.1f, dy = 6.1f)
          // l 1.22 -2.44
          lineToRelative(dx = 1.22f, dy = -2.44f)
          // A 3 3 0 0 1 24 16
          arcTo(
            horizontalEllipseRadius = 3.0f,
            verticalEllipseRadius = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.0f,
            y1 = 16.0f,
          )
          // h 1.82
          horizontalLineToRelative(dx = 1.82f)
          // A 12 12 0 1 0 14 26
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 14.0f,
            y1 = 26.0f,
          )
          // a 12 12 0 0 0 3.4 -0.5z
          arcToRelative(
            a = 12.0f,
            b = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 3.4f,
            dy1 = -0.5f,
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
      .also { _inProgressWarning = it }
  }

@Suppress("ObjectPropertyName")
private var _inProgressWarning: ImageVector? = null
