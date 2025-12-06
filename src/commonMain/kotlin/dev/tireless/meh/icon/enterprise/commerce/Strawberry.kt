// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.enterprise.commerce

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Strawberry: ImageVector
  get() {
    val current = _strawberry
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Strawberry",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="2" height="2" x="9.0" y="10.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 10
          moveTo(x = 9.0f, y = 10.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="9.0" y="14.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 14
          moveTo(x = 9.0f, y = 14.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // <rect width="2" height="2" x="13.0" y="12.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13 12
          moveTo(x = 13.0f, y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -2z
          horizontalLineToRelative(dx = -2.0f)
          close()
        }
        // M9 28 a5 5 0 0 1 -.74 -.05 A5.1 5.1 0 0 1 4 22.87 V11.2 a7.16 7.16 0 0 1 6.31 -7.17 7 7 0 0 1 4.46 1.07 l7.97 4.98 a6.98 6.98 0 0 1 -.69 12.2 L11.17 27.5 A5 5 0 0 1 9 28 m2 -22 -.5 .02 A5.15 5.15 0 0 0 6 11.2 v11.67 a3.1 3.1 0 0 0 2.54 3.1 3 3 0 0 0 1.77 -.27 l10.88 -5.23 a4.98 4.98 0 0 0 .49 -8.7 L13.7 6.8 A5 5 0 0 0 11 6 m15 1 h-4 a4 4 0 0 1 -4 -4 V2 h2 v1 a2 2 0 0 0 2 2 h4Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 9 28
          moveTo(x = 9.0f, y = 28.0f)
          // a 5 5 0 0 1 -0.74 -0.05
          arcToRelative(
            a = 5.0f,
            b = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.74f,
            dy1 = -0.05f,
          )
          // A 5.1 5.1 0 0 1 4 22.87
          arcTo(
            horizontalEllipseRadius = 5.1f,
            verticalEllipseRadius = 5.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 22.87f,
          )
          // V 11.2
          verticalLineTo(y = 11.2f)
          // a 7.16 7.16 0 0 1 6.31 -7.17
          arcToRelative(
            a = 7.16f,
            b = 7.16f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 6.31f,
            dy1 = -7.17f,
          )
          // a 7 7 0 0 1 4.46 1.07
          arcToRelative(
            a = 7.0f,
            b = 7.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 4.46f,
            dy1 = 1.07f,
          )
          // l 7.97 4.98
          lineToRelative(dx = 7.97f, dy = 4.98f)
          // a 6.98 6.98 0 0 1 -0.69 12.2
          arcToRelative(
            a = 6.98f,
            b = 6.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.69f,
            dy1 = 12.2f,
          )
          // L 11.17 27.5
          lineTo(x = 11.17f, y = 27.5f)
          // A 5 5 0 0 1 9 28
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 9.0f,
            y1 = 28.0f,
          )
          // m 2 -22
          moveToRelative(dx = 2.0f, dy = -22.0f)
          // l -0.5 0.02
          lineToRelative(dx = -0.5f, dy = 0.02f)
          // A 5.15 5.15 0 0 0 6 11.2
          arcTo(
            horizontalEllipseRadius = 5.15f,
            verticalEllipseRadius = 5.15f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 6.0f,
            y1 = 11.2f,
          )
          // v 11.67
          verticalLineToRelative(dy = 11.67f)
          // a 3.1 3.1 0 0 0 2.54 3.1
          arcToRelative(
            a = 3.1f,
            b = 3.1f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.54f,
            dy1 = 3.1f,
          )
          // a 3 3 0 0 0 1.77 -0.27
          arcToRelative(
            a = 3.0f,
            b = 3.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 1.77f,
            dy1 = -0.27f,
          )
          // l 10.88 -5.23
          lineToRelative(dx = 10.88f, dy = -5.23f)
          // a 4.98 4.98 0 0 0 0.49 -8.7
          arcToRelative(
            a = 4.98f,
            b = 4.98f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.49f,
            dy1 = -8.7f,
          )
          // L 13.7 6.8
          lineTo(x = 13.7f, y = 6.8f)
          // A 5 5 0 0 0 11 6
          arcTo(
            horizontalEllipseRadius = 5.0f,
            verticalEllipseRadius = 5.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 11.0f,
            y1 = 6.0f,
          )
          // m 15 1
          moveToRelative(dx = 15.0f, dy = 1.0f)
          // h -4
          horizontalLineToRelative(dx = -4.0f)
          // a 4 4 0 0 1 -4 -4
          arcToRelative(
            a = 4.0f,
            b = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -4.0f,
            dy1 = -4.0f,
          )
          // V 2
          verticalLineTo(y = 2.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 1
          verticalLineToRelative(dy = 1.0f)
          // a 2 2 0 0 0 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // h 4z
          horizontalLineToRelative(dx = 4.0f)
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
      .also { _strawberry = it }
  }

@Suppress("ObjectPropertyName")
private var _strawberry: ImageVector? = null
