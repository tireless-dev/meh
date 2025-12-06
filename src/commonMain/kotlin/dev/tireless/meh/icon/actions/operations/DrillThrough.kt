// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DrillThrough: ImageVector
  get() {
    val current = _drillThrough
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DrillThrough",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 30 A14 14 0 0 1 2 16 h2 A12 12 0 1 0 16 4 V2 a14 14 0 0 1 0 28
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 30
          moveTo(x = 16.0f, y = 30.0f)
          // A 14 14 0 0 1 2 16
          arcTo(
            horizontalEllipseRadius = 14.0f,
            verticalEllipseRadius = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 2.0f,
            y1 = 16.0f,
          )
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // A 12 12 0 1 0 16 4
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 16.0f,
            y1 = 4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // a 14 14 0 0 1 0 28
          arcToRelative(
            a = 14.0f,
            b = 14.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 28.0f,
          )
        }
        // <polygon points="4.0 12.0 4.0 10.0 8.586 10.0 2.0 3.414 3.414 2.0 10.0 8.586 10.0 4.0 12.0 4.0 12.0 12.0 4.0 12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 4 12
          moveTo(x = 4.0f, y = 12.0f)
          // L 4 10
          lineTo(x = 4.0f, y = 10.0f)
          // L 8.586 10
          lineTo(x = 8.586f, y = 10.0f)
          // L 2 3.414
          lineTo(x = 2.0f, y = 3.414f)
          // L 3.414 2
          lineTo(x = 3.414f, y = 2.0f)
          // L 10 8.586
          lineTo(x = 10.0f, y = 8.586f)
          // L 10 4
          lineTo(x = 10.0f, y = 4.0f)
          // L 12 4
          lineTo(x = 12.0f, y = 4.0f)
          // L 12 12
          lineTo(x = 12.0f, y = 12.0f)
          // L 4 12z
          lineTo(x = 4.0f, y = 12.0f)
          close()
        }
        // M16 10 v6 h-6 a6 6 0 1 0 6 -6
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 10
          moveTo(x = 16.0f, y = 10.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
          // h -6
          horizontalLineToRelative(dx = -6.0f)
          // a 6 6 0 1 0 6 -6
          arcToRelative(
            a = 6.0f,
            b = 6.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            dx1 = 6.0f,
            dy1 = -6.0f,
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
      .also { _drillThrough = it }
  }

@Suppress("ObjectPropertyName")
private var _drillThrough: ImageVector? = null
