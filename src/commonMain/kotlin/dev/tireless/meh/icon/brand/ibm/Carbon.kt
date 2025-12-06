// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.brand.ibm

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Carbon: ImageVector
  get() {
    val current = _carbon
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.Carbon",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M13.5 30.81 a1 1 0 0 1 -.5 -.13 l-8.5 -4.81 A1 1 0 0 1 4 25 V15 a1 1 0 0 1 .5 -.87 L13 9.31 a1 1 0 0 1 1 0 l8.5 4.82 A1 1 0 0 1 23 15 v10 a1 1 0 0 1 -.5 .87 L14 30.69 a1 1 0 0 1 -.5 .12 M6 24.41 l7.5 4.26 7.5 -4.25 v-8.84 l-7.5 -4.25 L6 15.58Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 13.5 30.81
          moveTo(x = 13.5f, y = 30.81f)
          // a 1 1 0 0 1 -0.5 -0.13
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = -0.13f,
          )
          // l -8.5 -4.81
          lineToRelative(dx = -8.5f, dy = -4.81f)
          // A 1 1 0 0 1 4 25
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 4.0f,
            y1 = 25.0f,
          )
          // V 15
          verticalLineTo(y = 15.0f)
          // a 1 1 0 0 1 0.5 -0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 0.5f,
            dy1 = -0.87f,
          )
          // L 13 9.31
          lineTo(x = 13.0f, y = 9.31f)
          // a 1 1 0 0 1 1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 0.0f,
          )
          // l 8.5 4.82
          lineToRelative(dx = 8.5f, dy = 4.82f)
          // A 1 1 0 0 1 23 15
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 23.0f,
            y1 = 15.0f,
          )
          // v 10
          verticalLineToRelative(dy = 10.0f)
          // a 1 1 0 0 1 -0.5 0.87
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = 0.87f,
          )
          // L 14 30.69
          lineTo(x = 14.0f, y = 30.69f)
          // a 1 1 0 0 1 -0.5 0.12
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -0.5f,
            dy1 = 0.12f,
          )
          // M 6 24.41
          moveTo(x = 6.0f, y = 24.41f)
          // l 7.5 4.26
          lineToRelative(dx = 7.5f, dy = 4.26f)
          // l 7.5 -4.25
          lineToRelative(dx = 7.5f, dy = -4.25f)
          // v -8.84
          verticalLineToRelative(dy = -8.84f)
          // l -7.5 -4.25
          lineToRelative(dx = -7.5f, dy = -4.25f)
          // L 6 15.58z
          lineTo(x = 6.0f, y = 15.58f)
          close()
        }
        // M28 17 h-2 V7.58 l-7.5 -4.25 -8 4.54 -1 -1.74 L18 1.31 a1 1 0 0 1 1 0 l8.5 4.82 A1 1 0 0 1 28 7Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 28 17
          moveTo(x = 28.0f, y = 17.0f)
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // V 7.58
          verticalLineTo(y = 7.58f)
          // l -7.5 -4.25
          lineToRelative(dx = -7.5f, dy = -4.25f)
          // l -8 4.54
          lineToRelative(dx = -8.0f, dy = 4.54f)
          // l -1 -1.74
          lineToRelative(dx = -1.0f, dy = -1.74f)
          // L 18 1.31
          lineTo(x = 18.0f, y = 1.31f)
          // a 1 1 0 0 1 1 0
          arcToRelative(
            a = 1.0f,
            b = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 1.0f,
            dy1 = 0.0f,
          )
          // l 8.5 4.82
          lineToRelative(dx = 8.5f, dy = 4.82f)
          // A 1 1 0 0 1 28 7z
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 7.0f,
          )
          close()
        }
        // <rect width="32" height="32" fill="#000" style="fill:none" />
        path(
          fill = SolidColor(Color.Transparent),
        ) {
          // M 32 32
        moveTo(x = 32.0f, y = 32.0f)
        // l -32 0
        lineToRelative(dx = -32.0f, dy = 0.0f)
        // l 0 -32
        lineToRelative(dx = 0.0f, dy = -32.0f)
        // l 32 -0z
        lineToRelative(dx = 32.0f, dy = -0.0f)
        close()
      }
    }.build()
      .also { _carbon = it }
  }

@Suppress("ObjectPropertyName")
private var _carbon: ImageVector? = null
