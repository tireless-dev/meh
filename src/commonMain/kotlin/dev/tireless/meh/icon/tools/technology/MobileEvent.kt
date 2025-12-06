// SPDX-License-Identifier: Apache-2.0
// Copyright 2025 tireless.dev
package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MobileEvent: ImageVector
  get() {
    val current = _mobileEvent
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.MobileEvent",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M27.38 28 h-6.76 L24 21.24z M24 18 a1 1 0 0 0 -.9 .55 l-5 10 A1 1 0 0 0 19 30 h10 a1 1 0 0 0 .92 -1.39 L24.9 18.55 A1 1 0 0 0 24 18 m-9 10 H9 V8 h14 v7 h2 V4 a2 2 0 0 0 -2 -2 H9 a2 2 0 0 0 -2 2 v24 a2 2 0 0 0 2 2 h6z M9 4 h14 v2 H9z
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
          // m -9 10
          moveToRelative(dx = -9.0f, dy = 10.0f)
          // H 9
          horizontalLineTo(x = 9.0f)
          // V 8
          verticalLineTo(y = 8.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 7
          verticalLineToRelative(dy = 7.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // a 2 2 0 0 0 -2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = -2.0f,
          )
          // H 9
          horizontalLineTo(x = 9.0f)
          // a 2 2 0 0 0 -2 2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -2.0f,
            dy1 = 2.0f,
          )
          // v 24
          verticalLineToRelative(dy = 24.0f)
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
          // h 6z
          horizontalLineToRelative(dx = 6.0f)
          close()
          // M 9 4
          moveTo(x = 9.0f, y = 4.0f)
          // h 14
          horizontalLineToRelative(dx = 14.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 9z
          horizontalLineTo(x = 9.0f)
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
      .also { _mobileEvent = it }
  }

@Suppress("ObjectPropertyName")
private var _mobileEvent: ImageVector? = null
