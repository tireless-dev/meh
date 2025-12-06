// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.formatting

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val TextCreation: ImageVector
  get() {
    val current = _textCreation
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.TextCreation",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27 22.14 V9.86 A4 4 0 1 0 22.14 5 H9.86 A4 4 0 1 0 5 9.86 v12.28 A4 4 0 1 0 9.86 27 h12.28 A4 4 0 1 0 27 22.14 M26 4 a2 2 0 1 1 -2 2 2 2 0 0 1 2 -2 M4 6 a2 2 0 1 1 2 2 2 2 0 0 1 -2 -2 m2 22 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2 m16.14 -3 H9.86 A4 4 0 0 0 7 22.14 V9.86 A4 4 0 0 0 9.86 7 h12.28 A4 4 0 0 0 25 9.86 v12.28 A4 4 0 0 0 22.14 25 M26 28 a2 2 0 1 1 2 -2 2 2 0 0 1 -2 2
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27 22.14
          moveTo(x = 27.0f, y = 22.14f)
          // V 9.86
          verticalLineTo(y = 9.86f)
          // A 4 4 0 1 0 22.14 5
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 22.14f,
            y1 = 5.0f,
          )
          // H 9.86
          horizontalLineTo(x = 9.86f)
          // A 4 4 0 1 0 5 9.86
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 5.0f,
            y1 = 9.86f,
          )
          // v 12.28
          verticalLineToRelative(dy = 12.28f)
          // A 4 4 0 1 0 9.86 27
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 9.86f,
            y1 = 27.0f,
          )
          // h 12.28
          horizontalLineToRelative(dx = 12.28f)
          // A 4 4 0 1 0 27 22.14
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = false,
            x1 = 27.0f,
            y1 = 22.14f,
          )
          // M 26 4
          moveTo(x = 26.0f, y = 4.0f)
          // a 2 2 0 1 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // M 4 6
          moveTo(x = 4.0f, y = 6.0f)
          // a 2 2 0 1 1 2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = 2.0f,
          )
          // a 2 2 0 0 1 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // m 2 22
          moveToRelative(dx = 2.0f, dy = 22.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // m 16.14 -3
          moveToRelative(dx = 16.14f, dy = -3.0f)
          // H 9.86
          horizontalLineTo(x = 9.86f)
          // A 4 4 0 0 0 7 22.14
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.0f,
            y1 = 22.14f,
          )
          // V 9.86
          verticalLineTo(y = 9.86f)
          // A 4 4 0 0 0 9.86 7
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.86f,
            y1 = 7.0f,
          )
          // h 12.28
          horizontalLineToRelative(dx = 12.28f)
          // A 4 4 0 0 0 25 9.86
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 25.0f,
            y1 = 9.86f,
          )
          // v 12.28
          verticalLineToRelative(dy = 12.28f)
          // A 4 4 0 0 0 22.14 25
          arcTo(
            horizontalEllipseRadius = 4.0f,
            verticalEllipseRadius = 4.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.14f,
            y1 = 25.0f,
          )
          // M 26 28
          moveTo(x = 26.0f, y = 28.0f)
          // a 2 2 0 1 1 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = true,
            isPositiveArc = true,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // a 2 2 0 0 1 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
        }
        // <polygon points="21.0 11.0 11.0 11.0 11.0 13.0 15.0 13.0 15.0 22.0 17.0 22.0 17.0 13.0 21.0 13.0 21.0 11.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 21 11
          moveTo(x = 21.0f, y = 11.0f)
          // L 11 11
          lineTo(x = 11.0f, y = 11.0f)
          // L 11 13
          lineTo(x = 11.0f, y = 13.0f)
          // L 15 13
          lineTo(x = 15.0f, y = 13.0f)
          // L 15 22
          lineTo(x = 15.0f, y = 22.0f)
          // L 17 22
          lineTo(x = 17.0f, y = 22.0f)
          // L 17 13
          lineTo(x = 17.0f, y = 13.0f)
          // L 21 13
          lineTo(x = 21.0f, y = 13.0f)
          // L 21 11z
          lineTo(x = 21.0f, y = 11.0f)
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
      .also { _textCreation = it }
  }

@Suppress("ObjectPropertyName")
private var _textCreation: ImageVector? = null
