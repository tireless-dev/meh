// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.actions.toggle

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PhoneOffFilled: ImageVector
  get() {
    val current = _phoneOffFilled
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.PhoneOffFilled",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // m26.74 19.56 -2.52 -1 A2 2 0 0 0 22.07 19 L20 21.06 a10 10 0 0 1 -5.35 -2.29 L30 3.41 28.59 2 2 28.59 3.41 30 l7.93 -7.92 c3.24 3.12 7.89 5.5 14.55 5.92 A2 2 0 0 0 28 26 v-4.59 a2 2 0 0 0 -1.26 -1.85 M8.15 18.19 l3.52 -3.52 A12 12 0 0 1 10.85 12 l2.07 -2.07 a2 2 0 0 0 .44 -2.15 l-1 -2.52 A2 2 0 0 0 10.5 4 H6 a2 2 0 0 0 -2 2.22 29 29 0 0 0 4.15 11.97
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 26.74 19.56
          moveTo(x = 26.74f, y = 19.56f)
          // l -2.52 -1
          lineToRelative(dx = -2.52f, dy = -1.0f)
          // A 2 2 0 0 0 22.07 19
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 22.07f,
            y1 = 19.0f,
          )
          // L 20 21.06
          lineTo(x = 20.0f, y = 21.06f)
          // a 10 10 0 0 1 -5.35 -2.29
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -5.35f,
            dy1 = -2.29f,
          )
          // L 30 3.41
          lineTo(x = 30.0f, y = 3.41f)
          // L 28.59 2
          lineTo(x = 28.59f, y = 2.0f)
          // L 2 28.59
          lineTo(x = 2.0f, y = 28.59f)
          // L 3.41 30
          lineTo(x = 3.41f, y = 30.0f)
          // l 7.93 -7.92
          lineToRelative(dx = 7.93f, dy = -7.92f)
          // c 3.24 3.12 7.89 5.5 14.55 5.92
          curveToRelative(
            dx1 = 3.24f,
            dy1 = 3.12f,
            dx2 = 7.89f,
            dy2 = 5.5f,
            dx3 = 14.55f,
            dy3 = 5.92f,
          )
          // A 2 2 0 0 0 28 26
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 28.0f,
            y1 = 26.0f,
          )
          // v -4.59
          verticalLineToRelative(dy = -4.59f)
          // a 2 2 0 0 0 -1.26 -1.85
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -1.26f,
            dy1 = -1.85f,
          )
          // M 8.15 18.19
          moveTo(x = 8.15f, y = 18.19f)
          // l 3.52 -3.52
          lineToRelative(dx = 3.52f, dy = -3.52f)
          // A 12 12 0 0 1 10.85 12
          arcTo(
            horizontalEllipseRadius = 12.0f,
            verticalEllipseRadius = 12.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 10.85f,
            y1 = 12.0f,
          )
          // l 2.07 -2.07
          lineToRelative(dx = 2.07f, dy = -2.07f)
          // a 2 2 0 0 0 0.44 -2.15
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.44f,
            dy1 = -2.15f,
          )
          // l -1 -2.52
          lineToRelative(dx = -1.0f, dy = -2.52f)
          // A 2 2 0 0 0 10.5 4
          arcTo(
            horizontalEllipseRadius = 2.0f,
            verticalEllipseRadius = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 10.5f,
            y1 = 4.0f,
          )
          // H 6
          horizontalLineTo(x = 6.0f)
          // a 2 2 0 0 0 -2 2.22
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.22f,
          )
          // a 29 29 0 0 0 4.15 11.97
          arcToRelative(
            a = 29.0f,
            b = 29.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 4.15f,
            dy1 = 11.97f,
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
      .also { _phoneOffFilled = it }
  }

@Suppress("ObjectPropertyName")
private var _phoneOffFilled: ImageVector? = null
