// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentMultiple02: ImageVector
  get() {
    val current = _documentMultiple02
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.DocumentMultiple02",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // M18 31 H6 a2 2 0 0 1 -2 -2 V12 h2 v17 h12z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 31
          moveTo(x = 18.0f, y = 31.0f)
          // H 6
          horizontalLineTo(x = 6.0f)
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
          // V 12
          verticalLineTo(y = 12.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 17
          verticalLineToRelative(dy = 17.0f)
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
        }
        // M22 27 H10 a2 2 0 0 1 -2 -2 V8 h2 v17 h12z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 22 27
          moveTo(x = 22.0f, y = 27.0f)
          // H 10
          horizontalLineTo(x = 10.0f)
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
          // V 8
          verticalLineTo(y = 8.0f)
          // h 2
          horizontalLineToRelative(dx = 2.0f)
          // v 17
          verticalLineToRelative(dy = 17.0f)
          // h 12z
          horizontalLineToRelative(dx = 12.0f)
          close()
        }
        // <rect width="8" height="2" x="16.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 16 16
          moveTo(x = 16.0f, y = 16.0f)
          // h 8
          horizontalLineToRelative(dx = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -8z
          horizontalLineToRelative(dx = -8.0f)
          close()
        }
        // m27.7 9.3 -7 -7 A1 1 0 0 0 20 2 h-6 a2 2 0 0 0 -2 2 v17 a2 2 0 0 0 2 2 h12 a2 2 0 0 0 2 -2 V10 c0 -.3 -.1 -.5 -.3 -.7 M20 4.4 l5.6 5.6 H20z M26 21 H14 V4 h4 v6 a2 2 0 0 0 2 2 h6z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 27.7 9.3
          moveTo(x = 27.7f, y = 9.3f)
          // l -7 -7
          lineToRelative(dx = -7.0f, dy = -7.0f)
          // A 1 1 0 0 0 20 2
          arcTo(
            horizontalEllipseRadius = 1.0f,
            verticalEllipseRadius = 1.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 20.0f,
            y1 = 2.0f,
          )
          // h -6
          horizontalLineToRelative(dx = -6.0f)
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
          // v 17
          verticalLineToRelative(dy = 17.0f)
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
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // a 2 2 0 0 0 2 -2
          arcToRelative(
            a = 2.0f,
            b = 2.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 2.0f,
            dy1 = -2.0f,
          )
          // V 10
          verticalLineTo(y = 10.0f)
          // c 0 -0.3 -0.1 -0.5 -0.3 -0.7
          curveToRelative(
            dx1 = 0.0f,
            dy1 = -0.3f,
            dx2 = -0.1f,
            dy2 = -0.5f,
            dx3 = -0.3f,
            dy3 = -0.7f,
          )
          // M 20 4.4
          moveTo(x = 20.0f, y = 4.4f)
          // l 5.6 5.6
          lineToRelative(dx = 5.6f, dy = 5.6f)
          // H 20z
          horizontalLineTo(x = 20.0f)
          close()
          // M 26 21
          moveTo(x = 26.0f, y = 21.0f)
          // H 14
          horizontalLineTo(x = 14.0f)
          // V 4
          verticalLineTo(y = 4.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 6
          verticalLineToRelative(dy = 6.0f)
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
      .also { _documentMultiple02 = it }
  }

@Suppress("ObjectPropertyName")
private var _documentMultiple02: ImageVector? = null
