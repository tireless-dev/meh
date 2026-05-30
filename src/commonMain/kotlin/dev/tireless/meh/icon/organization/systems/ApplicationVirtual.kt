// SPDX-License-Identifier: Apache-2.0
// Copyright 2026 tireless.dev
package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ApplicationVirtual: ImageVector
  get() {
    val current = _applicationVirtual
    if (current != null) return current

    return ImageVector
      .Builder(
        name = "MehTheme.ApplicationVirtual",
        defaultWidth = 32.0.dp,
        defaultHeight = 32.0.dp,
        viewportWidth = 32.0f,
        viewportHeight = 32.0f,
      ).apply {
        // <rect width="4" height="4" x="17.0" y="19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 19
          moveTo(x = 17.0f, y = 19.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="11.0" y="19.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 19
          moveTo(x = 11.0f, y = 19.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="17.0" y="25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 17 25
          moveTo(x = 17.0f, y = 25.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // <rect width="4" height="4" x="11.0" y="25.0" fill="#000" />
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 11 25
          moveTo(x = 11.0f, y = 25.0f)
          // h 4
          horizontalLineToRelative(dx = 4.0f)
          // v 4
          verticalLineToRelative(dy = 4.0f)
          // h -4z
          horizontalLineToRelative(dx = -4.0f)
          close()
        }
        // M24.5 25 H24 v-2 h.5 a5.5 5.5 0 0 0 .38 -10.98 l-.84 -.06 -.09 -.83 a8 8 0 0 0 -15.9 0 l-.1 .83 -.83 .06 A5.5 5.5 0 0 0 7.5 23 H8 v2 H7.5 a7.5 7.5 0 0 1 -1.32 -14.88 10 10 0 0 1 19.64 0 A7.5 7.5 0 0 1 24.5 25
        path(
          fill = SolidColor(Color(0xFF000000)),
        ) {
          // M 24.5 25
          moveTo(x = 24.5f, y = 25.0f)
          // H 24
          horizontalLineTo(x = 24.0f)
          // v -2
          verticalLineToRelative(dy = -2.0f)
          // h 0.5
          horizontalLineToRelative(dx = 0.5f)
          // a 5.5 5.5 0 0 0 0.38 -10.98
          arcToRelative(
            a = 5.5f,
            b = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = 0.38f,
            dy1 = -10.98f,
          )
          // l -0.84 -0.06
          lineToRelative(dx = -0.84f, dy = -0.06f)
          // l -0.09 -0.83
          lineToRelative(dx = -0.09f, dy = -0.83f)
          // a 8 8 0 0 0 -15.9 0
          arcToRelative(
            a = 8.0f,
            b = 8.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            dx1 = -15.9f,
            dy1 = 0.0f,
          )
          // l -0.1 0.83
          lineToRelative(dx = -0.1f, dy = 0.83f)
          // l -0.83 0.06
          lineToRelative(dx = -0.83f, dy = 0.06f)
          // A 5.5 5.5 0 0 0 7.5 23
          arcTo(
            horizontalEllipseRadius = 5.5f,
            verticalEllipseRadius = 5.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = false,
            x1 = 7.5f,
            y1 = 23.0f,
          )
          // H 8
          horizontalLineTo(x = 8.0f)
          // v 2
          verticalLineToRelative(dy = 2.0f)
          // H 7.5
          horizontalLineTo(x = 7.5f)
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
          // a 10 10 0 0 1 19.64 0
          arcToRelative(
            a = 10.0f,
            b = 10.0f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            dx1 = 19.64f,
            dy1 = 0.0f,
          )
          // A 7.5 7.5 0 0 1 24.5 25
          arcTo(
            horizontalEllipseRadius = 7.5f,
            verticalEllipseRadius = 7.5f,
            theta = 0.0f,
            isMoreThanHalf = false,
            isPositiveArc = true,
            x1 = 24.5f,
            y1 = 25.0f,
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
      .also { _applicationVirtual = it }
  }

@Suppress("ObjectPropertyName")
private var _applicationVirtual: ImageVector? = null
