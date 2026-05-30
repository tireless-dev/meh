// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.enterprise.appcatalogue

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InfrastructureClassic: ImageVector
  get() {
    val current = _infrastructureClassic
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.InfrastructureClassic",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="12" height="2" x="18.0" y="26.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 26
          moveTo(x = 18.0f, y = 26.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="21.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 21
          moveTo(x = 18.0f, y = 21.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // <rect width="12" height="2" x="18.0" y="16.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 18 16
          moveTo(x = 18.0f, y = 16.0f)
          // h 12
          horizontalLineToRelative(dx = 12.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // h -12z
          horizontalLineToRelative(dx = -12.0f)
          close()
        }
        // M14 25 H9.5 a7.5 7.5 0 0 1 -1.32 -14.88 A10 10 0 0 1 28 12 h-2 a8 8 0 0 0 -15.95 -.87 l-.1 .83 -.83 .06 A5.5 5.5 0 0 0 9.5 23 H14Z
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 14 25
          moveTo(x = 14.0f, y = 25.0f)
          // H 9.5
          horizontalLineTo(x = 9.5f)
          // a 7.5 7.5 0 0 1 -1.32 -14.88
          arcToRelative(
            a = 7.5f,
            b = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = -1.32f,
            dy1 = -14.88f,
          )
          // A 10 10 0 0 1 28 12
          arcTo(
            horizontalEllipseRadius = 10.0f,
            verticalEllipseRadius = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 28.0f,
            y1 = 12.0f,
          )
          // h -2
          horizontalLineToRelative(dx = -2.0f)
          // a 8 8 0 0 0 -15.95 -0.87
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -15.95f,
            dy1 = -0.87f,
          )
          // l -0.1 0.83
          lineToRelative(dx = -0.1f, dy = 0.83f)
          // l -0.83 0.06
          lineToRelative(dx = -0.83f, dy = 0.06f)
          // A 5.5 5.5 0 0 0 9.5 23
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 9.5f,
            y1 = 23.0f,
          )
          // H 14z
          horizontalLineTo(x = 14.0f)
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
      .also { _infrastructureClassic = it }
  }

@Suppress("ObjectPropertyName")
private var _infrastructureClassic: ImageVector? = null
