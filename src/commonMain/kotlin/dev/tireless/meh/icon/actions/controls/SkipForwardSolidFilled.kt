// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.controls

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SkipForwardSolidFilled: ImageVector
  get() {
    val current = _skipForwardSolidFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.SkipForwardSolidFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M16 2 a14 14 0 1 0 14 14 A14 14 0 0 0 16 2 m2.49 14.87 -9 5 A1 1 0 0 1 8 21 V11 a1 1 0 0 1 1.49 -.87 l9 5 a1 1 0 0 1 0 1.74 M24 22 h-2 V10 h2Z
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
          // m 2.49 14.87
          moveToRelative(dx = 2.49f, dy = 14.87f)
          // l -9 5
          lineToRelative(dx = -9.0f, dy = 5.0f)
          // A 1 1 0 0 1 8 21
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 21.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 1 1 0 0 1 1.49 -0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.49f,
            dy1 = -0.87f,
          )
          // l 9 5
          lineToRelative(dx = 9.0f, dy = 5.0f)
          // a 1 1 0 0 1 0 1.74
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.74f,
          )
          // M 24 22
          moveTo(x = 24.0f, y = 22.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 10
          verticalLineTo(y = 10.0f)
          // h 2z
          horizontalLineToRelative(dx = 2.0f)
          close()
        }
        // <rect width="2" height="12" x="22.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 22 10
          moveTo(x = 22.0f, y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 12
          verticalLineToRelative(dy = 12.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M8.5 21.86 A1 1 0 0 1 8 21 V11 a1 1 0 0 1 1.49 -.87 l9 5 a1 1 0 0 1 0 1.74 l-9 5 a1 1 0 0 1 -1 0
        path {
          // M 8.5 21.86
          moveTo(x = 8.5f, y = 21.86f)
          // A 1 1 0 0 1 8 21
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 8.0f,
            y1 = 21.0f,
          )
          // V 11
          verticalLineTo(y = 11.0f)
          // a 1 1 0 0 1 1.49 -0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.49f,
            dy1 = -0.87f,
          )
          // l 9 5
          lineToRelative(dx = 9.0f, dy = 5.0f)
          // a 1 1 0 0 1 0 1.74
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.0f,
            dy1 = 1.74f,
          )
          // l -9 5
          lineToRelative(dx = -9.0f, dy = 5.0f)
          // a 1 1 0 0 1 -1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.0f,
            dy1 = 0.0f,
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
      .also { _skipForwardSolidFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _skipForwardSolidFilled: ImageVector? = null
