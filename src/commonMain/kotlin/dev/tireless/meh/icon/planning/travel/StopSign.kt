// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.planning.travel

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val StopSign: ImageVector
  get() {
    val current = _stopSign
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.StopSign",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M20.59 29 H11.4 A2 2 0 0 1 10 28.41 L3.59 22 A2 2 0 0 1 3 20.59 V11.4 A2 2 0 0 1 3.59 10 L10 3.59 A2 2 0 0 1 11.41 3 h9.18 A2 2 0 0 1 22 3.59 L28.41 10 A2 2 0 0 1 29 11.41 v9.18 A2 2 0 0 1 28.41 22 L22 28.41 A2 2 0 0 1 20.59 29 M11.4 5 5 11.41 v9.18 L11.41 27 h9.18 L27 20.59 V11.4 L20.59 5z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 20.59 29
          moveTo(x = 20.59f, y = 29.0f)
          // H 11.4
          horizontalLineTo(x = 11.4f)
          // A 2 2 0 0 1 10 28.41
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.0f,
            y1 = 28.41f,
          )
          // L 3.59 22
          lineTo(x = 3.59f, y = 22.0f)
          // A 2 2 0 0 1 3 20.59
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.0f,
            y1 = 20.59f,
          )
          // V 11.4
          verticalLineTo(y = 11.4f)
          // A 2 2 0 0 1 3.59 10
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 3.59f,
            y1 = 10.0f,
          )
          // L 10 3.59
          lineTo(x = 10.0f, y = 3.59f)
          // A 2 2 0 0 1 11.41 3
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 11.41f,
            y1 = 3.0f,
          )
          // h 9.18
          horizontalLineToRelative(dx = 9.18f)
          // A 2 2 0 0 1 22 3.59
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 22.0f,
            y1 = 3.59f,
          )
          // L 28.41 10
          lineTo(x = 28.41f, y = 10.0f)
          // A 2 2 0 0 1 29 11.41
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 29.0f,
            y1 = 11.41f,
          )
          // v 9.18
          verticalLineToRelative(dy = 9.18f)
          // A 2 2 0 0 1 28.41 22
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.41f,
            y1 = 22.0f,
          )
          // L 22 28.41
          lineTo(x = 22.0f, y = 28.41f)
          // A 2 2 0 0 1 20.59 29
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 20.59f,
            y1 = 29.0f,
          )
          // M 11.4 5
          moveTo(x = 11.4f, y = 5.0f)
          // L 5 11.41
          lineTo(x = 5.0f, y = 11.41f)
          // v 9.18
          verticalLineToRelative(dy = 9.18f)
          // L 11.41 27
          lineTo(x = 11.41f, y = 27.0f)
          // h 9.18
          horizontalLineToRelative(dx = 9.18f)
          // L 27 20.59
          lineTo(x = 27.0f, y = 20.59f)
          // V 11.4
          verticalLineTo(y = 11.4f)
          // L 20.59 5z
          lineTo(x = 20.59f, y = 5.0f)
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
      .also { _stopSign = it }
  }

@Suppress("ObjectPropertyName")
private var _stopSign: ImageVector? = null
